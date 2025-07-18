package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agge extends agfw {
    private final Handler a;
    private volatile boolean b;

    public agge(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        if (this.b) {
            return aghe.INSTANCE;
        }
        Runnable runnableD = agoh.d(runnable);
        Handler handler = this.a;
        aggf aggfVar = new aggf(handler, runnableD);
        Message messageObtain = Message.obtain(handler, aggfVar);
        messageObtain.obj = this;
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.b) {
            return aggfVar;
        }
        handler.removeCallbacks(aggfVar);
        return aghe.INSTANCE;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
