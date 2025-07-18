package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kra extends mgq {
    @Override // defpackage.mgq, defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        getActivity().finish();
    }
}
