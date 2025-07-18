package defpackage;

import java.util.AbstractList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vul<T> extends AbstractList<T> {
    private final vuj a;
    private final vuk b;

    public vul(vuj vujVar, vuk vukVar) {
        this.a = vujVar;
        this.b = vukVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
