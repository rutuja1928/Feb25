function getFormValues() {
var firstName = document.getElementById('firstName').value;
var lastName = document.getElementById('lastName').value;
var contact = document.getElementById('contact').value;
var email = document.getElementById('email').value;

var output = document.getElementById('output');
    output.innerHTML = "<strong>Form Details:</strong><br>" +
                       "First Name: " + firstName + "<br>" +
                       "Last Name: " + lastName + "<br>" +
                       "Contact No.: " + contact + "<br>" +
                       "Email ID: " + email;
}