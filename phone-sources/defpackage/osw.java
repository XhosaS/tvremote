package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class osw extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ uic c;
    final /* synthetic */ ufv d;
    final /* synthetic */ Executor e;

    public osw(AtomicBoolean atomicBoolean, Context context, uic uicVar, ufv ufvVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = uicVar;
        this.d = ufvVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            osx.e(this.b, this);
            this.c.ev(sfy.G(this.d, this.e));
        }
    }
}
