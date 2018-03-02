import re


def is_isogram(string):
    if string == "":
        return True
    else:
        string = re.sub("[^a-zA-z]+", "", string)  # Remove non-alpha chars
        string = string.lower()
        for letter in string:
            if string.count(letter) > 1:
                return False
        return True
