# 🚀 Day 5 - Arrays & ArrayList in Java

## 📌 What I Learned

Today I learned about Arrays and ArrayLists in Java, how they work internally, memory allocation, indexing, and the difference between fixed-size arrays and dynamic ArrayLists.

---

## 🧠 Key Concepts

### 🔹 Why Arrays?

Arrays are used to store multiple values of the same data type using a single variable.

Example:

```java id="o0ah90"
int[] arr = {1, 2, 3, 4, 5};
```

Instead of creating many separate variables, arrays help organize data efficiently.

---

### 🔹 Array Declaration & Initialization

```java id="w6mq58"
int[] arr;              // declaration
arr = new int[5];      // initialization
```

Or directly:

```java id="y0f69z"
int[] arr = {10, 20, 30};
```

---

### 🔹 Internal Working of Arrays

* Array reference variable is stored in stack memory
* Actual array object is created in heap memory
* Memory allocation happens during runtime using `new`

---

### 🔹 Indexing in Arrays

Arrays use zero-based indexing.

Example:

```java id="n2wrj7"
arr[0] = 10;
arr[1] = 20;
```

Elements can be accessed or modified using indexes.

---

### 🔹 Default Values in Arrays

If values are not assigned:

* `int` → 0
* `boolean` → false
* `String` → null

---

### 🔹 Mutable Nature of Arrays

Array elements can be modified after creation, so arrays are mutable.

Example:

```java id="hvf76z"
arr[2] = 99;
```

---

### 🔹 2D Arrays

2D arrays are arrays of arrays.

Example:

```java id="7gk66m"
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Accessing elements:

```java id="4lj9x5"
arr[0][2]
```

---

### 🔹 ArrayList

ArrayList is part of Java Collection Framework and provides dynamic arrays.

Example:

```java id="n5hptw"
ArrayList<Integer> list = new ArrayList<>();
```

Features:

* Dynamic size
* Can grow automatically
* Easier to use compared to normal arrays

---

### 🔹 Internal Working of ArrayList

* Internally uses arrays
* When capacity becomes full:

  1. Creates a larger array
  2. Copies old elements
  3. Deletes old array

---

## 💻 Concepts Practiced

✔ Array declaration
✔ Array initialization
✔ Indexing
✔ 2D arrays
✔ ArrayList basics
✔ Stack vs Heap memory understanding

---

## 📊 My Learning

Today I understood how arrays store data internally and how ArrayList works dynamically in Java.
I also learned the difference between stack memory and heap memory in array allocation.

---

## ✅ Status

✔ Completed
