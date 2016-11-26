package com.github.nightmeister.bootique.ebean;

import com.google.inject.Module;
import io.bootique.BQModuleProvider;

/**
 * Created by Artem N. Ivanov
 *
 * @since 26.11.16.
 */
public class EbeanModuleProvider implements BQModuleProvider {

    @Override
    public Module module() {
        return new EbeanModule();
    }
}
