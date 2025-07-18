package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxt extends nzi {
    final /* synthetic */ Dialog a;
    final /* synthetic */ yav b;

    public nxt(yav yavVar, Dialog dialog) {
        this.a = dialog;
        this.b = yavVar;
    }

    @Override // defpackage.nzi
    public final void a() {
        ((nxu) this.b.b).b();
        Dialog dialog = this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
