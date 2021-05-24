import java.util.Scanner;

public class Trials {
    public static void main(String[] args) {
      System.out.println(" # T R I A L S # ");
      int bar = 45;
      // declares bar variable which get modified by algorithms associated with a

      System.out.println("Welcome to TRIALS, a training program to help you min-max your strength gains.\n");
      System.out.println("Can you make it to TRIAL 96 without starting over?\n");
      System.out.println("Type rules, tips, or start to begin.\n");
      Scanner input = new Scanner(System.in);
      String input1 = input.nextLine();

      if (input1.equals("rules")) {
        System.out.println("\nThis is an adaption of the standard Starting Strength protocol.\n");
        System.out.println("TRIALS separates your gym sessions into 96 trials to overcome. \n");
        System.out.println("Rest for 2-3 days between trials to succeed.\n");
        System.out.println("The program can be completed within 8 months.\n");
        System.out.println("It is recommended that you rest for 8 hours each night, \n");
        System.out.println("and to get at least 120g of protein per day to succeed.\n");
        System.out.println("Putting on a pound of bodymass per week will ensure your success in this protocol.\n");        
        System.out.println("You must acquire two 1lb plates and two 2.5lb plates to take to the gym to ensure your success. \n");  
        main(args);
      } else if (input1.equals("tips")) {
        System.out.println("- Use a personal trainer or gym buddy to check your form, to avoid injury and ensure progression in later trials.\n");
        System.out.println("- Trust the process. This can be difficult, but with proper form, this program is doable for many beginners!\n");        
        System.out.println("- Waiting 5 minutes between sets will cause you to nearly fully recover from fatigue.\n");
        System.out.println("- To recover, eat between 60-70% grams of protein per your bodyweight in pounds, 120g suffices for most people.\n");
        System.out.println("- Use foam rollers and massages to ensure a faster recovery. Saunas help too, if you have time for them.\n");
        System.out.println("- Focus on exhaling and bracing the core!\n");
        System.out.println("- Focus on form and mastery over going through each trial and succeeding at hitting numbers no matter the cost.\n");
        System.out.println("- Don't think about every minor detail. Just lift the weights up and put them down.\n");
        System.out.println("- Always TRAIN HARDER THAN LAST TIME! The end of TRIALS is only the beginning to big lifting. \n");
        System.out.println("- Remember to buy two 1lb plates and two 2.5lb plates to take to the gym to ensure the program runs properly. \n");
        main(args);

      } else if (input1.equals("start")) {
        System.out.println("To start, please enter the number trial you are on.\n");
        Scanner in = new Scanner(System.in);
        int trial = in.nextInt();

        // Standard Periodization of Starting Strength - ABA BAB ABA BAB Days
        //A Days - we check the remainder of 2 to check for an even day, which is periodized as A day (odds are B days and the else condition)

        if (trial % 2 == 0){
          // These nested if statements check the first two weeks or 12 sessions, as progression is typically faster here
          if (trial < 12){
          System.out.println("Perform 3 sets of 5 SQUATS for " + (trial*5+bar) + "lbs");
          System.out.println("Perform 3 sets of 5 OVERHEAD PRESS for " + (trial*2.5+bar) + "lbs");
          System.out.println("Perform 1 set of 5 DEADLIFTS for " + (trial*7.5+bar) + "lbs"); 
          } else {
          /* This condition changes the rate at which we progress in each trial, in this instance 5 times per session 
           We add 60 to denote the progress we covered in the first 12 days (12*5=60)*/
          System.out.println("Perform 3 sets of 5 SQUATS for " + (trial*2.5+60+bar) + "lbs"); 
          System.out.println("Perform 3 sets of 5 OVERHEAD PRESS for " + (trial+30+bar) + "lbs");
          System.out.println("Perform 1 set of 5 DEADLIFTS for " + (trial*2.5+90+bar) + "lbs");      
          }
          System.out.println("Perform 3 sets of CHIN-UPS to Failure");
          main(args); 
          // B Days
          } else {
          if (trial < 12){
          System.out.println("Perform 3 sets of 5 SQUATS for " + (trial*5+bar) + "lbs");
          System.out.println("Perform 3 sets of 5 BENCH PRESS for " + (trial*2.5+2.5+bar) + "lbs");
          System.out.println("Perform 5 sets of 3 POWER CLEANS for " + (trial*2.5+2.5+bar) + "lbs");
          } else {
          System.out.println("Perform 3 sets of 5 SQUATS for " + (trial*2.5+60+bar) + "lbs");
          System.out.println("Perform 3 sets of 5 BENCH PRESS for " + (trial+30+bar) + "lbs");
          System.out.println("Perform 5 sets of 3 POWER CLEANS for " + (trial+30+bar) + "lbs");
          }
          System.out.println("Optional: Perform BARBELL CURLS at 3 sets of 10");
          main(args);
        }
      } else {
        System.out.println("Invalid operator! Womp womp. Try again!\n"); 
      }
      input.close();
    }
  }
