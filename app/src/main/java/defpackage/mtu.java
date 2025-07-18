package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtu implements obm {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtu(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obm
    public final void a(View view, ofs ofsVar, ofs ofsVar2, float f, float f2) {
        if (ofsVar == null) {
            return;
        }
        view.getLocationInWindow(new int[2]);
        actl actlVarF = mtx.f(view);
        actj actjVarE = mtx.e(view, ofsVar, r1[0], r1[1]);
        actj actjVarE2 = mtx.e(view, ofsVar2, r1[0], r1[1]);
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        actn actnVar = actn.a;
        actm actmVar = new actm();
        if ((actmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actmVar.y();
        }
        actn actnVar2 = (actn) actmVar.b;
        actjVarE.getClass();
        actnVar2.d = actjVarE;
        actnVar2.c |= 1;
        if ((actmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actmVar.y();
        }
        actn actnVar3 = (actn) actmVar.b;
        actjVarE2.getClass();
        actnVar3.e = actjVarE2;
        actnVar3.c |= 2;
        acyb acybVar = acyb.a;
        acya acyaVar = new acya();
        float fD = mtx.d(displayMetrics, f);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar2 = (acyb) acyaVar.b;
        acybVar2.b = 1 | acybVar2.b;
        acybVar2.c = fD;
        float fD2 = mtx.d(displayMetrics, f2);
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar3 = (acyb) acyaVar.b;
        acybVar3.b = 2 | acybVar3.b;
        acybVar3.d = fD2;
        acyb acybVar4 = (acyb) acyaVar.v();
        if ((actmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actmVar.y();
        }
        actn actnVar4 = (actn) actmVar.b;
        acybVar4.getClass();
        actnVar4.f = acybVar4;
        actnVar4.c |= 4;
        actn actnVar5 = (actn) actmVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actn.b, actnVar5);
        acykVar.f(actl.b, actlVarF);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
        mtx mtxVar = this.e;
        ogq ogqVar = this.a;
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 5, ofsVar, senderStateOuterClass$SenderState2, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }
}
