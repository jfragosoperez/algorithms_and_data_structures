import time
from random import randint

# More efficient in practice than most other simple quadratic 
# (i.e., O(n2)) algorithms such as selection sort or bubble sort;
# When humans manually sort something (for example, a deck of 
# playing cards), most use a method that is similar to insertion 
# sort.

# best case (nearly sorted input) is O(n)
# average --> O(n^2) comparisons
# worst case --> O(n^2)

# Space complexity --> O(1)


def insertionSort(numbersList):
        
    counter = 0    
    while counter < len(numbersList):
        currentItemPosition = counter
        swappingValue = numbersList[currentItemPosition]
        
        while currentItemPosition > 0 and swappingValue < numbersList[currentItemPosition - 1]:
            numbersList[currentItemPosition] = numbersList[currentItemPosition - 1]
            currentItemPosition -= 1
        numbersList[currentItemPosition] = swappingValue    
        counter += 1        
    
    return numbersList    


def runSample():    
    numbersShortList = [randint(1, 500) for _ in range(0, 11)]
    numbersLargeList = [randint(1, 500) for _ in range(0, 15000)]

    print 'TEST WITH SHORT LIST'
    runInsertionSortTest(numbersShortList)
    
    print 'TEST WITH A LARGE LIST'
    runInsertionSortTest(numbersLargeList) 


def runInsertionSortTest(numbersList):
    
    # time in micros
    startTime = int(round(time.time() * 1000000))

    print insertionSort(numbersList)
    
    # time in micros
    endTime = int(round(time.time() * 1000000))
    
    print 'Sorting time ended up successfully lasting %d microseconds' % (endTime - startTime)

if __name__ == "__main__":
    runSample()
