package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bof extends boj {
    private final List a;
    private final long c;
    private final List b = null;
    private final float d = Float.POSITIVE_INFINITY;
    private final int e = 0;

    public bof(List list, long j) {
        this.a = list;
        this.c = j;
    }

    @Override // defpackage.boj
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jP = d.p(j);
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP >> 32));
            fIntBitsToFloat = Float.intBitsToFloat((int) (jP & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = fIntBitsToFloat3;
        }
        List list = this.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
        float fB = bna.b(j) / 2.0f;
        bnj.d(list, null);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (jFloatToRawIntBits << 32);
        long j3 = 4294967295L & jFloatToRawIntBits2;
        int iC = bnj.c(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) j3), fB, bnj.f(list, iC), bnj.e(null, list, iC), bnj.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bof)) {
            return false;
        }
        bof bofVar = (bof) obj;
        if (!yks.e(this.a, bofVar.a)) {
            return false;
        }
        List list = bofVar.b;
        if (!yks.e(null, null) || !a.s(this.c, bofVar.c)) {
            return false;
        }
        float f = bofVar.d;
        int i = bofVar.e;
        return a.r(0, 0);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + a.k(this.c)) * 31) + Float.floatToIntBits(Float.POSITIVE_INFINITY)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) bmx.d(j)) + ", ";
        } else {
            str = "";
        }
        return "RadialGradient(colors=" + this.a + ", stops=null, " + str + ((Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) < 2139095040 ? "radius=Infinity, " : "") + "tileMode=" + ((Object) boo.a()) + ')';
    }
}
