package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class meb implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return mec.a(this.a, runnable);
    }
}
