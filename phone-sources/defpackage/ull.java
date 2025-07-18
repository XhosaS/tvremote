package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ull implements Executor {
    public static final ull a;
    private static final Handler b;
    private static final /* synthetic */ ull[] c;

    static {
        ull ullVar = new ull();
        a = ullVar;
        c = new ull[]{ullVar};
        b = new Handler(Looper.getMainLooper());
    }

    private ull() {
    }

    public static ull[] values() {
        return (ull[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
