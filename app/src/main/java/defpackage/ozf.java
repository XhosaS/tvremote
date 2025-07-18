package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozf implements owu {
    final /* synthetic */ ahge a;

    public ozf(ahge ahgeVar) {
        this.a = ahgeVar;
    }

    @Override // defpackage.owu
    public final void i(boolean z) {
        Object objA = ahfw.a(this.a, new ows(z));
        if (objA instanceof ahfs) {
            ahft.b(objA);
            ((zdv) ozi.b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$observeUpdates$1$homeGraphListener$1", "onHomeGraphUpdated", 1393, "FoyerHomeGraph.kt")).u("Could not send HomeGraphEvent.Update");
        }
    }

    @Override // defpackage.owu
    public final void q(int i, long j, Status status) {
        Object objA = ahfw.a(this.a, new owo(i, j, status));
        if (objA instanceof ahfs) {
            ahft.b(objA);
            ((zdv) ozi.b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$observeUpdates$1$homeGraphListener$1", "onHomeGraphLoadFailed", 1403, "FoyerHomeGraph.kt")).u("Could not send HomeGraphEvent.Error");
        }
    }

    @Override // defpackage.owu
    public final void r(ypn ypnVar) {
        ypnVar.getClass();
        Object objA = ahfw.a(this.a, owp.a);
        if (objA instanceof ahfs) {
            ahft.b(objA);
            ((zdv) ozi.b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$observeUpdates$1$homeGraphListener$1", "onHomeGraphLoaded", 1387, "FoyerHomeGraph.kt")).u("Could not send HomeGraphEvent.Loaded");
        }
    }

    @Override // defpackage.owu
    public final void t(Status status) {
        Object objA = ahfw.a(this.a, new owr(status));
        if (objA instanceof ahfs) {
            ahft.b(objA);
            ((zdv) ozi.b.d().q("com/google/android/libraries/home/homegraph/foyer/FoyerHomeGraph$observeUpdates$1$homeGraphListener$1", "onHomeGraphRefreshFailed", 1409, "FoyerHomeGraph.kt")).u("Could not send HomeGraphEvent.RefreshError");
        }
    }

    @Override // defpackage.owu
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.owu
    public final /* synthetic */ void s() {
    }
}
