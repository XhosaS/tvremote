package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakm implements Executor {
    public static final aakm a;
    private static final Handler b;
    private static final /* synthetic */ aakm[] c;

    static {
        aakm aakmVar = new aakm();
        a = aakmVar;
        c = new aakm[]{aakmVar};
        b = new Handler(Looper.getMainLooper());
    }

    private aakm() {
    }

    public static aakm[] values() {
        return (aakm[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
