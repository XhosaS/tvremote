package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpu extends cpz {
    public cpu(cpd cpdVar) {
        super(cpdVar);
    }

    private final void g(cpq cpqVar) {
        cpq cpqVar2 = this.i;
        cpqVar2.j.add(cpqVar);
        cpqVar.k.add(cpqVar2);
    }

    @Override // defpackage.cpz
    public final void b() {
        cpd cpdVar = this.d;
        if (cpdVar instanceof cpa) {
            cpq cpqVar = this.i;
            cpqVar.b = true;
            cpa cpaVar = (cpa) cpdVar;
            int i = cpaVar.a;
            boolean z = cpaVar.b;
            int i2 = 0;
            if (i == 0) {
                cpqVar.l = 4;
                while (i2 < cpaVar.aK) {
                    cpd cpdVar2 = cpaVar.aJ[i2];
                    if (z || cpdVar2.ai != 8) {
                        cpq cpqVar2 = cpdVar2.h.i;
                        cpqVar2.j.add(cpqVar);
                        cpqVar.k.add(cpqVar2);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 1) {
                cpqVar.l = 5;
                while (i2 < cpaVar.aK) {
                    cpd cpdVar3 = cpaVar.aJ[i2];
                    if (z || cpdVar3.ai != 8) {
                        cpq cpqVar3 = cpdVar3.h.j;
                        cpqVar3.j.add(cpqVar);
                        cpqVar.k.add(cpqVar3);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 2) {
                cpqVar.l = 6;
                while (i2 < cpaVar.aK) {
                    cpd cpdVar4 = cpaVar.aJ[i2];
                    if (z || cpdVar4.ai != 8) {
                        cpq cpqVar4 = cpdVar4.i.i;
                        cpqVar4.j.add(cpqVar);
                        cpqVar.k.add(cpqVar4);
                    }
                    i2++;
                }
                g(this.d.i.i);
                g(this.d.i.j);
                return;
            }
            if (i != 3) {
                return;
            }
            cpqVar.l = 7;
            while (i2 < cpaVar.aK) {
                cpd cpdVar5 = cpaVar.aJ[i2];
                if (z || cpdVar5.ai != 8) {
                    cpq cpqVar5 = cpdVar5.i.j;
                    cpqVar5.j.add(cpqVar);
                    cpqVar.k.add(cpqVar5);
                }
                i2++;
            }
            g(this.d.i.i);
            g(this.d.i.j);
        }
    }

    @Override // defpackage.cpz
    public final void c() {
        cpd cpdVar = this.d;
        if (cpdVar instanceof cpa) {
            int i = ((cpa) cpdVar).a;
            if (i == 0 || i == 1) {
                cpdVar.aa = this.i.f;
            } else {
                cpdVar.ab = this.i.f;
            }
        }
    }

    @Override // defpackage.cpz
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.cpz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.cpz, defpackage.cpo
    public final void f() {
        cpa cpaVar = (cpa) this.d;
        int i = cpaVar.a;
        cpq cpqVar = this.i;
        Iterator it = cpqVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((cpq) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            cpqVar.c(i3 + cpaVar.c);
        } else {
            cpqVar.c(i2 + cpaVar.c);
        }
    }
}
