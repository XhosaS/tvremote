package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdw extends bf {
    public Dialog ah;
    public DialogInterface.OnCancelListener ai;
    private Dialog aj;

    @Override // defpackage.bf
    public final Dialog m() {
        Dialog dialog = this.ah;
        if (dialog != null) {
            return dialog;
        }
        this.b = false;
        if (this.aj == null) {
            Context contextS = s();
            kkk.k(contextS);
            this.aj = new AlertDialog.Builder(contextS).create();
        }
        return this.aj;
    }

    @Override // defpackage.bf, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ai;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
