import java.io.*;
import java.util.*;

class NightTour
{
    public char[][] maze;
    public int h,w;
    public boolean solved = false;
    final public char wall=' ';
    final public char path= '0';
    public char travelled='A';
    public NightTour(String filename)
    {
 maze = new char[80][25];
 h=0;
 w=0;
 try
     {

  FileInputStream fstream=new FileInputStream(filename);
  DataInputStream in = new DataInputStream(fstream);

  while (in.available()!=0)
      {
   String line = in.readLine();
   if (w==0)
       w = line.length();
   for (int i=0;i<line.length();i++)
       {
    maze[i][h]=line.charAt(i);
       }
   h++;
      }
  in.close();
     }
 catch (Exception e)
     {
  System.err.println("File Input Error");
     }

    }

    public String toString()
    {
 String s = " [0;0H";
 int i,j;
 for (i=0;i<h;i++)
     {
  for (j=0;j<w;j++)
      {
   s = s + maze[j][i];
      }

  s = s + "\n";
     }
 return s;
    }

    private void delay(int n)
    {
 try{
  Thread.sleep(n);
 }
 catch (InterruptedException e) {
     System.exit(0);
 }
    }
    
    public void solve(int x,int y) {

 if (travelled == (x*y)) {
     solved = true;
 } else if (maze[x][y]==path){
 
   try{   delay(75);
     System.out.println(this);
     maze[x][y] = (char)travelled;
     travelled++;
     solve(x+2,y+1);
     if (!solved )
  solve(x+2,y-1);
     if (!solved )
  solve(x+1,y-2);
     if (!solved)
  solve(x+1,y+2);
     if (!solved)
  solve(x-1,y-2);
     if (!solved)
  solve(x-1,y+2);
     if (!solved)
  solve(x-2,y+1);
     if (!solved)
  solve(x-2,y-1);
     
   
   }
 catch (Exception e){
   
 }
 

    }
    }


    public static void main(String[] args)
    {
 NightTour m = new NightTour("maze1.dat");

 System.out.println(" [2J");
 System.out.println(m);
 m.solve(2,3);
    }

}
