package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zcq implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ zcq(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = zcr.a;
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
