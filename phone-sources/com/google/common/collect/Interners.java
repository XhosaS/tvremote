package com.google.common.collect;

import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;
import defpackage.tsh;
import defpackage.tsl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Interners {

    /* compiled from: PG */
    public class InternerBuilder {
        private final MapMaker mapMaker;
        private boolean strong;

        private InternerBuilder() {
            this.mapMaker = new MapMaker();
            this.strong = true;
        }

        public <E> Interner<E> build() {
            if (!this.strong) {
                this.mapMaker.weakKeys();
            }
            return new InternerImpl(this.mapMaker);
        }

        public InternerBuilder concurrencyLevel(int i) {
            this.mapMaker.concurrencyLevel(i);
            return this;
        }

        public InternerBuilder strong() {
            this.strong = true;
            return this;
        }

        public InternerBuilder weak() {
            this.strong = false;
            return this;
        }
    }

    /* compiled from: PG */
    class InternerFunction<E> implements tsl<E, E> {
        private final Interner<E> interner;

        public InternerFunction(Interner<E> interner) {
            this.interner = interner;
        }

        @Override // defpackage.tsl
        public E apply(E e) {
            return this.interner.intern(e);
        }

        @Override // defpackage.tsl
        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.interner.equals(((InternerFunction) obj).interner);
            }
            return false;
        }

        public int hashCode() {
            return this.interner.hashCode();
        }
    }

    /* compiled from: PG */
    final class InternerImpl<E> implements Interner<E> {
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> map;

        @Override // com.google.common.collect.Interner
        public E intern(E e) {
            E e2;
            do {
                MapMakerInternalMap.InternalEntry entry = this.map.getEntry(e);
                if (entry != null && (e2 = (E) entry.getKey()) != null) {
                    return e2;
                }
            } while (this.map.putIfAbsent(e, MapMaker.Dummy.VALUE) != null);
            return e;
        }

        private InternerImpl(MapMaker mapMaker) {
            mapMaker.keyEquivalence(tsh.a);
            this.map = MapMakerInternalMap.createWithDummyValues(mapMaker);
        }
    }

    private Interners() {
    }

    public static <E> tsl<E, E> asFunction(Interner<E> interner) {
        interner.getClass();
        return new InternerFunction(interner);
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    public static <E> Interner<E> newStrongInterner() {
        InternerBuilder internerBuilderNewBuilder = newBuilder();
        internerBuilderNewBuilder.strong();
        return internerBuilderNewBuilder.build();
    }

    public static <E> Interner<E> newWeakInterner() {
        InternerBuilder internerBuilderNewBuilder = newBuilder();
        internerBuilderNewBuilder.weak();
        return internerBuilderNewBuilder.build();
    }
}
