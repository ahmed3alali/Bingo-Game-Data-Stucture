# 🎲 Bingo Game - Multi-Linked List Implementation

**A two-player Bingo game built with Java Swing GUI, implementing custom Multi-Linked List data structures for efficient card management.**  
Built as a **Data Structures & Algorithms** project demonstrating advanced linked list concepts.


---

## 📘 Project Overview

This **Bingo Game** is a classic two-player Tombola/Bingo game featuring:
- Custom **Multi-Linked List** data structure for card representation
- **3x9 Bingo cards** with random number generation
- Real-time **Chinko** (row completion) and **Tombala** (full card) detection
- Interactive **Java Swing GUI** with visual feedback
- **Random number generator** (1-90) with duplicate prevention

The project emphasizes **data structure implementation** over GUI, showcasing how multi-dimensional linked lists can efficiently manage game state.

---

## 🎯 Game Rules

### Classic Tombola/Bingo Rules:
- Each player receives a **3x9 Bingo card**
- Each card contains **15 numbers** (5 per row) and **12 empty cells**
- Numbers range from **1-90**, distributed by column:
  - Column 1: 1-10
  - Column 2: 11-20
  - Column 3: 21-30
  - ... and so on up to Column 9: 81-90

### Winning Conditions:
- **First Chinko** 🥉: Complete 1 row (5 numbers)
- **Second Chinko** 🥈: Complete 2 rows (10 numbers)
- **Tombala** 🏆: Complete all 3 rows (15 numbers) - **Winner!**

---

## ✨ Key Features

### 🔗 Data Structure Implementation
- **Custom Multi-Linked List** with right and down pointers
- **2D node traversal** for efficient card representation
- Dynamic **number generation** and validation
- Matrix-to-linked-list conversion algorithms

### 🎮 Game Mechanics
- ✅ **Random card generation** with unique numbers per column
- ✅ **Duplicate-free number drawing** (1-90)
- ✅ **Real-time label coloring** (Red for matched numbers)
- ✅ **Automatic win detection** for Chinko and Tombala
- ✅ **Two-player simultaneous gameplay**
- ✅ **Visual status tracking** for both players

### 🎨 User Interface
- 📱 **Custom Java Swing GUI**
- 🎴 **Dual card display** (Player 1 vs Player 2)
- 🔢 **Live number generator** with button click
- 🏆 **Win notifications** with JOptionPane dialogs
- 🎯 **Color-coded matching** (Black → Red when matched)

---

## 🛠️ Technical Architecture

### Multi-Linked List Structure

```java
class MultiNode {
    int data;
    MultiNode right;  // Horizontal connection
    MultiNode down;   // Vertical connection
}
```

**Visualization:**
```
     1  →  X  →  25 →  X  → 48 →  X  → 67 →  X  → 90
     ↓     ↓     ↓     ↓     ↓     ↓     ↓     ↓     ↓
     X  →  12 →  X  →  34 →  X  → 56 →  X  → 78 →  X
     ↓     ↓     ↓     ↓     ↓     ↓     ↓     ↓     ↓
     5  →  X  →  29 →  X  → 45 →  X  → 63 →  X  → 87
```

Where:
- **X** = Empty cell (-1 in data)
- **Numbers** = Valid Bingo numbers
- **→** = Right pointer connection
- **↓** = Down pointer connection

---

## 🧩 Project Structure

```
📦 BingoGame
┣ 📂 src/
┃ ┣ 📂 com.mycompany.binggame/
┃ ┃ ┣ 📜 GameFrame.java          # Main game GUI
┃ ┃ ┣ 📜 WelcomePage.java        # Welcome screen
┃ ┃ ┗ 📜 MultiLinkedList.java    # Core data structure (inner class)
┣ 📂 images/
┃ ┣ 🖼️ game-banner.png
┃ ┣ 🖼️ gameplay-screenshot.png
┃ ┣ 🖼️ winning-moment.png
┃ ┗ 🖼️ data-structure-diagram.png
┣ 📜 README.md
┗ 📜 pom.xml / build.gradle
```

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK 8+** (Tested on Java 11, 17)
- **NetBeans IDE** (or any Java IDE supporting Swing)
- **Maven** (optional, for dependency management)

