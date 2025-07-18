package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import defpackage.bl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatDialogFragment extends bl {
    public AppCompatDialogFragment() {
    }

    @Override // defpackage.bl
    public Dialog onCreateDialog(Bundle bundle) {
        return new AppCompatDialog(getContext(), getTheme());
    }

    @Override // defpackage.bl
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof AppCompatDialog)) {
            super.setupDialog(dialog, i);
            return;
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public AppCompatDialogFragment(int i) {
        super(i);
    }
}
