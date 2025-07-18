package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
class ddt {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new dds());

    final synchronized void a(ddp ddpVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            ddpVar.e();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, ddpVar).sendToTarget();
    }
}
