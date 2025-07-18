package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euy implements ewx {
    public final ewx a;
    public boolean b;
    final /* synthetic */ euz c;

    public euy(euz euzVar, ewx ewxVar) {
        this.c = euzVar;
        this.a = ewxVar;
    }

    @Override // defpackage.ewx
    public final int a(long j) {
        if (this.c.q()) {
            return -3;
        }
        return this.a.a(j);
    }

    @Override // defpackage.ewx
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        return !this.c.q() && this.a.dv();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // defpackage.ewx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(defpackage.hig r12, defpackage.ehk r13, int r14) {
        /*
            r11 = this;
            euz r0 = r11.c
            boolean r1 = r0.q()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r11.b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r13.setFlags(r3)
            return r4
        L14:
            long r5 = r0.c()
            ewx r1 = r11.a
            int r14 = r1.e(r12, r13, r14)
            r1 = -5
            r7 = -9223372036854775808
            if (r14 != r1) goto L57
            java.lang.Object r13 = r12.a
            defpackage.a.aq(r13)
            dze r13 = (defpackage.dze) r13
            int r14 = r13.at
            r2 = 0
            if (r14 != 0) goto L34
            int r14 = r13.au
            if (r14 == 0) goto L56
            r14 = r2
        L34:
            long r3 = r0.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3d
            r14 = r2
        L3d:
            long r3 = r0.c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L44
            goto L46
        L44:
            int r2 = r13.au
        L46:
            dzd r0 = new dzd
            r0.<init>(r13)
            r0.H = r14
            r0.I = r2
            dze r13 = new dze
            r13.<init>(r0)
            r12.a = r13
        L56:
            return r1
        L57:
            long r0 = r0.c
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L79
            if (r14 != r4) goto L65
            long r9 = r13.e
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 >= 0) goto L6f
        L65:
            if (r14 != r2) goto L79
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L79
            boolean r12 = r13.d
            if (r12 != 0) goto L79
        L6f:
            r13.clear()
            r13.setFlags(r3)
            r12 = 1
            r11.b = r12
            return r4
        L79:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euy.e(hig, ehk, int):int");
    }
}
