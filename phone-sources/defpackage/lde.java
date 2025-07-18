package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lde extends bl {
    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.error_purchase_not_found);
        builder.setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null);
        return builder.create();
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ((ApiActivity) getActivity()).a(3, new Throwable());
    }
}
