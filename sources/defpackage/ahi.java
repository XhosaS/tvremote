package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahi {
    public volatile Object a;
    public volatile ahg b;
    private final Executor c;

    public ahi(Looper looper, Object obj, String str) {
        this.c = new aml(looper, 1);
        this.a = obj;
        qp.o(str);
        this.b = new ahg(obj, str);
    }

    public final void a(ahh ahhVar) {
        this.c.execute(new bb(this, ahhVar, 17));
    }
}
