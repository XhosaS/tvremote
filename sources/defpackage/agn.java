package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agn extends agl {
    public final bzt b;

    public agn(bzt bztVar, adx adxVar) {
        super(3, adxVar);
        this.b = bztVar;
    }

    @Override // defpackage.agk
    public final boolean a(ahc ahcVar) {
        return ((ahm) this.b.b).c;
    }

    @Override // defpackage.agk
    public final aes[] b(ahc ahcVar) {
        return ((ahm) this.b.b).b;
    }

    @Override // defpackage.agl
    public final void c(ahc ahcVar) {
        bzt bztVar = this.b;
        ahm ahmVar = (ahm) bztVar.b;
        ahmVar.b(ahcVar.b, this.a);
        ahg ahgVarA = ahmVar.a();
        if (ahgVarA != null) {
            ahcVar.d.put(ahgVarA, bztVar);
        }
    }

    @Override // defpackage.agl, defpackage.agq
    public final /* bridge */ /* synthetic */ void g(awy awyVar, boolean z) {
    }
}
