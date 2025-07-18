package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpt extends cpz {
    public cpt(cpd cpdVar) {
        super(cpdVar);
        cpdVar.h.d();
        cpdVar.i.d();
        this.g = ((cph) cpdVar).as;
    }

    private final void g(cpq cpqVar) {
        cpq cpqVar2 = this.i;
        cpqVar2.j.add(cpqVar);
        cpqVar.k.add(cpqVar2);
    }

    @Override // defpackage.cpz
    public final void b() {
        cpd cpdVar = this.d;
        cph cphVar = (cph) cpdVar;
        int i = cphVar.b;
        int i2 = cphVar.c;
        float f = cphVar.a;
        if (cphVar.as == 1) {
            if (i != -1) {
                cpq cpqVar = this.i;
                cpqVar.k.add(cpdVar.V.h.i);
                this.d.V.h.i.j.add(cpqVar);
                cpqVar.e = i;
            } else if (i2 != -1) {
                cpq cpqVar2 = this.i;
                cpqVar2.k.add(cpdVar.V.h.j);
                this.d.V.h.j.j.add(cpqVar2);
                cpqVar2.e = -i2;
            } else {
                cpq cpqVar3 = this.i;
                cpqVar3.b = true;
                cpqVar3.k.add(cpdVar.V.h.j);
                this.d.V.h.j.j.add(cpqVar3);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            cpq cpqVar4 = this.i;
            cpqVar4.k.add(cpdVar.V.i.i);
            this.d.V.i.i.j.add(cpqVar4);
            cpqVar4.e = i;
        } else if (i2 != -1) {
            cpq cpqVar5 = this.i;
            cpqVar5.k.add(cpdVar.V.i.j);
            this.d.V.i.j.j.add(cpqVar5);
            cpqVar5.e = -i2;
        } else {
            cpq cpqVar6 = this.i;
            cpqVar6.b = true;
            cpqVar6.k.add(cpdVar.V.i.j);
            this.d.V.i.j.j.add(cpqVar6);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.cpz
    public final void c() {
        cpd cpdVar = this.d;
        if (((cph) cpdVar).as == 1) {
            cpdVar.aa = this.i.f;
        } else {
            cpdVar.ab = this.i.f;
        }
    }

    @Override // defpackage.cpz
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.cpz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.cpz, defpackage.cpo
    public final void f() {
        cpq cpqVar = this.i;
        if (cpqVar.c && !cpqVar.i) {
            cpqVar.c((int) ((((cpq) cpqVar.k.get(0)).f * ((cph) this.d).a) + 0.5f));
        }
    }
}
