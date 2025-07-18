package com.google.common.collect;

/* compiled from: PG */
/* loaded from: classes.dex */
interface FilteredSetMultimap<K, V> extends FilteredMultimap<K, V>, SetMultimap<K, V> {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.FilteredSetMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    @Override // com.google.common.collect.FilteredMultimap
    SetMultimap<K, V> unfiltered();
}
