package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pco implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vmy vmyVar = (vmy) obj;
        vtw vtwVarM = uzh.a.m();
        vtwVarM.as(vmyVar.c);
        if ((vmyVar.b & 1) != 0) {
            tsg tsgVar = pds.a;
            vmx vmxVarB = vmx.b(vmyVar.d);
            if (vmxVarB == null) {
                vmxVarB = vmx.ACTION_UNSPECIFIED;
            }
            uzg uzgVar = (uzg) tsgVar.convert(vmxVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzh uzhVar = (uzh) vtwVarM.b;
            uzhVar.d = uzgVar.e;
            uzhVar.b |= 1;
        }
        return (uzh) vtwVarM.r();
    }
}
