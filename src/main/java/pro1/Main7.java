package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.PrijmaciOborList;

import java.util.HashSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main7 {

    public static String specializationDeadlines(int year){
        String json = Api.getSpecializations(year);

        PrijmaciOborList obory = new Gson().fromJson(json, PrijmaciOborList.class);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        Set<String> uniqueDeadlines = obory.prijimaciObor.stream()
                .map(o -> o.deadline != null && o.deadline.value != null ? o.deadline.value : null)
                .filter(d -> d != null && !d.isEmpty())
                .map(d -> {
                    try {
                        return LocalDate.parse(d, formatter);
                    } catch (Exception e) {
                        System.out.println("Error parsing date: " + d);
                        return null;
                    }
                })
                .filter(d -> d != null)
                .map(formatter::format)
                .filter(d -> !d.equals("30.4.2025"))
                .collect(Collectors.toCollection(HashSet::new));

        List<String> sortedDeadlines = uniqueDeadlines.stream()
                .map(d -> LocalDate.parse(d, formatter))
                .sorted(Comparator.comparing(LocalDate::toEpochDay))
                .map(formatter::format)
                .collect(Collectors.toList());

        return String.join(",", sortedDeadlines);
    }
}
