# Parameters, arguments and return
def calculate_discount(price, discount_percentage):
    """Calculates the final price after a discount."""
    discount_amount = price * (discount_percentage / 100)
    final_price = price - discount_amount
    return final_price

payable_amount = calculate_discount(5000, 10) 

# Args and Kwargs
def print_invoice(order_id, *products, **customer_info):
    print(f"\nInvoice for Order {order_id}")
    
    print("Products Bought:")
    for prod in products:
        print(f" - {prod}")
        
    print("Shipping Details:")
    for key, value in customer_info.items():
        print(f" - {key.capitalize()}: {value}")

print_invoice(992, "Laptop", "Mouse", "Bag", name="Varun", city="Mumbai", zip_code="400074")