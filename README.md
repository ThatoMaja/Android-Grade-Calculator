# Grade Calculator Android App

An intuitive Android application designed to simplify a teacher's task of calculating and managing student grades. This app was built to support high school educators, like Sarah, by automating average score calculation and grade assignment based on inputted subject scores.

---

## Overview

**Project Title**: Grade Calculator App  
**Purpose**: Automate grade calculations to reduce manual effort and eliminate human error  
**Audience**: Teachers, students, and education facilitators  
**Platform**: Android  
**Tech Stack**: Java & XML (Android Studio)

---

## Features

- Input fields for:
  - Student name
  - Scores in **Mathematics**, **Science**, and **English**
- Button to **calculate average** and **assign grade**
- Displays:
  - Student's name
  - Calculated average (to two decimal places)
  - Final grade (A, B, C, or F)
- Input validation:
  - Prompts user if any field is empty
  - Handles non-numeric values gracefully

---

## Grade Criteria

| Average Score (%) | Grade |
|-------------------|-------|
| 90 – 100          | A     |
| 80 – 89           | B     |
| 70 – 79           | C     |
| Below 70          | F     |

---

## User Interface

A minimal and clean layout:
- 3 `EditText` fields for subject scores
- 1 `EditText` for student name
- 1 `Button` to trigger calculation
- 1 `TextView` to display the result

---

## How to Run

1. Open the project in **Android Studio**
2. Run the app on an emulator or physical device
3. Enter:
   - Student name
   - Scores for Math, Science, and English
4. Tap **“Calculate”**
5. View result in the display area

---

