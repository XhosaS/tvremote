package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faj extends LinkedHashMap {
    private final int a = 10;

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a;
    }
}
