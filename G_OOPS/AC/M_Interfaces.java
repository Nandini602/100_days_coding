// remenber we use here the public at the time of interface

import java.util.*; 

public class M_Interfaces{
public  static void main(String args[]){
        Queen q = new Queen(); 
        q.moves();
    } 
} 

interface Chessplayer{
    void moves();
} 

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right, diagonal");
    }
} 

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
} 

class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,diagonal");
    }
}