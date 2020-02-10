package com.cts.ap.model;
import java.util.Comparator;
public class StudentComparator implements Comparator<StudentQueue>{ 
        
        // Overriding compare()method of Comparator  
                    // for descending order of cgpa 
        public int compare(StudentQueue s1, StudentQueue s2) { 
            if (s1.cgpa < s2.cgpa) 
                return 1; 
            else if (s1.cgpa > s2.cgpa) 
                return -1; 
                            return 0; 
            } 
    } 

