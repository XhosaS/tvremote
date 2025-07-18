package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zcj extends yzq {
    private final transient yyr b;
    private final transient yyk c;

    public zcj(yyr yyrVar, yyk yykVar) {
        this.b = yyrVar;
        this.c = yykVar;
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        return this.c.b(objArr, i);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.get(obj) != null;
    }

    @Override // defpackage.yzq, defpackage.yxy
    public final yyk f() {
        return this.c;
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.c.listIterator(0);
    }

    @Override // defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return this.c.listIterator(0);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((zcl) this.b).c;
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
