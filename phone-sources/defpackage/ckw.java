package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckw extends TextPaint {
    public int a;
    private cll b;
    private bok c;
    private bnq d;
    private bnn e;
    private bdy f;
    private bna g;
    private tac h;
    private brx i;

    public ckw(float f) {
        super(1);
        this.density = f;
        this.b = cll.a;
        this.a = 3;
        this.c = bok.a;
    }

    private final void g() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    private final tac h() {
        tac tacVar = this.h;
        if (tacVar != null) {
            return tacVar;
        }
        tac tacVar2 = new tac(this);
        this.h = tacVar2;
        return tacVar2;
    }

    public final void a(int i) {
        if (a.r(i, this.a)) {
            return;
        }
        h().n(i);
        this.a = i;
    }

    public final void b(bnn bnnVar, long j, float f) {
        g();
    }

    public final void c(long j) {
        bnq bnqVar = this.d;
        if ((bnqVar != null && a.s(bnqVar.h, j)) || j == 16) {
            return;
        }
        this.d = new bnq(j);
        setColor(bny.h(j));
        g();
    }

    public final void d(bok bokVar) {
        if (bokVar == null || yks.e(this.c, bokVar)) {
            return;
        }
        this.c = bokVar;
        if (yks.e(bokVar, bok.a)) {
            clearShadowLayer();
            return;
        }
        bok bokVar2 = this.c;
        float f = bokVar2.d;
        long j = bokVar2.c;
        float fIntBitsToFloat = Float.intBitsToFloat(0);
        long j2 = this.c.c;
        setShadowLayer(Float.MIN_VALUE, fIntBitsToFloat, Float.intBitsToFloat(0), bny.h(this.c.b));
    }

    public final void e(cll cllVar) {
        if (cllVar == null || yks.e(this.b, cllVar)) {
            return;
        }
        this.b = cllVar;
        setUnderlineText(cllVar.a(cll.b));
        setStrikeThruText(this.b.a(cll.c));
    }

    public final void f(brx brxVar) {
        if (brxVar == null || yks.e(this.i, brxVar)) {
            return;
        }
        this.i = brxVar;
        if (!yks.e(brxVar, bps.a)) {
            throw new yfu();
        }
        setStyle(Paint.Style.FILL);
    }
}
