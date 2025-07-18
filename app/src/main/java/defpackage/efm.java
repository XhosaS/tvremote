package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class efm implements dvn, dvl {
    public final dvo a;
    final /* synthetic */ efn b;

    public efm(efn efnVar) {
        this.b = efnVar;
        efnVar.a.b(this);
        this.a = new dvo();
    }

    @Override // defpackage.dvn
    public final dvm a() {
        return this.a.a;
    }

    @Override // defpackage.dvn
    public final synchronized void b(dvl dvlVar) {
        this.a.b(dvlVar);
    }

    @Override // defpackage.dvn
    public final synchronized void c(dvl dvlVar) {
        this.a.c(dvlVar);
    }

    public final void d(dvm dvmVar) {
        dyd.a();
        this.a.d(dvmVar);
        if (dvmVar == dvm.DESTROYED) {
            efn efnVar = this.b;
            efnVar.a.c(this);
            efnVar.d = null;
            efnVar.c = false;
        }
    }

    @Override // defpackage.dvl
    public final void q(dvm dvmVar) {
        dvm dvmVar2 = dvm.HINT_VISIBLE;
        int iOrdinal = dvmVar.ordinal();
        if (iOrdinal == 0) {
            d(dvm.HINT_VISIBLE);
        } else if (iOrdinal == 1) {
            d(dvm.HINT_INVISIBLE);
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException("Illegal state: ".concat(String.valueOf(String.valueOf(dvmVar))));
            }
            d(dvm.DESTROYED);
        }
    }
}
