package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaeo implements aaff {
    private final aaff[] a;
    private final int b;

    public aaeo(aaff[] aaffVarArr) {
        int iA;
        this.a = aaffVarArr;
        int length = aaffVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            aaff aaffVar = aaffVarArr[length];
            if (aaffVar != null && (iA = aaffVar.a()) > i) {
                i = iA;
            }
        }
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (r4 > r12) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r4 != r12) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        return ~r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        r10.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        return r4;
     */
    @Override // defpackage.aaff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.aafb r10, java.lang.CharSequence r11, int r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r10.b()
            r1 = 0
            r2 = 0
            r4 = r12
            r5 = r4
            r3 = r1
        L9:
            aaff[] r6 = r9.a
            int r7 = r6.length
            if (r3 >= r7) goto L41
            r8 = r6[r3]
            if (r8 != 0) goto L17
            if (r4 <= r12) goto L16
            r1 = 1
            goto L41
        L16:
            return r12
        L17:
            int r8 = r8.c(r10, r11, r12)
            if (r8 < r12) goto L35
            if (r8 <= r4) goto L3b
            int r2 = r11.length()
            if (r8 >= r2) goto L34
            int r2 = r3 + 1
            if (r2 >= r7) goto L34
            r2 = r6[r2]
            if (r2 != 0) goto L2e
            goto L34
        L2e:
            java.lang.Object r2 = r10.b()
            r4 = r8
            goto L3b
        L34:
            return r8
        L35:
            if (r8 >= 0) goto L3b
            int r6 = ~r8
            if (r6 <= r5) goto L3b
            r5 = r6
        L3b:
            r10.h(r0)
            int r3 = r3 + 1
            goto L9
        L41:
            if (r4 > r12) goto L4a
            if (r4 != r12) goto L48
            if (r1 == 0) goto L48
            goto L4a
        L48:
            int r10 = ~r5
            return r10
        L4a:
            if (r2 == 0) goto L4f
            r10.h(r2)
        L4f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeo.c(aafb, java.lang.CharSequence, int):int");
    }
}
