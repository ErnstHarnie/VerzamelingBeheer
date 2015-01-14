/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.Categorie;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ernst
 */
public class CategorieServiceTest {
    
    public CategorieServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CategorieOpslaan method, of class CategorieService.
     */
    @Test
    public void testCategorieOpslaan() {
        System.out.println("CategorieOpslaan");
        Categorie categorie = null;
        Categorie expResult = null;
        Categorie result = CategorieService.CategorieOpslaan(categorie);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of CategorieVerwijderen method, of class CategorieService.
     */
    @Test
    public void testCategorieVerwijderen() {
        System.out.println("CategorieVerwijderen");
        int Id = 0;
        CategorieService.CategorieVerwijderen(Id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetCategorie method, of class CategorieService.
     */
    @Test
    public void testGetCategorie() {
        System.out.println("GetCategorie");
        int Id = 0;
        Categorie expResult = null;
        Categorie result = CategorieService.GetCategorie(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllCategories method, of class CategorieService.
     */
    @Test
    public void testGetAllCategories() {
        System.out.println("GetAllCategories");
        List<Categorie> expResult = null;
        List<Categorie> result = CategorieService.GetAllCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
