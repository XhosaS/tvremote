package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtv implements obl {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtv(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obl
    public final void a(View view, ofs ofsVar) {
        actl actlVarF = mtx.f(view);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
        acyk acykVar = new acyk();
        acykVar.f(actl.b, actlVarF);
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        CommandOuterClass$Command commandOuterClass$CommandA = this.a.a();
        nzx nzxVarG = mtx.g(view, null, 6, ofsVar, senderStateOuterClass$SenderState2, obzVar, nzwVar, oalVar, null);
        mtx mtxVar = this.e;
        mtxVar.b.a(commandOuterClass$CommandA, nzxVarG).b(mtxVar.c.a(oalVar)).k();
    }
}
