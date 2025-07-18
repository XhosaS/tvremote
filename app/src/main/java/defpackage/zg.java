package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zg extends zn {
    public zg(yn ynVar) {
        super(ynVar);
        ynVar.h.d();
        ynVar.i.d();
        this.g = ((yr) ynVar).as;
    }

    private final void g(zc zcVar) {
        zc zcVar2 = this.i;
        zcVar2.j.add(zcVar);
        zcVar.k.add(zcVar2);
    }

    @Override // defpackage.zn
    public final void b() {
        yn ynVar = this.d;
        yr yrVar = (yr) ynVar;
        int i = yrVar.b;
        int i2 = yrVar.c;
        float f = yrVar.a;
        if (yrVar.as == 1) {
            if (i != -1) {
                zc zcVar = this.i;
                zcVar.k.add(ynVar.V.h.i);
                this.d.V.h.i.j.add(zcVar);
                zcVar.e = i;
            } else if (i2 != -1) {
                zc zcVar2 = this.i;
                zcVar2.k.add(ynVar.V.h.j);
                this.d.V.h.j.j.add(zcVar2);
                zcVar2.e = -i2;
            } else {
                zc zcVar3 = this.i;
                zcVar3.b = true;
                zcVar3.k.add(ynVar.V.h.j);
                this.d.V.h.j.j.add(zcVar3);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            zc zcVar4 = this.i;
            zcVar4.k.add(ynVar.V.i.i);
            this.d.V.i.i.j.add(zcVar4);
            zcVar4.e = i;
        } else if (i2 != -1) {
            zc zcVar5 = this.i;
            zcVar5.k.add(ynVar.V.i.j);
            this.d.V.i.j.j.add(zcVar5);
            zcVar5.e = -i2;
        } else {
            zc zcVar6 = this.i;
            zcVar6.b = true;
            zcVar6.k.add(ynVar.V.i.j);
            this.d.V.i.j.j.add(zcVar6);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.zn
    public final void c() {
        yn ynVar = this.d;
        if (((yr) ynVar).as == 1) {
            ynVar.aa = this.i.f;
        } else {
            ynVar.ab = this.i.f;
        }
    }

    @Override // defpackage.zn
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.zn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zn, defpackage.za
    public final void f() {
        zc zcVar = this.i;
        if (zcVar.c && !zcVar.i) {
            zcVar.c((int) ((((zc) zcVar.k.get(0)).f * ((yr) this.d).a) + 0.5f));
        }
    }
}
