package model;

public class Bst {

    Node root;

    public Bst(){

    }

    public String add(Node node){
        if(root == null){
            root = node;
            return "Se ha añadido el elemento al arbol con exito";
        }else{
            return add(root, node);
        }
    }
    private String add(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
          //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
                return "Se ha añadido el elemento al arbol con exito";
            }else{
                return add(current.getLeft(), node);
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
                return "Se ha añadido el elemento al arbol con exito";
            }else{
                return add(current.getRight(), node);                
            }

        }else{
            return "No se a añadido el elemento al arbol.";
        }
    }

    public String inOrder(){
        return inOrder(root);
    }

    private String inOrder(Node current){
        String names = "";
        if(current == null){
            return "";
        }
        names += inOrder(current.getRight()) + " ";
        names += current.getKey() + " ";
        names += inOrder(current.getLeft()) + "";
        return names;
    }

}
