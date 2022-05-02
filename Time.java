/*3. WAP to add and subtract two times (hours,minutes & seconds) using constructors 
with proper conditions of 24 hour format and display the result.
*/

class Time24 {
    
    int seconds;
    int minutes;
    int hours;

    public Time24(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public static Time24 Add(Time24 start, Time24 stop)
    {
        Time24 sum = new Time24(0, 0, 0);

        sum.seconds = stop.seconds + start.seconds;
        if(sum.seconds > 60)
        {
            sum.seconds -= 60;
            sum.minutes += 1;
        }
        sum.minutes += stop.minutes + start.minutes;
        if(sum.minutes > 60)
        {
            sum.minutes -= 60;
            sum.hours += 1;
        }
        sum.hours += stop.hours + start.hours;

        return(sum);
    }

    public static Time24 difference(Time24 start, Time24 stop)
    {
        Time24 diff = new Time24(0, 0, 0);

        if(start.seconds > stop.seconds){
            --stop.minutes;
            stop.seconds += 60;
        }
        diff.seconds = stop.seconds - start.seconds;
        if(start.minutes > stop.minutes){
            --stop.hours;
            stop.minutes += 60;
        }
        diff.minutes = stop.minutes - start.minutes;
        diff.hours = stop.hours - start.hours;
        return(diff);
    }

    public static void main(String[] args) {

          Time24 start = new Time24(18, 18, 45);
          Time24 stop = new Time24(22, 10, 23);
          Time24 sum;
          sum = Add(start, stop);
          Time24 diff;
          diff = difference(start, stop);

          System.out.println("TIME Sum:- " + sum.hours+ " hrs : "+ sum.minutes+ " min : " + sum.seconds+ " sec");
          System.out.println("TIME DIFFERENCE:- " + diff.hours +" hrs : "+ diff.minutes +" min : "+ diff.seconds+" sec");
      }
}