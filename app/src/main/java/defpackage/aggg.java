package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aggg extends agfx {
    private final Handler b;

    public aggg(Handler handler) {
        this.b = handler;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agge(this.b);
    }

    @Override // defpackage.agfx
    public final aggi c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableD = agoh.d(runnable);
        Handler handler = this.b;
        aggf aggfVar = new aggf(handler, runnableD);
        handler.sendMessageDelayed(Message.obtain(handler, aggfVar), timeUnit.toMillis(j));
        return aggfVar;
    }
}
