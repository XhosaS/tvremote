package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mll extends BroadcastReceiver {
    final /* synthetic */ IntentFilter a;
    final /* synthetic */ mlm b;

    public mll(mlm mlmVar, IntentFilter intentFilter) {
        this.a = intentFilter;
        this.b = mlmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.hasAction(intent.getAction())) {
            this.b.eb();
        }
    }
}
