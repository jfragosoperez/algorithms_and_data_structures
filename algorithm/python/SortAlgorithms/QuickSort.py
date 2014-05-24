import time
from random import randrange


# Choosing a random pivot minimizes the chance that 
# you will encounter worst-case O(n2) performance (always 
# choosing first or last would cause worst-case performance 
# for nearly-sorted or nearly-reverse-sorted data). Choosing 
# the middle element would also be acceptable in the majority of cases.
# Quicksort is usually faster than other O(nlogn) algorithms

# best case --> O(nlogn) comparisons
# average --> O(nlogn) comparisons
# worst case --> O(n^2)

# Space complexity --> Worst: O(n)


def quicksort(numbersList):
    less = [ ]
    greater = [ ]
    equal = [ ]
    
    if len(numbersList) > 1:
        #python method randrange counts up to penultimate element, 
        #if we want to keep on using the default behaviour that
        #other programming languages, are used to
        #we can use randint(0, len(numbersList)-1)
        pivotPosition = randrange(0, len(numbersList))
        for element in numbersList:
            if element < numbersList[pivotPosition]:
                less.append(element)
            elif element > numbersList[pivotPosition]:
                greater.append(element)
            else:
                equal.append(element)
        return quicksort (less) + equal + quicksort (greater) 
    else:
        return numbersList  

    
def runSample():    
    numbersShortList = [3, 30, 1, 2, 43, 432 , 43214, 44, 11, 13, 22, 22, 22, 22, 17, 34]
    numbersLargeList = numbersShortList * 1000

    print 'TEST WITH SHORT LIST'
    runQuickSortTest(numbersShortList)
    
    print 'TEST WITH A LARGE LIST'
    runQuickSortTest(numbersLargeList)


def runQuickSortTest(numbersList):
    
    # time in micros
    startTime = int(round(time.time() * 1000000))

    print quicksort(numbersList)
    
    # time in micros
    endTime = int(round(time.time() * 1000000))
    
    print 'Sorting time ended up successfully lasting %d microseconds' % (endTime - startTime)

if __name__ == "__main__":
    runSample()
        
        
