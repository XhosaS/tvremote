package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaen implements aafh, aaff {
    protected final int a;
    protected final int b;
    private final aabo c;

    protected aaen(aabo aaboVar, int i, int i2) {
        this.c = aaboVar;
        this.a = i;
        this.b = i2 > 18 ? 18 : i2;
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        aabm aabmVarA = this.c.a(aafbVar.a);
        int iMin = Math.min(this.b, charSequence.length() - i);
        long jE = aabmVarA.s().e() * 10;
        int i2 = 0;
        long j = 0;
        while (i2 < iMin) {
            char cCharAt = charSequence.charAt(i + i2);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            jE /= 10;
            j += (cCharAt - '0') * jE;
            i2++;
        }
        long j2 = j / 10;
        if (i2 == 0 || j2 > 2147483647L) {
            return ~i;
        }
        int i3 = i + i2;
        aafbVar.c().c(new aaea(aabo.x, aady.a, aabmVarA.s()), (int) j2);
        return i3;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        aabk aabkVar = ((aacb) aachVar).b;
        f(appendable, aabkVar.N(aachVar), aabkVar);
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        f(appendable, j, aabkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[ADDED_TO_REGION, LOOP:4: B:48:0x00d0->B:49:0x00d2, LOOP_START, PHI: r1
  0x00d0: PHI (r1v4 int) = (r1v3 int), (r1v5 int) binds: [B:47:0x00ce, B:49:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(java.lang.Appendable r10, long r11, defpackage.aabk r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaen.f(java.lang.Appendable, long, aabk):void");
    }
}
