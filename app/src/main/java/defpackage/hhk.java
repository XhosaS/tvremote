package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hhk extends azx {
    @Override // defpackage.azx
    protected void g(azw azwVar, Object obj) {
        obj.getClass();
        super.g(azwVar, obj);
        if (obj instanceof hhl) {
            View view = azwVar.g;
            hhl hhlVar = (hhl) obj;
            pan panVarC = hhlVar.c();
            if (panVarC == null) {
                panVarC = new pan(hhlVar.a());
            }
            paq.c(view, panVarC);
        }
    }
}
