const form = document.getElementById('registrationForm');

form.addEventListener('submit', function(event) {
    // Prevent the form from submitting normally so we can validate it first
    event.preventDefault(); 
    
    let isValid = true;

    const username = document.getElementById('username').value;
    if (username.length < 3) {
        document.getElementById('usernameError').style.display = 'block';
        isValid = false;
    } else {
        document.getElementById('usernameError').style.display = 'none';
    }

    const email = document.getElementById('email').value;
    if (!emailInput.checkValidity()) {
        document.getElementById('emailError').style.display = 'block';
        isValid = false;
    } else {
        document.getElementById('emailError').style.display = 'none';
    }

    const password = document.getElementById('password').value;
    if (password.length < 6) {
        document.getElementById('passwordError').style.display = 'block';
        isValid = false;
    } else {
        document.getElementById('passwordError').style.display = 'none';
    }

    const isPersonal = document.getElementById('personal').checked;
    const isBusiness = document.getElementById('business').checked;
    if (!isPersonal && !isBusiness) {
        document.getElementById('radioError').style.display = 'block';
        isValid = false;
    } else {
        document.getElementById('radioError').style.display = 'none';
    }

    const terms = document.getElementById('terms').checked;
    if (!terms) {
        document.getElementById('termsError').style.display = 'block';
        isValid = false;
    } else {
        document.getElementById('termsError').style.display = 'none';
    }

    // If everything is valid, show the success message and clear the form
    if (isValid) {
        document.getElementById('successMessage').style.display = 'block';
        form.reset();
        
        // Hide success message after 4 seconds
        setTimeout(() => {
            document.getElementById('successMessage').style.display = 'none';
        }, 4000);
    }
});