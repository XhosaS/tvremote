package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class axi implements View.OnClickListener {
    final /* synthetic */ axp a;

    public axi(axp axpVar) {
        this.a = axpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        axp axpVar = this.a;
        RecyclerView recyclerView = axpVar.d;
        if (recyclerView.s) {
            ayb aybVar = (ayb) recyclerView.l(view);
            axh axhVar = aybVar.s;
            if (axhVar.c()) {
                axpVar.g.e(axpVar, aybVar);
                return;
            }
            axh axhVar2 = aybVar.s;
            boolean z = recyclerView.s;
            if (!axhVar.g() || axhVar.d()) {
                return;
            }
            axpVar.p(aybVar);
        }
    }
}
