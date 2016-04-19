package io.advantageous.nektwork;

import io.advantageous.nektwork.spi.ContextFactory;
import io.advantageous.nektwork.spi.FactoryHelper;

public interface Context {

    ContextFactory contextFactory = FactoryHelper.loadFactory(ContextFactory.class);

    static ContextFactory getContextFactory() {
        return contextFactory;
    }

    /**
     * If many IO connections are managed by a single event loop or thread pool. This
     * is the reference to the underlying pool or event loop.
     *
     * @param <T> T type of event bus or pool.
     * @return event loop or pool
     */
    <T> T getUnderlyingContext();
}
