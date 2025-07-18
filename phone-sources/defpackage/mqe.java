package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqe extends bl {
    public static final String a = "mqe";

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("error_message");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(string);
        builder.setPositiveButton(getString(R.string.ok), (DialogInterface.OnClickListener) null);
        return builder.create();
    }
}
