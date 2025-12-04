☕ Coffee Machine

This project is a simple Coffee Machine simulator written in Java.
The user inserts coins, selects a coffee type, chooses the sugar level, and finally receives the product.

The goal of this program is to demonstrate:

User input handling

Conditional logic

Switch statements

Basic program flow control

(Future improvement) Delayed output before dispensing the product

🧠 Algorithm (Step-by-Step)

Insert coins

The program prompts the user to enter a monetary amount.

If the amount is less than the minimum required, an error message is displayed, and the user cannot proceed.

If the coins are enough, the user proceeds to the next step.

Select coffee type

The user chooses between different coffee types (Espresso, Macchiato, Americano).

This selection is handled using a switch statement.

Select sugar level

The user selects how much sugar they want (Little, Medium, High).

This is also done using a switch statement.

Combine both switches

Because we have two choices (coffee + sugar), in more complex designs, we could use a nested switch statement to handle all combinations.

For now, both inputs are processed separately and validated.

Final output

If all inputs are valid, the machine prints:
"Please take your product."

🚀 Planned Improvement (Your Current Goal)

In the final step, before printing “Please take your product”,
You want to:

⏳ Add a 10-second delay

After all choices are processed, the machine should:

Pause for 10 seconds

Then display the final message

In Java, this can be done using:

Thread.sleep(10000); // 10 seconds


This delay will simulate the real-life coffee preparation time.

✔ What Could Be Added in the Future

Here are more improvements you may continue with:

🔹 Dynamic prices for each coffee
🔹 Change calculation
🔹 Continuous menu loop
🔹 Input validation (no crashes if user types letters)
🔹 ASCII UI to make it look like a real machine
🔹 OOP version with Coffee, Sugar, Machine classes
