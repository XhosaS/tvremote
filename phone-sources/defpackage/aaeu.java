package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaeu implements aafh, aaff {
    private final int a;

    public aaeu(int i) {
        this.a = i;
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        Map map = aabp.a;
        String str = null;
        for (String str2 : map.keySet()) {
            if (aaey.c(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        aafbVar.f((aabs) map.get(str));
        return i + str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[PHI: r7
  0x0088: PHI (r7v11 java.lang.String) = (r7v7 java.lang.String), (r7v16 java.lang.String) binds: [B:38:0x007d, B:21:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aafh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Appendable r4, long r5, defpackage.aabk r7, int r8, defpackage.aabs r9, java.util.Locale r10) throws java.io.IOException {
        /*
            r3 = this;
            if (r9 != 0) goto L6
            java.lang.String r5 = ""
            goto L89
        L6:
            long r7 = (long) r8
            long r5 = r5 - r7
            int r7 = r3.a
            r8 = 0
            if (r7 == 0) goto L4b
            if (r10 != 0) goto L13
            java.util.Locale r10 = java.util.Locale.getDefault()
        L13:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L1d
            java.lang.String r5 = r9.e
            goto L89
        L1d:
            aaga r0 = defpackage.aabs.f
            boolean r1 = r0 instanceof defpackage.aaga
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r7 = r9.e
            boolean r1 = r9.o(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L31
            goto L3c
        L31:
            r7 = r7[r2]
            goto L40
        L34:
            java.lang.String r1 = r9.e
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L3e
        L3c:
            r7 = r8
            goto L40
        L3e:
            r7 = r7[r2]
        L40:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.aabs.k(r5)
            goto L89
        L4b:
            if (r10 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.getDefault()
        L51:
            java.lang.String r7 = r9.g(r5)
            if (r7 != 0) goto L5a
            java.lang.String r5 = r9.e
            goto L89
        L5a:
            aaga r0 = defpackage.aabs.f
            boolean r1 = r0 instanceof defpackage.aaga
            r2 = 1
            if (r1 == 0) goto L71
            java.lang.String r7 = r9.e
            boolean r1 = r9.o(r5)
            java.lang.String[] r7 = r0.b(r10, r7, r1)
            if (r7 != 0) goto L6e
            goto L79
        L6e:
            r7 = r7[r2]
            goto L7d
        L71:
            java.lang.String r1 = r9.e
            java.lang.String[] r7 = r0.a(r10, r1, r7)
            if (r7 != 0) goto L7b
        L79:
            r7 = r8
            goto L7d
        L7b:
            r7 = r7[r2]
        L7d:
            if (r7 != 0) goto L88
            int r5 = r9.a(r5)
            java.lang.String r5 = defpackage.aabs.k(r5)
            goto L89
        L88:
            r5 = r7
        L89:
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeu.e(java.lang.Appendable, long, aabk, int, aabs, java.util.Locale):void");
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) {
    }
}
