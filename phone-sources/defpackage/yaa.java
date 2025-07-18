package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yaa extends xrv {
    public final xru a;
    final /* synthetic */ yab b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public yaa(yab yabVar, xru xruVar) {
        this.b = yabVar;
        this.a = xruVar;
    }

    @Override // defpackage.xrv
    public final xrr a(xrs xrsVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.f.c().execute(new xyp(this, 5));
        }
        return xrr.a;
    }
}
