package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkh implements nzy {
    public final mjm a;

    public mkh(mjm mjmVar) {
        this.a = mjmVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return adaf.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final adaf adafVar = (adaf) obj;
        if (adafVar == null || (adafVar.c & 1) == 0) {
            return agff.f(new ocp("Invalid StopDisplaySyncCommand."));
        }
        agff agffVarG = agff.g(new aggv() { // from class: mkg
            @Override // defpackage.aggv
            public final void a() {
                this.a.a.b(adafVar.d);
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarG.j(agfxVar);
    }
}
