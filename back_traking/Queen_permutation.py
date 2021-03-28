def queenPermute(boxes, qpsf, tq, ans):
    global count
    if qpsf == tq:
        count += 1
        print(ans)
        return

    for i in range(len(boxes)):
        if boxes[i] == False:
            boxes[i] = True
            queenPermute(boxes, qpsf + 1, tq, ans + 'q' + str(qpsf) + 'b' + str(i) + " ")
            boxes[i] = False

count = 0
boxes = [False] * 4
queenPermute(boxes, 0, 2, '')
print(count)