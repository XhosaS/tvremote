package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbd extends cab {
    public static final cbd a;
    private static final Object[] e;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        e = objArr;
        a = new cbd(objArr, 0, objArr, 0, 0);
    }

    public cbd(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.bzl
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.g;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.bzl
    public final int b() {
        return this.g;
    }

    @Override // defpackage.bzl
    public final int c() {
        return 0;
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int iN = biu.n(obj.hashCode());
                while (true) {
                    int i = iN & this.f;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iN = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        return d().iterator();
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return false;
    }

    @Override // defpackage.bzl
    public final Object[] g() {
        return this.b;
    }

    @Override // defpackage.cab, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.cab
    public final boolean i() {
        return true;
    }

    @Override // defpackage.cab
    public final bzs k() {
        return bzs.l(this.b, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}
