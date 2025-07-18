package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdt {
    public long a;
    public final Object b;

    public zdt(View view) {
        this.a = -1L;
        this.b = view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zgm] */
    public final String a() {
        String strQ = this.b.q(this.a);
        this.a -= strQ.length();
        return strQ;
    }

    public final zcc b() {
        upq upqVar = new upq((byte[]) null, (byte[]) null);
        while (true) {
            String strA = a();
            if (strA.length() == 0) {
                return upqVar.t();
            }
            int iT = ylh.T(strA, ':', 1, 4);
            if (iT != -1) {
                String strSubstring = strA.substring(0, iT);
                strSubstring.getClass();
                String strSubstring2 = strA.substring(iT + 1);
                strSubstring2.getClass();
                upqVar.v(strSubstring, strSubstring2);
            } else if (strA.charAt(0) == ':') {
                String strSubstring3 = strA.substring(1);
                strSubstring3.getClass();
                upqVar.v("", strSubstring3);
            } else {
                upqVar.v("", strA);
            }
        }
    }

    public final float c(long j) {
        return Float.intBitsToFloat((int) (this.b == uv.b ? j >> 32 : j & 4294967295L));
    }

    public final long d(bsz bszVar, float f) {
        long jD = a.D(this.a, a.at(bszVar.c, bszVar.g));
        this.a = jD;
        Object obj = this.b;
        if ((obj == null ? bmx.a(jD) : Math.abs(c(jD))) < f) {
            return 9205357640488583168L;
        }
        if (obj == null) {
            float fA = bmx.a(this.a);
            return a.at(this.a, bmx.c((4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 & 4294967295L)) / fA)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 >> 32)) / fA) << 32), f));
        }
        float fC = c(this.a) - (Math.signum(c(this.a)) * f);
        long j = this.a;
        uv uvVar = uv.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (obj == uvVar ? j & 4294967295L : j >> 32));
        if (obj == uvVar) {
            return (Float.floatToRawIntBits(fC) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fC));
    }

    public final void e() {
        this.a = 0L;
    }

    public zdt(uv uvVar, long j) {
        this.b = uvVar;
        this.a = j;
    }

    public zdt(zgm zgmVar) {
        this.b = zgmVar;
        this.a = 262144L;
    }
}
