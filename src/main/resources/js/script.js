const problemSelect = document.getElementById("problemSelect");
const selectedProblem = document.getElementById("selectedProblem");

problemSelect.addEventListener("change", function () {
    const selectedValue = problemSelect.value;

    selectedProblem.textContent = "Selected problem: " + selectedValue;
});

