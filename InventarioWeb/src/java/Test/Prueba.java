/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.util.List;
/**
 *
 * @author alex
 */



public class Prueba {
    
     
    public static void main(String[]arg){
        Prueba evaluar = new Prueba();
       //evaluar.guardaCategoria();
        evaluar.listarCategorias();
        evaluar.eliminarCategoria();
        evaluar.listarCategorias();
       // evaluar.editarCategoria();
       
    }
    
   
    
     public void editarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria cat_edit = categoria.editarCat(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println(" ID :" + cat_edit.getId_categoria()+
                               " NOMBRE : " + cat_edit.getNom_categoria()+
                               " ESTADO : " + cat_edit.getEstado_categoria());
    }
   
    
    
    public void listarCategorias(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("Listado de categorias");
        
        for(Categoria categoriaListar : listar){
            System.out.println(" ID :" + categoriaListar.getId_categoria()+
                               " NOMBRE : " + categoriaListar.getNom_categoria()+
                               " ESTADO : " + categoriaListar.getEstado_categoria());
            
        }
        
    
    
    
    }
    
    
    
    
    public void guardaCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria guarda_cat = new Categoria();
        guarda_cat.setNom_categoria("Bebidas Naturales");
       // guarda_cat.setId_categoria(5);
        
        guarda_cat.setEstado_categoria(1);
        categoria.guardarCat(guarda_cat);
        
    }
    
    public void eliminarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(2);
    }
  
    
}
