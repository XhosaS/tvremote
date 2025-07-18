package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tcg implements View.OnFocusChangeListener {
    public final /* synthetic */ tco a;
    private final /* synthetic */ int b;

    public /* synthetic */ tcg(tco tcoVar, int i) {
        this.b = i;
        this.a = tcoVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.b != 0) {
            tca tcaVar = (tca) this.a;
            tcaVar.f(tcaVar.k());
            return;
        }
        tco tcoVar = this.a;
        tck tckVar = (tck) tcoVar;
        tckVar.b = z;
        tcoVar.x();
        if (z) {
            return;
        }
        tckVar.k(false);
        tckVar.c = false;
    }
}