### Installation & Running

1. **Clone the repository**
```bash
git clone https://github.com/yourusername/bingo-game.git
cd bingo-game
```

2. **Open in NetBeans**
   - File → Open Project
   - Select the `BingoGame` folder

3. **Run the project**
   - Right-click on `WelcomePage.java` → Run File
   - Enter player names
   - Click "Start Game"

4. **Alternative: Command Line**
```bash
# Compile
javac -d bin src/com/mycompany/binggame/*.java

# Run
java -cp bin com.mycompany.binggame.WelcomePage
```

---



---

## 🔧 Core Algorithms

### 1. Card Generation Algorithm

```java
private static int[][] generateRandomCard(int rows, int columns) {
    // Generates 3x9 matrix with:
    // - 15 random numbers (5 per row)
    // - 12 empty cells (-1 markers)
    // - Column-based number ranges (1-10, 11-20, etc.)
    // - No duplicate numbers per column
}
```

**Key Features:**
- Ensures 5 numbers per row
- Maintains column range constraints
- Uses HashSet for duplicate prevention

---

### 2. Multi-Linked List Construction

```java
public MultiLinkedList(int[][] matrix) {
    // Convert 2D array to multi-linked list
    // Connect nodes horizontally (right pointers)
    // Connect nodes vertically (down pointers)
    // Set head to matrix[0][0]
}
```

---

### 3. Number Matching & Coloring

```java
private void checkAndModifyLabels(JLabel[][] card1, JLabel[][] card2, int number) {
    // Iterate through all labels
    // Match generated number with card numbers
    // Change foreground color to RED when matched
}
```

---

### 4. Win Detection

```java
private void printRedLabelCountsInRows(JLabel[][] cardLabels) {
    // Count red labels per row
    // 1 row complete → First Chinko
    // 2 rows complete → Second Chinko
    // 3 rows complete → Tombala (Winner!)
}
```

---

## 🎓 Learning Outcomes

This project demonstrates proficiency in:

- ✅ **Custom Data Structure Design** (Multi-Linked Lists)
- ✅ **2D Pointer Manipulation** (right/down navigation)
- ✅ **Random Number Generation** with constraints
- ✅ **Java Swing GUI Development**
- ✅ **Event-Driven Programming** (Button clicks, label updates)
- ✅ **Algorithm Optimization** (Duplicate prevention, efficient traversal)
- ✅ **Game Logic Implementation** (Win condition checking)
- ✅ **Code Organization** (Inner classes, helper methods)

---

## 🧠 Data Structure Details

### Node Structure
```java
class MultiNode {
    int data;           // Number (1-90) or -1 (empty)
    MultiNode right;    // Next node in row
    MultiNode down;     // Next node in column
}
```

### Traversal Patterns

**Horizontal Traversal (Row-wise):**
```java
MultiNode temp = head;
while (temp != null) {
    // Process current node
    temp = temp.right;
}
```

**Vertical Traversal (Column-wise):**
```java
MultiNode temp = head;
while (temp != null) {
    // Process current node
    temp = temp.down;
}
```

**Full Grid Traversal:**
```java
MultiNode rowNode = head;
while (rowNode != null) {
    MultiNode colNode = rowNode;
    while (colNode != null) {
        // Process node
        colNode = colNode.right;
    }
    rowNode = rowNode.down;
}
```

---

## 🐛 Known Issues & Improvements

### Current Limitations:
- ⚠️ **Hardcoded image paths** (line 241-245) - needs relative paths
- ⚠️ **No number history display** - drawn numbers not tracked visually
- ⚠️ **No game reset** - requires restart after win
- ⚠️ **Single game session** - can't play multiple rounds

