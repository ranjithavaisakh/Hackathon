package com.example.demo;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
// Demo app
public class DemoApplication {

	public static void main(String[] args) {
                String createdDate = "2023-10-05 14:30:15.123456 +0000";
                String rawCountryCode = "ja_JP";
                String countryCode = rawCountryCode.contains("_") ? rawCountryCode.substring(rawCountryCode.indexOf('_') + 1) : rawCountryCode;
                // Accept both 3 and 6 digit milliseconds with offset
                if (createdDate.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{6} \\+\\d{4}")) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS X");
                    OffsetDateTime offsetDateTime = OffsetDateTime.parse(createdDate, formatter);
                    System.out.println("Epoch millis: " + offsetDateTime.toInstant().toEpochMilli());
                    return;
                } else if (createdDate.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3} \\+\\d{4}")) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS X");
                    OffsetDateTime offsetDateTime = OffsetDateTime.parse(createdDate, formatter);
                    System.out.println("Epoch millis: " + offsetDateTime.toInstant().toEpochMilli());
                    return;
                }
            }
        }
	}

}
