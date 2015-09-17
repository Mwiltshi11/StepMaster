'''
Created on Sep 11, 2015

@author: Mark Wiltshire
'''
#def main():
        #n = int (input ("Input the number of days in the month (28-31): "))
        #d = int (input ("Input the starting day (0=Sun,1=Mon, ...) "))
        #i = 1
        #while i <= n:
                #print (i)
                #i = i + 1 
                


#def main(): 
        #n = int(input("Input the number of days in the month (28-31): "))
        #d = int(input("Input the starting day (0=Sun,1=Mon,...): "))
        #i = 1 
        #while i <= n:
                #print (i, end=" ")
                #i = i +1
                
#main ()

#def main():
    
        #n = int(input("Input the number of days in the month (28-31) : "))
        #d = int(input("Input the starting day (0=Sun, 1=Mon, ...): "))
        #i = 1
        #while i<= n:
            #print (i, end=" ")
            #if (i+d) % 7 ==0:
                    #print (" ")
            #i = i + 1
            
#main ()

#def main():
  #     n = int(input("Input the number of days in the month (28-31): "))
   #    i = 1
    #    while i <= n:
     #           if i < 10:
      #         else:
       #                 print (i, end=" ")
        #        if (i+d) % 7 == 0:
         #               print (" ")
          #      i = i + 1
                
#main()

def main():
    n = int(input("Input the number of days in the month (28-31): "))
    d = int(input("Input the starting day (0=Sun, 1+Mon, ...): "))
    for i in range(d):
        print (" ", end=" ")
    i = 1
    while i <= n:
        if i < 10:
            print (" "+ str(i), end=" ")
        else:
            print (i,end=" ")
        if (i+d) % 7 == 0:
            print (" ")
        i = i + 1
        
main()
    