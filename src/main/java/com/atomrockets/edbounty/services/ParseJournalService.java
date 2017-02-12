package com.atomrockets.edbounty.services;

import com.atomrockets.edbounty.models.AbstractEvent;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseJournalService {
    final private String journalPath = "C:\\Users\\Allan\\Saved Games\\Frontier Developments\\Elite Dangerous\\";

    public List<AbstractEvent> parseJournalFile() throws IOException {
        List<AbstractEvent> eventList = new ArrayList<>();

        File directory = new File(journalPath);

        File[] list = directory.listFiles();
        for (File journalFile : list) {
            try (BufferedReader br = new BufferedReader(new FileReader(journalFile))) {
                String line, previousLine = null;

                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

                while ((line = br.readLine()) != null) {
//                    line = line.replaceAll("[\\x00-\\x09\\x11\\x12\\x14-\\x1F\\x7F]", "");

                    try {
                        eventList.add(objectMapper.readValue(line, AbstractEvent.class));
                    } catch (IOException jpe) {
                        System.out.println("Filename: " + journalFile);
                        System.out.println(previousLine);
                        System.out.println(line);
                        jpe.printStackTrace();
                    }

                    previousLine = line;
                }
            }
        }
        return eventList;
    }
}
