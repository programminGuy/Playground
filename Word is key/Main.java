keyList = ['break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var']
inp = str(input())
if inp in keyList:
  print(inp,'is a keyword')
else:
  print(inp,'is not a keyword')