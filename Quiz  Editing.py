
# A quiz that tests the user on a series of questions and gives them a grade
# Uses a menu system to select the type of quiz and exit the program


# ask for the name and age of the user and execute the menu procedure
def registerUser():
    # print welcome message
    print("Welcome to the big quiz!\n")

    # ask for the user's details
    name = input("Enter your name: ")
    age = input("Enter your age: ")

    newfile = open("user information.txt" , "w")
    newfile.write("Name:" + name + "\n")
    newfile.write("Age" + age + "\n")
    newfile.close()

    # execute the menu procedure passing the name and age as arguments
    menu(name, age)


# display the menu and ask the user what option they want to choose
# takes the user's name and age as parameters
def menu(name, age):
    # print the menu options
    print("\nMENU")
    print("1 - Take the Maths Quiz")
    print("2 - Take the Computing Quiz")
    print("3 - Register new user")
    print("4 - Exit the Quiz\n")

    # ask for a menu option
    option = input("Select a menu option from 1-4: ")

    # if the option is valid then execute it's procedure
    # else call the menu procedure
    if option == "1":
        runMathsQuiz(name, age) # run the Maths quiz
    elif option == "2":
        runComputingQuiz(name, age) 
    elif option == "3":
        registerUser
    elif option == "4":
        exit() # exit the program
    else:
        # menu choice is invalid so call the menu procedure again
        print("Please enter a valid option")
        menu(name, age)



# run the Maths quiz procedure with the user's name and age as parameters
def runMathsQuiz(name, age):
    # initialise score as 0
    score = 0
    print("Welcome to the Maths Quiz \n")
    print("Rule 1: DO NOT USE A CALCULATOR \n")
    print("Rule 2: you get 5 ponts for each correct question \n")
    print("Rule 3: you lose 3 points for each wrong question \n")
    #asks the questions
    Q1 =int(input("Q1. What is the square root of 49 \n"))
    Q2 =int(input("Q2. How many 6's go into 120 \n"))
    Q3 =int(input("Q3. what is 9^3 (9 cubed) \n"))
    Q4 =int(input("Q4. which number is bigger seventy two hundred or seventy five hundred (write in number) \n"))
    Q5 =int(input("Q5.solve 7x=7 \n"))
    Q6 =input("Q6.expand  20(5x+7) \n")
    #checks the answer and adds or removes points
    if Q1 == 7:
        score += 5
    else:
        score -= 3
    if Q2 == 20:
        score += 5
    else:
        score -= 3
    if Q3 == 729:
        score += 5
    else:
        score -= 3
    if Q4 == 7500:
        score += 5
    else:
        score -= 3
    if Q5 == 1:
        score += 5
    else:
        score -= 3
    if Q6 == "100x+140":
        score += 5
    else:
        score -= 3
    grade = gradessystem(score)
    
    #Saves maths information to the text file
    newfile = open("user information.txt" , "a")
    newfile.write("Maths: \n")
    newfile.write("Score:" + str(score) + "\n")
    newfile.write("Grade:" + grade + "\n")
    newfile.close()

    #Prints the text file
    newfile = open("user information.txt" , "r")
    print(newfile.read())
    newfile.close()

    
    check = input("do you want to check your answers? \n").lower()
    while check == "yes":
        maths = ["7","20","729","7500","1","100x+140"]
   
        #question = int(input("what answer do you want? "))
        question = input("Enter the number of the question or end to finish: ")
        if question == "1":
            print(maths[0])
        elif question == "2":
            print(maths[1])
        elif question == "3":
            print(maths[2])
        elif question == "4":
            print(maths[3])
        elif question == "5":
            print(maths[4])
        elif question == "6":
            print(maths[5])
        else:
            check = "end"
    #asks if they want to do another quiz        
    restart = input("do you want to do another quiz? (yes or no) ").lower()
    if restart == "yes":
        menu(name,age)
    else:
        exit()
        
def runComputingQuiz(name, age):
    #initialises score as 0
    score = 0
    print("welcome to the computer science quiz \n")
    print("Rule 1: you get 5 points for a correct question \n")
    print("Rule 2: you lose 3 points for a incorrect question \n")
    #asks questions
    Q1 =input("What does RAM stand for \n").lower()
    Q2 =input("what does CPU stand for \n").lower()
    Q3 =input("What does GPU stand for \n").lower()
    Q4 =input("What component does your CPU and RAM plug into \n").lower()
    Q5 =input("What does HDD stand for \n").lower()
    Q6 =input("what does SSD stand for \n").lower()
    #checks the answer and add or takes away points
    if Q1 == "random access memory":
        score += 5
    else:
        score -= 3
    if Q2 == "central processing unit":
        score +=5
    else:
        score -= 3
    if Q3 == "graphical processing unit":
        score += 5
    else:
        score -= 3
    if Q4 == "motherboard":
        score += 5
    else:
        score -=3
    if Q5 == "hard disk drive":
        score += 5
    else:
        score -=3
    if Q6 == "solid state drive":
        score += 5
    else:
        score -=3
    #find out the grade
    grade=gradessystem(score)
 
    #saves the information to the text file
    newfile = open("user information.txt" , "a")
    newfile.write("Computer Science: \n")
    newfile.write("Score" + str(score) + "\n")
    newfile.write("Grade:" + grade + "\n")
    newfile.close()
    #prints the text fike
    newfile = open("user information.txt" , "r")
    print(newfile.read())
    newfile.close()
    #asks if they want to check the answers
    check = input("do you want to check your answers? \n").lower()
    #starts the while loop
    while check == "yes":
        #list of answers
        computer = ["random access memory","central processing unit","graphical processing unit","motherboard","hard disk drive","solid state drive"]
        #prints out the answers of the question that they want
        question = input("Enter the number of the question or end to finish: ")
        if question == "1":
            print(computer[0])
        elif question == "2":
            print(computer[1])
        elif question == "3":
            print(computer[2])
        elif question == "4":
            print(computer[3])
        elif question == "5":
            print(computer[4])
        elif question == "6":
            print(computer[5])
        else:
            check = "end"
    #asks if the user wants to do another quiz
    restart = input("do you want to do another quiz? (yes or no) ").lower()
    if restart == "yes":
        menu(name,age)
    else:
        exit()

#grade system function        
def gradessystem(score):
    grade=""
    if score>=25:
        grade="A "
    elif score>=15 or score<25:
        grade="B "
    elif score>=5 or score<15:
        grade="C "
    else:
        grade= "FAIL"
    return grade



       
# start the program by running the register user procedure
registerUser() 
