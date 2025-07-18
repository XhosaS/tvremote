package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class xu implements Executor {
    public static final xu a;
    private static final /* synthetic */ xu[] b;

    static {
        xu xuVar = new xu();
        a = xuVar;
        b = new xu[]{xuVar};
    }

    private xu() {
    }

    public static xu[] values() {
        return (xu[]) b.clone();
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
