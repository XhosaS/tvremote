package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmc extends AbstractList {
    private final cma a;
    private final cmb b;

    public cmc(cma cmaVar, cmb cmbVar) {
        this.a = cmaVar;
        this.b = cmbVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
