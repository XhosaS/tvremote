package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugk implements Executor {
    public static final ugk a;
    private static final /* synthetic */ ugk[] b;

    static {
        ugk ugkVar = new ugk();
        a = ugkVar;
        b = new ugk[]{ugkVar};
    }

    private ugk() {
    }

    public static ugk[] values() {
        return (ugk[]) b.clone();
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
