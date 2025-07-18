package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.uem;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* compiled from: PG */
    public final class Builder<B> {
        private final ImmutableMap.Builder<Class<? extends B>, B> mapBuilder = ImmutableMap.builder();

        private static <T> T cast(Class<T> cls, Object obj) {
            return (T) uem.a(cls).cast(obj);
        }

        public ImmutableClassToInstanceMap<B> build() {
            ImmutableMap<Class<? extends B>, B> immutableMapBuildOrThrow = this.mapBuilder.buildOrThrow();
            return immutableMapBuildOrThrow.isEmpty() ? ImmutableClassToInstanceMap.of() : new ImmutableClassToInstanceMap<>(immutableMapBuildOrThrow);
        }

        public <T extends B> Builder<B> put(Class<T> cls, T t) {
            this.mapBuilder.put(cls, t);
            return this;
        }

        public <T extends B> Builder<B> putAll(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.mapBuilder.put(key, cast(key, entry.getValue()));
            }
            return this;
        }
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> immutableMap) {
        this.delegate = immutableMap;
    }

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        if (map instanceof ImmutableClassToInstanceMap) {
            return (ImmutableClassToInstanceMap) map;
        }
        Builder builder = new Builder();
        builder.putAll(map);
        return builder.build();
    }

    public static <B> ImmutableClassToInstanceMap<B> of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    public <T extends B> T getInstance(Class<T> cls) {
        cls.getClass();
        return this.delegate.get(cls);
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        return isEmpty() ? of() : this;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> cls, T t) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.of(cls, t));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}
