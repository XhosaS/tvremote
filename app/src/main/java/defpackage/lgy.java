package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgy implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ lhg b;

    public lgy(lhg lhgVar, long j) {
        this.a = j;
        this.b = lhgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            lhg r0 = r7.b
            r0.g()
            r0.i()
            lbk r1 = r0.y
            lab r2 = r1.f
            r1.o(r2)
            kzz r2 = r2.k
            long r3 = r7.a
            java.lang.String r5 = "Activity resumed, time"
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r2.b(r5, r6)
            ktx r2 = r1.d
            kzf r5 = defpackage.kzg.aU
            r6 = 0
            boolean r5 = r2.t(r6, r5)
            if (r5 == 0) goto L37
            boolean r1 = r2.v()
            if (r1 != 0) goto L31
            boolean r1 = r0.b
            if (r1 == 0) goto L50
        L31:
            lhe r1 = r0.d
            r1.a(r3)
            goto L50
        L37:
            boolean r2 = r2.v()
            if (r2 != 0) goto L4b
            lao r2 = r1.e
            r1.m(r2)
            laj r1 = r2.r
            r1.a()
            boolean r1 = r1.a
            if (r1 == 0) goto L50
        L4b:
            lhe r1 = r0.d
            r1.a(r3)
        L50:
            lhc r1 = r0.e
            lhg r2 = r1.b
            r2.g()
            lhb r1 = r1.a
            if (r1 == 0) goto L60
            android.os.Handler r3 = r2.a
            r3.removeCallbacks(r1)
        L60:
            lbk r1 = r2.y
            lao r3 = r1.e
            r1.m(r3)
            laj r3 = r3.r
            r4 = 0
            r3.b(r4)
            r2.g()
            r2.b = r4
            ktx r3 = r1.d
            kzf r4 = defpackage.kzg.aT
            boolean r3 = r3.t(r6, r4)
            if (r3 == 0) goto L99
            lbk r2 = r2.y
            leo r3 = r2.l
            r2.n(r3)
            boolean r4 = r3.h
            if (r4 == 0) goto L99
            lab r4 = r1.f
            r1.o(r4)
            kzz r1 = r4.k
            java.lang.String r4 = "Retrying trigger URI registration in foreground"
            r1.a(r4)
            r2.n(r3)
            r3.x()
        L99:
            lhf r0 = r0.c
            lhg r1 = r0.a
            r1.g()
            lbk r2 = r1.y
            boolean r2 = r2.s()
            if (r2 != 0) goto La9
            return
        La9:
            lbk r1 = r1.y
            klk r1 = r1.B
            long r1 = java.lang.System.currentTimeMillis()
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgy.run():void");
    }
}
