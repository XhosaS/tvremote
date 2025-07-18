package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zcg extends yyk {
    public static final yyk b = new zcg(new Object[0], 0);
    final transient Object[] c;
    public final transient int d;

    public zcg(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.yyk, defpackage.yxy
    public final int b(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.yxy
    public final int d() {
        return this.d;
    }

    @Override // defpackage.yxy
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yqw.al(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // defpackage.yxy
    public final Object[] m() {
        return this.c;
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
