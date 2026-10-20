# 🚀 LeetCode DSA in Java

### My Data Structures & Algorithms Learning Journey

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk)
![Platform](https://img.shields.io/badge/Practice-LeetCode-yellow?logo=leetcode)
![Status](https://img.shields.io/badge/Status-In%20Progress-blue)
![Focus](https://img.shields.io/badge/Focus-DSA%20%7C%20Problem%20Solving-green)

A structured repository documenting my journey of learning **Data Structures and Algorithms (DSA) using Java** through LeetCode.

This repository contains topic-wise notes, problem-solving patterns, Java implementations, time and space complexity analysis, mistakes, and optimized solutions. The goal is to build strong problem-solving skills rather than simply collect accepted answers.

---

## 📌 Table of Contents

- [About This Repository](#-about-this-repository)
- [Learning Objectives](#-learning-objectives)
- [Learning Resources](#-learning-resources)
- [Complete DSA Roadmap](#-complete-dsa-roadmap)
- [Problem-Solving Workflow](#-problem-solving-workflow)
- [Repository Structure](#-repository-structure)
- [Topic-Wise Progress Tracker](#-topic-wise-progress-tracker)
- [Problem Difficulty Levels](#-problem-difficulty-levels)
- [Java Concepts for DSA](#-java-concepts-for-dsa)
- [Solution Documentation Format](#-solution-documentation-format)
- [Revision Strategy](#-revision-strategy)
- [Weekly Learning Routine](#-weekly-learning-routine)
- [Useful Links](#-useful-links)
- [My Goals](#-my-goals)

---

## 📖 About This Repository

Data Structures and Algorithms help programmers organize data, solve computational problems, and develop efficient solutions.

This repository follows a **concept-first, pattern-based, and practice-driven** approach.

For every topic, I aim to:

1. Understand the underlying concept.
2. Learn how the data structure or algorithm works.
3. Implement the concept in Java.
4. Understand its time and space complexity.
5. Solve relevant LeetCode problems.
6. Document the approach and mistakes.
7. Revisit problems until I can solve them independently.

**Primary language:** Java  
**Practice platform:** LeetCode  
**Version control:** Git and GitHub  
**Learning focus:** DSA fundamentals, coding patterns, algorithm analysis, and interview preparation.

---

## 🎯 Learning Objectives

- Strengthen programming logic and analytical thinking.
- Understand fundamental data structures and algorithms.
- Recognize common patterns in unfamiliar problems.
- Write clean, readable, and reusable Java code.
- Analyze time complexity and auxiliary space complexity.
- Compare brute-force and optimized approaches.
- Improve debugging and dry-running skills.
- Prepare for university DSA assessments and technical interviews.

---

## 📚 Learning Resources

I will use a small number of reliable resources instead of switching between too many tutorials.

| Resource | Purpose | Link |
|---|---|---|
| LeetCode | Solve problems and track submissions | [leetcode.com](https://leetcode.com/) |
| LeetCode Study Plans | Follow curated practice sequences | [Study Plans](https://leetcode.com/studyplan/) |
| LeetCode Interview Crash Course | Learn DSA concepts and interview patterns | [Course information](https://leetcode.com/discuss/post/2580423/New-Data-Structures-and-Algorithms-CONTENT%21/) |
| NeetCode | Topic-wise explanations and problem roadmaps | [neetcode.io](https://neetcode.io/) |
| Java documentation | Learn Java syntax and standard libraries | [dev.java](https://dev.java/learn/) |
| Java Collections Framework | Understand lists, sets, maps, queues, and related APIs | [Collections tutorials](https://dev.java/learn/api/collections-and-streams/collections-framework/) |
| VisuAlgo | Visualize data structures and algorithms | [visualgo.org](https://visualgo.org/) |
| GitHub | Store solutions, notes, and progress | [github.com](https://github.com/) |

### How I will use these resources

- **Concepts:** Study one topic using Java documentation or a clear tutorial.
- **Visual understanding:** Use VisuAlgo when an algorithm is difficult to visualize.
- **Guided practice:** Follow a relevant NeetCode roadmap section or LeetCode Study Plan.
- **Independent practice:** Solve problems on LeetCode without immediately viewing solutions.
- **Documentation:** Record my own explanation, implementation, complexity, and mistakes in this repository.

I will prioritize understanding over watching multiple videos on the same topic.

---

## 🗺️ Complete DSA Roadmap

The roadmap is organized in a recommended learning order. Advanced topics can take longer, so progress will depend on understanding rather than a fixed deadline.

### Phase 1: Programming and Problem-Solving Foundations

**Goal:** Become comfortable translating a problem statement into working Java code.

Topics to learn:

- Variables, data types, and operators
- Conditional statements
- `for`, `while`, and nested loops
- Methods and parameters
- Arrays and strings
- Basic input constraints
- Functions and return values
- Debugging and dry runs
- Basic mathematical operations
- Basic recursion

Practice:

- Find the maximum and minimum in an array.
- Reverse an array.
- Count occurrences of an element.
- Check whether a string is a palindrome.
- Calculate a factorial.
- Generate Fibonacci numbers.

**Completion criterion:** I can write simple Java methods independently and explain how they execute.

### Phase 2: Complexity Analysis

**Goal:** Understand how efficient a solution is.

Topics:

- Time complexity
- Auxiliary space complexity
- Big O notation: `O(1)`, `O(log n)`, `O(n)`, `O(n log n)`, `O(n²)`
- Best, average, and worst cases
- Complexity of nested loops
- Complexity of recursion
- Input constraints and algorithm selection

Practice:

- Analyze a single loop.
- Analyze nested loops.
- Compare linear and binary search.
- Compare brute-force and optimized solutions.
- Estimate the complexity of recursive algorithms.

**Completion criterion:** I can explain the time and auxiliary space complexity of my code.

### Phase 3: Arrays and Strings

**Goal:** Build confidence with indexed data and sequential processing.

Topics:

- Traversal and indexing
- In-place modification
- Reversing arrays
- Frequency counting
- Prefix sums
- Subarrays and subsequences
- Two-dimensional arrays
- String traversal and manipulation
- Character frequency
- Basic matrix operations

Problem patterns:

- Traversal
- Two pointers
- Prefix sum
- Sliding window
- Frequency counting

Starter problems:

- [Two Sum](https://leetcode.com/problems/two-sum/)
- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
- [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- [Valid Anagram](https://leetcode.com/problems/valid-anagram/)
- [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

**Completion criterion:** I can identify common array and string patterns and explain why they fit a problem.

### Phase 4: Searching and Sorting

**Goal:** Understand how to find elements and arrange data efficiently.

Topics:

- Linear search
- Binary search
- Binary search conditions and boundaries
- Bubble sort
- Selection sort
- Insertion sort
- Merge sort
- Quick sort
- Sorting with comparators
- Searching in sorted arrays

Practice:

- Implement basic searching and sorting algorithms.
- Trace each algorithm on a small example.
- Compare time complexities.
- Solve problems involving sorted arrays.

Starter problems:

- [Binary Search](https://leetcode.com/problems/binary-search/)
- [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
- [First Bad Version](https://leetcode.com/problems/first-bad-version/)
- [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

**Completion criterion:** I can implement binary search, explain its boundary conditions, and choose an appropriate sorting or searching approach.

### Phase 5: Hashing and Java Collections

**Goal:** Learn how to improve lookups and frequency-based operations.

Topics:

- Hashing fundamentals
- Hash collisions at a conceptual level
- `HashMap`
- `HashSet`
- Key-value pairs
- Frequency maps
- Duplicate detection
- Expected lookup complexity
- `ArrayList` and `List`
- `Deque`, `Queue`, and `PriorityQueue`

Starter problems:

- [Two Sum](https://leetcode.com/problems/two-sum/)
- [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- [Group Anagrams](https://leetcode.com/problems/group-anagrams/)
- [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

**Completion criterion:** I can recognize when hashing can replace repeated searching or nested loops.

### Phase 6: Two Pointers and Sliding Window

**Goal:** Learn patterns that process arrays and strings efficiently.

Two pointers:

- Opposite-direction pointers
- Same-direction pointers
- Sorted-array problems
- In-place updates
- Fast and slow pointers

Sliding window:

- Fixed-size windows
- Variable-size windows
- Maintaining window state
- Frequency maps within windows
- Expanding and shrinking a window

Starter problems:

- [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)
- [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- [3Sum](https://leetcode.com/problems/3sum/)
- [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)

**Completion criterion:** I can explain the invariant maintained by the pointers or window and why the approach works.

### Phase 7: Linked Lists

**Goal:** Understand node-based data structures and pointer/reference manipulation.

Topics:

- Nodes and references
- Singly linked lists
- Doubly linked lists
- Traversal
- Insertion and deletion
- Searching
- Reversing a linked list
- Slow and fast pointers
- Cycle detection
- Dummy nodes
- Merging linked lists

Starter problems:

- [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
- [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
- [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
- [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

**Completion criterion:** I can trace reference changes and implement insertion, deletion, reversal, and cycle detection.

### Phase 8: Stacks and Queues

**Goal:** Understand linear data structures and their applications.

Topics:

- LIFO and FIFO
- Stack operations: `push`, `pop`, `peek`
- Queue operations: enqueue and dequeue
- Circular queues
- Implementing a queue using stacks
- Implementing a stack using queues
- Balanced parentheses
- Monotonic stacks
- Monotonic queues

Starter problems:

- [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
- [Min Stack](https://leetcode.com/problems/min-stack/)
- [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
- [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
- [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/)

**Completion criterion:** I can select the right structure and explain how each operation changes its state.

### Phase 9: Recursion and Backtracking

**Goal:** Understand self-calling methods and systematic exploration of choices.

Topics:

- Base cases
- Recursive cases
- Call stack
- Recursion trees
- Recursive array and string problems
- Subsets
- Permutations
- Combinations
- Backtracking and undoing choices
- Pruning unnecessary exploration

Starter problems:

- [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
- [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
- [Subsets](https://leetcode.com/problems/subsets/)
- [Permutations](https://leetcode.com/problems/permutations/)
- [Combination Sum](https://leetcode.com/problems/combination-sum/)

**Completion criterion:** I can identify the base case, trace recursive calls, and explain how backtracking restores state.

### Phase 10: Trees and Binary Search Trees

**Goal:** Learn hierarchical data structures and recursive traversal.

Topics:

- Tree terminology
- Binary trees
- Binary search trees
- Preorder, inorder, and postorder traversal
- Level-order traversal
- Depth and height
- Tree recursion
- Balanced trees
- Lowest common ancestor
- Binary search tree operations

Starter problems:

- [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
- [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)
- [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
- [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

**Completion criterion:** I can perform traversals manually and solve basic recursive tree problems.

### Phase 11: Heaps and Priority Queues

**Goal:** Process minimum or maximum elements efficiently.

Topics:

- Min-heaps and max-heaps
- Heap insertion and removal
- Heap properties
- Java `PriorityQueue`
- Top K problems
- Kth-largest and Kth-smallest elements
- Heap-based merging

Starter problems:

- [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)
- [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)
- [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)

**Completion criterion:** I can explain when a heap is preferable to fully sorting a collection.

### Phase 12: Greedy Algorithms

**Goal:** Learn how locally optimal decisions can lead to a globally optimal result when justified.

Topics:

- Greedy-choice property
- Sorting-based greedy approaches
- Interval scheduling
- Interval merging
- Exchange arguments and correctness reasoning
- Greedy versus dynamic programming

Starter problems:

- [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
- [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
- [Jump Game](https://leetcode.com/problems/jump-game/)
- [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)
- [Merge Intervals](https://leetcode.com/problems/merge-intervals/)

**Completion criterion:** I can justify why a greedy choice is safe instead of relying on intuition alone.

### Phase 13: Binary Search Patterns and Intervals

**Goal:** Extend binary search beyond finding a target in a sorted array.

Topics:

- First and last occurrence
- Lower and upper bounds
- Search on the answer
- Monotonic predicates
- Binary search in rotated arrays
- Interval merging
- Interval intersections
- Sweep-line basics

Starter problems:

- [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
- [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
- [Insert Interval](https://leetcode.com/problems/insert-interval/)

**Completion criterion:** I can recognize monotonic conditions and define correct binary-search boundaries.

### Phase 14: Graphs

**Goal:** Understand relationships between connected objects.

Topics:

- Vertices and edges
- Directed and undirected graphs
- Weighted and unweighted graphs
- Adjacency lists and matrices
- Breadth-first search (BFS)
- Depth-first search (DFS)
- Visited sets
- Connected components
- Cycle detection
- Topological sorting
- Shortest paths
- Dijkstra's algorithm
- Union-Find / Disjoint Set Union
- Minimum spanning trees

Starter problems:

- [Number of Islands](https://leetcode.com/problems/number-of-islands/)
- [Clone Graph](https://leetcode.com/problems/clone-graph/)
- [Course Schedule](https://leetcode.com/problems/course-schedule/)
- [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)
- [Redundant Connection](https://leetcode.com/problems/redundant-connection/)

**Completion criterion:** I can represent a graph, choose BFS or DFS appropriately, and track visited nodes correctly.

### Phase 15: Dynamic Programming

**Goal:** Solve problems involving overlapping subproblems and reusable results.

Topics:

- Overlapping subproblems
- Optimal substructure
- Memoization (top-down)
- Tabulation (bottom-up)
- State definition
- Transition equations
- Base cases
- Space optimization
- One-dimensional DP
- Two-dimensional DP
- Knapsack-style problems
- Longest common subsequence
- Grid-based DP

Starter problems:

- [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
- [House Robber](https://leetcode.com/problems/house-robber/)
- [Coin Change](https://leetcode.com/problems/coin-change/)
- [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
- [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
- [Unique Paths](https://leetcode.com/problems/unique-paths/)

**Completion criterion:** I can define the DP state, write the transition, establish base cases, and explain the complexity.

### Phase 16: Advanced Topics

Study these after the fundamentals and common patterns are strong.

- Tries and prefix trees
- Bit manipulation
- Advanced graph algorithms
- Strongly connected components
- Minimum spanning trees in depth
- Advanced dynamic programming
- Union-Find optimizations
- Segment trees
- Fenwick trees / Binary Indexed Trees
- Advanced string algorithms
- Topological DP

The purpose of this phase is to broaden algorithmic knowledge, not to rush through difficult topics before mastering the basics.

---

## 🧠 Problem-Solving Workflow

I will follow the same process for every new LeetCode problem.

### Step 1: Understand the problem

- What is the input?
- What output is required?
- What constraints are given?
- Are duplicates, negative values, or empty inputs possible?
- What should happen in edge cases?

### Step 2: Work through an example

Use a small example and solve it manually. Trace the important variables and state changes.

### Step 3: Develop a brute-force approach

Start with a straightforward solution. Understand why it works before attempting optimization.

### Step 4: Analyze complexity

Determine the time and auxiliary space complexity of the initial approach.

### Step 5: Identify a possible pattern

Ask whether the problem can benefit from hashing, two pointers, sliding window, binary search, recursion, a heap, or another suitable technique.

### Step 6: Implement in Java

Write readable code, use meaningful variable names, and handle boundary conditions.

### Step 7: Test and submit

Test normal cases, edge cases, and larger inputs where relevant. Submit the solution on LeetCode.

### Step 8: Compare approaches

If an optimization is possible, compare the original and improved implementations and explain the trade-offs.

### Step 9: Document the solution

Save the code, problem link, approach, complexity, and important learning points in the repository.

### Step 10: Re-solve independently

Attempt the problem again without viewing the saved solution. A previously accepted submission does not automatically mean the concept is mastered.

---

## 📁 Repository Structure

I will organize the repository by topic rather than storing every solution in one folder.

```text
leetcode-dsa-java/
│
├── README.md
│
├── 00-foundations/
│   ├── notes/
│   ├── complexity-analysis/
│   └── basic-problems/
│
├── 01-arrays-and-strings/
│   ├── notes.md
│   ├── Easy/
│   ├── Medium/
│   └── Hard/
│
├── 02-searching-and-sorting/
│   ├── notes.md
│   ├── binary-search/
│   └── sorting-algorithms/
│
├── 03-hashing/
├── 04-two-pointers/
├── 05-sliding-window/
├── 06-linked-lists/
├── 07-stacks-and-queues/
├── 08-recursion-and-backtracking/
├── 09-trees-and-bst/
├── 10-heaps-and-priority-queues/
├── 11-greedy/
├── 12-intervals/
├── 13-graphs/
├── 14-dynamic-programming/
├── 15-bit-manipulation/
├── 16-advanced-topics/
│
├── patterns/
│   ├── pattern-cheatsheet.md
│   └── pattern-recognition.md
│
├── revision/
│   ├── mistakes.md
│   ├── revisit-problems.md
│   └── complexity-cheatsheet.md
│
└── progress/
    └── problem-tracker.md
```

Each topic folder will contain the relevant Java solutions and notes. Easy, Medium, and Hard folders can be added as the number of solutions grows.

---

## 📊 Topic-Wise Progress Tracker

Use the checkboxes to track learning progress. Completing a topic means understanding the concepts and solving representative problems independently, not merely watching a tutorial.

- [ ] Programming foundations
- [ ] Time and space complexity
- [ ] Arrays and strings
- [ ] Searching and sorting
- [ ] Hashing and Java Collections
- [ ] Two pointers
- [ ] Sliding window
- [ ] Linked lists
- [ ] Stacks and queues
- [ ] Recursion
- [ ] Backtracking
- [ ] Trees and BSTs
- [ ] Heaps and priority queues
- [ ] Greedy algorithms
- [ ] Binary search patterns
- [ ] Intervals
- [ ] Graphs
- [ ] Dynamic programming
- [ ] Bit manipulation
- [ ] Advanced topics
- [ ] Mixed-topic revision
- [ ] Timed practice

### Problem tracker

For detailed tracking, maintain a separate file at `progress/problem-tracker.md`.

| Problem | Topic | Difficulty | Status | Revisit |
|---|---|---|---|---|
| Two Sum | Arrays / Hashing | Easy | In progress | Yes |
| Contains Duplicate | Hashing | Easy | Not started | No |
| Binary Search | Searching | Easy | Not started | No |

**Status definitions**

- `Not started`: The problem has not been attempted.
- `Attempted`: I have tried to solve it.
- `Solved`: I solved it and passed the tests.
- `Revised`: I solved it again independently.
- `Mastered`: I can explain the approach, prove why it works, and analyze its complexity.

---

## ⚖️ Problem Difficulty Levels

### Easy

Focus on understanding the statement, implementing the correct solution, and building confidence.

### Medium

Focus on recognizing patterns, choosing data structures, handling edge cases, and optimizing the approach.

### Hard

Focus on advanced combinations of patterns, mathematical reasoning, correctness proofs, and performance constraints.

**Rule:** I will prioritize a strong understanding of Easy and common Medium problems before spending significant time on Hard problems.

---

## ☕ Java Concepts for DSA

Before using a data structure in a solution, I should understand both the underlying concept and its Java implementation.

| Java concept | What to learn |
|---|---|
| Arrays | Declaration, indexing, traversal, copying |
| Strings | Immutability, character access, string operations |
| `StringBuilder` | Efficient construction and modification of strings |
| Methods | Parameters, return values, method calls |
| Classes and objects | Node classes and object references |
| `ArrayList` | Dynamic arrays and indexed access |
| `HashMap` | Key-value storage and frequency counting |
| `HashSet` | Unique values and membership checking |
| `Deque` | Stack-like and queue-like operations |
| `Queue` | FIFO processing |
| `PriorityQueue` | Min-heap behavior and custom ordering |
| Comparators | Custom sorting and priority ordering |
| Recursion | Method calls and the call stack |
| Generics | Type-safe reusable data structures |

Official reference: [Java Collections Framework](https://dev.java/learn/api/collections-and-streams/collections-framework/).

For each structure, I should know:

1. What problem it solves.
2. Its common operations.
3. The expected time complexity of those operations.
4. Its Java syntax.
5. When to use it and when not to use it.

---

## 📝 Solution Documentation Format

Every important solution should be documented consistently.

For Java solutions, use a filename based on the problem, such as `TwoSum.java`. LeetCode submissions that require a `Solution` class should retain LeetCode's expected method signature.

Example documentation:

```markdown
# Two Sum

- Platform: LeetCode
- Difficulty: Easy
- Topic: Arrays / Hashing
- Problem: https://leetcode.com/problems/two-sum/

## Problem Summary

Find two distinct indices whose values add up to the target.

## Approach

Explain the approach in your own words.

## Java Solution

Add the complete solution here.

## Complexity Analysis

- Time Complexity: O(...)
- Auxiliary Space Complexity: O(...)

## Edge Cases

- Minimum input size
- Duplicate values
- Negative values, if allowed

## What I Learned

Write the key concept learned from the problem.

## Mistakes and Improvements

Document implementation mistakes and possible optimizations.

## Revision

- [ ] Re-solved without looking at the solution
- [ ] Explained the complexity
- [ ] Explained why the approach works
```

For simple problems, this can be shortened. For important pattern-based problems, retain the complete explanation.

---

## 🔁 Revision Strategy

Learning a pattern once is not enough. I will revisit difficult problems and problems where I needed hints.

Suggested revision intervals:

- **Day 1:** Solve and document the problem.
- **Day 2:** Attempt it again without viewing the solution.
- **Day 7:** Re-solve and explain the approach.
- **Day 14:** Test whether I can recognize the pattern in a different problem.
- **Day 30:** Include the problem in a mixed-topic practice session.

These are suggested intervals, not strict deadlines. If I still need hints, I will continue revising the problem.

### Mistakes log

In `revision/mistakes.md`, record:

- Problem name and link
- What I misunderstood
- The implementation error or incorrect assumption
- Why the approach failed
- How I corrected it
- What I will check next time

The purpose is to recognize repeated mistakes and avoid making the same ones again.

---

## 📅 Weekly Learning Routine

A manageable routine is more useful than an unrealistic daily target.

| Day | Focus |
|---|---|
| Monday | Learn a new concept and implement a basic example |
| Tuesday | Solve Easy problems for that topic |
| Wednesday | Learn a common pattern and solve a guided example |
| Thursday | Attempt problems independently |
| Friday | Compare approaches and analyze complexity |
| Saturday | Re-solve previous problems and attempt a Medium problem |
| Sunday | Review notes, update GitHub, and plan the next week |

### Suggested daily session

- **15 minutes:** Revise the previous concept.
- **25 minutes:** Learn one new concept.
- **35 minutes:** Attempt a problem independently.
- **15 minutes:** Test, analyze, and document the solution.

Adjust the duration according to university workload and upcoming exams.

---

## 🔗 Useful Links

### Practice

- [LeetCode Problems](https://leetcode.com/problemset/)
- [LeetCode Study Plans](https://leetcode.com/studyplan/)
- [NeetCode](https://neetcode.io/)
- [LeetCode 75](https://leetcode.com/studyplan/leetcode-75/)

### Concepts and Visualization

- [Java Learning Resources](https://dev.java/learn/)
- [Java Collections Framework](https://dev.java/learn/api/collections-and-streams/collections-framework/)
- [VisuAlgo](https://visualgo.org/)

### Repository Management

- [GitHub Docs](https://docs.github.com/)
- [Git Handbook](https://guides.github.com/introduction/git-handbook/)

---

## 🎯 My Goals

- [ ] Build a strong foundation in Java problem-solving.
- [ ] Understand time and auxiliary space complexity.
- [ ] Master common DSA patterns.
- [ ] Solve Easy problems independently.
- [ ] Progress to common Medium problems.
- [ ] Maintain clean and organized Java solutions.
- [ ] Document mistakes and revise previously solved problems.
- [ ] Complete a curated interview-preparation problem set.
- [ ] Become confident in explaining solutions and their complexity.

## 🌱 Final Note

This repository represents a continuous learning process. The goal is not to solve the highest number of problems as quickly as possible; it is to understand how to approach unfamiliar problems, choose suitable data structures, write correct Java code, and explain why a solution works.

**Learn the concept → Understand the pattern → Solve independently → Analyze complexity → Document → Revise.**

---

*Built with Java, LeetCode, consistency, and a commitment to learning.*

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
| Problem Name | Difficulty |
| ------- | ------- |
| [0001-two-sum](https://github.com/erumnaz-code/leetcode-dsa-in-java/tree/main/0001-two-sum/) | Easy |
## Hash Table
| Problem Name | Difficulty |
| ------- | ------- |
| [0001-two-sum](https://github.com/erumnaz-code/leetcode-dsa-in-java/tree/main/0001-two-sum/) | Easy |
## Linked List
| Problem Name | Difficulty |
| ------- | ------- |
| [0002-add-two-numbers](https://github.com/erumnaz-code/leetcode-dsa-in-java/tree/main/0002-add-two-numbers/) | Medium |
## Math
| Problem Name | Difficulty |
| ------- | ------- |
| [0002-add-two-numbers](https://github.com/erumnaz-code/leetcode-dsa-in-java/tree/main/0002-add-two-numbers/) | Medium |
## Recursion
| Problem Name | Difficulty |
| ------- | ------- |
| [0002-add-two-numbers](https://github.com/erumnaz-code/leetcode-dsa-in-java/tree/main/0002-add-two-numbers/) | Medium |
<!---LeetCode Topics End-->