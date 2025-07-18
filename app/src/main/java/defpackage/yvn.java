package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yvn extends zbs {
    final /* synthetic */ yvo a;

    public yvn(yvo yvoVar) {
        this.a = yvoVar;
    }

    @Override // defpackage.zbs
    public final zbp a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b();
    }
}
