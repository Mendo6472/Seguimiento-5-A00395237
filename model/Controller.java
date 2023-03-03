package model;  

public class Controller {

    Bst bst = new Bst();
    
    public Controller(){

    }

    public String createBst(String names){
        String msj = "";
        String[] array = names.split(" ");
        array = sortArray(array);
        addNodes(array);
        return msj;
    }

    private void addNodes(String[] array){
        int midPoint;
        if(array.length == 0) return;
        if(array.length == 1){
            midPoint = 0;
        } else {
            midPoint = array.length/2;
        }
        String[] leftArray = new String[midPoint];
        for(int i = 0; i < midPoint; i++){
            leftArray[i] = array[i];
        }
        String[] rightArray;
        if(array.length%2 == 0){
            rightArray = new String[midPoint - 1];
        } else {
            rightArray = new String[midPoint];
        }
        int j = 0;
        for(int i = midPoint + 1; i < array.length; i++){
            rightArray[j] = array[i];
            j++;
        }
        addNode(array[midPoint]);
        addNodes(leftArray);
        addNodes(rightArray);
    }

    private void addNode(String name){
        Node node = new Node(name);
        bst.add(node);
    }

    private String[] sortArray(String array[]){
        for(int i = 0; i<array.length; i++){  
            for (int j = i+1; j<array.length; j++){  
               if(array[i].compareTo(array[j])>0){  
                   String temp = array[i];  
                   array[i] = array[j];  
                   array[j] = temp;  
                }  
            }  
        }
        return array;
    }

    public String inOrder(){
        return bst.inOrder();
    }

    public int getDepth(){
        return bst.getDepth();
    }

    
}
