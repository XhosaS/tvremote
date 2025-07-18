package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewn extends BroadcastReceiver {
    final /* synthetic */ ewm a;

    public ewn(ewm ewmVar) {
        this.a = ewmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (agvy.c("android.intent.action.CLOSE_SYSTEM_DIALOGS", intent.getAction()) && agvy.c("homekey", intent.getStringExtra("reason"))) {
            this.a.a();
        }
    }
}
