package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhb implements Runnable {
    final long a;
    final long b;
    final /* synthetic */ lhc c;

    public lhb(lhc lhcVar, long j, long j2) {
        this.c = lhcVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lbk lbkVar = this.c.b.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new Runnable() { // from class: lha
            /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r10 = this;
                    lhb r0 = r10.a
                    lhc r1 = r0.c
                    lhg r1 = r1.b
                    r1.g()
                    lbk r2 = r1.y
                    lab r3 = r2.f
                    r2.o(r3)
                    kzz r4 = r3.j
                    java.lang.String r5 = "Application going to the background"
                    r4.a(r5)
                    lao r4 = r2.e
                    r2.m(r4)
                    laj r4 = r4.r
                    r5 = 1
                    r4.b(r5)
                    r1.g()
                    r1.b = r5
                    ktx r4 = r2.d
                    boolean r6 = r4.v()
                    if (r6 != 0) goto L3c
                    long r6 = r0.b
                    lhe r8 = r1.d
                    r9 = 0
                    r8.b(r9, r9, r6)
                    kuj r6 = r8.c
                    r6.a()
                L3c:
                    long r6 = r0.a
                    r2.o(r3)
                    kzz r0 = r3.i
                    java.lang.String r8 = "Application backgrounded at: timestamp_millis"
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r0.b(r8, r6)
                    lbk r0 = r1.y
                    leo r1 = r0.l
                    r0.n(r1)
                    r1.g()
                    r1.a()
                    lbk r1 = r1.y
                    lgp r6 = r1.k()
                    r6.g()
                    r6.a()
                    boolean r7 = r6.z()
                    if (r7 != 0) goto L6c
                    goto L7c
                L6c:
                    lbk r6 = r6.y
                    lio r7 = r6.i
                    r6.m(r7)
                    int r6 = r7.n()
                    r7 = 242600(0x3b3a8, float:3.39955E-40)
                    if (r6 < r7) goto L92
                L7c:
                    lgp r1 = r1.k()
                    r1.g()
                    r1.a()
                    com.google.android.gms.measurement.internal.AppMetadata r5 = r1.i(r5)
                    lfu r6 = new lfu
                    r6.<init>(r1, r5)
                    r1.p(r6)
                L92:
                    r1 = 0
                    kzf r5 = defpackage.kzg.aN
                    boolean r1 = r4.t(r1, r5)
                    if (r1 == 0) goto Ld0
                    lio r1 = r2.i
                    r2.m(r1)
                    android.content.Context r5 = r2.a
                    java.lang.String r6 = r5.getPackageName()
                    java.lang.String r7 = r4.a
                    boolean r1 = r1.ai(r6, r7)
                    if (r1 == 0) goto Lb1
                    r4 = 1000(0x3e8, double:4.94E-321)
                    goto Lbb
                Lb1:
                    java.lang.String r1 = r5.getPackageName()
                    kzf r5 = defpackage.kzg.E
                    long r4 = r4.m(r1, r5)
                Lbb:
                    r2.o(r3)
                    kzz r1 = r3.k
                    java.lang.String r2 = "[sgtm] Scheduling batch upload with minimum latency in millis"
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.b(r2, r3)
                    lev r0 = r0.j()
                    r0.k(r4)
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lha.run():void");
            }
        });
    }
}
