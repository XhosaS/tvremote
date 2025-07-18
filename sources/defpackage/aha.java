package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aha implements Executor {
    public final /* synthetic */ Handler a;
    private final /* synthetic */ int b;

    public /* synthetic */ aha(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b != 0) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }
}
