package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class axm implements View.OnFocusChangeListener {
    public View a;
    final /* synthetic */ axp b;

    public axm(axp axpVar) {
        this.b = axpVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Resources.NotFoundException {
        RecyclerView recyclerView = this.b.d;
        if (recyclerView.s) {
            ayb aybVar = (ayb) recyclerView.l(view);
            if (z) {
                this.a = view;
                axh axhVar = aybVar.s;
            } else if (this.a == view) {
                aybVar.B(false);
                this.a = null;
            }
        }
    }
}
