package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmq {
    public final boolean a;
    public final int b;
    public final wvg c;
    public final boolean d;
    private final iea e;
    private final isw f;

    public jmq(isw iswVar, iea ieaVar, wkx wkxVar, boolean z) {
        this.f = iswVar;
        this.e = ieaVar;
        this.a = z;
        wmc wmcVar = wkxVar.e;
        wmcVar = wmcVar == null ? wmc.a : wmcVar;
        wmcVar.getClass();
        Integer numA = jab.a(wmcVar);
        this.b = numA != null ? numA.intValue() : 139332;
        vvd vvdVar = wvg.g;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        wvg wvgVar = (wvg) objK;
        this.c = wvgVar;
        wkk wkkVar = wvgVar.f;
        this.d = (wkkVar == null ? wkk.a : wkkVar).b == 2;
    }

    public final Object a(boolean z, yih yihVar) {
        wll wllVar = this.c.c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        isw iswVar = this.f;
        wllVar.getClass();
        return ((yql) iswVar.s(new iog(wllVar, ((ksn) ((ldy) this.e).a().g()).a), z)).z(yihVar);
    }
}
