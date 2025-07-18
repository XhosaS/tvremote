package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btl extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Runnable b;

    public btl(AtomicBoolean atomicBoolean, Runnable runnable) {
        this.a = atomicBoolean;
        this.b = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((cbs) ((cbs) btm.a.e().g(btt.a)).j("com/google/android/tv/remote/service/features/UserUtils$1", "onReceive", 35, "UserUtils.java")).p("User is unlocked");
        if (this.a.getAndSet(true)) {
            return;
        }
        context.unregisterReceiver(this);
        this.b.run();
    }
}
