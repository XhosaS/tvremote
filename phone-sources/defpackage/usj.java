package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usj extends dwt {
    public final usr b;
    public List c;
    private volatile ExecutorService e;
    public final dvv a = new dvv();
    private final Object d = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public usj(Context context) {
        if (usr.a == null) {
            synchronized (usr.class) {
                if (usr.a == null) {
                    usr.a = new usr(context.getApplicationContext());
                }
            }
        }
        usr usrVar = usr.a;
        this.b = usrVar;
        sij.z(usrVar.c.add(this), "Registered listener twice: %s", this);
    }

    final dvs a(List list) {
        list.getClass();
        this.c = list;
        c();
        return this.a;
    }

    public final Executor b() {
        if (this.e == null) {
            synchronized (this.d) {
                if (this.e == null) {
                    uie uieVar = new uie();
                    uieVar.c(true);
                    uieVar.d("XrpcDebugMenu-%d");
                    this.e = Executors.newSingleThreadExecutor(uie.b(uieVar));
                }
            }
        }
        return this.e;
    }

    public final void c() {
        uhq uhqVar = new uhq(new rjs(this, 13));
        szg.n(uhqVar, new qvj(this, 7), ugk.a);
        b().execute(uhqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.dwt
    public final void d() {
        sij.z(this.b.c.remove(this), "Tried to unregister listener before registering: %s", this);
        this.e.shutdown();
    }
}
