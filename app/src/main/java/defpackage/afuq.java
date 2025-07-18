package defpackage;

import java.net.SocketAddress;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afuq extends afiv {
    final /* synthetic */ afur a;

    public afuq(afur afurVar) {
        this.a = afurVar;
    }

    @Override // defpackage.afiv
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.afiv
    public final void d(afir afirVar) {
        afis afisVar = new afis();
        SocketAddress socketAddress = this.a.a;
        afeh afehVar = afeh.a;
        afisVar.a = new afjw(null, Collections.singletonList(new affy(Collections.singletonList(socketAddress), afehVar)));
        afisVar.b = afehVar;
        afirVar.a(afisVar.a());
    }

    @Override // defpackage.afiv
    public final void c() {
    }
}
