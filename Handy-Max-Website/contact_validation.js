const form = document.getElementById('form');
const firstName = document.getElementById('first_name');
const lastName = document.getElementById('last_name');
const email = document.getElementById('email');
const message = document.getElementById('message');

form.addEventListener('submit', e => {
	
	if (checkInputs()) { 
        form.submit();  
    }else{
		e.preventDefault();
	}
});

function checkInputs() {
	// trim to remove the whitespaces
	const firstNameValue = firstName.value.trim();
	const lastNameValue = lastName.value.trim();
	const emailValue = email.value.trim();
	const messageValue = message.value.trim();
	
	// Check if first name and last name was entered
	if(firstNameValue === '') {
		setErrorFor(firstName, 'First Name cannot be blank');
        isValid = false;
	} else {
		setSuccessFor(firstName);
	}
	if(lastNameValue === '') {
		setErrorFor(lastName, 'Surname cannot be blank');
        isValid = false;
	} else {
		setSuccessFor(lastName);
	}
	
	// Check if valid email was entered
	if(emailValue === '') {
		setErrorFor(email, 'Email cannot be blank');
        isValid = false;
	} else if (!isEmail(emailValue)) {
		setErrorFor(email, 'Not a valid email');
        isValid = false;
	} else {
		setSuccessFor(email);
	}

    if(messageValue === '') {
		setErrorFor(message, 'Message cannot be blank');
        isValid = false;
	} else {
		setSuccessFor(message);
	}
    return isValid;
}

function setErrorFor(input, message) {
	const formControl = input.parentElement;
	const small = formControl.querySelector('small');
	formControl.className = 'contactForm__control error';
	small.innerText = message;
}

function setSuccessFor(input) {
	const formControl = input.parentElement;
	formControl.className = 'contactForm__control success';
}
	
function isEmail(email) {
	return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);
}
