package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apq extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ cjl c;
    final /* synthetic */ Callable d;
    final /* synthetic */ Executor e;

    public apq(AtomicBoolean atomicBoolean, Context context, cjl cjlVar, Callable callable, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = cjlVar;
        this.d = callable;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            apr.e(this.b, this);
            this.c.e(qm.N(this.d, this.e));
        }
    }
}
