package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zul extends zuj {
    @Override // defpackage.zuj
    public final zod a(zmw zmwVar) {
        zqf zqfVarA = zqf.a(zmwVar.a.b);
        if (zqfVarA == null) {
            byte[] bArr = zjd.f(zmwVar.a()).b;
            zvq zvqVar = new zvq((zvh) zvh.a.get(Integer.valueOf(vxr.aQ(bArr, 0))));
            zvqVar.c = vxr.bz(bArr);
            return new zvk(zvqVar);
        }
        zjb zjbVar = zqfVarA.c.a;
        zqj zqjVarA = zqj.a(zmwVar.a());
        zvq zvqVar2 = new zvq(new zvh(zqfVarA.a, zqfVarA.b, zun.v(zjbVar)));
        zvqVar2.b = vxr.bz(zqjVarA.b());
        zvqVar2.a = vxr.bz(zqjVarA.c());
        return new zvk(zvqVar2);
    }
}
