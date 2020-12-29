# MinimalTree
Exercise related with Trees and Graphs.

## Exercise Challenge
Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree with minimal height.

### Solution
I have implemented a recursive algorithm. 
The key concept is that the middle of each subsection becomes the root of the subtree we are, the left half of the array will become our left subtree, and the right half of the array will become the right subtree. 
So, the root of the tree is the node in the middle of the array, etc. 
See the code to understand the details of the recursion.