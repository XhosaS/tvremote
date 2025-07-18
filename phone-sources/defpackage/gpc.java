package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpc implements Executor {
    public static final gpc a;
    private static final /* synthetic */ gpc[] b;

    static {
        gpc gpcVar = new gpc();
        a = gpcVar;
        gpc[] gpcVarArr = {gpcVar};
        b = gpcVarArr;
        wcq.P(gpcVarArr);
    }

    private gpc() {
    }

    public static gpc[] values() {
        return (gpc[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
