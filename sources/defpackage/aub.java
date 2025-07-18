package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aub {
    public final String a;
    public final boolean b;
    public final cym c;
    public final cww d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final avx h;
    public final boolean i;
    public final int j;
    public final Predicate k;
    public final asa l;
    public final int m;

    public aub() {
        throw null;
    }

    public static aua a() {
        aua auaVar = new aua();
        auaVar.c(false);
        auaVar.d(false);
        auaVar.b(0);
        auaVar.g(false);
        auaVar.e(Integer.MAX_VALUE);
        auaVar.f = new bma(1);
        return auaVar;
    }

    public final boolean equals(Object obj) {
        cww cwwVar;
        String str;
        Long l;
        asa asaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aub) {
            aub aubVar = (aub) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(aubVar.a) : aubVar.a == null) {
                if (this.b == aubVar.b && this.c.equals(aubVar.c) && ((cwwVar = this.d) != null ? cwwVar.equals(aubVar.d) : aubVar.d == null) && ((str = this.e) != null ? str.equals(aubVar.e) : aubVar.e == null) && ((l = this.f) != null ? l.equals(aubVar.f) : aubVar.f == null) && this.g == aubVar.g) {
                    if (this.h != null) {
                        avx avxVar = aubVar.h;
                        throw null;
                    }
                    if (aubVar.h == null && this.i == aubVar.i && this.j == aubVar.j && this.k.equals(aubVar.k) && ((asaVar = this.l) != null ? asaVar.equals(aubVar.l) : aubVar.l == null) && this.m == aubVar.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        cym cymVar = this.c;
        if (cymVar.A()) {
            iJ = cymVar.j();
        } else {
            int iJ3 = cymVar.s;
            if (iJ3 == 0) {
                iJ3 = cymVar.j();
                cymVar.s = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode ^ iJ) * 1000003;
        cww cwwVar = this.d;
        if (cwwVar == null) {
            iJ2 = 0;
        } else if (cwwVar.A()) {
            iJ2 = cwwVar.j();
        } else {
            int iJ4 = cwwVar.s;
            if (iJ4 == 0) {
                iJ4 = cwwVar.j();
                cwwVar.s = iJ4;
            }
            iJ2 = iJ4;
        }
        int i2 = (i ^ iJ2) * 1000003;
        String str2 = this.e;
        int iHashCode2 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i3 = true != this.g ? 1237 : 1231;
        if (this.h != null) {
            throw null;
        }
        int iHashCode4 = (((((((iHashCode3 ^ i3) * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        asa asaVar = this.l;
        return ((iHashCode4 ^ (asaVar != null ? asaVar.hashCode() : 0)) * 1000003) ^ this.m;
    }

    public final String toString() {
        asa asaVar = this.l;
        Predicate predicate = this.k;
        avx avxVar = this.h;
        cww cwwVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + String.valueOf(this.c) + ", metricExtension=" + String.valueOf(cwwVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", activeCuiId=" + String.valueOf(avxVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + String.valueOf(predicate) + ", debugLogsTime=" + String.valueOf(asaVar) + ", debugLogsSize=" + this.m + "}";
    }

    public aub(String str, boolean z, cym cymVar, cww cwwVar, String str2, Long l, boolean z2, avx avxVar, boolean z3, int i, Predicate predicate, asa asaVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = cymVar;
        this.d = cwwVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = avxVar;
        this.i = z3;
        this.j = i;
        this.k = predicate;
        this.l = asaVar;
        this.m = i2;
    }
}
