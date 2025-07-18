package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tth extends trl {
    final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tth(uof uofVar, CharSequence charSequence, String str) {
        super(uofVar, charSequence);
        this.g = str;
    }

    @Override // defpackage.trl
    public final int a(int i) {
        return i + this.g.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r8 = r8 + 1;
     */
    @Override // defpackage.trl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.g
            java.lang.CharSequence r1 = r7.b
            int r2 = r1.length()
            int r3 = r0.length()
            int r2 = r2 - r3
        Ld:
            if (r8 > r2) goto L25
            r4 = 0
        L10:
            if (r4 >= r3) goto L24
            int r5 = r4 + r8
            char r5 = r1.charAt(r5)
            char r6 = r0.charAt(r4)
            if (r5 == r6) goto L21
            int r8 = r8 + 1
            goto Ld
        L21:
            int r4 = r4 + 1
            goto L10
        L24:
            return r8
        L25:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tth.b(int):int");
    }
}
