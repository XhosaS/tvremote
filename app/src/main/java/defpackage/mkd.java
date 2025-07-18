package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkd implements nzy {
    public final mjm a;

    public mkd(mjm mjmVar) {
        this.a = mjmVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return adab.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final adab adabVar = (adab) obj;
        if (adabVar == null || (adabVar.c & 1) == 0) {
            return agff.f(new ocp("Invalid StartDisplaySyncCommand."));
        }
        agff agffVarG = agff.g(new aggv() { // from class: mkc
            @Override // defpackage.aggv
            public final void a() {
                this.a.a.a(adabVar.d, nzxVar);
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarG.j(agfxVar);
    }
}
