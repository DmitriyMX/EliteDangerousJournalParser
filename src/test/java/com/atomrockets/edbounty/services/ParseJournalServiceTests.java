package com.atomrockets.edbounty.services;


import com.atomrockets.edbounty.models.AbstractEvent;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ParseJournalServiceTests {
    @Test
    public void testParsingJsonFiles() throws IOException {
        ParseJournalService parseJournalService = new ParseJournalService();
        List<AbstractEvent> eventList = parseJournalService.parseJournalFile();
        eventList.forEach(x -> System.out.println(x));
    }
}
