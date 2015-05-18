
package projeto_git;


public class principal {
  
   public static void main(String[] args) {
       pilha x = new pilha();
       x.criarpilha(10);
        x.pop();
        System.out.println(x.tamanho());
        System.out.println(x.echeia());
        x.push(10);
        x.pop();
       
        x.push(10);
    } 
}
