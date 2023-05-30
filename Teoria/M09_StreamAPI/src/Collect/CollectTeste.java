package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectTeste {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    Set<Integer> collect = list.stream()
        .collect(
            () -> new HashSet<>(),
            (l, e) -> l.add(e),
            (l1, l2) -> l1.addAll(l2));

    System.out.println(list);
    System.out.println(collect);

    System.out.println("\ntoCollection");
    List<Integer> collect2 = list.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toCollection(() -> new ArrayList<>()));
    System.out.println(collect2);

    System.out.println("\njoining");
    String join = list.stream()
        .map(n -> n.toString())
        .collect(Collectors.joining(" "));
    System.out.println(join);

    System.out.println("\naveraging");
    Double media = list.stream()
        .collect(Collectors.averagingInt(n -> n.intValue()));
    System.out.println(media);

    System.out.println("\nsumming");
    Integer soma = list.stream()
        .collect(Collectors.summingInt(n -> n.intValue()));
    System.out.println(soma);

    System.out.println("\nsummarizing");
    IntSummaryStatistics stats = list.stream()
        .collect(Collectors.summarizingInt(n -> n.intValue()));

    System.out.println("\ngroupingBy");
    Map<Integer, List<Integer>> groupingBy = list.stream()
        .collect(Collectors.groupingBy(n -> n % 3));
    System.out.println(groupingBy);

    System.out.println("\npartitioningBy");
    Map<Boolean, List<Integer>> partitioningBy = list.stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    System.out.println(partitioningBy);

    System.out.println("\ntoMap");
    Map<Integer, Double> toMap = list.stream()
        .collect(Collectors.toMap(n -> n, n -> Math.pow(n.doubleValue(), 5)));
    System.out.println(toMap);

  }
}
