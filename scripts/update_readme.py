import os
import re

SRC_DIR = "src/leetcode"
README = "README.md"

pattern = re.compile(r"_([0-9]+)_(.+)\.java")

problems = []

if not os.path.exists(SRC_DIR):
    print("Source directory not found:", SRC_DIR)
    exit(1)

for file in os.listdir(SRC_DIR):
    m = pattern.match(file)
    if m:
        num = int(m.group(1))
        name = m.group(2).replace("_", " ")
        problems.append((num, name))

problems.sort()

lines = []
lines.append("# LeetCode Medium Solutions\n\n")
lines.append("## ✅ Solved Problems\n\n")

for n, name in problems:
    lines.append(f"- **{n}** — {name}\n")

with open(README, "w", encoding = "utf-8") as f:
    f.writelines(lines)

print("README updated.")