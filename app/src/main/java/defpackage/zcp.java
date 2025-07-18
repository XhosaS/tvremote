package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcp extends yzq {
    public static final zcp b;
    private static final Object[] g;
    final transient Object[] c;
    public final transient int d;
    final transient Object[] e;
    public final transient int f;
    private final transient int h;

    static {
        Object[] objArr = new Object[0];
        g = objArr;
        b = new zcp(objArr, 0, objArr, 0, 0);
    }

    public zcp(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.c = objArr;
        this.d = i;
        this.e = objArr2;
        this.h = i2;
        this.f = i3;
    }

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.f;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.yzq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.e;
            if (objArr.length != 0) {
                int iB = yxv.b(obj);
                while (true) {
                    int i = iB & this.h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yxy
    public final int d() {
        return this.f;
    }

    @Override // defpackage.yxy
    public final int e() {
        return 0;
    }

    @Override // defpackage.yzq
    public final yyk h() {
        return yyk.h(this.c, this.f);
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // defpackage.yxy
    public final Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}