### Future Enhancements:
- [ ] Add **number history panel** (all drawn numbers)
- [ ] Implement **game reset button** (new cards without restart)
- [ ] Add **sound effects** for number draws and wins
- [ ] Create **statistics tracker** (games played, win rates)
- [ ] Support **3+ players** (scalable card system)
- [ ] Add **AI opponent** mode
- [ ] Implement **network multiplayer** (Socket programming)
- [ ] Add **custom themes** and **dark mode**
- [ ] Save/load game state
- [ ] Add **animations** for number matching

---

## 🧪 Testing

### Manual Test Cases

| Test Case | Input | Expected Output |
|-----------|-------|-----------------|
| Card Generation | Run game | 2 unique 3x9 cards with 15 numbers each |
| Number Drawing | Click "Generate Number" | Random 1-90, no duplicates |
| Number Matching | Draw existing number | Label turns red on matching card |
| First Chinko | Complete 1 row | Status shows "FIRST CHINKO!" |
| Second Chinko | Complete 2 rows | Status shows "SECOND Chinko!" |
| Tombala Win | Complete 3 rows | Dialog: "Player X Won!" |
| No Match | Draw non-existing number | No label changes |

---

## 🤝 Contributing

Contributions are welcome! Areas for improvement:

1. **Code Refactoring**
   - Reduce label initialization boilerplate
   - Extract magic numbers to constants
   - Improve method naming conventions

2. **Feature Additions**
   - Number history tracker
   - Game reset functionality
   - Customizable card sizes

3. **Bug Fixes**
   - Fix relative image paths
   - Handle edge cases in win detection

**How to Contribute:**
1. Fork the repository
2. Create feature branch (`git checkout -b feature/NewFeature`)
3. Commit changes (`git commit -m 'Add NewFeature'`)
4. Push to branch (`git push origin feature/NewFeature`)
5. Open Pull Request

---

## 📝 Code Highlights

### Elegant Number Generation
```java
public int generateNumber() {
    Set<Integer> generatedNumbers = new HashSet<>();
    Random random = new Random();
    int number;
    do {
        number = random.nextInt(90) + 1;
    } while (generatedNumbers.contains(number));
    generatedNumbers.add(number);
    return number;
}
```

### Efficient Row Completion Check
```java
if (rowsWithFive >= 3) {
    // Tombala - Full Card Win
} else if (rowsWithFive == 2) {
    // Second Chinko
} else if (rowsWithFive == 1) {
    // First Chinko
}
```

---

## 📚 Academic Context

**Course:** Data Structures and Algorithms  
**Topic:** Advanced Linked List Implementations  
**Key Concepts:**
- Multi-dimensional linked structures
- Pointer manipulation in 2D space
- Algorithm design for game logic
- GUI integration with custom data structures

---

## 👨‍💻 Author

**Your Name**

- GitHub: [@yourusername](https://github.com/yourusername)
- LinkedIn: [Your Profile](https://linkedin.com/in/yourprofile)
- Email: your.email@example.com

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- Inspired by traditional **Tombola** games popular in Turkey and Italy
- Built as part of **Data Structures** coursework
- Thanks to **NetBeans Community** for GUI builder tools
- Special thanks to classmates for playtesting

---

<p align="center">
  <strong>⭐ If you enjoyed this project, please give it a star!</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white" alt="Swing">
  <img src="https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white" alt="NetBeans">
  <img src="https://img.shields.io/badge/Data_Structures-FF6B6B?style=for-the-badge&logo=databricks&logoColor=white" alt="Data Structures">
</p>

<p align="center">
  <em>Built with 🎲 and lots of ☕ - Let's play Bingo!</em>
</p>

---

## 🎯 Quick Links

- [View Source Code](src/com/mycompany/binggame/)
- [Report Bug](https://github.com/yourusername/bingo-game/issues)
- [Request Feature](https://github.com/yourusername/bingo-game/issues)
- [Discuss](https://github.com/yourusername/bingo-game/discussions)
