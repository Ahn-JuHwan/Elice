import re
init_password = input()
init = re.findall("\d+",init_password)
password = "".join(init)

print(password)