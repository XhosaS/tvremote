package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjo implements nzy {
    public final mjm a;
    private final mjs b;

    public mjo(mjm mjmVar, mjs mjsVar) {
        this.a = mjmVar;
        this.b = mjsVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczr.b;
    }

    @Override // defpackage.nzy
    public final /* synthetic */ agff b(Object obj, nzx nzxVar) {
        int i;
        aczr aczrVar = (aczr) obj;
        if (aczrVar == null || (aczrVar.c & 1) == 0 || !((i = aczrVar.d) == 4 || i == 5)) {
            return agff.f(new ocp("Invalid DisplaySyncCommand."));
        }
        final View viewN = nzxVar.n();
        if (viewN == null) {
            return agff.f(new ocp("No view is available."));
        }
        mjs mjsVar = this.b;
        aehf aehfVarB = aejf.b(((aejm) mjsVar.a).a);
        aehfVarB.getClass();
        aehf aehfVarB2 = aejf.b(((aejm) mjsVar.b).a);
        aehfVarB2.getClass();
        final mjr mjrVar = new mjr(aczrVar, aehfVarB, aehfVarB2);
        agff agffVarG = agff.g(new aggv() { // from class: mjn
            @Override // defpackage.aggv
            public final void a() {
                String str;
                mjm mjmVar = this.a.a;
                mjr mjrVar2 = mjrVar;
                synchronized (mjmVar) {
                    str = mjrVar2.a.f;
                    mjmVar.b(str);
                    mjmVar.a.put(str, mjrVar2);
                }
                viewN.addOnAttachStateChangeListener(new mjl(mjmVar, str));
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarG.j(agfxVar);
    }
}
