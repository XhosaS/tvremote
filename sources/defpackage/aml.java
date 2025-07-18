package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aml implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public aml(Looper looper, int i) {
        this.b = i;
        this.a = new akn(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b != 0) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }

    public aml(int i) {
        this.b = i;
        this.a = new akn(Looper.getMainLooper());
    }
}
