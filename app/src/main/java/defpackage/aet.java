package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aet implements Runnable {
    private final Callable a;
    private final afe b;
    private final Handler c;

    public aet(Handler handler, Callable callable, afe afeVar) {
        this.a = callable;
        this.b = afeVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aek aekVarCall;
        try {
            aekVarCall = ((aei) this.a).call();
        } catch (Exception unused) {
            aekVarCall = null;
        }
        this.c.post(new aes(this.b, aekVarCall));
    }
}
