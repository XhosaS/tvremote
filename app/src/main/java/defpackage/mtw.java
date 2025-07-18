package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtw implements obt {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtw(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obt
    public final void a(View view, ofs ofsVar, ofs ofsVar2, float f, float f2) {
        if (ofsVar == null) {
            return;
        }
        view.getLocationInWindow(new int[2]);
        actl actlVarF = mtx.f(view);
        actj actjVarE = mtx.e(view, ofsVar, r1[0], r1[1]);
        actj actjVarE2 = mtx.e(view, ofsVar2, r1[0], r1[1]);
        acyb acybVar = acyb.a;
        acya acyaVar = new acya();
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar2 = (acyb) acyaVar.b;
        acybVar2.b |= 1;
        acybVar2.c = f;
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar3 = (acyb) acyaVar.b;
        acybVar3.b |= 2;
        acybVar3.d = f2;
        acyb acybVar4 = (acyb) acyaVar.v();
        actt acttVar = actt.a;
        acts actsVar = new acts();
        if ((actsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actsVar.y();
        }
        actt acttVar2 = (actt) actsVar.b;
        actjVarE.getClass();
        acttVar2.d = actjVarE;
        acttVar2.c |= 1;
        if ((actsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actsVar.y();
        }
        actt acttVar3 = (actt) actsVar.b;
        actjVarE2.getClass();
        acttVar3.e = actjVarE2;
        acttVar3.c |= 2;
        if ((actsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            actsVar.y();
        }
        actt acttVar4 = (actt) actsVar.b;
        acybVar4.getClass();
        acttVar4.f = acybVar4;
        acttVar4.c |= 4;
        actt acttVar5 = (actt) actsVar.v();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actt.b, acttVar5);
        acykVar.f(actl.b, actlVarF);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
        mtx mtxVar = this.e;
        ogq ogqVar = this.a;
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        mtxVar.b.a(ogqVar.a(), mtx.g(view, null, 7, ofsVar, senderStateOuterClass$SenderState2, obzVar, nzwVar, oalVar, null)).b(mtxVar.c.a(oalVar)).k();
    }
}
