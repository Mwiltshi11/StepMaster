'''
Created on Sep 10, 2015

@author: Mark Wiltshire
'''
def main():
   
    print(factorial(5))
    factorial2(5) 
    factorial3(10)
   
    oneBillion(1)
    

def factorial(num):
    if num == 0: 
        return 1  
    else:  
      num = num * factorial(num - 1)
    return num



def factorial2(num):
    f = 1
    n = 0
    for i in range(num):
        n += 1
        f *= n 
        print(f)
        

def factorial3(num):
    f = 1
    n = 0
    while (n < num):
        n += 1
        f *= n
        print(f)
        
def oneBillion(num):
    result = factorial(num)
    billion = 1000000000
    while result < billion :
        result = factorial(num) 
        if result < billion : 
            print(result)
            num += 1
main()