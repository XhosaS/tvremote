package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmo implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new gfe(runnable, 14, null), "glide-active-resources");
    }
}
