package org.example;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    // Exercice
    // change
    //Exercice.optimalChange
    // 3 -> null
    // 1 ->null
    // 6 -> 0,0,3
    // 8 -> 0, 0, 4
    // 10 -> 1, 0, 0
    // 31 -> 2, 1, 3
    // 9223372036854775807l -> 922337203685477580l, 1,1


    @Test
    public void optimalChange_with1()
    {
        final Change change = App.optimalChange(1);
        assertNull( change );
    }

    @Test
    public void optimalChange_with3()
    {
        final Change change = App.optimalChange(3);
        assertNull( change );
    }
    @Test
    public void optimalChange_with4()
    {
        final Change change = App.optimalChange(4);
        Assert.assertEquals(change.getBill10(),0l);
        Assert.assertEquals(change.getBill5(),0l);
        Assert.assertEquals(change.getCoin2(),2l);
    }

    @Test
    public void optimalChange_with7()
    {
        final Change change = App.optimalChange(7);
        Assert.assertEquals(change.getBill10(),0l);
        Assert.assertEquals(change.getBill5(),1l);
        Assert.assertEquals(change.getCoin2(),1l);
    }

    @Test
    public void optimalChange_with6()
    {
        final Change change = App.optimalChange(6);
        Assert.assertEquals(change.getBill10(),0l);
        Assert.assertEquals(change.getBill5(),0l);
        Assert.assertEquals(change.getCoin2(),3l);
    }

    @Test
    public void optimalChange_with8()
    {
        final Change change = App.optimalChange(8);
        Assert.assertEquals(change.getBill10(),0l);
        Assert.assertEquals(change.getBill5(),0l);
        Assert.assertEquals(change.getCoin2(),4l);
    }

    @Test
    public void optimalChange_with10()
    {
        final Change change = App.optimalChange(10);
        Assert.assertEquals(change.getBill10(),1l);
        Assert.assertEquals(change.getBill5(),0l);
        Assert.assertEquals(change.getCoin2(),0l);
    }

    @Test
    public void optimalChange_with13()
    {
        final Change change = App.optimalChange(13);
        Assert.assertEquals(change.getBill10(),0l);
        Assert.assertEquals(change.getBill5(),1l);
        Assert.assertEquals(change.getCoin2(),4l);
    }

    @Test
    public void optimalChange_with15()
    {
        final Change change = App.optimalChange(15);
        Assert.assertEquals(change.getBill10(),1l);
        Assert.assertEquals(change.getBill5(),1l);
        Assert.assertEquals(change.getCoin2(),0l);
    }

    @Test
    public void optimalChange_with31()
    {
        final Change change = App.optimalChange(31);
        Assert.assertEquals(change.getBill10(),2l);
        Assert.assertEquals(change.getBill5(),1l);
        Assert.assertEquals(change.getCoin2(),3l);
    }

    @Test
    public void optimalChange_with9223372036854775807()
    {
        final Change change = App.optimalChange(9223372036854775807l);
        Assert.assertEquals(change.getBill10(),922337203685477580l);
        Assert.assertEquals(change.getBill5(),1l);
        Assert.assertEquals(change.getCoin2(),1l);
    }
}
