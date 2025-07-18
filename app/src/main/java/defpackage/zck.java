package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zck extends yyk {
    private final transient Object[] b;
    private final transient int c;
    private final transient int d;

    public zck(Object[] objArr, int i, int i2) {
        this.b = objArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yqw.al(i, this.d);
        Object obj = this.b[i + i + this.c];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.yyk, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
