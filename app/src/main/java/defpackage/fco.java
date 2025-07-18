package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fco {
    public final Context a;
    public final gkt b;
    public final gfr c;
    public final gmd d;
    fcl e = null;
    public fcn f = null;
    public final fcu g;
    public final est h;
    private final ghp i;
    private final ghr j;

    public fco(Context context, gkt gktVar, gfr gfrVar, gmd gmdVar, fcu fcuVar, ghp ghpVar, ghr ghrVar, est estVar) {
        this.a = context;
        this.b = gktVar;
        this.c = gfrVar;
        this.d = gmdVar;
        this.g = fcuVar;
        this.i = ghpVar;
        this.j = ghrVar;
        this.h = estVar;
    }

    public final zyd a(boolean z) {
        if (this.e == null) {
            this.e = new fcl(this.c, this.a, this.g, this.d, this.h, this.i, this.b, this.j);
        }
        return this.e.a(z);
    }
}
