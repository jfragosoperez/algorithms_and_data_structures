import time


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
        
    for i in range(1, len(numbersList)):
        currentItemPosition = i
        swappingValue = numbersList[currentItemPosition]
        
        while currentItemPosition > 0 and swappingValue < numbersList[currentItemPosition - 1]:
            numbersList[currentItemPosition] = numbersList[currentItemPosition - 1]
            currentItemPosition -= 1
        numbersList[currentItemPosition] = swappingValue    
            
    return numbersList    


def main():
    runSample()
    
    
def runSample():    
    numbers = [3, 30, 1, 2, 43, 432 , 43214, 44, 11, 13, 22, 22, 22, 22, 17, 34]
    
    print "Initial list" 
    print str(numbers) 
    
    # time in micros
    startTime = int(round(time.time() * 1000000))
    
    print insertionSort(numbers)
    
    # time in micros
    endTime = int(round(time.time() * 1000000))
    
    print 'Sorting time ended up successfully lasting %d microseconds' % (endTime - startTime) 


if __name__ == "__main__":
    main()
