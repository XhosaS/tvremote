package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsz extends rsw implements rqf {
    public final uht a;
    public final xbw b;
    public final rqd c;
    public final rtd d;
    private final rne e;
    private final boolean f;
    private final rsv g;

    public rsz(yyh yyhVar, rsv rsvVar, uht uhtVar, xbw xbwVar, rtd rtdVar, rne rneVar, yfo yfoVar, Executor executor, tst tstVar) {
        new AtomicReference(rsr.a);
        new ConcurrentHashMap();
        this.g = rsvVar;
        this.e = rneVar;
        this.c = yyhVar.f(executor, xbwVar, yfoVar);
        this.a = uhtVar;
        this.b = xbwVar;
        this.d = rtdVar;
        this.f = ((Boolean) tstVar.e(false)).booleanValue();
    }

    public static final boolean c(int i) {
        return i != 1;
    }

    @Override // defpackage.rsw
    public final void a() {
        rsu rsuVar = new rsu() { // from class: rsx
            @Override // defpackage.rsu
            public final void a(int i, String str) {
                this.a.d(null, i, str);
            }
        };
        rsv rsvVar = this.g;
        rsvVar.d = rsuVar;
        if (rsvVar.c.getAndSet(true)) {
            return;
        }
        sfy.G(new osv(rsvVar, 7), rsvVar.b);
    }

    @Override // defpackage.rsw
    public final void b(rmp rmpVar) {
        d(rmpVar.a, 1, null);
    }

    public final void d(String str, int i, String str2) {
        if (this.e.a) {
            sfy.A();
        } else {
            sfy.G(new sll(this, i, str, str2, 1), this.a);
        }
    }

    @Override // defpackage.rqf
    public final void k() {
        if (this.f) {
            a();
        }
    }
}
