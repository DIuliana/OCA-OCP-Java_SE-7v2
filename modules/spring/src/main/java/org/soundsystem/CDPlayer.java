package org.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by p3700639 on 10/26/2016.
 */

@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    @Inject
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){

        cd.play();
    }

}
