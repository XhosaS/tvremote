package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzt {
    public volatile Object a;
    public volatile nzr b;
    private final Executor c;

    public nzt(Looper looper, Object obj, String str) {
        this.c = new oob(looper, 1);
        ocv.aG(obj, "Listener must not be null");
        this.a = obj;
        ocv.aD(str);
        this.b = new nzr(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(nzs nzsVar) {
        this.c.execute(new non(this, nzsVar, 8));
    }
}
