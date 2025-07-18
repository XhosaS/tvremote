package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nre extends BroadcastReceiver {
    final /* synthetic */ nrg a;

    public nre(nrg nrgVar) {
        this.a = nrgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("android.intent.action.SCREEN_ON")) {
            this.a.b();
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            this.a.d();
        }
    }
}
