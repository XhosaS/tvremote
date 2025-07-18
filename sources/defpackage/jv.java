package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jv implements View.OnClickListener {
    final di a;
    final /* synthetic */ jx b;

    public jv(jx jxVar) {
        this.b = jxVar;
        this.a = new di(jxVar.a.getContext(), jxVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jx jxVar = this.b;
        Window.Callback callback = jxVar.d;
        if (callback == null || !jxVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
