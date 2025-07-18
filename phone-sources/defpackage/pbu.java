package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pbu implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vkv vkvVar = (vkv) obj;
        vtw vtwVarM = uxh.a.m();
        if ((vkvVar.b & 1) != 0) {
            tsl tslVar = pdb.a;
            voc vocVarB = voc.b(vkvVar.c);
            if (vocVarB == null) {
                vocVarB = voc.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object objApply = tslVar.apply(vocVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxh uxhVar = (uxh) vtwVarM.b;
            uxhVar.c = ((uvu) objApply).a();
            uxhVar.b |= 1;
        }
        if ((vkvVar.b & 2) != 0) {
            int i = vkvVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxh uxhVar2 = (uxh) vtwVarM.b;
            uxhVar2.b |= 2;
            uxhVar2.d = i;
        }
        return (uxh) vtwVarM.r();
    }
}
