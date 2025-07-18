package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdj implements hdb {
    private final hdb a;
    private final hdg b;
    private final hdg c;
    private final hdg d;
    private final hdg e;
    private final hdg f;
    private boolean g = true;

    public hdj(hdb hdbVar, hfk hfkVar, gag gagVar) {
        this.a = hdbVar;
        hdg hdgVarA = ((heh) gagVar.b).a();
        this.b = hdgVarA;
        hdgVarA.h(this);
        hfkVar.i(hdgVarA);
        hdg hdgVarA2 = ((hei) gagVar.c).a();
        this.c = hdgVarA2;
        hdgVarA2.h(this);
        hfkVar.i(hdgVarA2);
        hdg hdgVarA3 = ((hei) gagVar.e).a();
        this.d = hdgVarA3;
        hdgVarA3.h(this);
        hfkVar.i(hdgVarA3);
        hdg hdgVarA4 = ((hei) gagVar.a).a();
        this.e = hdgVarA4;
        hdgVarA4.h(this);
        hfkVar.i(hdgVarA4);
        hdg hdgVarA5 = ((hei) gagVar.d).a();
        this.f = hdgVarA5;
        hdgVarA5.h(this);
        hfkVar.i(hdgVarA5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.d.e()).floatValue();
            float fFloatValue = ((Float) this.e.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d)) * fFloatValue;
            float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.b.e()).intValue();
            paint.setShadowLayer(((Float) this.f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(hhu hhuVar) {
        this.b.d = hhuVar;
    }

    public final void c(hhu hhuVar) {
        this.d.d = hhuVar;
    }

    @Override // defpackage.hdb
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(hhu hhuVar) {
        this.e.d = hhuVar;
    }

    public final void f(hhu hhuVar) {
        this.c.d = new hdi(hhuVar);
    }

    public final void g(hhu hhuVar) {
        this.f.d = hhuVar;
    }
}
