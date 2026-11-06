
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
