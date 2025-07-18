package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtf implements obr {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtf(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obr
    public final void a(View view, float f) {
        actl actlVarF = mtx.f(view);
        actr actrVar = actr.a;
        actq actqVar = new actq();
        float degrees = (float) Math.toDegrees(f);
        if ((actqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actqVar.y();
        }
        actr actrVar2 = (actr) actqVar.b;
        actrVar2.c |= 1;
        actrVar2.d = degrees;
        actr actrVar3 = (actr) actqVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actr.b, actrVar3);
        acykVar.f(actl.b, actlVarF);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
        mtx mtxVar = this.e;
        ogq ogqVar = this.a;
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 10, null, senderStateOuterClass$SenderState2, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }
}
