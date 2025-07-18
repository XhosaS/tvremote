package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class se implements View.OnClickListener {
    final it a;
    final /* synthetic */ sg b;

    public se(sg sgVar) {
        this.b = sgVar;
        this.a = new it(sgVar.a.getContext(), sgVar.b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sg sgVar = this.b;
        Window.Callback callback = sgVar.c;
        if (callback == null || !sgVar.d) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
