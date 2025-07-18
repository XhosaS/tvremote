package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nft extends nez {
    @Override // defpackage.nez
    public final void b() {
        this.b.g("ctmp");
    }

    @Override // defpackage.nez
    public final void y(ekl eklVar, long j, int i) {
        String strB = nfa.b(this.b.a(eklVar.a));
        StringBuilder sbD = this.b.d();
        sbD.append("tstamp.");
        sbD.append(strB);
        sbD.append(";sum.");
        sbD.append(j);
        sbD.append(";count.");
        sbD.append(i);
        sbD.append(';');
        this.b.f("ctmp", "vfpo:".concat(sbD.toString()));
    }
}
