package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crz extends csa {
    public crz(List list) {
        super(list);
    }

    @Override // defpackage.crt
    public final /* synthetic */ Object f(cwz cwzVar, float f) {
        return Integer.valueOf(k(cwzVar, f));
    }

    public final int k(cwz cwzVar, float f) {
        float f2;
        Object obj = cwzVar.b;
        if (obj == null || cwzVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cxb cxbVar = this.d;
        if (cxbVar != null) {
            f2 = f;
            Integer num = (Integer) cxbVar.b(cwzVar.g, cwzVar.h.floatValue(), (Integer) obj, (Integer) cwzVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iIntValue = cwzVar.k;
        if (iIntValue == 784923401) {
            iIntValue = ((Integer) obj).intValue();
            cwzVar.k = iIntValue;
        }
        int iIntValue2 = cwzVar.l;
        if (iIntValue2 == 784923401) {
            iIntValue2 = ((Integer) cwzVar.c).intValue();
            cwzVar.l = iIntValue2;
        }
        PointF pointF = cwt.a;
        return (int) (iIntValue + ((iIntValue2 - iIntValue) * f2));
    }
}
