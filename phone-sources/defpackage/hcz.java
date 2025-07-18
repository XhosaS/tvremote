package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcz extends hci {
    private final hfk d;
    private final String e;
    private final boolean f;
    private final hdg g;
    private hdg h;

    public hcz(hbv hbvVar, hfk hfkVar, hfh hfhVar) {
        super(hbvVar, hfkVar, hjs.u(hfhVar.i), hjs.t(hfhVar.j), hfhVar.g, hfhVar.e, hfhVar.f, hfhVar.c, hfhVar.b);
        this.d = hfkVar;
        this.e = hfhVar.a;
        this.f = hfhVar.h;
        hdg hdgVarA = hfhVar.d.a();
        this.g = hdgVarA;
        hdgVarA.h(this);
        hfkVar.i(hdgVarA);
    }

    @Override // defpackage.hci, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.b) {
            this.g.d = hhuVar;
            return;
        }
        if (obj == hca.K) {
            hdg hdgVar = this.h;
            if (hdgVar != null) {
                this.d.k(hdgVar);
            }
            hdx hdxVar = new hdx(hhuVar);
            this.h = hdxVar;
            hdxVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.hci, defpackage.hcl
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Paint paint = this.b;
        paint.setColor(((hdh) this.g).k());
        hdg hdgVar = this.h;
        if (hdgVar != null) {
            paint.setColorFilter((ColorFilter) hdgVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.e;
    }
}
