package com.skyScraper.operations;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

//The Below steps describe the logic implemented
//1. Take input from the user and push all the floors built on particular days in a Queue. Method implemented is called 'push()'. Queue has been used here so that the elements can be retrieved in a FIFO order.
//2. The method 'arrangeFloor()' traverses through the floors entered by the user and keeps pushing them in an arrayList till it finds the largest floor.
//3. On Finding the largest Floor, the method 'arrangeFloor()' then reads all the elements from the arrayList, rearranges them in descending order and prints them till the difference between 2 elements is 1.
//4. The 'arrangeFloor()' method then stops printing if the difference between 2 elements is more than 1 because that effectively means there is a floor missing.
//5. In this way, the 'ArrangeFloor()' method keeps executing till all the floors have been printed in the right order.

public class BuildingOperations 
{
	Queue buildingFloors;
	ArrayList<Integer> tempArray = new ArrayList<Integer>();
	ArrayList<Integer> tempBuildingFloors1 = new ArrayList<Integer>();
	
		public BuildingOperations()
		{
			buildingFloors = new LinkedList();			
		}
	
       public void push(int data)
       {
    	   //pushing user enteres floors in a queue
    		   buildingFloors.add(data); 
       }
       
       
       
       
       public void arrangeFloor()
       {
    	   int sizeOfBuilding= buildingFloors.size();
    	   int tempSizeOfBuilding= buildingFloors.size();
    	   int lastElement=0;
    	   //loop starting to read all elements in the queue
    	   for(int i=0; i<sizeOfBuilding; i++)
    	   {
    		  
    	   Integer head = (Integer)buildingFloors.peek();
    	   
    	     //this if block will keep pushing the elements in the arrayList till the largest floor is encountered
	    	   if (head.intValue()<tempSizeOfBuilding)
	    	   {
	    		   
	    	      System.out.println("Day "+ (i+1) + ":");
	    	      tempBuildingFloors1.add((Integer)buildingFloors.remove());
	    	   }
    	       //the else is executed once the largest floor is encountered.
		    	   else 
		    	      {
		    		   Integer head1 = (Integer)buildingFloors.peek(); 
		    		   tempBuildingFloors1.add(head1);
		    		   buildingFloors.remove(head1);
		    		   System.out.print("Day "+ (i+1) + ": " );
		    		   int check =0;
		    		   Iterator it = tempBuildingFloors1.iterator();
			    			   
			    			   while(it.hasNext())
			    			   {
			    				    tempArray.add((Integer)(it.next()));
			    			   }
			    	//sorting the elements in descending order		   
			    	  Collections.sort(tempArray, Collections.reverseOrder());
			    	  boolean ans= false;
			    	  int k=0;
			    	  lastElement= tempArray.get(tempArray.size()-1);
			    			  
			    			//special condition is the largest element is the first element of the array. 
			    			  if(tempArray.size()==1)
			    			  {
			    				  tempArray.clear();
			    				  tempBuildingFloors1.remove(0);
			    			  }
			    				  
			    			  while(k<(tempArray.size()-1) && ans ==false)
		                        {
		                    	  //checking if the size difference in 2 consecutive floors is 1. 
		                    	   check = (Integer)(tempArray.get(k))-(tempArray.get(k+1));
		
				                      if(check ==1)
				                      {
				                    	System.out.print(tempArray.get(k).intValue()+ " ");
				                    	tempBuildingFloors1.remove((tempArray.get(k)));
				                    	tempBuildingFloors1.remove((tempArray.get(k+1)));
				                      }
			                      
					                      else
					                      {   
					                    	  System.out.print(tempArray.get(k));
					                    	  tempBuildingFloors1.remove((tempArray.get(k)));
					                    	  tempArray.clear();
					                    	  ans = true;
					                      }  
			                      k++;
		                        }
			    		 if(ans==false)   
			    			System.out.println(lastElement);
			    	     System.out.println();
			    		 tempArray.clear();
		                 int temp1=0;
		                 int temp2=0;
		                 Iterator it5= buildingFloors.iterator();
		                 while(it5.hasNext())
		                       {
		                    	 temp1= (Integer)(it5.next());
		                    			  
		                    	if(temp1>temp2)
		                    	   temp2=temp1;
		                    	}
		                    		  
		                 tempSizeOfBuilding= temp2;
		                    		  
		    	      }	  
                    		 
    	        }  	
	                    	
            }        	
	                    	
     }             	
	                    	
                            
	                      
                    	  
                    	  
                    	  
	                    
                      
           
                     
	                 

    	       
    	      
    	  
    	   
    	   
       
    	   
    	   
 
    	   
       
