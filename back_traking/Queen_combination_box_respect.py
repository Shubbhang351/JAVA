def queenCombination(boxes, tq, qpsf, ans, box):

    # it is mandatory to arrange base cases in the same order to get best results
    if qpsf == tq:
        print(ans)
        return
    if box >= len(boxes):
        return
    
    # place queen in current box
    boxes[box] = True
    queenCombination(boxes, tq, qpsf + 1, ans + 'b' + str(box) + " ", box + 1)
    boxes[box] = False

    # not place queen in current box
    queenCombination(boxes, tq, qpsf, ans, box + 1)

boxes = [False] * 4

# total queen
tq = 3

# queen placeed so far
qpsf = 0

# ans
ans = ''

# current box
box = 0

queenCombination(boxes, tq, qpsf, ans, box)