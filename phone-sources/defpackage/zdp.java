package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdp {
    public final zdc a;
    public final zcj b;
    public final bmd c;
    private final List d;
    private final int e;
    private int f;

    public zdp(zdc zdcVar, List list, int i, bmd bmdVar, zcj zcjVar) {
        this.a = zdcVar;
        this.d = list;
        this.e = i;
        this.c = bmdVar;
        this.b = zcjVar;
    }

    public static /* synthetic */ zdp b(zdp zdpVar, int i, bmd bmdVar, zcj zcjVar, int i2) {
        if ((i2 & 1) != 0) {
            i = zdpVar.e;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            bmdVar = zdpVar.c;
        }
        bmd bmdVar2 = bmdVar;
        if ((i2 & 4) != 0) {
            zcjVar = zdpVar.b;
        }
        zcj zcjVar2 = zcjVar;
        zcjVar2.getClass();
        return new zdp(zdpVar.a, zdpVar.d, i3, bmdVar2, zcjVar2);
    }

    public final zcl a(zcj zcjVar) {
        zcjVar.getClass();
        List list = this.d;
        int i = this.e;
        if (i >= list.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f++;
        bmd bmdVar = this.c;
        if (bmdVar != null) {
            if (!((zcy) bmdVar.e).b(zcjVar.a)) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must retain the same host and port");
            }
            if (this.f != 1) {
                throw new IllegalStateException("network interceptor " + list.get(i - 1) + " must call proceed() exactly once");
            }
        }
        int i2 = i + 1;
        zdp zdpVarB = b(this, i2, null, zcjVar, 58);
        zcf zcfVar = (zcf) list.get(i);
        zcl zclVarA = zcfVar.a(zdpVarB);
        if (bmdVar != null && i2 < list.size() && zdpVarB.f != 1) {
            throw new IllegalStateException(a.cj(zcfVar, "network interceptor ", " must call proceed() exactly once"));
        }
        if (zclVarA.g != null) {
            return zclVarA;
        }
        throw new IllegalStateException(a.cj(zcfVar, "interceptor ", " returned a response with no body"));
    }
}
