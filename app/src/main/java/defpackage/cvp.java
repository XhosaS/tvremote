package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvp {
    private static final Interpolator c = new LinearInterpolator();
    static final cwk a = cwk.a("t", "s", "e", "o", "i", "h", "to", "ti");
    static final cwk b = cwk.a("x", "y");

    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.cwz a(defpackage.cwm r20, defpackage.cph r21, float r22, defpackage.cwh r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvp.a(cwm, cph, float, cwh, boolean, boolean):cwz");
    }

    public static cwz b(cwm cwmVar, float f, cwh cwhVar) {
        return new cwz(cwhVar.a(cwmVar, f));
    }

    private static Interpolator c(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = cwt.a;
        pointF.x = Math.max(-1.0f, Math.min(1.0f, f));
        pointF.y = Math.max(-100.0f, Math.min(100.0f, pointF.y));
        pointF2.x = Math.max(-1.0f, Math.min(1.0f, pointF2.x));
        pointF2.y = Math.max(-100.0f, Math.min(100.0f, pointF2.y));
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        ThreadLocal threadLocal = cwy.a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }
}
