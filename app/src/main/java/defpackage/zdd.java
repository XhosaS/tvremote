package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdd extends yzq {
    public final transient Object b;

    public zdd(Object obj) {
        obj.getClass();
        this.b = obj;
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.b;
        return i + 1;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.equals(obj);
    }

    @Override // defpackage.yzq, defpackage.yxy
    public final yyk f() {
        return yyk.o(this.b);
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zaq(this.b);
    }

    @Override // defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return new zaq(this.b);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.b.toString() + "]";
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
