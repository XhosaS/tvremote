package defpackage;

import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hhj extends hvb {
    public hhj(hmc hmcVar, azu azuVar) {
        super(hmcVar, azuVar);
    }

    @Override // defpackage.ayy, defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        obj.getClass();
        super.g(azwVar, obj);
        ayx ayxVar = (ayx) y(azwVar);
        if (obj instanceof hhl) {
            HorizontalGridView horizontalGridView = ayxVar.a;
            hhl hhlVar = (hhl) obj;
            pan panVarC = hhlVar.c();
            if (panVarC == null) {
                panVarC = new pan(hhlVar.a());
            }
            paq.c(horizontalGridView, panVarC);
        }
    }
}
