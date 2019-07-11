public class Timer {

    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    void addSeconds(int sec){
        seconds += seconds + sec;
    }

    void addMinutes (int min){
        minutes += min;
    }

    void addHours (int hour){
        hours += hour;
    }

   void step(){
        seconds++;
   }
   


}
