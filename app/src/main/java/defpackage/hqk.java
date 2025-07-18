package defpackage;

import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hqk implements awg {
    final /* synthetic */ VerticalGridView a;
    final /* synthetic */ hqn b;

    public hqk(hqn hqnVar, VerticalGridView verticalGridView) {
        this.a = verticalGridView;
        this.b = hqnVar;
    }

    @Override // defpackage.awg
    public final void a(qs qsVar) {
        this.a.ad.W(this);
        hqn hqnVar = this.b;
        if (hqnVar.az) {
            hqnVar.dS(hqnVar.aK.g());
        } else if (hqnVar.d == hqnVar.aK.g()) {
            hqnVar.dS(hqnVar.aK.f());
        }
    }
}
