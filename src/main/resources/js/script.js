const problemSelect = document.getElementById("problemSelect");
const selectedProblem = document.getElementById("selectedProblem");
const otherBox = document.getElementById("otherProblem");

function checkProblem() {
    const selectedValue = problemSelect.value;

    if (selectedValue === "Other") {
        otherBox.style.display = "block";
    } else {
        otherBox.style.display = "none";
    }

    selectedProblem.textContent = "Selected problem: " + selectedValue;
}

problemSelect.addEventListener("change", checkProblem);

checkProblem();
