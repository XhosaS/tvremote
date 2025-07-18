package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjn {
    public final String a;
    public final vvj b;
    public final uao c;
    public final Integer d;
    public final ntm e;
    public final int[] f;
    public final int[] g;
    public final nte h;
    public final int i;

    public pjn() {
        throw null;
    }

    public static tad a() {
        tad tadVar = new tad();
        tadVar.g();
        return tadVar;
    }

    public final boolean equals(Object obj) {
        uao uaoVar;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjn) {
            pjn pjnVar = (pjn) obj;
            if (this.a.equals(pjnVar.a) && this.b.equals(pjnVar.b) && ((uaoVar = this.c) != null ? uaoVar.equals(pjnVar.c) : pjnVar.c == null) && ((num = this.d) != null ? num.equals(pjnVar.d) : pjnVar.d == null)) {
                int i = this.i;
                int i2 = pjnVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    ntm ntmVar = pjnVar.e;
                    boolean z = pjnVar instanceof pjn;
                    if (Arrays.equals(this.f, z ? pjnVar.f : pjnVar.f)) {
                        if (Arrays.equals(this.g, z ? pjnVar.g : pjnVar.g)) {
                            nte nteVar = this.h;
                            nte nteVar2 = pjnVar.h;
                            if (nteVar != null ? nteVar.equals(nteVar2) : nteVar2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        uao uaoVar = this.c;
        if (uaoVar == null) {
            iJ = 0;
        } else if (uaoVar.A()) {
            iJ = uaoVar.j();
        } else {
            int iJ2 = uaoVar.M;
            if (iJ2 == 0) {
                iJ2 = uaoVar.j();
                uaoVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int i = ((iHashCode * 1000003) ^ iJ) * 1000003;
        Integer num = this.d;
        int iHashCode2 = i ^ (num == null ? 0 : num.hashCode());
        a.bw(this.i);
        int iHashCode3 = ((((((iHashCode2 * 583896283) ^ 1) * (-721379959)) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003;
        nte nteVar = this.h;
        return iHashCode3 ^ (nteVar != null ? nteVar.hashCode() : 0);
    }

    public final String toString() {
        uao uaoVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(uaoVar);
        String string = this.i != 0 ? Integer.toString(0) : "null";
        int[] iArr = this.f;
        int[] iArr2 = this.g;
        nte nteVar = this.h;
        return "ClearcutData{logSource=" + this.a + ", message=" + strValueOf + ", visualElements=" + strValueOf2 + ", eventCode=" + this.d + ", wallTime=null, elapsedTime=null, qosTier=" + string + ", logVerifier=null, experimentIds=" + Arrays.toString(iArr) + ", testCodes=" + Arrays.toString(iArr2) + ", complianceProductData=" + String.valueOf(nteVar) + "}";
    }

    public pjn(String str, vvj vvjVar, uao uaoVar, Integer num, int[] iArr, int[] iArr2, nte nteVar) {
        this.a = str;
        this.b = vvjVar;
        this.c = uaoVar;
        this.d = num;
        this.i = 1;
        this.e = null;
        this.f = iArr;
        this.g = iArr2;
        this.h = nteVar;
    }
}
