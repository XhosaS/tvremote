package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agex extends aget {
    final /* synthetic */ agey b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agex(agey ageyVar) {
        super(ageyVar);
        this.b = ageyVar;
    }

    @Override // defpackage.aget, defpackage.ages, defpackage.afhe
    public final void e(affe affeVar, afhk afhkVar) {
        super.e(affeVar, afhkVar);
        agey ageyVar = this.b;
        if (ageyVar.f.i || affeVar != affe.IDLE) {
            return;
        }
        ageyVar.b.c();
    }
}
