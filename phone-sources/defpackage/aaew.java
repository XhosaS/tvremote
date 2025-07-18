package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaew implements aafh, aaff {
    private final aabo a;
    private final int b;
    private final boolean c;

    public aaew(aabo aaboVar, int i, boolean z) {
        this.a = aaboVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.aafh
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0038 A[SYNTHETIC] */
    @Override // defpackage.aaff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.aafb r12, java.lang.CharSequence r13, int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaew.c(aafb, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        aabo aaboVar = this.a;
        int i = -1;
        if (aachVar.f(aaboVar)) {
            try {
                int iB = aachVar.b(aaboVar);
                if (iB < 0) {
                    iB = -iB;
                }
                i = iB % 100;
            } catch (RuntimeException unused) {
            }
        }
        if (i >= 0) {
            aafd.b(appendable, i, 2);
        } else {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        }
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        int i2;
        try {
            int iA = this.a.a(aabkVar).a(j);
            if (iA < 0) {
                iA = -iA;
            }
            i2 = iA % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            aafd.b(appendable, i2, 2);
        } else {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        }
    }
}
