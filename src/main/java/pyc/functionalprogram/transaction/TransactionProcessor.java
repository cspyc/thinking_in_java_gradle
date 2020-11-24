package pyc.functionalprogram.transaction;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author pi
 * @date 2020/8/11 13:07:51
 */
public class TransactionProcessor {

    private List<Transaction> transactions;

    public TransactionProcessor() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }

    public List<Transaction> queryTransactionsIn2011AndSortByValueAsc() {
        return transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<String> queryTraderWorkCities() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Trader> queryTraderFromCambridge() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    public List<String> queryAllTraderNameCharacterAndOrderByAlpha() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                .map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .sorted(Collator.getInstance(Locale.ENGLISH))
                .collect(Collectors.toList());
    }

    public Boolean haveTraderWorkInMilan() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getCity)
                .anyMatch(x -> "Milan".equals(x));
    }

    public Integer calculateTransactionValueThatTraderInCambridge() {
        Optional<Integer> value = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        return value.get();
    }

    public Integer queryMaxTransactionValue() {
        Optional<Integer> maxTransactionValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        return maxTransactionValue.get();
    }

    public Integer queryMinTransactionValue() {
        Optional<Integer> minTransactionValue = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        return minTransactionValue.get();
    }

    public String joinAllTraderNameAndOrderByAlpha() {
        Optional<String> traderNames = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce((a, b) -> a + b);

        return traderNames.get();
    }
}
