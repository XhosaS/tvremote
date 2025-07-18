package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ri extends bxw implements byc {
    private final qj a;
    private final re b;
    private final yy c;

    public ri(bxv bxvVar, qj qjVar, re reVar, yy yyVar) {
        this.a = qjVar;
        this.b = reVar;
        this.c = yyVar;
        O(bxvVar);
    }

    private static final boolean e(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        boolean zE;
        char c;
        boolean z;
        qj qjVar = this.a;
        qjVar.i(byuVar.n());
        if (bna.e(byuVar.n())) {
            byuVar.r();
            return;
        }
        byuVar.r();
        qjVar.c.a();
        Canvas canvasA = bnc.a(byuVar.p().b());
        re reVar = this.b;
        if (reVar.l()) {
            EdgeEffect edgeEffectC = reVar.c();
            float f = -Float.intBitsToFloat((int) (byuVar.n() & 4294967295L));
            zE = e(270.0f, (Float.floatToRawIntBits(byuVar.cr(this.c.b(byuVar.o()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), edgeEffectC, canvasA);
        } else {
            zE = false;
        }
        if (reVar.r()) {
            c = ' ';
            zE = e(0.0f, (((long) Float.floatToRawIntBits(byuVar.cr(((za) this.c).a))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), reVar.g(), canvasA) || zE;
        } else {
            c = ' ';
        }
        if (reVar.o()) {
            zE = e(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((-((float) yln.v(Float.intBitsToFloat((int) (byuVar.n() >> c))))) + byuVar.cr(this.c.c(byuVar.o())))) & 4294967295L), reVar.e(), canvasA) || zE;
        }
        if (reVar.i()) {
            EdgeEffect edgeEffectA = reVar.a();
            z = e(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (byuVar.n() >> c)))) << c) | (4294967295L & ((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (byuVar.n() & 4294967295L))) + byuVar.cr(((za) this.c).b)))), edgeEffectA, canvasA) || zE;
        } else {
            z = zE;
        }
        if (z) {
            qjVar.h();
        }
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
