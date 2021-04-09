//This is to print the date and time
import java.util.*;
import java.text.*;

//This is to print dialog boxes
import javax.swing.JOptionPane;

public class Project1
{
  public static void main (String args [])
  {
    //This prints the date
    Date now = new Date ();
    DateFormat df = DateFormat.getDateInstance ();
    String s = df.format (now);
    System.out.println ("Today is " + s + "\n");  
    new Project1 ();
  }

  //These are global variables needed for the Tic Tac Toe game
  char a = ' ';
  char b = ' ';
  char c = ' ';
  char d = ' ';
  char e = ' ';
  char f = ' ';
  char g = ' ';
  char h = ' ';
  char i = ' ';
  
  char turn = 'x';
  
  public Project1()
  {    
    //This is a loop to repeat the game if the player wants to play again
    char end = 'y';
    while (end == 'y')
    {
      System.out.println ("****************************");
      System.out.println ("*ANGRY BIRDS: FIND YOUR EGG*"); 
      System.out.println ("****************************");
      printSlow ("\nOne day on Bird Island, Red and his friends were hanging out together.");
      printSlow ("They were doing what they normally do every day, like laughing together, eating and playing.");
      printSlow ("After a while, Red goes back home and.....");
      System.out.println ("OH NO! Red's egg disappeared! Who could it be?");
      printSlow ("Red looks out his window and sees a pig holding an egg running away.");
      printSlow ("It must be the pig that recently came to Bird Island!");
      pig ();
      System.out.println ("\nYou will be playing as Red. Get back your egg before the pig escapes on his aircraft!\n");
      red ();
      printSlow ("\nYou must successfully complete the tasks by answering the questions correctly. If you do not complete the tasks, you will lose your egg forever.");
      printSlow ("The game will start in 3   2   1   START!\n");
      
      //When the game ends, the program will print out the amount of points won
      int points = 0;
     
      char run = IBIO.inputChar ("The pig stole your egg! Run after them? (y/n) ");
      //Thi while loop continuosly asks the question if there is an invalid input
      while (run != 'y' && run != 'Y' && run != 'n' && run != 'N')
      {
        System.out.println ("ERROR!");
        run = IBIO.inputChar ("The pig stole your egg! Run after them? (y/n) ");
      }
      if (run == 'n' || run == 'N')
      {
        printSlow ("You decide to not run after the pig and stay at home.");
        printSlow ("\nPoints: " + points);
        end = IBIO.inputChar ("Would you like to play again?");
      }
      else
      {
        System.out.println ("\nYou run downstairs to run after him but you're too late. He's already out of sight.");
        System.out.println ("You look down and see a piece of paper. When you pick it up, it seems to be a piece of a map.");
        printSlow ("You must decipher this piece of paper to get back your egg!");
        printSlow ("To decipher it, you must successfully complete the task!\n");
        boolean unscrambleAns1 = unscrambling ("glipet", "piglet");
       
        if (unscrambleAns1 == false)
        {
          printSlow ("\nPoints: " + points);
          end = IBIO.inputChar ("Would you like to play again?");
        }
       
        else
        {
          //This is to incrase points as the question was answered correctly
          points++;
          System.out.println ("\nYou use the piece of the map to continue walking!");
          System.out.println ("After a while, you enter the forest and stumble upon another piece of the map! ");
          printSlow ("Once again, you will need to decipher it.\n");
          boolean mCAns1 = multipleChoice ("How many sides does a circle have? ", "a", "0", "1", "2", "infinite");
          
          if (mCAns1 == false)
          {
            printSlow ("\nPoints: " + points);
            end = IBIO.inputChar ("Would you like to play again?");
          }
          else 
          {
            //This is to incrase points as the question was answered correctly
            points++;
            System.out.println ("\nThe map leads you to the school!");
            System.out.println ("When you look around, you find another piece of the map in the desk!");
            printSlow ("Decipher it!\n");
            boolean tFAns1 = tF("5 is greater than 10 (t/f)", "f");
            
            if (tFAns1 == false) 
            {
              printSlow ("\nPoints: " + points);
              end = IBIO.inputChar ("Would you like to play again?");
            }
            
            else 
            {
              //This is to incrase points as the question was answered correctly
              points++;
              System.out.println ("\nThe map leads you to the beach....");
              System.out.println ("Where is the next piece of the map?");
              printSlow ("Oh no....OH WAIT!");
              System.out.println ("Chuck's house is around here! Maybe he saw where the pig went!");
              System.out.println ("You go to his house.\n");
              chuck ();
              System.out.println ("\nAfter asking Chuck if he saw the pig, Chuck says....");
              printSlow ("I will tell you if you win against me in Tic Tac Toe.\n");
              ticTacToe ();
              //This is to incrase points as the task was completed
              points++;
              chuck ();
              printSlow ("\nYou beat me! Good job Red!");
              printSlow ("I saw the pig go towards the park.");
              System.out.println ("\nYou go to the park and find another piece of the map!");
              printSlow ("You must decipher it!\n");
              boolean unscrambleAns2 = unscrambling ("htief", "thief");
              
              if (unscrambleAns2 == false)
              {
                printSlow ("\nPoints: " + points);
                end = IBIO.inputChar ("Would you like to play again?");
              }
              else
              {
                //This is to incrase points as the question was answered correctly
                points++;
                System.out.println ("\nThe next piece of the map leads you to a restaurant in the mall.");
                System.out.println ("Oh look! There's another map piece on that table with dishes!");
                printSlow ("Decipher it to see where the pig went next!\n");
                boolean mCAns2 = multipleChoice ("Who is the king of animals?", "a", "lion", "tiger", "cheetah", "jaguar");
                
                if (mCAns2 == false)
                {
                  printSlow ("\nPoints: " + points);
                  end = IBIO.inputChar ("Would you like to play again?");
                }
                else 
                {
                  //This is to increase points as the question was answered correctly
                  points++;
                  System.out.println ("\nThe map lead you to the arcade!");
                  System.out.println ("Where is the next piece of the map?");
                  System.out.println ("It's on the air hockey table!");
                  printSlow ("Let's decipher it!\n");
                  boolean unscrambleAns3 = unscrambling ("sridb", "birds");
                  
                  if (unscrambleAns3 == false)
                  {
                    printSlow ("\nPoints: " + points);
                    end = IBIO.inputChar ("Would you like to play again?");
                  }
                  else 
                  {
                    //This is to incrase points as the question was answered correctly
                    points++;
                    System.out.println ("\nThe map piece leads you somewhere....");
                    printSlow ("Oh no....where are we?");
                    System.out.println ("I don't see another map piece!");
                    System.out.println ("There's only a house around here.");
                    printSlow ("OH WAIT! That's the house of the Blues!");
                    System.out.println ("You go inside the house.\n");
                    blues ();
                    System.out.println ("\nYou see Jay. His two brothers seem to be out.");
                    System.out.println ("After asking Jay if he saw the pig, Jay says.....");
                    printSlow ("I'll tell you if you can finish my math homework for me!\n");
                    boolean mQAns = mathQuestions ();
                    
                    if (mQAns == false)
                    {
                      printSlow ("\nPoints: " + points);
                      end = IBIO.inputChar ("Would you like to play again?");
                    } 
                    
                    else 
                    {
                      //This is to increase points by 4 as the 4 math questions were answered correctly
                      points+=4;
                      blues ();
                      printSlow ("\nYou finished it! Thanks Red!");
                      printSlow ("Oh, I saw the pig go towards the library.");
                      System.out.println ("You go to the library and look around.");
                      System.out.println ("There's a piece of paper on that table.");
                      printSlow ("Could it be?.....Yes! It's another piece of the map.");
                      printSlow ("Time to decipher it!\n");
                      boolean tFAns2 = tF ("Birds have feathers (t/f)", "t");
                      
                      if (tFAns2 == false)
                      {
                        printSlow ("\nPoints: " + points);
                        end = IBIO.inputChar ("Would you like to play again?");
                      }
                      
                      else 
                      {
                        //This is to incrase points as the question was answered correctly
                        points++;
                        System.out.println ("\nThe map lead you to the supermarket!");
                        System.out.println ("Look! There looks like there's a map piece right in front of the entrance."); 
                        printSlow ("We have to decipher it!\n");
                        boolean unscrambleAns4 = unscrambling ("lsdain", "island");
                        
                        if (unscrambleAns4 == false)
                        {
                          printSlow ("\nPoints: " + points);
                          end = IBIO.inputChar ("Would you like to play again?");
                        }
                        
                        else 
                        {
                          //This is to increase points as the question was answered correctly
                          points++;
                          System.out.println ("\nThis time the map seems to be leading you to the gym!");
                          System.out.println ("Let's go!");
                          System.out.println ("You get there and find a map piece by the dumbbells.");
                          printSlow ("Decipher it.\n");
                          boolean mCAns3 = multipleChoice ("What is the missing colour in the rainbow? Red, Orange, Yellow, Green, Blue, _____, Purple", "b", "pink", "indigo", "white", "black");
                          
                          if (mCAns3 = false)
                          {
                            printSlow ("\nPoints: " + points);
                            end = IBIO.inputChar ("Would you like to play again?");
                          }
                          
                          else 
                          {
                            //This is to incrase points as the question was answered correctly
                            points++;
                            System.out.println ("\nThe map leads you to a clearing in the forest.");
                            System.out.println ("THERE'S THE PIG!");
                            pig ();
                            printSlow ("\nIt seems as if you have found me.");
                            printSlow ("I will only return your egg if you win against me in rock, paper, scissors, best 3 out of 5.\n");
                            red ();
                            printSlow ("\nBeat the pig in rock, paper, scissors to stop him from escaping in his aircraft.\n");
                            boolean rps = rockPaperScissors ();
                            
                            if (rps == false)
                            {
                              printSlow ("You lost! The pig has escaped with your egg!");
                              printSlow ("\nPoints: " + points);
                              end = IBIO.inputChar ("Would you like to play again?");
                            }
                            
                            else 
                            {
                              //This is to incrase points as the task was completed
                              points++;
                              printSlow ("You won! You got your egg back! The police birds arrest the pig and he never ever steals another bird's egg!");
                              printSlow ("You have finished the game.");
                              printSlow ("Points: " + points);
                              end = IBIO.inputChar ("Would you like to play again?");
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    printSlow ("Goodbye!");
  }
  
  public void printSlow (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (100);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  }
  
  //This method contains the ASCII art for the pig in Angry Birds
  public void pig ()
  {
    System.out.println("                            $ ");
    System.out.println("                            $$ ");
    System.out.println("                  $$$$      $$$    $ ");
    System.out.println("                $$    $$    $$$$  $$   $ ");
    System.out.println("                $      $    $$$$$$$$$$$ ");
    System.out.println("    $$$$$        $$_$$______$$$$$$$$$$ ");
    System.out.println("   $$    $____$$$$$____________$$$$$$$");
    System.out.println("  $$     $$___________________________$$ ");
    System.out.println("  $$     $______________________________$$$  ");
    System.out.println("    $$$$__$$$$_____$$$$$$$$$$$$$____$$$$___$$ ");
    System.out.println("    $$__________$$_______________$$__________$$ ");
    System.out.println("   $$__$$$$$___$____________________$__$$$$$$__$  ");
    System.out.println("  $__$$     $_$____ $$$$___ $$$$____$_$      $__$ ");
    System.out.println(" $__$$      $_$___$$$$$$__$$$$$$____$$    $$ $__$ ");
    System.out.println("$__$  $$    $_$____$$$$____$$$$$____$_$   $$ $__$ ");
    System.out.println("$__$  $$    $_$_____$$______$$$_____$_$$$$$$$___$ ");
    System.out.println("$___$$$$$$$$__$$___________________$__________$$ ");
    System.out.println(" $_______________$$$$$______$$$$$$__________$$  ");
    System.out.println("   $$$$________________________________$$$$ ");
    System.out.println("        $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
  }
  
  //This method contains the ASCII art for Red, the protagonist in Angry Birds
  public void red ()
  {
    System.out.println("                     $$$$$$                   ");
    System.out.println("                   $$______$$$ ");
    System.out.println("               $$$$$$_________$$ ");
    System.out.println("            $$$$_____$$$$$_____$$$ ");
    System.out.println("           $$___________$$$$_____$$$ ");
    System.out.println("           $$$$__$$$$$____________$$$$$ ");
    System.out.println("               $$$$___________________$$$ ");
    System.out.println("            $$________$_______________$$$_$ ");
    System.out.println("          $___________$$$$$__________$$$$$$_$ ");
    System.out.println("        $$____________$$$$$$$$$_____$$$$$$$__$ ");
    System.out.println("    $$  $$_____________$$$$$$$$$$$$$$$$ $$___$$ ");
    System.out.println("    $$$ $________________$     $$$$$$ 0  $$___$ ");
    System.out.println("$$$   $$$_______________$$   0    $_$_$$$$____$ ");
    System.out.println("$$$$$$$$$________________$   $$_$$$$$$$_______$ ");
    System.out.println("$$$   $$$________________$$$$_$$$______$$$____$ ");
    System.out.println("    $$$$$____________________$$__________$$$__$ ");
    System.out.println("   $$$ $$___________________$$_____________$$_$ ");
    System.out.println("        $___________________$$$$$$$$$$$$$$__$$ ");
    System.out.println("        $$__________________$__$$$$$___$_$$$$$$ ");
    System.out.println("         $___________________$$$______$$___$$ ");
    System.out.println("         $$___________________$$$$$$$$$___$$ ");
    System.out.println("           $$$_________________________$$$ ");
    System.out.println("               $$$$$$$$$$$$$$$$$$$$$$$ ");
  }
  
  //This method contains the ASCII art for Chuck, the yellow bird in Angry Birds
  public void chuck ()
  {
    System.out.println("                 $$$$$$ ");
    System.out.println("                  $$$$$$$$   $$ ");
    System.out.println("                      $$$$$$ $$$ ");
    System.out.println("                $$$$$$$$$$$$$$$$ ");
    System.out.println("                    $$$$$$$_$$$ ");
    System.out.println("                       $$_______$$ ");
    System.out.println("         $           $$____________$ ");
    System.out.println("        $$$  $$  $$__$$$$____________$$ ");
    System.out.println("        $$$$$$$$$$__$$$$$$$____________$$ ");
    System.out.println("         $$$$$$$$______$$$$$$$__________$$$$$ ");
    System.out.println("          $$$$$$______$  $$$$$$____$$$$$$$$$$$ ");
    System.out.println("        $$$$$$________$  0   $_____$$ 0 $$__$ ");
    System.out.println("            $__________$    $$_$$$$$$$$$__$___$ ");
    System.out.println("           $_$__________$$$__$$_______$$$_____$ ");
    System.out.println("          $_$______________$$$$$$________$$___$$ ");
    System.out.println("         $_$$_____________$$___$$$$$$$$____$$__$$ ");
    System.out.println("         $_$_______________$$_________$$$$$$$$$_$ ");
    System.out.println("          $_$_______________$$$$___$$$$________$ ");
    System.out.println("            $$$________________$$$$$$_________$ ");
    System.out.println("              $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  }
  
  //This method contains the ASCII art for Blues, the three blue birds in Angry Birds
  public void blues ()
  {
    System.out.println("                            $$$$ ");
    System.out.println("                      $$$$_$___$$$ ");
    System.out.println("                    $$$$$___$_____$$ ");
    System.out.println("                    $$_______$$____$$ ");
    System.out.println("                   $$$$$$$$____$____$$$ ");
    System.out.println("                $$$____________________$$ ");
    System.out.println("              $$$______$$$$$$$___________$$ ");
    System.out.println("            $$_______$$$     $$____$$$$$$$$$ ");
    System.out.println("           $$_______$$         $__$$      $$$ ");
    System.out.println("          $$_______$$       $$  $$$     $$ $$$ ");
    System.out.println("         $$________$        $$  $$      $$  $$ ");
    System.out.println("        $$________$$$$      $$$$_$$$$$$_$$$$$$ ");
    System.out.println("        $$________$$__$$$$$$$$________$$$$___$$ ");
    System.out.println("        $$_________$_____$$$_____________$$$_$$ ");
    System.out.println("        $___________$___$$_________________$$$$ ");
    System.out.println(" $$$    $____________$$$______________________$$ ");
    System.out.println(" $$$$$$ $_____________$$$$$$$$$$$$$$$$$$$$$_____$ ");
    System.out.println("$$$$$$$$$_______________$$________________$$$$$$$$ ");
    System.out.println("      $$$$_______________$$______________$$$__$ ");
    System.out.println("    $$$$$$_________________$$_______$$$$$____$$ ");
    System.out.println("  $$$$$   $__________________$$$$$$$$$______$$ ");
    System.out.println("   $$        $$__________________$_______$$ ");
    System.out.println("                 $$$$$$$$$$$$$$$$$$$$$$$");
  }  
  
  //This method is for all the unscrambling questions
  public boolean unscrambling (String word, String ans)
  {
    printSlow ("Unscrambling");
    printSlow ("You have 3 chances to unscramble this word correctly.");
    String userInput = JOptionPane.showInputDialog ("Unscramble: " + word + "\nWhat is the unscrambled word?");
    /*This loop is to repeat the question if the user didn't answer correctly
    Max amount of times it will repeat is 3 times */
    int tries = 1;
    
    //If the number of tries is less than 3 and the answer is wrong, the question will be asked once again.
    while (!userInput.equals(ans) && tries < 3)
    {
        JOptionPane.showMessageDialog(null, "Nope, try again.", "WRONG", JOptionPane.ERROR_MESSAGE);
        userInput = JOptionPane.showInputDialog ("Unscramble: " + word + "\nWhat is the unscrambled word?");
        tries++;
    }
    
    //If the number of tries is 3 and the answer is still wrong, the following code will run
    if (!userInput.equals(ans) && tries == 3)
    {
      System.out.println ("\nIt was " + ans + ".");
      printSlow ("The pig escaped! You lose your egg...");
      return false;
    }  
    
    //If the answer is right and within 3 tries, the following code will run
    else 
    {
      printSlow ("\nYou got it! ");
      printSlow ("You deciphered the next piece of the map!");
      return true;
    }
  }
  
  //This method is for all the multiple choice questions
  public boolean multipleChoice (String question, String ans, String choice1, String choice2, String choice3, String choice4)
  {
    printSlow ("Multiple Choice");
    printSlow ("You have 2 chances to answer this question correctly.");
    String userInput = JOptionPane.showInputDialog (question + "\na. " + choice1 + "   b. " + choice2 + "   c. " + choice3 + "   d. "+choice4 + "\nWhat is your answer? (Enter the letter)");
    /*This loop is to repeat the question if the user didn't answer correctly
      Max amount of times it will repeat is 2 times */
    int tries = 1;
    
    //If the answer is wrong and the number of tries is less than 2, the question will be asked again
    while (!userInput.equals(ans) && tries < 2)
    {
        JOptionPane.showMessageDialog(null, "Nope, try again.", "WRONG", JOptionPane.ERROR_MESSAGE);
        userInput = JOptionPane.showInputDialog (question + "\na." + choice1 + "   b." + choice2 + "   c." + choice3 + "   d."+choice4 + "\nWhat is your answer? (Enter the letter)");
        tries++;
     }
    
    //If the answer is wrong and the number of tries is 2, the following code will run
    if (!userInput.equals(ans) && tries == 2)
    {
      System.out.println ("\nIt was " + ans + ".");
      printSlow ("The pig escaped! You lose your egg...");
      return false;
      }    
    
    //If the answer is right and the number of tries is 2 or less, the following code will run
    else 
    {
      printSlow ("\nYou got it! ");
      printSlow ("You deciphered the next piece of the map!");
      return true;
    }
  }
  
  //This method is for all the true and false questions
  public boolean tF (String question, String ans)
  {
    printSlow ("True or False");
    printSlow ("You only have one chance to guess correctly.");
    String userInput = JOptionPane.showInputDialog (question + "\nWhat is your answer?");
    
    if (userInput.equals(ans))
    {
      printSlow ("\nYou got it! ");
      printSlow ("You deciphered the next piece of the map!");
      return true;
    }    
    else 
    {
      System.out.println ("\nIt was " + ans + ".");
      printSlow ("The pig escaped! You lose your egg...");
      return false;
    }
  }
  
  //This method is for the tic tac toe game
  public void ticTacToe ()
  {
    /* Do-while loop is used here as this block of code will be executed atleast once.
       This block of code will repeat until the player wins */
    char win = ' ';
    do
    {
      while (!winner ())
      {
        printBoard ();
        makeMove (turn);
        
        //This question mark operator is used to switch between x and o with less lines
        turn = (turn == 'x') ? 'o' : 'x';
        
        /*This is here to check that there isn't a tie or that the user didn't win
          If this isn't here and there is a tie or the user did win, the program will not
          be able to continue as the computer will continue generating random coordinate numbers
          that will always be invalid */
        if (!winner ())
        {
          compChoice (turn);
          
          //This question mark operator is used to switch between x and o with less lines
          turn = (turn == 'x') ? 'o' : 'x';
        }
      }
      printBoard ();
      win = printWinner ();
      
      if (win == 'x')
        System.out.println ("\nThe winner is you, Red!\n");
      else if (win == 'o')
      {
        System.out.println ("\nThe winner is the computer.\n");
        
        //This resets the variables so that the board will reset and return to an empty board and so that x will start off the game again
        a = ' ';
        b = ' ';
        c = ' ';
        d = ' ';
        e = ' ';
        f = ' ';
        g = ' ';
        h = ' ';
        i = ' ';
        turn = 'x';
      }
      else 
      {
        System.out.println ("\nThe game is a tie.\n");
        //This resets the variables so that the board will reset and return to an empty board and so that x will start off the game again
        a = ' ';
        b = ' ';
        c = ' ';
        d = ' ';
        e = ' ';
        f = ' ';
        g = ' ';
        h = ' ';
        i = ' ';
        turn = 'x';
      }
    }
    //Boolean expression for the do-while loop
    while (win != 'x');
  }
  
  public void printBoard ()
  {
    //This block of code prints out the board
     System.out.println ("  1   2   3");
     System.out.println ("1 "+ a +" | " + b + " | " + c);
     System.out.println ("------------");
     System.out.println ("2 "+ d +" | "+ e +" | "+ f);
     System.out.println (" ------------");
     System.out.println ("3 "+ g +" | "+ h +" | "+ i);
  }
  
  //This method is for the player to make a move
  public void makeMove (char piece)
  {
    int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
    int y = IBIO.inputInt ("Enter the y-coordinate: ");
    //This checks if the coordinates entered are valid coordiantes (are empyt and between 1 and 3)
    while (!isValid (x, y))
    {
      System.out.println ("Error - invalid coordinate. Try again.");
      x = IBIO.inputInt ("\nEnter the x-coordinate: ");
      y = IBIO.inputInt ("Enter the y-coordinate: ");
    }
    if (x == 1 && y == 1)
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else
      i = piece;    
  }
  
  //This method is for the computer to randomly choose a number from 1 to 3 to make a move
  public void compChoice (char piece)
  {
    int x = (int) (Math.random () * 3) + 1; 
    int y = (int) (Math.random () * 3) + 1; 
    //This checks if the randomly chosen coordiantes are valid (are empty spaces)
    while (!isValid (x, y))
    {
      x = (int) (Math.random () * 3) + 1; 
      y = (int) (Math.random () * 3) + 1;
    }
    
    if (x == 1 && y == 1)
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else
      i = piece;  
  }
    
  //This method will return false if coordinates are invalid (that space is full or coordinates aren't between 1 and 3)
  public boolean isValid (int x, int y)
  {
    if (x > 3 || x < 1)
      return false; 
    else if (y > 3 || y < 1)
      return false;
    else if (x == 1 && y == 1 && a!= ' ')
      return false;
    else if (x == 2 && y == 1 && b!= ' ')
      return false;
    else if (x == 3 && y == 1 && c!= ' ')
      return false;
    else if (x == 1 && y == 2 && d!= ' ')
      return false;
    else if (x == 2 && y == 2 && e!= ' ')
      return false;
    else if (x == 3 && y == 2 && f!= ' ')
      return false;
    else if (x == 1 && y == 3 && g!= ' ')
      return false;
    else if (x == 2 && y == 3 && h!= ' ')
      return false;
    else if (x == 3 && y == 3 && i!= ' ')
      return false;      
    else 
      return true;
  }
  
  //This checks if anyone won 
  public boolean winner ()
  { 
    if (a == b && a == c && a != ' ')
      return true;
    else if (d == e && d == f && d!= ' ')
      return true;
    else if (g == h && g == i && g!= ' ')
      return true;
    else if (a == d && a == g && a!= ' ')
      return true;
    else if (b == e && b == h && b!= ' ')
      return true;
    else if (c == f && c == i && c!= ' ')
      return true;
    else if (a == e && a == i && a!= ' ')
      return true;
    else if (c == e && c == g && c!= ' ')
      return true;
    //This is to check if there is a tie. It returns true so that the program won't continue if there is a tie
    else if (a!= ' ' && b!= ' ' && c!= ' ' && d!= ' ' && e!= ' ' && f!= ' ' && g!= ' ' && h!= ' ' && i!= ' ')
      return true;
    else 
      return false;             
  }
  
  
  public char printWinner ()
  { //This returns who is in the winning condition
    if (a == b && a == c && a != ' ') 
      return a;
    else if (d == e && d == f && d!= ' ')
      return d;
    else if (g == h && g == i && g!= ' ')
      return g;
    else if (a == d && a == g && a!= ' ')
      return a;
    else if (b == e && b == h && b!= ' ')
      return b;
    else if (c == f && c == i && c!= ' ')
      return c;
    else if (a == e && a == i && a!= ' ')
      return a; 
    else if (c == e && c == g && c != ' ') 
      return c;
    //This line will run if there is a tie
    else 
      return ' ';
  }
  
  public boolean mathQuestions ()
  {
    printSlow ("Math Questions");
    printSlow ("You only have one chance to answer correctly.");

    //The player can only move onto the next question if they can answer this question correctly on the first try
    String ans1 = JOptionPane.showInputDialog ("Question 1: \n6 - 5 = ");
    
    if (!ans1.equals((6-5) + ""))
      return false;
    else 
    {
      String ans2 = JOptionPane.showInputDialog ("Question 2: \n2 + 2 = ");
      
      if (!ans2.equals((2+2) + ""))
        return false;
      else
      {
        String ans3 = JOptionPane.showInputDialog ("Question 3: \n5^2 = ");
        
        if (!ans3.equals((Math.round(Math.pow (5,2)) + "")))
          return false;
        else
        {
          String ans4 = JOptionPane.showInputDialog ("Question 4: \npi = (Enter only to 2 decimal places)");
          
          if (ans4.equals((Math.round (Math.PI * 100)/100.0) + ""))
            return true;
          else 
            return false;
          }
        }        
      }
    }
    
   public boolean rockPaperScissors ()
   {
     //This end variable is to store the boolean value but not return it yet
     boolean end = false;
     int cPoint = 0;
     int uPoint = 0;
     int game = 1;
     System.out.println ("-----Rock, Paper, Scissors------\n");
     
     //This do-while loop is make sure that this game only plays 5 rounds
     do
     {
      //This loop is to make the round repeat until one of them wins that round
      char win = ' ';
      while (win != 'u' && win != 'c')
      {
        char user = userChoice ();
        System.out.println ("You have selected " + user);
        char comp = compChoice ();
        System.out.println ("The computer has selected " + comp);
        win = winner (comp, user);
        if (win == 'c')
        {
          cPoint++;
          System.out.println ("\nThe computer wins!");
        }
        else if (win == 'u')
        {
          uPoint++;
          System.out.println ("\nYou win!");
        }
        else
          System.out.println ("\nThere is a tie!");
      
        System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint + "\n");
      }
      
      if (uPoint == 3)
      {
        game = 6;
        return true;
      }
      else if (cPoint == 3)
      {
        game = 6;
        return false;
      }
      else 
        game++;
    }
     //Boolean expression for do-while loop
     while (game <= 5);
     return end;
  }
  
  
  public boolean isValid (String c)
  {
    // These are all of the valid answers
     if (c.equals("Rock") || c.equals("ROCK") || c.equals("rock") ||c.equals("r") || c.equals("R"))
       return true;
     else if (c.equals("Paper") || c.equals("PAPER") || c.equals("paper") || c.equals("p") || c.equals("P"))
       return true;
     else if ( c.equals("Scissors") || c.equals("SCISSORS") || c.equals("scissors") || c.equals("s") || c.equals("S"))
       return true;
     else 
       return false;
  }
  
  public char userChoice ()
  { //This returns r, p or s, based on the user's choice
    System.out.println ("You can choose rock, paper or scissors.");
    
    //This asks for the user's choice
    String choice = IBIO.inputString ("Rock, Paper, or Scissors?");
    
    //This loop checks if there is invalid input. If it is invalid input, it asks again
    while (!isValid(choice))
    {
      System.out.println ("INVALID INPUT!");
      choice = IBIO.inputString ("Rock, Paper, or Scissors?");
    }
    
    //This is to standardize values (rock = r, paper = p, scissors = s)
    if (choice.equals("Rock") || choice.equals("ROCK") || choice.equals("rock") || choice.equals("r") || choice.equals("R"))
      return 'r';
    else if (choice.equals("Paper") || choice.equals("PAPER") || choice.equals("paper") || choice.equals("p") || choice.equals("P"))
      return 'p';
    else
      return 's';
  }
  
  
  public char compChoice ()
  { 
    /*This makes a random number between 1 and 3. If the number is 1, it returns r.
      If the number is 2, it returns s. If the number is 3, return p.*/
    int num = (int) (Math.random () * 3) + 1; 
    
    char choice = ' ';
    switch (num)
    {
      case 1 : choice = 'r';
      break;
      case 2 : choice = 's';
      break;
      default : choice = 'p';
      break;
    }
    return choice;
  }
  
  public char winner (char comp, char user)
  {
    // This returns c if computer wins, u if user wins and b for tie
    if (comp == 'r' && user == 's'|| comp == 's' && user == 'p' || comp == 'p' && user == 'r')
      return 'c';
    else if (comp == 's' && user == 'r' || comp == 'p' && user == 's' || comp == 'r' && user == 'p')
      return 'u';
    else     
      return 'b';
  }
}