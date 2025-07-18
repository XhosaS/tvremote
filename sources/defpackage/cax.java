package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cax extends bzs {
    public static final bzs a = new cax(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public cax(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.bzs, defpackage.bzl
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.c;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.bzl
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bzl
    public final int c() {
        return 0;
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return false;
    }

    @Override // defpackage.bzl
    public final Object[] g() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bdq.n(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.bzs, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
