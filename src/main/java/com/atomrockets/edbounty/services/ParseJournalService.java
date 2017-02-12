package com.atomrockets.edbounty.services;

import com.atomrockets.edbounty.models.AbstractEvent;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseJournalService {
    final private String journalPath = "C:\\Users\\Allan\\Saved Games\\Frontier Developments\\Elite Dangerous\\Journal.170131200857.01.log";

    public List<AbstractEvent> parseJournalFile() throws IOException {
        List<AbstractEvent> eventList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(journalPath))) {
            String line;

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

            while ((line = br.readLine()) != null) {
                eventList.add(objectMapper.readValue(line, AbstractEvent.class));
            }
        }

        return eventList;
    }
}
