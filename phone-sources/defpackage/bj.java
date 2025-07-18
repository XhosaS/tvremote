package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bj implements DialogInterface.OnCancelListener {
    final /* synthetic */ bl a;

    public bj(bl blVar) {
        this.a = blVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        bl blVar = this.a;
        if (blVar.mDialog != null) {
            blVar.onCancel(blVar.mDialog);
        }
    }
}
