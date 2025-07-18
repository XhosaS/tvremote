package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cua implements Runnable {
    private final Callable a;
    private final cuh b;
    private final Handler c;

    public cua(Handler handler, Callable callable, cuh cuhVar) {
        this.a = callable;
        this.b = cuhVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zuw zuwVarCall;
        try {
            zuwVarCall = ((ctv) this.a).call();
        } catch (Exception unused) {
            zuwVarCall = null;
        }
        this.c.post(new be(this.b, zuwVarCall, 15, (char[]) null));
    }
}
