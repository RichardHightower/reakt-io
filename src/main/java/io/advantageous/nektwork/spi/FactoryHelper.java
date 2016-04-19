package io.advantageous.nektwork.spi;


import java.util.ServiceLoader;

import static java.util.ServiceLoader.load;

/**
 * Ideas based off of ServiceHelper written by Tim Fox for Vert.x.
 */
public class FactoryHelper {

    public static <T> T loadFactory(Class<T> interfaceOfFactory) {
        ServiceLoader<T> factories = load(interfaceOfFactory);
        if (factories.iterator().hasNext()) {
            return factories.iterator().next();
        } else {
            /**
             * Helps support odd classloader environments like OSGi.
             */
            factories = load(interfaceOfFactory, FactoryHelper.class.getClassLoader());
            if (factories.iterator().hasNext()) {
                return factories.iterator().next();
            } else {
                throw new IllegalStateException("Cannot find Factory under META-INF/services/"
                        + interfaceOfFactory.getName() + " on classpath");
            }
        }
    }
}
