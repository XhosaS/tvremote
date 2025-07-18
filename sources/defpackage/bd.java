package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bd extends be {
    private final ar j;

    /* JADX WARN: Illegal instructions before constructor call */
    public bd(int i, int i2, ar arVar) {
        q qVar = arVar.a;
        qVar.getClass();
        super(i, i2, qVar);
        this.j = arVar;
    }

    @Override // defpackage.be
    public final void a() {
        super.a();
        this.a.o = false;
        this.j.d();
    }

    @Override // defpackage.be
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                q qVar = this.j.a;
                qVar.getClass();
                View viewL = qVar.l();
                if (am.S(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewL.findFocus() + " on view " + viewL + " for Fragment " + qVar);
                }
                viewL.clearFocus();
                return;
            }
            return;
        }
        ar arVar = this.j;
        q qVar2 = arVar.a;
        qVar2.getClass();
        View viewFindFocus = qVar2.L.findFocus();
        if (viewFindFocus != null) {
            qVar2.w(viewFindFocus);
            if (am.S(2)) {
                Log.v("FragmentManager", b.d(qVar2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View viewL2 = this.a.l();
        if (viewL2.getParent() == null) {
            if (am.S(2)) {
                Log.v("FragmentManager", "Adding fragment " + qVar2 + " view " + viewL2 + " to container in onStart");
            }
            arVar.a();
            viewL2.setAlpha(0.0f);
        }
        if (viewL2.getAlpha() == 0.0f && viewL2.getVisibility() == 0) {
            if (am.S(2)) {
                Log.v("FragmentManager", b.b(viewL2, "Making view ", " INVISIBLE in onStart"));
            }
            viewL2.setVisibility(4);
        }
        viewL2.setAlpha(qVar2.a());
        if (am.S(2)) {
            Log.v("FragmentManager", "Setting view alpha to " + qVar2.a() + " in onStart");
        }
    }
}
