package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzu extends xrv {
    final /* synthetic */ xzw a;
    private final xzw b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public xzu(xzw xzwVar, xzw xzwVar2) {
        this.a = xzwVar;
        this.b = xzwVar2;
    }

    @Override // defpackage.xrv
    public final xrr a(xrs xrsVar) {
        if (this.c.compareAndSet(false, true)) {
            this.a.g.c().execute(new xyp(this.b, 4, null));
        }
        return xrr.a;
    }
}
