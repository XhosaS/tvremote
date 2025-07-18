package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class by extends re {
    final /* synthetic */ cj a;

    public by(cj cjVar) {
        this.a = cjVar;
    }

    @Override // defpackage.re, defpackage.rd
    public final void a() {
        cj cjVar = this.a;
        cjVar.q.setAlpha(1.0f);
        cjVar.K.R(null);
        cjVar.K = null;
    }

    @Override // defpackage.re, defpackage.rd
    public final void b() {
        cj cjVar = this.a;
        cjVar.q.setVisibility(0);
        if (cjVar.q.getParent() instanceof View) {
            View view = (View) cjVar.q.getParent();
            int[] iArr = qv.a;
            qk.j(view);
        }
    }
}
