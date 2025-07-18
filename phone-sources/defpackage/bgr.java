package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgr extends ygu {
    private final bgw a;

    public bgr() {
        throw null;
    }

    @Override // defpackage.ygu
    public final int a() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
                bgw bgwVar = this.a;
                Object obj2 = bgwVar.get(entry.getKey());
                return obj2 != null ? yks.e(obj2, entry.getValue()) : entry.getValue() == null && bgwVar.containsKey(entry.getKey());
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new brl(this.a, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((true != (entry instanceof Object) ? null : entry) instanceof Map.Entry) {
            return this.a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    public bgr(bgw bgwVar) {
        this.a = bgwVar;
    }
}
