s = input()
s = list(s)
copy = []
for i in range(len(s)):
  if s[i] not in copy:
    copy.append(s[i])
copy.reverse()
print("".join(copy))