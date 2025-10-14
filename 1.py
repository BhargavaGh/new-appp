import os

# Get
print(os.environ.get("HOME"))

# Set
os.environ["MYVAR"] = "DevOps"
print(os.environ.get("MYVAR"))
