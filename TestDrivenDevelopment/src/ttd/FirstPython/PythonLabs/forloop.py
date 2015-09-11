'''
Created on Sep 10, 2015

@author: step
'''
def alist():
    sampleList = [5,7,9, "Bob", "Apple",11,15,0]
    for a in sampleList:
        print(a)
    sampleList.pop(3)
    print("")
    print('Break')
    for a in sampleList:

        alist()