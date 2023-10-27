// A. Take a sentence as an input and reverse every word in that sentence

const sentence =
  "Take a sentence as an input and reverse every word in that sentence";
const words = sentence.split(" ");

for (let i = 0; i < words.length; i++) {
  let reversed = "";
  for (let j = words[i].length - 1; j >= 0; j--) {
    reversed += words[i][j];
  }
  words[i] = reversed;
}

const reversedSentence = words.join(" ");
console.log(reversedSentence);
