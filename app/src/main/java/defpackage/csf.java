package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csf extends csa {
    private final cxc e;

    public csf(List list) {
        super(list);
        this.e = new cxc(1.0f, 1.0f);
    }

    @Override // defpackage.crt
    public final /* bridge */ /* synthetic */ Object f(cwz cwzVar, float f) {
        Object obj;
        float f2;
        Object obj2 = cwzVar.b;
        if (obj2 == null || (obj = cwzVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        cxc cxcVar = (cxc) obj2;
        cxc cxcVar2 = (cxc) obj;
        cxb cxbVar = this.d;
        if (cxbVar != null) {
            f2 = f;
            cxc cxcVar3 = (cxc) cxbVar.b(cwzVar.g, cwzVar.h.floatValue(), cxcVar, cxcVar2, f2, c(), this.c);
            if (cxcVar3 != null) {
                return cxcVar3;
            }
        } else {
            f2 = f;
        }
        cxc cxcVar4 = this.e;
        float f3 = cxcVar.a;
        float f4 = cxcVar2.a;
        PointF pointF = cwt.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = cxcVar.b;
        float f7 = f6 + ((cxcVar2.b - f6) * f2);
        cxcVar4.a = f5;
        cxcVar4.b = f7;
        return cxcVar4;
    }
}
