import calendar
'''
Created on Sep 22, 2015
@author: Mark
'''



def main():

    count = 0
    while count < 5:
        if count > 0:
            print("\n")
        n = int(input("Input the number of days in the month (28-31): "))
        d = int(input("Input the starting day (0=Sun, 1=Mon, 2=Tue, 3=Wed, 4=Thur, 5=Fri, 6=Sun, 7=Eight): "))
        count = count + 1
        for j in range(d):
            print("  ",end=" ") 
        i = 1
        while i <= n:
            if i < 10:
                print(" "+str(i), end=" ")
            else:
                print(i, end=" ")
            if (i + d) % 8 == 0:
                print(" ")
            i = i + 1
            
              
main() 