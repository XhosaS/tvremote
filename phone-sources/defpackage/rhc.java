package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhc extends BroadcastReceiver {
    final /* synthetic */ rme a;

    public rhc(rme rmeVar) {
        this.a = rmeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            this.a.dismiss();
        }
    }
}
