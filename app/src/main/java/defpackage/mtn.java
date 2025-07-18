package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtn implements obu {
    final /* synthetic */ niv a;
    final /* synthetic */ ogq b;
    final /* synthetic */ obz c;
    final /* synthetic */ nzw d;
    final /* synthetic */ oal e;
    final /* synthetic */ mtx f;

    public mtn(mtx mtxVar, niv nivVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = nivVar;
        this.b = ogqVar;
        this.c = obzVar;
        this.d = nzwVar;
        this.e = oalVar;
        this.f = mtxVar;
    }

    @Override // defpackage.obu
    public final void a(View view, ofs ofsVar, MotionEvent motionEvent) {
        niv nivVar;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = null;
        if (view != null && ofsVar != null && (nivVar = this.a) != null && nivVar.p()) {
            view.getLocationInWindow(new int[2]);
            actj actjVarE = mtx.e(view, ofsVar, r0[0], r0[1]);
            actl actlVarF = mtx.f(view);
            actv actvVar = actv.a;
            actu actuVar = new actu();
            if ((actuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                actuVar.y();
            }
            actv actvVar2 = (actv) actuVar.b;
            actjVarE.getClass();
            actvVar2.d = actjVarE;
            actvVar2.c |= 1;
            actv actvVar3 = (actv) actuVar.v();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = SenderStateOuterClass$SenderState.a;
            acyk acykVar = new acyk();
            acykVar.f(actv.b, actvVar3);
            acykVar.f(actl.b, actlVarF);
            senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) acykVar.v();
        }
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState3 = senderStateOuterClass$SenderState;
        mtx mtxVar = this.f;
        ogq ogqVar = this.b;
        obz obzVar = this.c;
        nzw nzwVar = this.d;
        oal oalVar = this.e;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 1, ofsVar, senderStateOuterClass$SenderState3, obzVar, nzwVar, oalVar, motionEvent)).b(mtxVar.c.a(oalVar)).k();
    }
}
