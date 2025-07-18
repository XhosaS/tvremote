package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe implements Executor {
    public static final cbe a;
    private static final /* synthetic */ cbe[] b;

    static {
        cbe cbeVar = new cbe();
        a = cbeVar;
        cbe[] cbeVarArr = {cbeVar};
        b = cbeVarArr;
        agtw.a(cbeVarArr);
    }

    private cbe() {
    }

    public static cbe[] values() {
        return (cbe[]) b.clone();
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
