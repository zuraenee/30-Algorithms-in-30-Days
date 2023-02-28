#matrix keypad
testcase=int(input())

for i in range(testcase):
    rowgrid = input() #'3 3'
    num = rowgrid.split()
    row = int(num[0])
    col = int(num[1])
    if col<3:
        print("impossible")
        print("----------")
        continue
    else:
        if rowgrid!=1 or rowgrid!=0:
            keypad = [[0 for x in range(col)] for y in range(row)]
            for i in range(row):
                a=[]
                for j in range(col):
                    a.append(int(input()))
                keypad[i]=a

            for i in range(row):
                for j in range(col):
                    if keypad[i][j]==1 :
                        keypad[i][j]="I"
                    else:
                        keypad[i][j]="N"

            for i in range(row):
                for j in range(col):
                    print(keypad[i][j], end="")
                print()
            print("----------")
            keypad.clear()
            a.clear()
