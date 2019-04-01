int ticketPrice=10;
int age=?;
boolean isStudent=?

/*
if(age <= 15){
  ticketPrice = 5;
} else if(age > 60){
  ticketPrice = 5;
} else if(isStudent){
  ticketPrice = 5;
}
*/

if(age <= 15 || age > 60 || isStudent){
  ticketPrice = 5;
}


#if(action && romance && (comedy || horror)) ==> nested if statement

if(action && romance) {
  System.out.println("This movie includes action and romance.");
  if(comedy || horror) {
    System.out.println("This also includes comedy or horror!");
   }
 }
