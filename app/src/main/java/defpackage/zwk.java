package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwk implements Executor {
    public static final zwk a;
    private static final /* synthetic */ zwk[] b;

    static {
        zwk zwkVar = new zwk();
        a = zwkVar;
        b = new zwk[]{zwkVar};
    }

    private zwk() {
    }

    public static zwk[] values() {
        return (zwk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
