/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Hashtable;
import java.util.Enumeration;
/**
 *
 * @author Artu
 */
public class Diretorio {

    private Hashtable<String, String> Contatos;

    public Diretorio(){
    this.Contatos = new Hashtable<String,String>();
    
}
    public int adicionarContato(String a, String telefone){//returna 0 se nao poder adicionar e 1 se poder
        int resultado =0;//define o resultado
        if(!this.Contatos.containsKey(a)){//valida que o contato existe
            this.Contatos.put(a, telefone);//add  o contato
            resultado = 1;//att o valor 
        }
        return resultado;
    }
    public int apagarContato(){
        int resultado = 0;
        return resultado;
    }
    public void apagarTudo(){
        
    }
    public String buscarContato(String a){
        String resultado="";
        return resultado;
    }
    public void listarCntatos(){
        Enumeration lista = this.Contatos.keys();
        Object a ;
        Object telefone;
        while(lista.hasMoreElements()){
            a = lista.nextElement();
            telefone = this.Contatos.get(a);
            System.err.println(a+"--"+telefone);
            
            
        }
    }
    
    
    
}
