package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nmm extends npj {
    final /* synthetic */ nmq a;

    public nmm(nmq nmqVar) {
        this.a = nmqVar;
    }

    @Override // defpackage.npj
    public final void b() {
        nmq nmqVar = this.a;
        nqj nqjVar = nmqVar.d;
        nln nlnVarH = nqjVar != null ? nqjVar.h() : null;
        pku pkuVar = nmqVar.e;
        if (pkuVar == null || nlnVarH == null) {
            return;
        }
        noa noaVarC = ((goe) pkuVar.a).c();
        nny nnyVar = new nny(new sew(nlnVarH));
        nny nnyVar2 = noaVarC.o;
        if (nnyVar2 == null || nnyVar2.a != 2) {
            nnyVar.c = noaVarC.j;
            noaVarC.o = nnyVar;
        }
    }

    @Override // defpackage.npj
    public final void c(String str, long j, int i, long j2, long j3) {
        pku pkuVar = this.a.e;
        if (pkuVar != null) {
            noa noaVarC = ((goe) pkuVar.a).c();
            nos nosVar = new nos(str);
            nosVar.b = j;
            nosVar.c = i;
            nosVar.d = j2;
            nosVar.e = j3;
            not notVar = new not(nosVar);
            notVar.f = noaVarC.j;
            noaVarC.f.add(notVar);
        }
    }
}
