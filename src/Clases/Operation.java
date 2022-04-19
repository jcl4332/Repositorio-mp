
package Clases;

import java.util.ArrayList;
import java.util.List;


public interface Operation  {
   
    List <Operation> operationList=new ArrayList<>();
    public abstract void doOperation(int n);

    
}
