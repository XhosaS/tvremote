package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bla {
    public final View a;
    public final cfq b;
    public final String c;
    public final Rect d;
    public AutofillId e;
    public boolean f;
    public je g;
    public final dfb h;
    public final cb i;

    public bla() {
        throw null;
    }

    public bla(cb cbVar, dfb dfbVar, View view, cfq cfqVar, String str) {
        this.i = cbVar;
        this.h = dfbVar;
        this.a = view;
        this.b = cfqVar;
        this.c = str;
        this.d = new Rect();
        view.setImportantForAutofill(1);
        cvw cvwVarX = cbp.x(view);
        Object obj = cvwVarX != null ? cvwVarX.a : null;
        if (obj == null) {
            bty.a("Required value was null.");
            throw new yfs();
        }
        this.e = bb$$ExternalSyntheticApiModelOutline1.m(obj);
        this.g = new je((byte[]) null);
    }
}
