package com.github.nightmeister.bootique.ebean;

import io.bootique.ConfigModule;

/**
 * Created by Artem N. Ivanov
 * @since 26.11.16.
 */
public class EbeanModule extends ConfigModule {

    public EbeanModule(String configPrefix) {
        super(configPrefix);
    }

    public EbeanModule() {
    }

}
