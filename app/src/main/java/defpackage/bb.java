package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class bb implements DialogInterface.OnCancelListener {
    final /* synthetic */ bf a;

    public bb(bf bfVar) {
        this.a = bfVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bf bfVar = this.a;
        Dialog dialog = bfVar.c;
        if (dialog != null) {
            bfVar.onCancel(dialog);
        }
    }
}
