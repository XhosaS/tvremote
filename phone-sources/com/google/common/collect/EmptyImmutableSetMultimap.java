package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {
    static final EmptyImmutableSetMultimap INSTANCE = new EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.of(), 0, null);
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return asMap();
    }
}
