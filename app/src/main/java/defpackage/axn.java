package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class axn implements View.OnKeyListener {
    final /* synthetic */ axp a;
    private boolean b = false;

    public axn(axp axpVar) {
        this.a = axpVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) throws Resources.NotFoundException {
        if (view != null && keyEvent != null) {
            RecyclerView recyclerView = this.a.d;
            if (recyclerView.s && (i == 23 || i == 66 || i == 160 || i == 99 || i == 100)) {
                ayb aybVar = (ayb) recyclerView.l(view);
                axh axhVar = aybVar.s;
                if (!axhVar.g() || axhVar.d()) {
                    keyEvent.getAction();
                    return true;
                }
                int action = keyEvent.getAction();
                if (action != 0) {
                    if (action == 1 && this.b) {
                        this.b = false;
                        aybVar.B(false);
                    }
                } else if (!this.b) {
                    this.b = true;
                    aybVar.B(true);
                }
            }
        }
        return false;
    }
}
