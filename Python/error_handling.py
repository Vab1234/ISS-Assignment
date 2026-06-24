def apply_promo_code(cart_total, division_factor):
    if cart_total < 0:
        raise ValueError("Cart total cannot be a negative number.")
        
    try:
        # The code that might crash goes in the 'try' block
        new_total = cart_total / division_factor
        
    except ZeroDivisionError:
        # Catching a specific error to prevent a crash
        print("\nError: Invalid promo code applied (Division by zero).")
        new_total = cart_total
        
    except Exception as e:
        # Catching any other unexpected errors
        print(f"\nSomething went wrong: {e}")
        new_total = cart_total
        
    else:
        print("\nPromo code successfully applied!")
        
    finally:
        print("Promo code evaluation finished.")
        
    return new_total

final_bill = apply_promo_code(1000, 0)