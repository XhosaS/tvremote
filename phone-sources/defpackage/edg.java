package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edg extends BroadcastReceiver {
    final /* synthetic */ nxo a;

    public edg(nxo nxoVar) {
        this.a = nxoVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c.execute(new edd(this, context, 2, null));
    }
}
