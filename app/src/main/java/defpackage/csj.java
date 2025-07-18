package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csj extends csa {
    public csj(List list) {
        super(list);
    }

    @Override // defpackage.crt
    public final /* bridge */ /* synthetic */ Object f(cwz cwzVar, float f) {
        Object obj;
        cxb cxbVar = this.d;
        if (cxbVar == null) {
            return (f != 1.0f || (obj = cwzVar.c) == null) ? (csp) cwzVar.b : (csp) obj;
        }
        float f2 = cwzVar.g;
        Float f3 = cwzVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        csp cspVar = (csp) cwzVar.b;
        Object obj2 = cwzVar.c;
        return (csp) cxbVar.b(f2, fFloatValue, cspVar, obj2 == null ? cspVar : (csp) obj2, f, b(), this.c);
    }
}
