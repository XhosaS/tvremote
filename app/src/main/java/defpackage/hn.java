package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class hn extends ahy {
    final /* synthetic */ hr a;

    public hn(hr hrVar) {
        this.a = hrVar;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void a() {
        View view;
        hr hrVar = this.a;
        if (hrVar.j && (view = hrVar.f) != null) {
            view.setTranslationY(0.0f);
            hrVar.c.setTranslationY(0.0f);
        }
        hrVar.c.setVisibility(8);
        hrVar.c.a(false);
        hrVar.l = null;
        ii iiVar = hrVar.i;
        if (iiVar != null) {
            iiVar.a(hrVar.h);
            hrVar.h = null;
            hrVar.i = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = hrVar.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ahj.a;
            aha.c(actionBarOverlayLayout);
        }
    }
}
