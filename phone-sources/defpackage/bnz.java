package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnz extends boj {
    private final List a;
    private final List b;
    private final long c;
    private final long d;
    private final int e = 0;

    public bnz(List list, List list2, long j, long j2) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.boj
    public final Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        List list = this.a;
        List list2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat3);
        bnj.d(list, list2);
        long jFloatToRawIntBits4 = (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
        long j4 = (jFloatToRawIntBits << 32) | jFloatToRawIntBits2;
        long j5 = 4294967295L & j4;
        int i5 = (int) (jFloatToRawIntBits4 & 4294967295L);
        int iC = bnj.c(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) j5), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat(i5), bnj.f(list, iC), bnj.e(list2, list, iC), bnj.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnz)) {
            return false;
        }
        bnz bnzVar = (bnz) obj;
        if (!yks.e(this.a, bnzVar.a) || !yks.e(this.b, bnzVar.b) || !a.s(this.c, bnzVar.c) || !a.s(this.d, bnzVar.d)) {
            return false;
        }
        int i = bnzVar.e;
        return a.r(0, 0);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return (((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + a.k(this.c)) * 31) + a.k(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) bmx.d(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) bmx.d(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=" + ((Object) boo.a()) + ')';
    }
}
