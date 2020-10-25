#python A550
import re
val = input()
match = re.match(r'(((AB)+\\w+(BA)+)|((BA)+\\w+(AB)+))',val)
if match:
    print("YES")
else:
    print("NO")