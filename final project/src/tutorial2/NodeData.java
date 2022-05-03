
package tutorial2;




public class NodeData {//start class
    
    int num;
    char ch;
    int chcount=0;
    int numcount=0;
    
    public NodeData(int n){//start class
    
        num = n;
    numcount++;
    }//end nodedata int
    
    public NodeData(char n){//start class
    
        ch = n;
    chcount++;
    }//end nodedata char
    
    public String toString(){//start class
    
       if (chcount >0){ return ch+" ";}
        
       return num+" ";
    
    }//close tostring
    

    
}//end class
