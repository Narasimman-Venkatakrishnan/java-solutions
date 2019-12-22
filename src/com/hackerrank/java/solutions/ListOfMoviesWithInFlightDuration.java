package com.hackerrank.java.solutions;

import java.util.Arrays;

    /*  find out best pair of movies from a list(playtime in minutes)
     where sum of playing time is equal or within flying time */

 public class ListOfMoviesWithInFlightDuration  {
     int best_duration_match=0;
     int[] best_matches=new int[2];

     public ListOfMoviesWithInFlightDuration() {
     }

     public int[] findMovies(int[] sorted_movies_list, int duration){

         System.out.println(Arrays.toString(sorted_movies_list));

         int number_of_movies=sorted_movies_list.length-1;
         int entertainment_duration=calculateFlightDuration(duration);

         for(int i=0;i <= number_of_movies;i++) {
             for (int j = i + 1; j <= number_of_movies; j++) {
                 int total_duration = sorted_movies_list[i] + sorted_movies_list[j];
                 if (total_duration > entertainment_duration) {
                     continue;
                 } else {
                     int[] matches = new int[2];
                     matches[0] = sorted_movies_list[i];
                     matches[1] = sorted_movies_list[j];
                     updateBestMatch(matches, total_duration);
                 }
             }
         }
         return best_matches;
     }

     public void updateBestMatch(int[] best_match, int total_duration){
         if(best_duration_match == 0){
             best_duration_match=total_duration;
         }else if(best_duration_match <= total_duration ){
             best_duration_match=total_duration;
             best_matches=best_match;
         }
     }

     /* flying_time = total_duration - check-in time  */

     public int calculateFlightDuration(int duration){
         int flying_time=duration - 20;
         return flying_time;
     }


     public static void main(String args[]){
         //movies list - playtime in minutes
         int[] movies_list = new int[] {90, 80, 75, 60, 120, 150, 125};
         int flight_duration = 250;
         Arrays.sort(movies_list);
         ListOfMoviesWithInFlightDuration entertainment = new ListOfMoviesWithInFlightDuration();
         int[] best_match = entertainment.findMovies(movies_list,flight_duration);
         System.out.println("best match : " + Arrays.toString(best_match));

     }
 }
