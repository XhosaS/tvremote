package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyz extends yxy {
    public final yyr b;

    public yyz(yyr yyrVar) {
        this.b = yyrVar;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        yyw yywVar = new yyw(this);
        while (yywVar.a.hasNext()) {
            if (obj.equals(yywVar.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yxy
    public final yyk f() {
        return new yyx(this.b.entrySet().f());
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yyw(this);
    }

    @Override // defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return new yyw(this);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.yxy
    public Object writeReplace() {
        return new yyy(this.b);
    }
}
