package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfl extends nez {
    private final eav a = new eav();
    private final eax c = new eax();
    private boolean d;

    private final void A(ekl eklVar, boolean z) {
        if (this.d || !z) {
            return;
        }
        eay eayVar = eklVar.b;
        if (eayVar.q()) {
            return;
        }
        evz evzVar = eklVar.d;
        long jE = (evzVar == null || !evzVar.b()) ? eayVar.p(eklVar.c, this.c).A : eayVar.o(evzVar.a, this.a).e(evzVar.b, evzVar.c);
        if (jE != -9223372036854775807L) {
            this.d = true;
            this.b.f("len", nfa.b(edt.F(jE)));
        }
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        A(eklVar, true);
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("len");
    }

    @Override // defpackage.nez
    public final void w(ekl eklVar, boolean z) {
        A(eklVar, z);
    }
}
