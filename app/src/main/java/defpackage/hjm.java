package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjm implements nzy {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/elements/SwitchCardModeCommandHandler");
    public final fgt b;

    public hjm(fgt fgtVar) {
        this.b = fgtVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return ades.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final ades adesVar = (ades) obj;
        return agff.g(new aggv() { // from class: hjl
            @Override // defpackage.aggv
            public final void a() {
                few fewVar = this.a.b.a;
                if (fewVar == null) {
                    ((zdv) ((zdv) hjm.a.c()).q("com/google/android/apps/tvsearch/results/elements/SwitchCardModeCommandHandler", "onCommand", 35, "SwitchCardModeCommandHandler.java")).u("Null fragment view manager supplied to command handler");
                } else if (adesVar.c) {
                    fewVar.j();
                } else {
                    ((zdv) ((zdv) hjm.a.d()).q("com/google/android/apps/tvsearch/results/elements/SwitchCardModeCommandHandler", "onCommand", 41, "SwitchCardModeCommandHandler.java")).u("Not going to fullscreen since to_fullscreen is false in SwitchCardModeCommand");
                }
            }
        });
    }
}
