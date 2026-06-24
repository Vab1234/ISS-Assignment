# Simulating user input which always comes in as a string
user_input_quantity = "3"

# Explicitly converting string to integer for math operations
qty_int = int(user_input_quantity)

# Converting to float for precise billing calculations
base_price_float = float(product_details["price"])
total_price = base_price_float * qty_int