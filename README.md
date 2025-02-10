
This project implements a simple game logic with a player, enemies, items, and level progression. The code follows SOLID principles.

How SOLID Principles Are Applied

1. Single Responsibility Principle (SRP)
Each class has a single responsibility:
- **Player** – Manages the player's health and experience.
- **Enemy** (abstract class) – Defines enemy attack logic.
- **Goblin, Dragon** – Represent different enemy types.
- **CombatManager** – Handles combat logic.
- **Item** (abstract class) – Represents game items.
- **HealthPotion, ExperienceBoost** – Implement specific item behaviors.
- **LevelManager** – Manages level progression.

2. Open/Closed Principle (OCP)
New enemy or item types can be added by extending **Enemy** or **Item** without modifying existing classes.

3. Liskov Substitution Principle (LSP)
Classes extending **Enemy** and **Item** can replace their parent classes without issues. For example, **Goblin**, **Dragon**, and **HealthPotion** function as expected.

4. Interface Segregation Principle (ISP)
Each functionality is separated into distinct classes, preventing unnecessary method exposure to unrelated objects.

5. Dependency Inversion Principle (DIP)
Abstract classes and interfaces decouple high-level modules from low-level details. **CombatManager**, **Enemy**, and **Item** ensure modularity and flexibility.

 Running the Project
1. Ensure Java is installed.
2. Compile the project:
   ```sh
   javac Game.java
   ```
3. Run the game:
   ```sh
   java Game
   ```

## Conclusion
This project follows SOLID principles to ensure maintainable and extendable object-oriented programming. You can add new functionality by creating new classes without modifying existing code.

