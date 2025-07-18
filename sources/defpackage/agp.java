package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agp extends agl {
    public final ahg b;

    public agp(ahg ahgVar, adx adxVar) {
        super(4, adxVar);
        this.b = ahgVar;
    }

    @Override // defpackage.agk
    public final boolean a(ahc ahcVar) {
        bzt bztVar = (bzt) ahcVar.d.get(this.b);
        return bztVar != null && ((ahm) bztVar.b).c;
    }

    @Override // defpackage.agk
    public final aes[] b(ahc ahcVar) {
        bzt bztVar = (bzt) ahcVar.d.get(this.b);
        if (bztVar == null) {
            return null;
        }
        return ((ahm) bztVar.b).b;
    }

    @Override // defpackage.agl
    public final void c(ahc ahcVar) {
        bzt bztVar = (bzt) ahcVar.d.remove(this.b);
        if (bztVar == null) {
            this.a.h(false);
            return;
        }
        ((ahn) ((byj) bztVar.c).a).b.a(ahcVar.b, this.a);
        ahi ahiVar = ((ahm) bztVar.b).a;
        ahiVar.a = null;
        ahiVar.b = null;
    }

    @Override // defpackage.agl, defpackage.agq
    public final /* bridge */ /* synthetic */ void g(awy awyVar, boolean z) {
    }
}
