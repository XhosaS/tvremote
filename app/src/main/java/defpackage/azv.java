package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class azv extends azk {
    final azw a;

    public azv(azs azsVar, azw azwVar) {
        super(azsVar);
        azsVar.addView(azwVar.g);
        azt aztVar = azwVar.i;
        if (aztVar != null) {
            View view = aztVar.g;
            if (azsVar.a.indexOfChild(view) < 0) {
                azsVar.a.addView(view, 0);
            }
        }
        this.a = azwVar;
        azwVar.h = this;
    }
}
