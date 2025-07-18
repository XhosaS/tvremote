package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crx extends csa {
    public crx(List list) {
        super(list);
    }

    @Override // defpackage.crt
    public final /* synthetic */ Object f(cwz cwzVar, float f) {
        return Float.valueOf(l(cwzVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(cwz cwzVar, float f) {
        float f2;
        Object obj = cwzVar.b;
        if (obj == null || cwzVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cxb cxbVar = this.d;
        if (cxbVar != null) {
            f2 = f;
            Float f3 = (Float) cxbVar.b(cwzVar.g, cwzVar.h.floatValue(), (Float) obj, (Float) cwzVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = cwzVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            cwzVar.i = fFloatValue;
        }
        float fFloatValue2 = cwzVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) cwzVar.c).floatValue();
            cwzVar.j = fFloatValue2;
        }
        PointF pointF = cwt.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
