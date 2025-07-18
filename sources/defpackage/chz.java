package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class chz implements Executor {
    public static final chz a;
    private static final /* synthetic */ chz[] b;

    static {
        chz chzVar = new chz();
        a = chzVar;
        b = new chz[]{chzVar};
    }

    private chz() {
    }

    public static chz[] values() {
        return (chz[]) b.clone();
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
