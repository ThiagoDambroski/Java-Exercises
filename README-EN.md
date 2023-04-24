## Java Exercise Repository

This repository contains a collection of Java exercises. Below you will find a brief summary of each exercise:

- [Atbash Cipher](#atbash-cipher)
- [Bob Exercise](#bob-exercise)
- [Crypto Square](#crypto-square)
- [Knapsack](#knapsack)
- [Nucleotide count](#nucleotide-count)
- [Robot Exercise](#robot-exercise)

<h2 id="atbash-cipher">Atbash Cipher</h2>
  
  <p>The Atbash cipher is an ancient encryption system created in the Middle East. Your task is to implement this cipher in Java. The Atbash cipher is a simple substitution cipher that relies on transposing all the letters in the alphabet such that the resulting alphabet is backwards. The first letter is replaced with the last letter, the second with the second-last, and so on. Ciphertext is written out in groups of fixed length, and punctuation is excluded.</p>
  [Atbash Cipher Solution](Java-Exercises/src/atbashCipher/ "Click to view the Atbash Cipher solution")

  <h2 id="bob-exercise">Bob Exercise</h2>
  
  <p>Bob is a fictional character who has a limited number of responses to certain types of messages. In this exercise, you will create a Java program that will determine what Bob will reply to someone when they say something to him or ask him a question. Bob only ever answers one of five things: "Sure.", "Whoa, chill out!", "Calm down, I know what I'm doing!", "Fine. Be that way!", and "Whatever."</p>

  <h2 id="crypto-square">Crypto Square</h2>
  
  <p>The Crypto Square is a classic method for composing secret messages. Your task is to implement this method in Java. Given an English text, the text is first normalized by removing spaces and punctuation and downcasing the text. Then the normalized characters are broken into rows, which can be regarded as forming a rectangle when printed with intervening newlines. The plaintext should be organized into a rectangle such that the number of columns is greater than or equal to the number of rows, and the difference between the number of columns and the number of rows is at most 1. The coded message is obtained by reading down the columns going left to right. The output should be the encoded text in chunks that fill perfect rectangles, separated by spaces.</p>

<h2 id="knapsack">Knapsack</h2>
  
  <p>In the knapsack problem, you are given a knapsack with a specific carrying capacity and a list of items, each with a value and weight. Your task is to help Bob determine the maximum value he can get from the items in the house. Note that Bob can take only one of each item. All values given will be strictly positive.</p>
  
<h2 id ="nucleotide-count">Nucleotide count</h2>
  
<p>The Nucleotide count exercise involves counting the occurrence of each nucleotide (A, C, G, T) in a given DNA sequence represented as a string of characters. If the string contains any other characters, an error should be signaled.</p>

<h2 id="robot-exercise">Robot Exercise</h2>
  
<p>involves creating a program that can simulate robot movements on a hypothetical infinite grid. The robots can turn right, turn left, or advance (move forward) in the direction they are facing (north, east, south, or west). The program should be able to take a series of instructions and move the robot accordingly, and output its new position and facing direction.</p>
