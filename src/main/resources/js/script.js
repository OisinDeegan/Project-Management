function checkProblem() {
    const selectedProblem = document.getElementById("problemSelect").value;
    const otherBox = document.getElementById("otherProblem");

    if (selectedProblem === "Other") {
        otherProblem.style.display = "block";
    } else {
        otherProblem.style.display = "none";
    }
}


// Get the dropdown menu and the result paragraph
const problemSelect = document.getElementById("problemSelect");
const selectedProblem = document.getElementById("selectedProblem");

// Listen for changes in the dropdown menu
problemSelect.addEventListener("change", function () {

    // Get the selected problem
    const selectedValue = problemSelect.value;

    // Display the selected problem
    selectedProblem.textContent = "Selected problem: " + selectedValue;

});
