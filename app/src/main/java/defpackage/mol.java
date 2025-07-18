package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class mol {
    public final moi a;

    public mol(moi moiVar) {
        this.a = moiVar;
    }

    public final void a(mpq mpqVar) {
        Float f = mpqVar.b;
        double dFloatValue = 0.0d;
        if (f != null && mpqVar.c != null) {
            dFloatValue = f.floatValue() - mpqVar.c.floatValue();
        }
        moi moiVar = this.a;
        View view = (View) moiVar.a.get();
        List list = moiVar.n;
        if (list == null || view == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((obr) it.next()).a(view, (float) dFloatValue);
        }
    }
}
