package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class zn implements za {
    public int c;
    public yn d;
    zj e;
    protected int k;
    public final zd f = new zd(this);
    public int g = 0;
    public boolean h = false;
    public final zc i = new zc(this);
    public final zc j = new zc(this);
    protected int l = 1;

    public zn(yn ynVar) {
        this.d = ynVar;
    }

    public long a() {
        if (this.f.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.za
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            yn ynVar = this.d;
            int i3 = ynVar.x;
            int iMax = Math.max(ynVar.w, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            yn ynVar2 = this.d;
            int i4 = ynVar2.A;
            int iMax2 = Math.max(ynVar2.z, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final zc i(ym ymVar) {
        ym ymVar2 = ymVar.e;
        if (ymVar2 == null) {
            return null;
        }
        int i = ymVar2.i;
        yn ynVar = ymVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return ynVar.h.i;
        }
        if (i2 == 2) {
            return ynVar.i.i;
        }
        if (i2 == 3) {
            return ynVar.h.j;
        }
        if (i2 == 4) {
            return ynVar.i.j;
        }
        if (i2 != 5) {
            return null;
        }
        return ynVar.i.a;
    }

    protected final zc j(ym ymVar, int i) {
        ym ymVar2 = ymVar.e;
        if (ymVar2 == null) {
            return null;
        }
        yn ynVar = ymVar2.d;
        zn znVar = i == 0 ? ynVar.h : ynVar.i;
        int i2 = ymVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return znVar.i;
        }
        if (i2 == 3 || i2 == 4) {
            return znVar.j;
        }
        return null;
    }

    protected final void k(zc zcVar, zc zcVar2, int i) {
        zcVar.k.add(zcVar2);
        zcVar.e = i;
        zcVar2.j.add(zcVar);
    }

    protected final void l(zc zcVar, zc zcVar2, int i, zd zdVar) {
        List list = zcVar.k;
        list.add(zcVar2);
        list.add(this.f);
        zcVar.g = i;
        zcVar.h = zdVar;
        zcVar2.j.add(zcVar);
        zdVar.j.add(zcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r9
  0x00a4: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:44:0x008c, B:32:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m(defpackage.ym r13, defpackage.ym r14, int r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn.m(ym, ym, int):void");
    }
}
