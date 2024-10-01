const form = document.getElementById('form');
const firstName = document.getElementById('first_name');
const lastName = document.getElementById('last_name');
const email = document.getElementById('email');
const date = document.getElementById('date');
const services = document.getElementById('services');


form.addEventListener('submit', e => {
	e.preventDefault();
	
	checkInputs();
});

function checkInputs() {
	// trim to remove the whitespaces
	const firstNameValue = firstName.value.trim();
	const lastNameValue = lastName.value.trim();
	const emailValue = email.value.trim();
    const serviceValue = services.value;
    const dateValue = date.value;
    // Get the value of the date input and convert it to a Date object
    const selectedDate = new Date(date.value);

    // Get today's date, set the time to midnight to avoid time zone issues
    const today = new Date();
    today.setHours(0, 0, 0, 0); // Sets time to 00:00:00
	
	if(firstNameValue === '') {
		setErrorFor(firstName, 'First Name cannot be blank');
	} else {
		setSuccessFor(firstName);
	}
	if(lastNameValue === '') {
		setErrorFor(lastName, 'Surname cannot be blank');
	} else {
		setSuccessFor(lastName);
	}
	
	if(emailValue === '') {
		setErrorFor(email, 'Email cannot be blank');
	} else if (!isEmail(emailValue)) {
		setErrorFor(email, 'Not a valid email');
	} else {
		setSuccessFor(email);
	}

    // Check if value was selected from the dropdown
    if(serviceValue === '') {
        setErrorFor(services, 'Please select a service.');
    } else {
        setSuccessFor(services);
    }

    // Check if the selected date is in the past
    if (dateValue === '') {
        setErrorFor(date, 'Please select a date.');
    } else if (selectedDate < today) {
        setErrorFor(date, 'The appointment date cannot be in the past.');
    } else {
        // Clear any existing error messages if the date is valid
        setSuccessFor(date);
    }
}

function setErrorFor(input, message) {
	const formControl = input.parentElement;
	const small = formControl.querySelector('small');
	formControl.className = 'appointmentForm__control error';
	small.innerText = message;
}

function setSuccessFor(input) {
	const formControl = input.parentElement;
	formControl.className = 'appointmentForm__control success';
}
	
function isEmail(email) {
	return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);
}
