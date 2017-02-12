package com.atomrockets.edbounty;

import com.atomrockets.edbounty.services.ParseJournalService;

import java.io.IOException;

public class EDBounty {

    public static void main (String args[]) throws IOException {
        ParseJournalService parseJournalService = new ParseJournalService();
        parseJournalService.parseJournalFile();
    }
}
