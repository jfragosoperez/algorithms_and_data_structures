from datetime import time
from numpy.oldnumeric.random_array import randint


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
        pivotPosition = randint(0, len(numbersList) - 1)
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

def main():
    runSample()
    
    
def runSample():    
    numbers = [3, 30, 1, 2, 43, 432 , 43214, 44, 11, 13, 22, 22, 22, 22, 17, 34]
    
    print "Initial list" 
    print str(numbers) 
    
    # time in micros
    startTime = int(round(time.time() * 1000000))

    print quicksort(numbers)
    
    # time in micros
    endTime = int(round(time.time() * 1000000))
    
    print 'Sorting time ended up successfully lasting %d microseconds' % (endTime - startTime)


if __name__ == "__main__":
    main()
        
        
