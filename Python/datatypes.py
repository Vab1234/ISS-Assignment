# int datatype
product_id = 101

# Boolean
is_in_stock = True

# Strings and f-strings
hello_message = "Hey Varun, What's up!!!"
STORE_NAME = "DMART"
customer_name = "Varun"
welcome_message = f"Welcome to {STORE_NAME}, {customer_name}!"
print(welcome_message)

# Lists
cart_items = ["Laptop", "Wireless Mouse", "Keyboard"]
cart_items.append("HDMI Cable")
print(cart_items)
for item in cart_items:
    print(item)

# Tuples
store_coordinates = (18.5204, 73.8567) 
for item in store_coordinates:
    print (item)

# Sets
searched_categories = {"electronics", "laptops", "accessories", "electronics" , "laptops"}
print(searched_categories)

# Dictionaries
product_details = {
    "name": "Wireless Mouse",
    "brand": "Logitech",
    "price": 1500,
    "warranty_years": 1
}