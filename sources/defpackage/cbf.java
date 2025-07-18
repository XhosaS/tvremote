package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbf extends cab {
    final transient Object a;

    public cbf(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.bzl
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.cab, defpackage.bzl
    public final bzs d() {
        return bzs.q(this.a);
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        return new cai(this.a);
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cab, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
