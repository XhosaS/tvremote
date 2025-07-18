package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pke {
    public final pkg a;
    public final pkg b;

    public pke(pkg pkgVar, pkg pkgVar2) {
        this.a = pkgVar;
        this.b = pkgVar2;
    }

    public final void a(View view) {
        sjl.c();
        pju pjuVarC = pkd.c(view);
        if (pjuVarC == null) {
            this.b.e(new NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
            return;
        }
        pjuVarC.c.g();
        a.ab(!pjuVarC.c.n());
        pjuVarC.c = null;
    }

    @Deprecated
    public final pjr b(int i) {
        return new pjr(ntp.y(i), new oyj(15), this.b, this);
    }

    public final void c(View view, pjr pjrVar) {
        if (pkd.c(view) == null) {
            e(view, pjrVar);
        }
    }

    public final void d(Activity activity, pjr pjrVar) {
        e(pkd.a(activity), pjrVar);
    }

    public final void e(View view, pjr pjrVar) {
        sjl.c();
        pkg pkgVar = this.b;
        pju pjuVarG = pjrVar.g(pkgVar);
        pju pjuVarC = pkd.c(view);
        if (pjuVarC != null) {
            if (!pjuVarC.c()) {
                pjuVarC.b(pjuVarG);
                return;
            } else if (pjuVarC.d()) {
                pkgVar.e(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                return;
            } else {
                pkgVar.e(new IllegalStateException("CVE is already attached and cannot be replaced."));
                return;
            }
        }
        pkd pkdVar = new pkd(view, pjuVarG);
        pjuVarG.c = pkdVar;
        View view2 = pkdVar.a;
        view2.setTag(R.id.ve_tag, pkdVar.b);
        if (pkdVar.f.f()) {
            view2.addOnAttachStateChangeListener(pkdVar);
            int[] iArr = cww.a;
            if (view2.isAttachedToWindow()) {
                pkdVar.onViewAttachedToWindow(view2);
            }
        }
    }
}
