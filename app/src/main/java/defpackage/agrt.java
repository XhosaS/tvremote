package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agrt extends agqg {
    public abstract boolean b(Map.Entry entry);

    public /* bridge */ boolean c(Map.Entry entry) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return b(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }
}
