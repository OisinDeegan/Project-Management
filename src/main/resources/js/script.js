const problemSelect = document.getElementById("problemSelect");
const selectedProblem = document.getElementById("selectedProblem");
const otherBox = document.getElementById("otherProblem");

function checkProblem() {
    const selectedValue = problemSelect.value;

    otherBox.hidden = selectedValue !== "Other";

    selectedProblem.textContent = "Selected problem: " + selectedValue;
}

problemSelect.addEventListener("change", checkProblem);

checkProblem();
