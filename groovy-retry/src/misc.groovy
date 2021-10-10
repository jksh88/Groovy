def (a,b,c) = [10, 20, 'hi']
assert a == 10 && c == 'hi'

def (int i, String j) = [7, 'why']
def (_, mo, year) = "18th October 2021".split()
assert "In $mo of $year" == "In October of 2021"