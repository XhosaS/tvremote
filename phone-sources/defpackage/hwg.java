package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwg implements Executor {
    public static final hwg a = new hwg(3);
    private final /* synthetic */ int b;

    public hwg(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            runnable.run();
            return;
        }
        if (i == 1) {
            hwp.h(runnable);
        } else if (i != 2) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
