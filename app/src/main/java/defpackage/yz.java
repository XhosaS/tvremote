package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yz extends zn {
    ArrayList a;
    private int b;

    public yz(yn ynVar, int i) {
        yn ynVar2;
        super(ynVar);
        this.a = new ArrayList();
        this.g = i;
        yn ynVar3 = this.d;
        yn ynVarL = ynVar3.l(i);
        while (true) {
            yn ynVar4 = ynVarL;
            ynVar2 = ynVar3;
            ynVar3 = ynVar4;
            if (ynVar3 == null) {
                break;
            } else {
                ynVarL = ynVar3.l(this.g);
            }
        }
        this.d = ynVar2;
        this.a.add(ynVar2.m(this.g));
        yn ynVarK = ynVar2.k(this.g);
        while (ynVarK != null) {
            this.a.add(ynVarK.m(this.g));
            ynVarK = ynVarK.k(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zn znVar = (zn) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                znVar.d.f = this;
            } else if (i3 == 1) {
                znVar.d.g = this;
            }
        }
        if (this.g == 0 && ((yo) this.d.V).d && this.a.size() > 1) {
            this.d = ((zn) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ak : this.d.al;
    }

    private final yn g() {
        for (int i = 0; i < this.a.size(); i++) {
            yn ynVar = ((zn) this.a.get(i)).d;
            if (ynVar.ai != 8) {
                return ynVar;
            }
        }
        return null;
    }

    private final yn n() {
        yn ynVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            ynVar = ((zn) this.a.get(size)).d;
        } while (ynVar.ai == 8);
        return ynVar;
    }

    @Override // defpackage.zn
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.i.e + ((zn) this.a.get(i)).a() + r4.j.e;
        }
        return jA;
    }

    @Override // defpackage.zn
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zn) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        yn ynVar = ((zn) this.a.get(0)).d;
        yn ynVar2 = ((zn) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            ym ymVar = ynVar.K;
            ym ymVar2 = ynVar2.M;
            zc zcVarJ = j(ymVar, 0);
            int iB = ymVar.b();
            yn ynVarG = g();
            if (ynVarG != null) {
                iB = ynVarG.K.b();
            }
            if (zcVarJ != null) {
                k(this.i, zcVarJ, iB);
            }
            zc zcVarJ2 = j(ymVar2, 0);
            int iB2 = ymVar2.b();
            yn ynVarN = n();
            if (ynVarN != null) {
                iB2 = ynVarN.M.b();
            }
            if (zcVarJ2 != null) {
                k(this.j, zcVarJ2, -iB2);
            }
        } else {
            ym ymVar3 = ynVar.L;
            ym ymVar4 = ynVar2.N;
            zc zcVarJ3 = j(ymVar3, 1);
            int iB3 = ymVar3.b();
            yn ynVarG2 = g();
            if (ynVarG2 != null) {
                iB3 = ynVarG2.L.b();
            }
            if (zcVarJ3 != null) {
                k(this.i, zcVarJ3, iB3);
            }
            zc zcVarJ4 = j(ymVar4, 1);
            int iB4 = ymVar4.b();
            yn ynVarN2 = n();
            if (ynVarN2 != null) {
                iB4 = ynVarN2.N.b();
            }
            if (zcVarJ4 != null) {
                k(this.j, zcVarJ4, -iB4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.zn
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((zn) this.a.get(i)).c();
        }
    }

    @Override // defpackage.zn
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zn) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.zn
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((zn) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    @Override // defpackage.zn, defpackage.za
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zn znVar = (zn) arrayList.get(i);
            sb.append("<");
            sb.append(znVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
