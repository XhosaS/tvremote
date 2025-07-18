package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ox implements Runnable {
    private final Callable a;
    private final oy b;
    private final Handler c;

    public ox(Handler handler, Callable callable, oy oyVar) {
        this.a = callable;
        this.b = oyVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dln dlnVarCall;
        try {
            dlnVarCall = ((or) this.a).call();
        } catch (Exception unused) {
            dlnVarCall = null;
        }
        this.c.post(new bb(this.b, dlnVarCall, 13, (char[]) null));
    }
}
