package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cog {
    static final cog a = new cog(null, null);
    final Runnable b;
    final Executor c;
    cog next;

    public cog(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
