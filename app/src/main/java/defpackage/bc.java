package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class bc implements DialogInterface.OnDismissListener {
    final /* synthetic */ bf a;

    public bc(bf bfVar) {
        this.a = bfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bf bfVar = this.a;
        Dialog dialog = bfVar.c;
        if (dialog != null) {
            bfVar.onDismiss(dialog);
        }
    }
}
