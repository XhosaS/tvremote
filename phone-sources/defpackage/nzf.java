package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzf implements oao {
    public final nwj a;
    public final nxn b;
    public final /* synthetic */ nzg e;
    public obm f = null;
    public Set c = null;
    public boolean d = false;

    public nzf(nzg nzgVar, nwj nwjVar, nxn nxnVar) {
        this.e = nzgVar;
        this.a = nwjVar;
        this.b = nxnVar;
    }

    @Override // defpackage.oao
    public final void a(nve nveVar) {
        this.e.o.post(new non(this, nveVar, 7));
    }

    public final void b(nve nveVar) {
        nzd nzdVar = (nzd) this.e.l.get(this.b);
        if (nzdVar != null) {
            nzdVar.k(nveVar);
        }
    }

    public final void c() {
        obm obmVar;
        if (!this.d || (obmVar = this.f) == null) {
            return;
        }
        this.a.I(obmVar, this.c);
    }
}
