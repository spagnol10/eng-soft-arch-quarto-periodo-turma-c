document.addEventListener('DOMContentLoaded', function() {
    let currentInput = "";
    let previousInput = "";
    let currentOperation = null;

    const display = document.getElementById("display");

    document.querySelectorAll(".calculator-btn").forEach(button => {
        button.addEventListener("click", handleButtonClick);
    });

    document.addEventListener('keydown', function(event) {
        const key = event.key;
        if ((key >= '0' && key <= '9') || key === ".") {
            handleInput(key);
        } else if (['+', '-', '*', '/'].includes(key)) {
            handleOperator(key);
        } else if (key === 'Enter' || key === '=') {
            handleEquals();
        } else if (key === 'Backspace' || key === 'Delete') {
            clearAll();
        }
    });

    function handleButtonClick() {
        const type = this.getAttribute("data-type");
        const value = this.getAttribute("data-value");

        if (type === "number") {
            handleInput(value);
        } else if (type === "operator") {
            handleOperator(value);
        } else if (type === "equals") {
            handleEquals();
        } else if (type === "decimal") {
            handleDecimal(value);
        }
    }

    function handleButtonClick() {
        const type = this.getAttribute("data-type");
        const value = this.getAttribute("data-value");
    
        if (type === "number") {
            handleInput(value);
        } else if (type === "operator") {
            handleOperator(value);
        } else if (type === "equals") {
            handleEquals();
        } else if (type === "decimal") {
            handleDecimal(value);
        } else if (type === "reset") {
            clearAll();
        }
    }

    function handleInput(value) {
        currentInput += value;
        updateDisplay();
    }

    function handleOperator(value) {
        if (previousInput && currentOperation && currentInput) {
            performOperation();
        }
        previousInput = currentInput;
        currentInput = "";
        currentOperation = value;
    }

    function handleEquals() {
        if (previousInput && currentOperation && currentInput) {
            performOperation();
            currentOperation = null;
            updateDisplay();
        }
    }

    function handleDecimal(value) {
        if (!currentInput.includes('.')) {
            currentInput += value;
            updateDisplay();
        }
    }

    function performOperation() {
        switch(currentOperation) {
            case "+":
                currentInput = (parseFloat(previousInput) + parseFloat(currentInput)).toString();
                break;
            case "-":
                currentInput = (parseFloat(previousInput) - parseFloat(currentInput)).toString();
                break;
            case "*":
                currentInput = (parseFloat(previousInput) * parseFloat(currentInput)).toString();
                break;
            case "/":
                if (currentInput === "0") {
                    alert("Cannot divide by zero!");
                    clearAll();
                } else {
                    currentInput = (parseFloat(previousInput) / parseFloat(currentInput)).toString();
                }
                break;
        }
        previousInput = "";
    }

    function updateDisplay() {
        display.value = currentInput;
    }

    function clearAll() {
        currentInput = "";
        previousInput = "";
        currentOperation = null;
        updateDisplay();
    }
});
