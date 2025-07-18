package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class affk implements Executor {
    public static final affk a;
    private static final /* synthetic */ affk[] b;

    static {
        affk affkVar = new affk();
        a = affkVar;
        b = new affk[]{affkVar};
    }

    private affk() {
    }

    public static affk[] values() {
        return (affk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
