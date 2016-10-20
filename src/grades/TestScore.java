/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

/**
 *
 * @author Remi
 */
public class TestScore {
    private final double test1;
private final double test2;
private final double test3;

public TestScore (double t1, double t2, double t3)
{
    test1=t1;
    test2=t2;
    test3=t3;
}
public double getAvg()
{
    return (test1+test2+test3)/3;
}
}
