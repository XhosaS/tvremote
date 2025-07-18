package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class aaep implements aafh, aaff {
    protected final aabo a;
    protected final int b;
    protected final boolean c;

    public aaep(aabo aaboVar, int i, boolean z) {
        this.a = aaboVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(defpackage.aafb r12, java.lang.CharSequence r13, int r14) {
        /*
            r11 = this;
            int r0 = r13.length()
            int r0 = r0 - r14
            int r1 = r11.b
            int r0 = java.lang.Math.min(r1, r0)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        Lf:
            r5 = 1
            if (r2 >= r0) goto L5a
            int r6 = r14 + r2
            char r6 = r13.charAt(r6)
            r7 = 57
            r8 = 48
            if (r2 != 0) goto L52
            r2 = 45
            r9 = 43
            if (r6 == r2) goto L2a
            if (r6 != r9) goto L28
            r6 = r9
            goto L2a
        L28:
            r2 = r1
            goto L52
        L2a:
            boolean r10 = r11.c
            if (r10 == 0) goto L28
            if (r6 != r2) goto L32
            r3 = r5
            goto L33
        L32:
            r3 = r1
        L33:
            if (r6 != r9) goto L37
            r4 = r5
            goto L38
        L37:
            r4 = r1
        L38:
            if (r0 <= r5) goto L5b
            int r2 = r14 + 1
            char r2 = r13.charAt(r2)
            if (r2 < r8) goto L5b
            if (r2 <= r7) goto L45
            goto L5b
        L45:
            int r0 = r0 + 1
            int r2 = r13.length()
            int r2 = r2 - r14
            int r0 = java.lang.Math.min(r0, r2)
            r2 = r5
            goto Lf
        L52:
            if (r6 < r8) goto L5a
            if (r6 <= r7) goto L57
            goto L5a
        L57:
            int r2 = r2 + 1
            goto Lf
        L5a:
            r1 = r2
        L5b:
            if (r1 != 0) goto L5e
            goto Lae
        L5e:
            r0 = 9
            if (r1 < r0) goto L80
            int r1 = r1 + r14
            if (r4 == 0) goto L73
            int r14 = r14 + r5
            java.lang.CharSequence r13 = r13.subSequence(r14, r1)
            java.lang.String r13 = r13.toString()
            int r13 = java.lang.Integer.parseInt(r13)
            goto La8
        L73:
            java.lang.CharSequence r13 = r13.subSequence(r14, r1)
            java.lang.String r13 = r13.toString()
            int r13 = java.lang.Integer.parseInt(r13)
            goto La8
        L80:
            if (r3 != 0) goto L87
            if (r4 == 0) goto L85
            goto L87
        L85:
            r0 = r14
            goto L89
        L87:
            int r0 = r14 + 1
        L89:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)     // Catch: java.lang.StringIndexOutOfBoundsException -> Lae
            int r0 = r0 + (-48)
            int r1 = r1 + r14
        L92:
            if (r2 >= r1) goto La3
            int r14 = r0 << 3
            int r0 = r0 + r0
            int r4 = r2 + 1
            char r2 = r13.charAt(r2)
            int r14 = r14 + r0
            int r14 = r14 + r2
            int r0 = r14 + (-48)
            r2 = r4
            goto L92
        La3:
            if (r3 == 0) goto La7
            int r13 = -r0
            goto La8
        La7:
            r13 = r0
        La8:
            aabo r14 = r11.a
            r12.d(r14, r13)
            return r1
        Lae:
            int r12 = ~r14
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaep.c(aafb, java.lang.CharSequence, int):int");
    }
}
