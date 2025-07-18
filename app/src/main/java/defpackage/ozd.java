package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozd implements owu {
    final /* synthetic */ ozi a;
    final /* synthetic */ ahap b;

    public ozd(ozi oziVar, ahap ahapVar) {
        this.a = oziVar;
        this.b = ahapVar;
    }

    @Override // defpackage.owu
    public final void q(int i, long j, Status status) {
        this.a.k(this);
        ahap ahapVar = this.b;
        if (ahapVar.c()) {
            try {
                ahapVar.e(new agpk(agpl.a(new owz())));
            } catch (IllegalStateException e) {
                ((zdv) ((zdv) ozi.b.d()).p(e).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$load$2$listener$1", "onHomeGraphLoadFailed", 293, "FoyerHomeGraph.kt")).u("Failed to resume with failure - continuation has already been resumed. Ignoring exception.");
            }
        }
    }

    @Override // defpackage.owu
    public final void r(ypn ypnVar) {
        ypnVar.getClass();
        this.a.k(this);
        ahap ahapVar = this.b;
        if (ahapVar.c()) {
            try {
                ahapVar.e(new agpk(ypnVar));
            } catch (IllegalStateException e) {
                ((zdv) ((zdv) ozi.b.d()).p(e).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$load$2$listener$1", "onHomeGraphLoaded", 273, "FoyerHomeGraph.kt")).u("Failed to resume with success - continuation has already been resumed. Ignoring exception.");
            }
        }
    }

    @Override // defpackage.owu
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.owu
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.owu
    public final /* synthetic */ void i(boolean z) {
    }

    @Override // defpackage.owu
    public final /* synthetic */ void t(Status status) {
    }
}
