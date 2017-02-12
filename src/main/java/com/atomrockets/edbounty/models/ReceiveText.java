package com.atomrockets.edbounty.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReceiveText extends AbstractEvent {
    private String from;
    @JsonProperty("From_Localised")
    private String fromLocalised;
    private String message;
    @JsonProperty("Message_Localised")
    private String messageLocalised;
    private String channel; //Channel: (wing/local/voicechat/friend/player/npc)
}
