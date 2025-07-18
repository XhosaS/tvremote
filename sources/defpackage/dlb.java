package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlb extends dla {
    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        dgv dgvVarA = dgv.a(ddpVar.a.b);
        if (dgvVarA == null) {
            byte[] bArr = czx.f(ddpVar.a()).b;
            dmh dmhVar = new dmh((dme) dme.a.get(Integer.valueOf(dos.c(bArr, 0))));
            dmhVar.c = dnx.l(bArr);
            return new dmi(dmhVar);
        }
        czv czvVar = dgvVarA.b.a;
        dha dhaVarA = dha.a(ddpVar.a());
        dmh dmhVar2 = new dmh(new dme(dgvVarA.a, dle.v(czvVar)));
        dmhVar2.b = dnx.l(dhaVarA.b());
        dmhVar2.a = dnx.l(dhaVarA.c());
        return new dmi(dmhVar2);
    }
}
