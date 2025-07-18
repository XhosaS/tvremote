package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
class mhu extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ zyu c;
    final /* synthetic */ zvh d;
    final /* synthetic */ Executor e;

    public mhu(AtomicBoolean atomicBoolean, Context context, zyu zyuVar, zvh zvhVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = zyuVar;
        this.d = zvhVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            mhv.e(this.b, this);
            this.c.eZ(zxn.l(this.d, this.e));
        }
    }
}
