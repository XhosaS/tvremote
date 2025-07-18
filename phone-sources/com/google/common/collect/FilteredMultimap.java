package com.google.common.collect;

import defpackage.tsv;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    tsv<? super Map.Entry<K, V>> entryPredicate();

    Multimap<K, V> unfiltered();
}
