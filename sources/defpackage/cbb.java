package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbb extends bzs {
    public final transient int a;
    private final transient Object[] b;
    private final transient int c;

    public cbb(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.a = i2;
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bdq.n(i, this.a);
        Object obj = this.b[i + i + this.c];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    @Override // defpackage.bzs, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
