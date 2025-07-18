package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eus extends BroadcastReceiver {
    final /* synthetic */ euu a;

    public eus(euu euuVar) {
        this.a = euuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.a.b();
    }
}
