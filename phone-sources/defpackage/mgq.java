package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mgq extends bl {
    public static void a(by byVar) {
        bv bvVarF = byVar.getSupportFragmentManager().f("ProgressDialogFragment");
        if (bvVarF instanceof mgq) {
            ((mgq) bvVarF).dismiss();
        }
    }

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof mgp) {
            ((mgp) activity).a();
        }
    }

    @Override // defpackage.bl
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawableResource(R.color.full_transparent);
        dialog.setContentView(new ProgressBar(dialog.getContext()));
        return dialog;
    }
}
