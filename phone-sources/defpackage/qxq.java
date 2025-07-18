package defpackage;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxq extends BroadcastReceiver {
    final /* synthetic */ qxr a;

    public qxq(qxr qxrVar) {
        this.a = qxrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Window window;
        context.getClass();
        intent.getClass();
        if (ylh.y(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS", false)) {
            qxr qxrVar = this.a;
            Dialog dialog = qxrVar.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(0);
            }
            View view = qxrVar.getView();
            if (view != null) {
                view.requestLayout();
            }
            View view2 = qxrVar.getView();
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new fta(qxrVar, 3, null));
            }
        }
    }
}
