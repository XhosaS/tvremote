package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozb extends yiz implements yjz {
    Object a;
    long b;
    long c;
    int d;
    final /* synthetic */ oze e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozb(oze ozeVar, yih yihVar) {
        super(2, yihVar);
        this.e = ozeVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ozb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ozb(this.e, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            yio r0 = defpackage.yio.a
            int r1 = r13.d
            r2 = 0
            java.lang.String r4 = "GNP_JOBS_SCHEDULED_TIMESTAMP_MS"
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L24
            if (r1 == r5) goto L19
            long r0 = r13.b
            java.lang.Object r2 = r13.a
            defpackage.ybn.f(r14)
            goto La0
        L19:
            long r5 = r13.c
            long r7 = r13.b
            java.lang.Object r1 = r13.a
            defpackage.ybn.f(r14)
            r14 = r1
            goto L80
        L24:
            defpackage.ybn.f(r14)
            goto L4b
        L28:
            defpackage.ybn.f(r14)
            tvn r14 = defpackage.oze.a
            tuv r14 = r14.l()
            java.lang.String r1 = "Scheduling jobs on startup"
            r14.s(r1)
            oze r14 = r13.e
            xbw r14 = r14.c
            java.lang.Object r14 = r14.b()
            r14.getClass()
            uhp r14 = (defpackage.uhp) r14
            r13.d = r6
            java.lang.Object r14 = defpackage.wae.U(r14, r13)
            if (r14 == r0) goto Ld0
        L4b:
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14
            long r7 = r14.getLong(r4, r2)
            oze r1 = r13.e
            j$.time.Instant r6 = j$.time.Instant.now()
            long r9 = r6.toEpochMilli()
            r11 = -86400000(0xfffffffffad9a400, double:NaN)
            long r11 = r11 + r9
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 >= 0) goto L71
            tvn r14 = defpackage.oze.a
            tuv r14 = r14.l()
            java.lang.String r0 = "Rescheduling startup job interval did not pass, not re-scheduling."
            r14.s(r0)
            ygi r14 = defpackage.ygi.a
            return r14
        L71:
            r13.a = r14
            r13.b = r7
            r13.c = r9
            r13.d = r5
            java.lang.Object r1 = r1.b(r13)
            if (r1 == r0) goto Ld0
            r5 = r9
        L80:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto Lc3
            tvn r1 = defpackage.oze.a
            tuv r1 = r1.l()
            java.lang.String r2 = "Scheduling one-off sync job and canceling migrated jobs"
            r1.s(r2)
            oze r1 = r13.e
            r13.a = r14
            r13.b = r5
            r2 = 3
            r13.d = r2
            java.lang.Object r1 = r1.a(r13)
            if (r1 == r0) goto Ld0
            r2 = r14
            r0 = r5
        La0:
            oze r14 = r13.e
            android.content.Context r14 = r14.e
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r14 = r14.getSystemService(r3)
            r14.getClass()
            android.app.job.JobScheduler r14 = (android.app.job.JobScheduler) r14
            r3 = 1573857706(0x5dcf29aa, float:1.8659562E18)
            r14.cancel(r3)
            r3 = 1573857705(0x5dcf29a9, float:1.865956E18)
            r14.cancel(r3)
            r3 = 1573857707(0x5dcf29ab, float:1.8659563E18)
            r14.cancel(r3)
            r5 = r0
            r14 = r2
        Lc3:
            android.content.SharedPreferences$Editor r14 = r14.edit()
            r14.putLong(r4, r5)
            r14.apply()
            ygi r14 = defpackage.ygi.a
            return r14
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
