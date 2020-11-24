package pyc.functionalprogram.transaction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author pi
 * @date 2020/8/11 13:12:49
 */
public class TransactionProcessorTest {

    private TransactionProcessor transactionProcessor;

    @Before
    public void setFixture() {
        transactionProcessor = new TransactionProcessor();
    }

    @Test
    public void should_return_all_transaction_in_2011_and_sort_by_value() throws Exception {
        List<Transaction> transactions = transactionProcessor.queryTransactionsIn2011AndSortByValueAsc();
        Assert.assertEquals(2, transactions.size());
        Assert.assertEquals(300, transactions.get(0).getValue());
    }

    @Test
    public void should_return_distinct_work_cities() throws Exception {
        List<String> cities = transactionProcessor.queryTraderWorkCities();
        Assert.assertEquals(2, cities.size());
        Assert.assertEquals("Cambridge", cities.get(0));
        Assert.assertEquals("Milan", cities.get(1));
    }

    @Test
    public void should_return_traders_from_cambridge_sort_by_name() throws Exception {
        List<Trader> traders = transactionProcessor.queryTraderFromCambridge();
        Assert.assertEquals(3, traders.size());
        Assert.assertEquals("Alan", traders.get(0).getName());
    }

    @Test
    public void should_return_all_traders_name_characters_order_by_alpha() throws Exception {
        List<String> tradersNameCharacter = transactionProcessor.queryAllTraderNameCharacterAndOrderByAlpha();
        Assert.assertEquals(19, tradersNameCharacter.size());
        Assert.assertEquals("a", tradersNameCharacter.get(0));
        Assert.assertEquals("u", tradersNameCharacter.get(tradersNameCharacter.size() - 1));
        tradersNameCharacter.stream().forEach(System.out::print);
    }

    @Test
    public void should_return_have_trader_work_in_milan() throws Exception {
        Boolean haveTraderWorkInMilan = transactionProcessor.haveTraderWorkInMilan();
        Assert.assertEquals(true,haveTraderWorkInMilan);
    }

    @Test
    public void should_print_sum_of_transaction_value_that_trader_in_cambridge() throws Exception {
        Integer transactionValue = transactionProcessor.calculateTransactionValueThatTraderInCambridge();
        Assert.assertEquals(2650,transactionValue.intValue());
    }

    @Test
    public void should_return_max_transaction_value() throws Exception {
        Integer maxTransactionValue = transactionProcessor.queryMaxTransactionValue();
        Assert.assertEquals(1000,maxTransactionValue.intValue());
    }

    @Test
    public void should_return_min_transaction_value() throws Exception {
        Integer minTransactionValue = transactionProcessor.queryMinTransactionValue();
        Assert.assertEquals(300,minTransactionValue.intValue());
    }

    @Test
    public void should_return_sort_trader_name_and_join_together() throws Exception {
        String allTraderNameOrderByAlpha = transactionProcessor.joinAllTraderNameAndOrderByAlpha();
        Assert.assertEquals(19,allTraderNameOrderByAlpha.length());
        Assert.assertEquals("A",allTraderNameOrderByAlpha.substring(0,1));
        Assert.assertEquals("l",allTraderNameOrderByAlpha.substring(allTraderNameOrderByAlpha.length()-1,allTraderNameOrderByAlpha.length()));
        Arrays.asList(allTraderNameOrderByAlpha.split("")).forEach(System.out::print);
    }
}
