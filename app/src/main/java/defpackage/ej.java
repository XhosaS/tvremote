package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ej extends en {
    private final dm j;

    /* JADX WARN: Illegal instructions before constructor call */
    public ej(int i, int i2, dm dmVar) {
        bq bqVar = dmVar.b;
        bqVar.getClass();
        super(i, i2, bqVar);
        this.j = dmVar;
    }

    @Override // defpackage.en
    public final void a() {
        super.a();
        this.a.u = false;
        this.j.d();
    }

    @Override // defpackage.en
    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                bq bqVar = this.j.b;
                bqVar.getClass();
                View viewCP = bqVar.cP();
                if (de.S(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewCP.findFocus() + " on view " + viewCP + " for Fragment " + bqVar);
                }
                viewCP.clearFocus();
                return;
            }
            return;
        }
        dm dmVar = this.j;
        bq bqVar2 = dmVar.b;
        bqVar2.getClass();
        View viewFindFocus = bqVar2.R.findFocus();
        if (viewFindFocus != null) {
            bqVar2.eb().p = viewFindFocus;
            if (de.S(2)) {
                Log.v("FragmentManager", a.d(bqVar2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View viewCP2 = this.a.cP();
        if (viewCP2.getParent() == null) {
            if (de.S(2)) {
                Log.v("FragmentManager", a.f(viewCP2, bqVar2, "Adding fragment ", " view ", " to container in onStart"));
            }
            dmVar.a();
            viewCP2.setAlpha(0.0f);
        }
        if (viewCP2.getAlpha() == 0.0f && viewCP2.getVisibility() == 0) {
            if (de.S(2)) {
                Log.v("FragmentManager", a.c(viewCP2, "Making view ", " INVISIBLE in onStart"));
            }
            viewCP2.setVisibility(4);
        }
        viewCP2.setAlpha(bqVar2.dU());
        if (de.S(2)) {
            Log.v("FragmentManager", "Setting view alpha to " + bqVar2.dU() + " in onStart");
        }
    }
}
