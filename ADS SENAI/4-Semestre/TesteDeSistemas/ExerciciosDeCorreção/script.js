// Utility Functions
function showPage(pageId) {
  // Hide all containers
  document.querySelectorAll(".container").forEach((container) => {
    container.style.display = "none";
  });
  // Show the selected container
  document.getElementById(pageId).style.display = "block";
}

// Event Listeners
document.getElementById("loginForm").addEventListener("submit", function (e) {
  e.preventDefault();
  alert("Login realizado com sucesso!");
});

document
  .getElementById("forgotPasswordForm")
  .addEventListener("submit", function (e) {
    e.preventDefault();
    const email = document.getElementById("recoveryEmail").value;
    const errorElement = document.getElementById("recoveryEmailError");
    const successElement = document.getElementById("recoverySuccess");

    if (!validateEmail(email)) {
      errorElement.style.display = "block";
      successElement.style.display = "none";
      return;
    }

    errorElement.style.display = "none";
    successElement.style.display = "block";

    setTimeout(() => {
      showPage("loginPage");
    }, 2000);
  });

document
  .getElementById("registerForm")
  .addEventListener("submit", function (e) {
    e.preventDefault();
    const name = document.getElementById("fullName").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    let hasError = false;

    // Verificações de erro
    if (name.length < 3) {
      document.getElementById("nameError").style.display = "block";
      hasError = true;
    } else {
      document.getElementById("nameError").style.display = "none";
    }

    if (!validateEmail(email)) {
      document.getElementById("emailError").style.display = "block";
      hasError = true;
    } else {
      document.getElementById("emailError").style.display = "none";
    }

    if (password !== confirmPassword) {
      document.getElementById("passwordError").style.display = "block";
      hasError = true;
    } else {
      document.getElementById("passwordError").style.display = "none";
    }

    if (!validatePassword(password)) {
      hasError = true;
    }

    if (!hasError) {
      document.getElementById("registerSuccess").style.display = "block";
      setTimeout(() => {
        showPage("loginPage");
      }, 2000);
    }
  });

// Utility Functions for Validation
function validateEmail(email) {
  const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return re.test(email);
}

function validatePassword(password) {
  const hasLength = password.length >= 8;
  const hasUpper = /[A-Z]/.test(password);
  const hasNumber = /[0-9]/.test(password);
  const hasSpecial = /[!@#$%^&*]/.test(password);

  document.getElementById("lengthCheck").classList.toggle("valid", hasLength);
  document.getElementById("upperCheck").classList.toggle("valid", hasUpper);
  document.getElementById("numberCheck").classList.toggle("valid", hasNumber);
  document.getElementById("specialCheck").classList.toggle("valid", hasSpecial);

  return hasLength && hasUpper && hasNumber && hasSpecial;
}
