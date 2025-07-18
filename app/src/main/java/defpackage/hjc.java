package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjc implements nzy {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/elements/DismissCommandHandler");
    public final fgt b;

    public hjc(fgt fgtVar) {
        fgtVar.getClass();
        this.b = fgtVar;
    }

    @Override // defpackage.nzz
    public final /* synthetic */ abwk a() {
        return adem.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final adem ademVar = (adem) obj;
        ademVar.getClass();
        agff agffVarG = agff.g(new aggv() { // from class: hjb
            @Override // defpackage.aggv
            public final void a() {
                few fewVar = this.a.b.a;
                if (fewVar == null) {
                    ((zdv) hjc.a.c().q("com/google/android/apps/tvsearch/results/elements/DismissCommandHandler", "onCommand$lambda$0", 26, "DismissCommandHandler.kt")).u("Null fragment view manager supplied to command handler");
                    return;
                }
                adem ademVar2 = ademVar;
                int i = ademVar2.c;
                adel adelVarB = adel.b(i);
                if (adelVarB == null) {
                    adelVarB = adel.UNKNOWN_TYPE;
                }
                if (adelVarB == adel.DISMISS_ROW) {
                    fewVar.n();
                    return;
                }
                adel adelVarB2 = adel.b(i);
                if (adelVarB2 == null) {
                    adelVarB2 = adel.UNKNOWN_TYPE;
                }
                if (adelVarB2 == adel.DISMISS_PAGE) {
                    fewVar.d();
                    return;
                }
                zdv zdvVar = (zdv) hjc.a.c().q("com/google/android/apps/tvsearch/results/elements/DismissCommandHandler", "onCommand$lambda$0", 34, "DismissCommandHandler.kt");
                adel adelVarB3 = adel.b(ademVar2.c);
                if (adelVarB3 == null) {
                    adelVarB3 = adel.UNKNOWN_TYPE;
                }
                zdvVar.x("Unsupported dismiss type: %s", adelVarB3);
            }
        });
        agfx agfxVar = aggd.a;
        aggb.a(agfxVar);
        return agffVarG.j(agfxVar);
    }
}
