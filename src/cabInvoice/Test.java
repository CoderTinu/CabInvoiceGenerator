package cabInvoice;

public class Test {
	@org.junit.jupiter.api.Test
    public void checkFairCalculation(){
        int expected = FareCalculation.fairCalculation(10,1);
        Assert.assertEquals(expected,101);
    }
}
