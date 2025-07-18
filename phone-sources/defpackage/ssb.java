package defpackage;

import java.util.HashMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssb {
    public final String a;
    public final Function b;
    public final Function c;
    public final boolean d;
    public final Function e;
    public final ssa f;
    public final Function g;
    public final Function h;
    public final HashMap i;

    public ssb(String str, Function function, Function function2, boolean z, Function function3, ssa ssaVar, Function function4) {
        this.i = new HashMap();
        this.a = str;
        this.b = function;
        this.c = function2;
        this.d = z;
        this.e = function3;
        this.f = ssaVar;
        this.g = function4;
        this.h = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double a(double r21, double r23) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssb.a(double, double):double");
    }

    public final double b(ssc sscVar) {
        double dMin;
        double d = sscVar.c;
        Function function = this.g;
        if (function == null) {
            double dDoubleValue = ((Double) this.c.apply(sscVar)).doubleValue();
            Function function2 = this.e;
            if (function2 == null) {
                return dDoubleValue;
            }
            double dB = ((ssb) function2.apply(sscVar)).b(sscVar);
            double dA = this.f.a(d);
            if (sis.b(dB, dDoubleValue) < dA) {
                dDoubleValue = a(dB, dA);
            }
            if (d < 0.0d) {
                dDoubleValue = a(dB, dA);
            }
            return (!this.d || dDoubleValue < 50.0d || dDoubleValue >= 60.0d) ? dDoubleValue : sis.b(49.0d, dB) >= dA ? 49.0d : 60.0d;
        }
        rza rzaVar = (rza) function.apply(sscVar);
        Object obj = rzaVar.b;
        Object obj2 = rzaVar.c;
        int i = rzaVar.a;
        double dB2 = ((ssb) this.e.apply(sscVar)).b(sscVar);
        String str = this.a;
        ssb ssbVar = (ssb) obj;
        String str2 = ssbVar.a;
        double d2 = true != sscVar.b ? -1.0d : 1.0d;
        ssa ssaVar = ssbVar.f;
        boolean zEquals = str.equals(str2);
        double dA2 = ssaVar.a(d);
        ssb ssbVar2 = (ssb) obj2;
        double d3 = d2;
        double dA3 = ssbVar2.f.a(d);
        double dDoubleValue2 = ((Double) ssbVar.c.apply(sscVar)).doubleValue();
        if (sis.b(dB2, dDoubleValue2) < dA2) {
            dDoubleValue2 = a(dB2, dA2);
        }
        double dDoubleValue3 = ((Double) ssbVar2.c.apply(sscVar)).doubleValue();
        if (sis.b(dB2, dDoubleValue3) < dA3) {
            dDoubleValue3 = a(dB2, dA3);
        }
        if (d < 0.0d) {
            dDoubleValue2 = a(dB2, dA2);
            dDoubleValue3 = a(dB2, dA3);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d3 < 10.0d) {
            double d4 = d3 * 10.0d;
            dDoubleValue3 = sik.i(100.0d, dDoubleValue2 + d4);
            if ((dDoubleValue3 - dDoubleValue2) * d3 < 10.0d) {
                dDoubleValue2 = sik.i(100.0d, dDoubleValue3 - d4);
            }
        }
        if (dDoubleValue2 < 50.0d || dDoubleValue2 >= 60.0d) {
            dMin = (dDoubleValue3 < 50.0d || dDoubleValue3 >= 60.0d) ? dDoubleValue3 : d3 > 0.0d ? 60.0d : 49.0d;
        } else if (d3 > 0.0d) {
            dMin = Math.max(dDoubleValue3, 70.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dMin = Math.min(dDoubleValue3, 39.0d);
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dMin;
    }

    public ssb(Function function, Function function2, Function function3) {
        this.i = new HashMap();
        this.a = "control_highlight";
        this.b = function;
        this.c = function2;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = function3;
    }
}
