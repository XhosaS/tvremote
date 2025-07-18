package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sqi extends AppCompatDialogFragment {
    private boolean a;

    private final boolean a(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof sqg)) {
            return false;
        }
        sqg sqgVar = (sqg) dialog;
        BottomSheetBehavior bottomSheetBehaviorA = sqgVar.a();
        if (!bottomSheetBehaviorA.v || !sqgVar.d) {
            return false;
        }
        this.a = z;
        if (bottomSheetBehaviorA.y == 5) {
            c();
            return true;
        }
        if (getDialog() instanceof sqg) {
            sqg sqgVar2 = (sqg) getDialog();
            sqgVar2.b.L(sqgVar2.i);
        }
        bottomSheetBehaviorA.H(new sqh(this));
        bottomSheetBehaviorA.P(5);
        return true;
    }

    public final void c() {
        if (this.a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // defpackage.bl
    public final void dismiss() {
        if (a(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // defpackage.bl
    public final void dismissAllowingStateLoss() {
        if (a(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, defpackage.bl
    public Dialog onCreateDialog(Bundle bundle) {
        return new sqg(getContext(), getTheme());
    }
}
