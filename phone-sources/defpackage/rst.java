package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rst implements roq {
    final /* synthetic */ uht a;
    public final /* synthetic */ rsv b;

    public rst(rsv rsvVar, uht uhtVar) {
        this.a = uhtVar;
        this.b = rsvVar;
    }

    @Override // defpackage.roq
    public final void g(rmp rmpVar) {
        rsv rsvVar = this.b;
        rsvVar.d.a(3, rmpVar.a);
        rsvVar.a();
        rsvVar.f = this.a.a(new rmz(this, rmpVar, 3, null), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.roq
    public final void j(rmp rmpVar) {
        rsv rsvVar = this.b;
        rsvVar.d.a(4, rmpVar.a);
        rsvVar.a();
        rsvVar.e = this.a.a(new rmz(this, rmpVar, 4, null), 10L, TimeUnit.SECONDS);
    }
}
