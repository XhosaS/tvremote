package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwd extends bl {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    private Dialog c;

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.c == null) {
            Context context = getContext();
            ocv.aF(context);
            this.c = new AlertDialog.Builder(context).create();
        }
        return this.c;
    }
}
