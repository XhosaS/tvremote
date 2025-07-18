package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpn extends cpz {
    ArrayList a;
    private int b;

    public cpn(cpd cpdVar, int i) {
        cpd cpdVar2;
        super(cpdVar);
        this.a = new ArrayList();
        this.g = i;
        cpd cpdVar3 = this.d;
        cpd cpdVarN = cpdVar3.n(i);
        while (true) {
            cpd cpdVar4 = cpdVarN;
            cpdVar2 = cpdVar3;
            cpdVar3 = cpdVar4;
            if (cpdVar3 == null) {
                break;
            } else {
                cpdVarN = cpdVar3.n(this.g);
            }
        }
        this.d = cpdVar2;
        this.a.add(cpdVar2.o(this.g));
        cpd cpdVarM = cpdVar2.m(this.g);
        while (cpdVarM != null) {
            this.a.add(cpdVarM.o(this.g));
            cpdVarM = cpdVarM.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cpz cpzVar = (cpz) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                cpzVar.d.f = this;
            } else if (i3 == 1) {
                cpzVar.d.g = this;
            }
        }
        if (this.g == 0 && ((cpe) this.d.V).c && this.a.size() > 1) {
            this.d = ((cpz) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.ak : this.d.al;
    }

    private final cpd g() {
        for (int i = 0; i < this.a.size(); i++) {
            cpd cpdVar = ((cpz) this.a.get(i)).d;
            if (cpdVar.ai != 8) {
                return cpdVar;
            }
        }
        return null;
    }

    private final cpd n() {
        cpd cpdVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            cpdVar = ((cpz) this.a.get(size)).d;
        } while (cpdVar.ai == 8);
        return cpdVar;
    }

    @Override // defpackage.cpz
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.i.e + ((cpz) this.a.get(i)).a() + r4.j.e;
        }
        return jA;
    }

    @Override // defpackage.cpz
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cpz) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        cpd cpdVar = ((cpz) this.a.get(0)).d;
        cpd cpdVar2 = ((cpz) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            cpc cpcVar = cpdVar.K;
            cpc cpcVar2 = cpdVar2.M;
            cpq cpqVarL = l(cpcVar, 0);
            int iB = cpcVar.b();
            cpd cpdVarG = g();
            if (cpdVarG != null) {
                iB = cpdVarG.K.b();
            }
            if (cpqVarL != null) {
                j(this.i, cpqVarL, iB);
            }
            cpq cpqVarL2 = l(cpcVar2, 0);
            int iB2 = cpcVar2.b();
            cpd cpdVarN = n();
            if (cpdVarN != null) {
                iB2 = cpdVarN.M.b();
            }
            if (cpqVarL2 != null) {
                j(this.j, cpqVarL2, -iB2);
            }
        } else {
            cpc cpcVar3 = cpdVar.L;
            cpc cpcVar4 = cpdVar2.N;
            cpq cpqVarL3 = l(cpcVar3, 1);
            int iB3 = cpcVar3.b();
            cpd cpdVarG2 = g();
            if (cpdVarG2 != null) {
                iB3 = cpdVarG2.L.b();
            }
            if (cpqVarL3 != null) {
                j(this.i, cpqVarL3, iB3);
            }
            cpq cpqVarL4 = l(cpcVar4, 1);
            int iB4 = cpcVar4.b();
            cpd cpdVarN2 = n();
            if (cpdVarN2 != null) {
                iB4 = cpdVarN2.N.b();
            }
            if (cpqVarL4 != null) {
                j(this.j, cpqVarL4, -iB4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.cpz
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((cpz) this.a.get(i)).c();
        }
    }

    @Override // defpackage.cpz
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cpz) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.cpz
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((cpz) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    @Override // defpackage.cpz, defpackage.cpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpn.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cpz cpzVar = (cpz) arrayList.get(i);
            sb.append("<");
            sb.append(cpzVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
