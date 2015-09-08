'''
Created on Sep 8, 2015

@author: step
'''
def toFarenheit(temp):  
    
    return float(temp) * 1.8 + 32

def main():
    celsius = input("Enter a teperature in Celsius")
    farenheit = toFarenheit (celsius)
    print ("The temperature in Celsius: ")
    print (celsius)
    print ("The temperature in Farenheit is: ")
    print (farenheit) 
    


main()