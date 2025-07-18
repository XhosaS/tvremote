package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewn implements ewx {
    public final int a;
    final /* synthetic */ ewp b;

    public ewn(ewp ewpVar, int i) {
        this.b = ewpVar;
        this.a = i;
    }

    @Override // defpackage.ewx
    public final int a(long j) throws Throwable {
        ewp ewpVar = this.b;
        if (ewpVar.y()) {
            return 0;
        }
        int i = this.a;
        ewpVar.t(i);
        eww ewwVar = ewpVar.i[i];
        int iL = ewwVar.l(j, ewpVar.m);
        ewwVar.D(iL);
        if (iL != 0) {
            return iL;
        }
        ewpVar.u(i);
        return 0;
    }

    @Override // defpackage.ewx
    public final void b() throws eow {
        ewp ewpVar = this.b;
        ewpVar.i[this.a].x();
        ewpVar.v();
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        ewp ewpVar = this.b;
        if (ewpVar.y()) {
            return false;
        }
        return ewpVar.i[this.a].F(ewpVar.m);
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        ewp ewpVar = this.b;
        if (ewpVar.y()) {
            return -3;
        }
        int i2 = this.a;
        ewpVar.t(i2);
        int iJ = ewpVar.i[i2].J(higVar, ehkVar, i, ewpVar.m);
        if (iJ != -3) {
            return iJ;
        }
        ewpVar.u(i2);
        return iJ;
    }
}
