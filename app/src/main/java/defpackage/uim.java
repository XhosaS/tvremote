package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uim extends BroadcastReceiver {
    private final Runnable a;

    public uim(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((ulx) this.a).a.d();
    }
}
