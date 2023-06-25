package de.cooperr.cooperrsurvival;

import de.cooperr.cppluginutil.CustomConfig;
import de.cooperr.cppluginutil.PaperPlugin;

import java.io.File;

public final class CooperrSurvival extends PaperPlugin {

    @Override
    public void onLoad() {
        config = new CustomConfig(this,
                new File(getDataFolder(), "config.yml"),
                new File("./resources/config-default.yml"));
    }

    @Override
    public void onEnable() {
        commandRegistration();
        listenerRegistration();
    }

    @Override
    protected void commandRegistration() {
    }

    @Override
    protected void listenerRegistration() {
    }
}
