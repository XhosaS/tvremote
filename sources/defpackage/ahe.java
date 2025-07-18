package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahe implements ahw {
    public final afx a;
    public final agr b;
    public final /* synthetic */ ahf e;
    public aip f = null;
    public Set c = null;
    public boolean d = false;

    public ahe(ahf ahfVar, afx afxVar, agr agrVar) {
        this.e = ahfVar;
        this.a = afxVar;
        this.b = agrVar;
    }

    @Override // defpackage.ahw
    public final void a(aeq aeqVar) {
        this.e.k.post(new bb(this, aeqVar, 16));
    }

    public final void b(aeq aeqVar) {
        ahc ahcVar = (ahc) this.e.j.get(this.b);
        if (ahcVar != null) {
            ahcVar.l(aeqVar);
        }
    }

    public final void c() {
        aip aipVar;
        if (!this.d || (aipVar = this.f) == null) {
            return;
        }
        this.a.p(aipVar, this.c);
    }
}
