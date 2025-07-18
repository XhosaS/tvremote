package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cq extends re {
    final /* synthetic */ ct a;

    public cq(ct ctVar) {
        this.a = ctVar;
    }

    @Override // defpackage.re, defpackage.rd
    public final void a() {
        View view;
        ct ctVar = this.a;
        if (ctVar.j && (view = ctVar.e) != null) {
            view.setTranslationY(0.0f);
            ctVar.c.setTranslationY(0.0f);
        }
        ctVar.c.setVisibility(8);
        ctVar.c.a(false);
        ctVar.l = null;
        cx cxVar = ctVar.h;
        if (cxVar != null) {
            cxVar.a(ctVar.g);
            ctVar.g = null;
            ctVar.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = ctVar.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = qv.a;
            qk.j(actionBarOverlayLayout);
        }
    }
}
