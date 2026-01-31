package com.engine;

import org.springframework.stereotype.Component;
import com.engine.RollsRoyce;

@Component("rrGhostBean")
public class RollsRoyceGhost extends RollsRoyce {
    public RollsRoyceGhost() {
        super("RRGH-2123", "GHOST", "$12345");
    }
}