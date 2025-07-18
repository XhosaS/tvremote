package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbo extends fv {
    public WeakReference a;
    private final pnl d;
    private final xzg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbo(pnl pnlVar, xzg xzgVar) {
        super(false);
        pnlVar.getClass();
        this.d = pnlVar;
        this.e = xzgVar;
    }

    @Override // defpackage.fv
    public final void b() {
        if (!this.b) {
            throw new IllegalStateException("setRootViewAndEnable has to be set when handleOnBackPressed is called and BentoOnBackPressedCallback is enabled.");
        }
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            yks.c("rootView");
            weakReference = null;
        }
        View view = (View) weakReference.get();
        if (view != null) {
            this.d.a().a(new ntp(27).u(), view);
        }
        this.e.f(vow.a);
    }
}
