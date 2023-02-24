import java.util.Scanner;

class TotalArray{
  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int no_elements = 0;


  

  public void insertFirst() {
    System.out.println("[1]enter value for first index");
    int num = s.nextInt();
    if (no_elements == 0) {  // check wheather if elements present or not in an array
      arr[0] = num;
      no_elements++;
    } else {
      for (int i = no_elements;i > 0; i--) { // if 56 67 89 present i // array i will ne some no_elements;i>0(greater than 0);i--
        arr[i] = arr[i - 1];       // arr[i]=arr[i-1]// ll decrement till arr[0]//                      
      }
      arr[0] = num;   //arr[0] wil be empty so the number we give ll save in arr[0]
      no_elements++; //no_elements will increment
    }
  }




  

  public void insertLast() {
    System.out.println("[2]enter value for last index");
    int num = s.nextInt();
    if (no_elements == 0) {      // check if arr[] is empty or not
      arr[0] = num;              //if empty then arr[0]= number 
    } else {
      arr[no_elements] = num;    // arr[no_elements]=num
      no_elements++;            // n0_increment
    }
  }




  

  public void insertMiddle() {
    System.out.println(" [3] enter new index value"); //55
    int value = s.nextInt();
    System.out.println(" enter new index n0");  //3
    int index = s.nextInt();
    if (index <= no_elements) {       // 3<0
      if (no_elements == 0) {
        arr[index] = value;
        no_elements++;
      } else {                  
        for (int i = no_elements; i > index; i--) {//tere will be some numbers in arr i=that number;i>index;i--//
          arr[i] = arr[i - 1];    //arr[4]=arr[4-1]
        }
        arr[index] = value;    //arr[3]=value dump
        no_elements++;          //increment 
      }
    }
  }





  
  
  public void deletFirst() {
    if(no_elements==0){
      System.out.println("invalid");
    }
    for (int i = 0; i < no_elements; i++) {
      arr[i] = arr[i + 1];
    }
    no_elements--;
  }





  
public void deletLast() {
if(no_elements==0)
{
  System.out.println("array is empty");
}
    else{
      no_elements--;
      }
  }





  

  public void deletSpecific() {
    if(no_elements==0){
      System.out.println("array is empty");
    }
    else{
      System.out.println("enter index value");
      int index=s.nextInt();
      if(index<no_elements){
        for(int i=index;i<no_elements;i++){
          arr[i]=arr[i+1];
        }
        no_elements--;
      }
    }
 }




  
  
  public void deletSearch() {
    System.out.println("enter search element");
    int key=s.nextInt();
    int index=-1;
    for(int i=0;i<no_elements;i++){
      if(key==arr[i]){
        index=i;
        break;
      }
    }
if(index>=0){
  int i;
for(i =index;i<no_elements;i++);{
   arr[i]=arr[i+1];
}
  no_elements--;
  }
    else{
         System.out.println("entered search element not found");
    }
  }



  
  public void display() {
    for (int i = 0; i < no_elements; i++) {
      System.out.print(arr[i] + " ");
    }
    viewOptions();
  }



  

  
  public void viewOptions() {
    System.out.println(" [1]insert an  value for first index");
    System.out.println(" [2]insert an  value for last index");
    System.out.println(" [3]insert elment in specific  index position");
    System.out.println(" [4] delet first");
    System.out.println(" [5] delet last");
    System.out.println(" [6] delet specific");
    System.out.println(" [7] delet search");
    System.out.println("choose your option");
    int option = 0;
    do {
      option = s.nextInt();
      switch (option) {
        case 1: {
          insertFirst();
          display();
        }
        case 2: {
          insertLast();
          display();
        }
        case 3: {
          insertMiddle();
          display();
        }
        case 4: {
          deletFirst();
          display();
        }
        case 5: {
          deletLast();
          display();
        }
        case 6: {
          deletSpecific();
          display();
        }
        case 7: {
          deletSearch();
          display();
        }
      }
    } while (option != 0);
    {
      System.out.println(" ok friends byee");
    }
  }





  
    public static void main(String args[]) {

    TotalArray obj = TotalArray();
    obj.insertFirst();
    obj.display();
    obj.viewOptions();
  }
}