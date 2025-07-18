package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zuk extends zuj {
    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        zqe zqeVarA = zqe.a(zmwVar.a.b);
        if (zqeVarA == null) {
            byte[] bArr = zjd.f(zmwVar.a()).b;
            zvq zvqVar = new zvq((zvn) zvn.a.get(Integer.valueOf(vxr.aQ(bArr, 0))));
            zvqVar.c = vxr.bz(bArr);
            return new zvr(zvqVar);
        }
        zjb zjbVar = zqeVarA.b.a;
        zqj zqjVarA = zqj.a(zmwVar.a());
        zvq zvqVar2 = new zvq(new zvn(zqeVarA.a, zun.v(zjbVar)));
        zvqVar2.b = vxr.bz(zqjVarA.b());
        zvqVar2.a = vxr.bz(zqjVarA.c());
        return new zvr(zvqVar2);
    }
}
