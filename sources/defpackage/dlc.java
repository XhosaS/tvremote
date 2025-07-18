package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlc extends dla {
    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        dgw dgwVarA = dgw.a(ddpVar.a.b);
        if (dgwVarA == null) {
            byte[] bArr = czx.f(ddpVar.a()).b;
            dmh dmhVar = new dmh((dly) dly.a.get(Integer.valueOf(dos.c(bArr, 0))));
            dmhVar.c = dnx.l(bArr);
            return new dmb(dmhVar);
        }
        czv czvVar = dgwVarA.c.a;
        dha dhaVarA = dha.a(ddpVar.a());
        dmh dmhVar2 = new dmh(new dly(dgwVarA.a, dgwVarA.b, dle.v(czvVar)));
        dmhVar2.b = dnx.l(dhaVarA.b());
        dmhVar2.a = dnx.l(dhaVarA.c());
        return new dmb(dmhVar2);
    }
}
