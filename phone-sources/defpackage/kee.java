package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kee implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kee(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        if (i == 0) {
            dialogInterface.dismiss();
            by byVarF = hju.F((Context) this.a);
            byVarF.getClass();
            byVarF.finish();
            return;
        }
        if (i == 1) {
            bl blVar = (bl) this.a;
            if (blVar.mDialog != null) {
                blVar.onDismiss(blVar.mDialog);
                return;
            }
            return;
        }
        if (i != 2) {
            dialogInterface.dismiss();
            ((StreamingWarningDialogActivity) this.a).finish();
        } else {
            dialogInterface.dismiss();
            ((BootstrapWatchActivity) this.a).finish();
        }
    }

    public kee(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
