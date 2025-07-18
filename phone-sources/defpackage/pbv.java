package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pbv implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vod vodVar = (vod) obj;
        vtw vtwVarM = uxj.a.m();
        if ((vodVar.b & 1) != 0) {
            tsl tslVar = pdc.a;
            voc vocVarB = voc.b(vodVar.c);
            if (vocVarB == null) {
                vocVarB = voc.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object objApply = tslVar.apply(vocVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxj uxjVar = (uxj) vtwVarM.b;
            uxjVar.c = ((uvu) objApply).a();
            uxjVar.b |= 1;
        }
        return (uxj) vtwVarM.r();
    }
}
