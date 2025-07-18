package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugo {
    private static final uho c = new uho(ugo.class);
    public ugn a;
    public boolean b;

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }
}
