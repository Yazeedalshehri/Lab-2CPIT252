

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cpit252lab2.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yaaz4
 */
public class LoggerTest 
{
  @Test
  public void shouldBeIdenticals()
  {
    Logger log1 = Logger.getLogger();
    Logger log2 = Logger.getLogger();
    assertEquals(log1, log2); 
  }

}
