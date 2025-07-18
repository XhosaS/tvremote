package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cor implements Executor {
    public static final cor a;
    private static final /* synthetic */ cor[] b;

    static {
        cor corVar = new cor();
        a = corVar;
        b = new cor[]{corVar};
    }

    private cor() {
    }

    public static cor[] values() {
        return (cor[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
