package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqg extends LinkedHashMap {
    public eqg() {
        super(5, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
