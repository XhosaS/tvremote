package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cru extends csa {
    public cru(List list) {
        super(list);
    }

    @Override // defpackage.crt
    public final /* synthetic */ Object f(cwz cwzVar, float f) {
        return Integer.valueOf(l(cwzVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(cwz cwzVar, float f) {
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
        PointF pointF = cwt.a;
        return cwp.a(Math.max(0.0f, Math.min(1.0f, f2)), ((Integer) obj).intValue(), ((Integer) cwzVar.c).intValue());
    }
}
