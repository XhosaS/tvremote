package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtd implements obs {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtd(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obs
    public final void a(View view, float f) {
        actl actlVarF = mtx.f(view);
        actp actpVar = actp.a;
        acto actoVar = new acto();
        if ((actoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actoVar.y();
        }
        actp actpVar2 = (actp) actoVar.b;
        actpVar2.c |= 1;
        actpVar2.d = f;
        actp actpVar3 = (actp) actoVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actp.b, actpVar3);
        acykVar.f(actl.b, actlVarF);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
        mtx mtxVar = this.e;
        ogq ogqVar = this.a;
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 8, null, senderStateOuterClass$SenderState2, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }
}
