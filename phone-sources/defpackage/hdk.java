package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdk extends hdn {
    public hdk(List list) {
        super(list);
    }

    @Override // defpackage.hdg
    public final /* bridge */ /* synthetic */ Object f(hhs hhsVar, float f) {
        return Float.valueOf(l(hhsVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(hhs hhsVar, float f) {
        float f2;
        Object obj = hhsVar.b;
        if (obj == null || hhsVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hhu hhuVar = this.d;
        if (hhuVar != null) {
            f2 = f;
            Float f3 = (Float) hhuVar.b(hhsVar.g, hhsVar.h.floatValue(), (Float) obj, (Float) hhsVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = hhsVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            hhsVar.i = fFloatValue;
        }
        float fFloatValue2 = hhsVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) hhsVar.c).floatValue();
            hhsVar.j = fFloatValue2;
        }
        PointF pointF = hhm.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
