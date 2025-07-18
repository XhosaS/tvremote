package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crw implements cro {
    public final crt a;
    public final crt b;
    public final crt c;
    public final crt d;
    private final cro e;
    private final crt f;
    private boolean g = true;

    public crw(cro croVar, cug cugVar, cvf cvfVar) {
        this.e = croVar;
        crt crtVarA = cvfVar.a.a();
        this.a = crtVarA;
        crtVarA.h(this);
        cugVar.k(crtVarA);
        crt crtVarA2 = cvfVar.b.a();
        this.f = crtVarA2;
        crtVarA2.h(this);
        cugVar.k(crtVarA2);
        crt crtVarA3 = cvfVar.c.a();
        this.b = crtVarA3;
        crtVarA3.h(this);
        cugVar.k(crtVarA3);
        crt crtVarA4 = cvfVar.d.a();
        this.c = crtVarA4;
        crtVarA4.h(this);
        cugVar.k(crtVarA4);
        crt crtVarA5 = cvfVar.e.a();
        this.d = crtVarA5;
        crtVarA5.h(this);
        cugVar.k(crtVarA5);
    }

    public final void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((Float) this.b.e()).floatValue();
            float fFloatValue = ((Float) this.c.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d)) * fFloatValue;
            float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.a.e()).intValue();
            paint.setShadowLayer(((Float) this.d.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(cxb cxbVar) {
        this.f.d = new crv(cxbVar);
    }

    @Override // defpackage.cro
    public final void d() {
        this.g = true;
        this.e.d();
    }
}
