package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertDialog;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldc extends xcg implements DialogInterface.OnClickListener {
    public lfn a;

    private final void a() {
        ((ApiActivity) getActivity()).a(0, new Throwable());
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            a();
            return;
        }
        ApiActivity apiActivity = (ApiActivity) getActivity();
        Handler handler = new Handler(Looper.getMainLooper());
        apiActivity.getClass();
        handler.post(new jlr(apiActivity, 16));
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("authAccount");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (this.a.cW()) {
            builder.setNegativeButton(R.string.ok, this);
        } else {
            builder.setPositiveButton(R.string.add_account_button, this);
            builder.setNegativeButton(R.string.cancel, this);
        }
        builder.setMessage(getString(R.string.add_account, string));
        return builder.create();
    }
}
