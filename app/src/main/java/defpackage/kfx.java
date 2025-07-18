package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes.dex */
class kfx extends kgw {
    final /* synthetic */ Dialog a;
    final /* synthetic */ kfy b;

    public kfx(kfy kfyVar, Dialog dialog) {
        this.a = dialog;
        this.b = kfyVar;
    }

    @Override // defpackage.kgw
    public final void a() {
        this.b.a.b();
        Dialog dialog = this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
