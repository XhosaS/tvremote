package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfe extends nez {
    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        evz evzVar = eklVar.d;
        if (evzVar == null || !evzVar.b()) {
            return;
        }
        this.b.f("adformat", "16_2");
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("adformat");
        this.b.g("ad_playback");
    }

    @Override // defpackage.nez
    public final void c(ekl eklVar, String str) {
        eay eayVar = eklVar.b;
        a.ab(!eayVar.q());
        evz evzVar = eklVar.d;
        eci.e(evzVar);
        int i = evzVar.b;
        a.ab(i != -1);
        eayVar.o(evzVar.a, new eav()).g(i);
        StringBuilder sbE = this.b.e(eklVar.a);
        sbE.append(str);
        sbE.append(":16_2:1");
        this.b.f("ad_playback", sbE.toString());
    }
}
