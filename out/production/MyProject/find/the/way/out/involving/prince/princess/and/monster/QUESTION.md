You have:

- A 2D matrix representing the map.

- Each cell contains:

    0: Empty space
    1: Monster (deadly)
    2: Blocked path

- Prince and monsters move 1 unit per time unit in 4 directions (up/down/left/right).

You are given:

    The start position of the prince: (px, py)
    The target position of the princess: (tx, ty)

Goal:
- Determine if the prince can reach the princess without ever being in a cell where a monster could be present at that
  same or earlier time.

Sample Inputs:-
```
Input 1 (Path Exists Before Monsters Arrive)
Grid:
    0 0 0 0
    0 1 0 2
    0 0 0 0

Prince Start: (0, 0)
Princess Location: (2, 3)

Output: NO (The prince can reach before monsters spread)
```

```
Input 2: Monster Reaches Sooner
Grid:
    0 0 1 0
    0 2 2 0
    0 0 0 0

Prince: (2, 0)
Princess: (0, 3)

Output: NO (Monster spreads faster or blocks the route.)
```
```
Input 3: No Path Due to Walls
Grid:
    2 2 2
    2 0 2
    2 0 2

Prince: (1, 1)
Princess: (2, 1)

Output: YES (No monster interference, but limited path — prince still reaches.)
```
```
Input 4: Princess Already Occupied by Monster
Grid:
    0 0 0
    0 1 0
    0 0 1

Prince: (0, 0)
Princess: (2, 2)

Output: NO (Princess cell has a monster from the beginning.)
```
```
Input 5: Monster and Prince Start Near Each Other
Grid:
    0 0 0
    1 2 0
    0 0 0

Prince: (2, 0)
Princess: (0, 2)

Output: NO (Monster will cut off the prince quickly.)
```