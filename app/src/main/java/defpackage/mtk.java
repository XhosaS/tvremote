package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mtk implements obv {
    final /* synthetic */ ogq a;
    final /* synthetic */ obz b;
    final /* synthetic */ nzw c;
    final /* synthetic */ oal d;
    final /* synthetic */ mtx e;

    public mtk(mtx mtxVar, ogq ogqVar, obz obzVar, nzw nzwVar, oal oalVar) {
        this.a = ogqVar;
        this.b = obzVar;
        this.c = nzwVar;
        this.d = oalVar;
        this.e = mtxVar;
    }

    @Override // defpackage.obv
    public final void a(View view, ofs ofsVar) {
        CommandOuterClass$Command commandOuterClass$CommandA = this.a.a();
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderStateH = mtx.h(ofsVar, view.getContext().getResources().getDisplayMetrics());
        obz obzVar = this.b;
        nzw nzwVar = this.c;
        oal oalVar = this.d;
        nzx nzxVarG = mtx.g(view, null, 16, ofsVar, senderStateOuterClass$SenderStateH, obzVar, nzwVar, oalVar, null);
        mtx mtxVar = this.e;
        mtxVar.b.a(commandOuterClass$CommandA, nzxVarG).b(mtxVar.c.a(oalVar)).k();
    }
}
