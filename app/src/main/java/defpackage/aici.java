package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aici implements Executor {
    private final Executor a;

    public aici(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        aich aichVar = new aich(runnable, Thread.currentThread());
        this.a.execute(aichVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = aichVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        aichVar.a = null;
    }
}
