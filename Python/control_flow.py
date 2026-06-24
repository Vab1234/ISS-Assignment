# If-else
cart_value = 5500
if cart_value >= 10000:
    print("You get a 10% premium discount!")
elif cart_value >= 5000:
    print("You get a 5% standard discount.")
else:
    print("Add more items to get a discount.")

# For loop
cart_items = ["mobile" ,  "hot wheels" , "frying pan"]
print("\nItems in your cart:")
for item in cart_items:
    print(f"- {item}")

# While loop, Break and continue
stock_count = 3
print("\nProcessing purchases...")
while stock_count > 0:
    user_action = "buy" 
    if user_action == "pause":
        continue  
        
    if user_action == "cancel":
        print("Transaction cancelled.")
        break
        
    stock_count -= 1
    print(f"Item sold. Remaining stock: {stock_count}")

# Pass
def integrate_payment_gateway():
    # TODO: Add Stripe or Razorpay integration next week
    pass

# Loop-else 
search_item = "Webcam"
for item in cart_items:
    if item == search_item:
        print(f"\nFound {search_item} in your cart!")
        break
else:
    print(f"\n{search_item} is not in your cart.")