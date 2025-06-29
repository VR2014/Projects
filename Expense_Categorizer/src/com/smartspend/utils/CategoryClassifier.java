package com.smartspend.utils;

import java.util.*;

public class CategoryClassifier {

    private static final Map<String, List<String>> CATEGORY_KEYWORDS = new LinkedHashMap<>();

    static {
        CATEGORY_KEYWORDS.put("Food", Arrays.asList("restaurant", "cafe", "coffee", "pizza", "burger", "dominos", "kfc", "mcdonald", "zomato", "swiggy"));
        CATEGORY_KEYWORDS.put("Travel", Arrays.asList("uber", "ola", "cab", "flight", "indigo", "airasia", "train", "irctc", "metro", "bus"));
        CATEGORY_KEYWORDS.put("Utilities", Arrays.asList("electricity", "water", "gas", "internet", "wifi", "broadband", "phone", "mobile", "recharge", "postpaid"));
        CATEGORY_KEYWORDS.put("Shopping", Arrays.asList("amazon", "flipkart", "myntra", "ajio", "bigbasket", "grofers"));
        CATEGORY_KEYWORDS.put("Rent", Arrays.asList("rent", "landlord"));
        CATEGORY_KEYWORDS.put("Entertainment", Arrays.asList("netflix", "prime", "hotstar", "spotify", "bookmyshow"));
        CATEGORY_KEYWORDS.put("Others", Collections.emptyList());
    }

    public static String classify(String description) {
        String descLower = description.toLowerCase();
        for (Map.Entry<String, List<String>> entry : CATEGORY_KEYWORDS.entrySet()) {
            if (entry.getKey().equals("Others")) continue;
            for (String keyword : entry.getValue()) {
                if (descLower.contains(keyword)) {
                    return entry.getKey();
                }
            }
        }
        return "Others";
    }

    public static Set<String> getAllCategories() {
        return CATEGORY_KEYWORDS.keySet();
    }
}
