package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqj extends ocv {
    final /* synthetic */ pqk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqj(pqk pqkVar) {
        super((short[]) null);
        this.b = pqkVar;
    }

    @Override // defpackage.ocv
    public final void bE(int i) {
        this.b.b(i);
    }

    @Override // defpackage.ocv
    public final void bF() {
        pqk pqkVar = this.b;
        if (pqkVar.c) {
            String str = pqkVar.b;
            if (a.au(str, str) && pqkVar.h == 1 && pqkVar.g != null) {
                tbk tbkVarE = pqkVar.e();
                if (tbkVarE != null) {
                    ((tvk) pgz.a.l().j("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onTaskComplete", 80, "FeatureHighlightController.java")).s("FeatureHighlight task complete");
                    pgz pgzVar = (pgz) tbkVarE.b;
                    pgzVar.e.i(pgzVar.b, uxd.POSITIVE_RESPONSE);
                    tbkVarE.a = true;
                }
                pqkVar.d();
                pqkVar.g.f(new pqi(pqkVar, 4));
            }
        }
    }

    @Override // defpackage.ocv
    public final void bG() {
        pqk pqkVar = this.b;
        long j = pqkVar.d;
        if (j > 0) {
            pqkVar.g.postDelayed(pqkVar.i, j);
        }
    }

    @Override // defpackage.ocv
    public final void bH() {
        pqk pqkVar = this.b;
        if (pqkVar.d > 0) {
            pqkVar.g.removeCallbacks(pqkVar.i);
        }
    }
}
