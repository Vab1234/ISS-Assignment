# SQL Database Normalization: Comprehensive Notes

## I. Core Terminology

Before applying normalization processes, the following foundational concepts must be understood:

* **Table (Relation):** A structured data set organized into rows (records) and columns (attributes).
* **Primary Key (PK):** A column, or distinct set of columns, that uniquely identifies every record in a table. It must be unique and cannot contain NULL values.
* **Composite Key:** A Primary Key consisting of two or more columns combined to guarantee record uniqueness.
* **Foreign Key (FK):** A column in one table that references the Primary Key of another table, establishing a relational link between the two.
* **Functional Dependency:** A relationship where the value of one attribute determines the value of another. (e.g., `Employee_ID` determines `Employee_Name`).
* **Data Anomalies:** Structural flaws resulting from data redundancy.
* *Update Anomaly:* Modifying a value requires updating multiple records, risking inconsistency.
* *Insertion Anomaly:* Inability to add a record because dependent data is missing.
* *Deletion Anomaly:* Deleting a record unintentionally deletes other necessary data.



The primary objective of normalization is to eliminate data redundancy and prevent data anomalies by systematically organizing tables.

---

## II. The Normalization Process

To demonstrate the structural progression, we will track a raw dataset through the first three Normal Forms (1NF, 2NF, and 3NF).

### Step 0: Unnormalized Form (UNF)

Data in UNF contains multi-valued attributes (arrays, comma-separated lists) within a single cell. It is structurally flawed and cannot be queried efficiently.

**Dataset: Employee Project Roster**

| Emp_ID (PK) | Emp_Name | Department | Dept_Manager | Assigned_Projects |
| --- | --- | --- | --- | --- |
| 101 | John Smith | IT | Alan Turing | Proj_A, Proj_B |
| 102 | Ada Lovelace | Sales | Grace Hopper | Proj_C |

*Defect:* The `Assigned_Projects` column contains multiple values for Employee 101.

---

### Step 1: First Normal Form (1NF)

**Definition:** A table is in 1NF if every cell contains a single, atomic (indivisible) value, and there are no repeating groups.

**Transformation:** Expand the multi-valued attributes into distinct rows. To maintain record uniqueness, the Primary Key must be updated to a Composite Key consisting of `Emp_ID` and `Assigned_Project`.

**Table: Employee_Projects_1NF**

| Emp_ID (PK) | Assigned_Project (PK) | Emp_Name | Department | Dept_Manager |
| --- | --- | --- | --- | --- |
| 101 | Proj_A | John Smith | IT | Alan Turing |
| 101 | Proj_B | John Smith | IT | Alan Turing |
| 102 | Proj_C | Ada Lovelace | Sales | Grace Hopper |

*Status Check:* 1NF is achieved.
*Remaining Defect:* `Emp_Name`, `Department`, and `Dept_Manager` are now duplicated for every project John Smith takes on. This causes update anomalies.

---

### Step 2: Second Normal Form (2NF)

**Definition:** A table is in 2NF if it fulfills 1NF requirements and contains **no partial dependencies**. Every non-key attribute must depend on the *entire* Primary Key, not just a portion of a composite key.

**Transformation:** In the 1NF table, `Emp_Name` depends only on `Emp_ID`, not on the `Assigned_Project`. We must separate attributes dependent on the whole key from those dependent on part of the key.

**Table A: Employees (PK: Emp_ID)**

| Emp_ID (PK) | Emp_Name | Department | Dept_Manager |
| --- | --- | --- | --- |
| 101 | John Smith | IT | Alan Turing |
| 102 | Ada Lovelace | Sales | Grace Hopper |

**Table B: Project_Assignments (PK: Emp_ID + Assigned_Project)**

| Emp_ID (FK) | Assigned_Project (PK) |
| --- | --- |
| 101 | Proj_A |
| 101 | Proj_B |
| 102 | Proj_C |

*Status Check:* 2NF is achieved. Employee demographic data is no longer duplicated based on project assignments.
*Remaining Defect:* `Dept_Manager` is determined by the `Department`, not directly by the `Emp_ID`. If the IT department changes managers, multiple employee records must still be updated.

---

### Step 3: Third Normal Form (3NF)

**Definition:** A table is in 3NF if it fulfills 2NF requirements and contains **no transitive dependencies**. A non-key attribute must not depend on another non-key attribute. All columns must depend strictly on the Primary Key.

**Transformation:** In Table A above, remove `Dept_Manager` (which depends on `Department`) and create a distinct table for departments. Establish a Foreign Key relationship to link them.

**Table 1: Employees (PK: Emp_ID)**

| Emp_ID (PK) | Emp_Name | Department (FK) |
| --- | --- | --- |
| 101 | John Smith | IT |
| 102 | Ada Lovelace | Sales |

**Table 2: Departments (PK: Department)**

| Department (PK) | Dept_Manager |
| --- | --- |
| IT | Alan Turing |
| Sales | Grace Hopper |

**Table 3: Project_Assignments (PK: Emp_ID + Assigned_Project)**

| Emp_ID (FK) | Assigned_Project (PK) |
| --- | --- |
| 101 | Proj_A |
| 101 | Proj_B |
| 102 | Proj_C |

*Status Check:* 3NF is achieved. The database architecture is now fully normalized for standard application use. There is no redundant data, and each table serves a single, distinct logical entity (Employees, Departments, and Assignments).

---

## III. Summary Rule

The requirements for normalization up to 3NF can be summarized by this formal principle regarding table attributes:

Every non-key attribute in a relation must depend on:

1. **The Key** (1NF: Unique identifier, atomic values).
2. **The Whole Key** (2NF: No partial dependencies on a composite key).
3. **And Nothing But the Key** (3NF: No transitive dependencies on other non-key attributes).