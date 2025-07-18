package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class gr extends ahy {
    final /* synthetic */ hf a;

    public gr(hf hfVar) {
        this.a = hfVar;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void a() {
        hf hfVar = this.a;
        hfVar.r.setAlpha(1.0f);
        hfVar.u.d(null);
        hfVar.u = null;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void b() {
        hf hfVar = this.a;
        hfVar.r.setVisibility(0);
        if (hfVar.r.getParent() instanceof View) {
            View view = (View) hfVar.r.getParent();
            int[] iArr = ahj.a;
            aha.c(view);
        }
    }
}
