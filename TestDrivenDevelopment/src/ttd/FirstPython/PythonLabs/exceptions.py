'''
Created on Sep 10, 2015

@author: step
'''
def exceptioncontrol():
    yoursmart=0
    while(yoursmart==0):
        try:
            a =int(input("Tell me your age"))
            print ("you were born in the year", 2015-a)
            yoursmart=True
        except:
            print ("you gave me a string")
        
exceptioncontrol()