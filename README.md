# COSC 3P91 Assignment 1 - Design Description Document

This repository contains the Design Description Document for Assignment 1 of COSC 3P91.

## Contents

- `latex_template/` - LaTeX source files and templates
- `latex_template/manuscript.tex` - Main LaTeX document with Question 2 design description
- `latex_template/manuscript.pdf` - Generated PDF document
- `assignment1 (1).pdf` - Assignment specification

## Important: Before Submission

**You must update the following placeholders in `latex_template/manuscript.tex`:**
- Line 70: Replace `StudentID` with your actual student ID
- Line 72: Replace `Author Name` with your actual name

## Compiling the LaTeX Document

### Prerequisites

You need to have LaTeX installed on your system. On Ubuntu/Debian:

```bash
sudo apt-get update
sudo apt-get install texlive-latex-base texlive-latex-extra texlive-fonts-recommended texlive-science
```

### Compilation

To compile the LaTeX document:

```bash
cd latex_template
pdflatex manuscript.tex
pdflatex manuscript.tex  # Run twice to resolve cross-references
```

The generated PDF will be `manuscript.pdf` in the `latex_template/` directory.

## Question 2: Design Description

The manuscript includes a complete answer for Question 2, which describes and justifies the UML design decisions for a village-war strategy game system. The design description covers:

1. **Overview of the System Design** - High-level architecture and design goals
2. **Package Structure** - Organization into modular packages (village, inhabitants, army, gameengine, player, ui)
3. **Building Hierarchy** - Abstract Building class with concrete subclasses (Farm, ArcherTower, Cannon, etc.)
4. **Villager Hierarchy** - Abstract Villager class with specialized roles (Worker, Miner, Collector, Lumberjack)
5. **Army and Army Units** - Army class with ArmyUnit hierarchy (Knight, Archer, Catapult)
6. **Village Class** - Central hub for player progression
7. **Game Engine** - Coordinates overall game flow
8. **Player and UI** - Player information and user interface layer
9. **Design Principles and Justification** - OOP principles (Encapsulation, Inheritance, Polymorphism, Extensibility, Separation of concerns)

## Assignment Requirements

This assignment focuses on:
- Designing a UML class diagram for a village-war strategy game
- Providing a comprehensive description of design decisions
- Demonstrating understanding of object-oriented design principles
- Ensuring the design supports required behaviors: building, training, upgrading, village generation, attack exploration, and attacking
