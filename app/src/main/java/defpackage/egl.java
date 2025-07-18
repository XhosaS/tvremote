package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class egl implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ egp a;
    final /* synthetic */ egq b;
    final /* synthetic */ eny c;

    public egl(egp egpVar, egq egqVar, eny enyVar) {
        this.a = egpVar;
        this.b = egqVar;
        this.c = enyVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        egp egpVar = this.a;
        egpVar.getViewTreeObserver().removeOnPreDrawListener(this);
        egq egqVar = this.b;
        int i = egqVar.a;
        if (i != -1) {
            egpVar.setScrollX(i);
            return true;
        }
        if (this.c == eny.RTL) {
            egpVar.fullScroll(66);
        }
        egqVar.a = egpVar.getScrollX();
        return true;
    }
}
