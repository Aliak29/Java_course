package Homework.Homework1.Homework2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        // Дана строка sql-запроса "select * from students where ". Сформируйте часть
        // WHERE этого запроса, используя StringBuilder.
        // Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
        // "city":"Moscow", "age":"null"}
        Map<String, Object> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Russia");
        params.put("city", "Moscow");
        params.put("age", null);

        String whereClause = buildWhereClause(params);
        System.out.println(whereClause);
    }

    private static String buildWhereClause(Map<String, Object> params) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value != null) {
                sb.append(key).append(" = ")
                        .append(value instanceof String ? "'" + value + "'" : value)
                        .append(" and ");
            }
        }

        return sb.length() > 0 ? sb.substring(0, sb.length() - 5) : "";
    }
}