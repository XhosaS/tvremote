package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cpz implements cpo {
    public int c;
    public cpd d;
    cpw e;
    protected int k;
    public final cpr f = new cpr(this);
    public int g = 0;
    public boolean h = false;
    public final cpq i = new cpq(this);
    public final cpq j = new cpq(this);
    protected int l = 1;

    public cpz(cpd cpdVar) {
        this.d = cpdVar;
    }

    protected static final void j(cpq cpqVar, cpq cpqVar2, int i) {
        cpqVar.k.add(cpqVar2);
        cpqVar.e = i;
        cpqVar2.j.add(cpqVar);
    }

    protected static final cpq k(cpc cpcVar) {
        cpc cpcVar2 = cpcVar.e;
        if (cpcVar2 == null) {
            return null;
        }
        int i = cpcVar2.i;
        cpd cpdVar = cpcVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return cpdVar.h.i;
        }
        if (i2 == 2) {
            return cpdVar.i.i;
        }
        if (i2 == 3) {
            return cpdVar.h.j;
        }
        if (i2 == 4) {
            return cpdVar.i.j;
        }
        if (i2 != 5) {
            return null;
        }
        return cpdVar.i.a;
    }

    protected static final cpq l(cpc cpcVar, int i) {
        cpc cpcVar2 = cpcVar.e;
        if (cpcVar2 == null) {
            return null;
        }
        cpd cpdVar = cpcVar2.d;
        cpz cpzVar = i == 0 ? cpdVar.h : cpdVar.i;
        int i2 = cpcVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return cpzVar.i;
        }
        if (i2 == 3 || i2 == 4) {
            return cpzVar.j;
        }
        return null;
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

    @Override // defpackage.cpo
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            cpd cpdVar = this.d;
            int i3 = cpdVar.x;
            int iMax = Math.max(cpdVar.w, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            cpd cpdVar2 = this.d;
            int i4 = cpdVar2.A;
            int iMax2 = Math.max(cpdVar2.z, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(cpq cpqVar, cpq cpqVar2, int i, cpr cprVar) {
        List list = cpqVar.k;
        list.add(cpqVar2);
        list.add(this.f);
        cpqVar.g = i;
        cpqVar.h = cprVar;
        cpqVar2.j.add(cpqVar);
        cprVar.j.add(cpqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r9
  0x00a4: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:44:0x008c, B:32:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m(defpackage.cpc r13, defpackage.cpc r14, int r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpz.m(cpc, cpc, int):void");
    }
}
