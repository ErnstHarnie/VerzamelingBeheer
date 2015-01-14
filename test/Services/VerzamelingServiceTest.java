/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.Verzameling;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ernst
 */
public class VerzamelingServiceTest {
    
    public VerzamelingServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of VerzamelingOpslaan method, of class VerzamelingService.
     */
    @Test
    public void testVerzamelingOpslaan() {
        System.out.println("VerzamelingOpslaan");
        Verzameling verzameling = new Verzameling();
        verzameling.setNaam("naam"); 
        verzameling.setBeschrijving("beschrijving");
        verzameling.setInBezit(true);
        verzameling.setCategoryId(1);
        verzameling.setTypeId(1);
        Verzameling expResult = null;
       VerzamelingService.VerzamelingOpslaan(verzameling);

        //assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of VerzamelingVerwijderen method, of class VerzamelingService.
     */
    @Test
    public void testVerzamelingVerwijderen() {
        System.out.println("VerzamelingVerwijderen");
        int Id = 0;
        VerzamelingService.VerzamelingVerwijderen(Id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetVerzameling method, of class VerzamelingService.
     */
    @Test
    public void testGetVerzameling() {
        System.out.println("GetVerzameling");
        int Id = 0;
        Verzameling expResult = null;
        Verzameling result = VerzamelingService.GetVerzameling(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAllVerzamelingen method, of class VerzamelingService.
     */
    @Test
    public void testGetAllVerzamelingen() {
        System.out.println("GetAllVerzamelingen");
        List<Verzameling> expResult = null;
        List<Verzameling> result = VerzamelingService.GetAllVerzamelingen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
