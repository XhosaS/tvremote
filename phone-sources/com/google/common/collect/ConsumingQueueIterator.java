package com.google.common.collect;

import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ConsumingQueueIterator<T> extends AbstractIterator<T> {
    private final Queue<T> queue;

    public ConsumingQueueIterator(Queue<T> queue) {
        queue.getClass();
        this.queue = queue;
    }

    @Override // com.google.common.collect.AbstractIterator
    protected T computeNext() {
        if (!this.queue.isEmpty()) {
            return this.queue.remove();
        }
        endOfData();
        return null;
    }
}
