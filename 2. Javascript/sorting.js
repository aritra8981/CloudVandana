// B. Perform sorting of an array in descending order.
const numbers = [5, 3, 1, 4, 2];

for (let i = 0; i < numbers.length - 1; i++) {
  for (let j = i + 1; j < numbers.length; j++) {
    if (numbers[i] < numbers[j]) {
      const temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }
  }
}

console.log(numbers);