package org.wiztools.xsdgen;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XsdGenWithoutAtrributeTest {
    public XsdGenWithoutAtrributeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPoste() throws Exception {
        // File file = new File("src/test/resources/agenda.xml");
        File file = new File("src/test/resources/poste.xml");
        // new XsdGenWithoutAtrribute().parse(file).write(System.out);

        // PrintWriter writer = new PrintWriter("src/test/resources/poste.xsd", "UTF-8");
        // writer.println(new XsdGenWithoutAtrribute().parse(file).toString());
        // writer.close();

        System.out.println(new XsdGenWithoutAtrribute().parse(file).toString());
    }
}
