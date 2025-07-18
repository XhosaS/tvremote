package defpackage;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ow implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ow(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b != 0) {
            qk.s(runnable);
            Handler handler = this.a;
            if (handler.post(runnable)) {
                return;
            }
            Objects.toString(handler);
            throw new RejectedExecutionException(handler.toString().concat(" is shutting down"));
        }
        qk.s(runnable);
        Handler handler2 = this.a;
        if (handler2.post(runnable)) {
            return;
        }
        Objects.toString(handler2);
        throw new RejectedExecutionException(handler2.toString().concat(" is shutting down"));
    }
}
