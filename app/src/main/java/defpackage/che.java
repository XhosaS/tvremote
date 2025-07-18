package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class che implements Runnable {
    private final chf a;

    public che(chf chfVar) {
        this.a = chfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0095, TryCatch #2 {, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003d, B:9:0x0041, B:10:0x0048, B:11:0x0049, B:12:0x0051, B:16:0x005b, B:18:0x0063, B:19:0x0065, B:23:0x006f, B:25:0x007e, B:33:0x0090, B:29:0x0084, B:30:0x0085, B:32:0x008d, B:37:0x0094, B:20:0x0066, B:21:0x006c, B:13:0x0052, B:14:0x0058), top: B:45:0x0015, inners: #0, #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "Removing command "
            cbx r1 = defpackage.cbx.c()
            java.lang.String r2 = defpackage.chf.a
            java.lang.String r3 = "Checking if commands are complete."
            r1.a(r2, r3)
            chf r1 = r6.a
            r1.b()
            java.util.List r3 = r1.g
            monitor-enter(r3)
            android.content.Intent r4 = r1.h     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L49
            cbx r4 = defpackage.cbx.c()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L95
            android.content.Intent r0 = r1.h     // Catch: java.lang.Throwable -> L95
            r5.append(r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L95
            r4.a(r2, r0)     // Catch: java.lang.Throwable -> L95
            r0 = 0
            java.lang.Object r0 = r3.remove(r0)     // Catch: java.lang.Throwable -> L95
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> L95
            android.content.Intent r2 = r1.h     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L41
            r0 = 0
            r1.h = r0     // Catch: java.lang.Throwable -> L95
            goto L49
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "Dequeue-d command is not the first."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L95
            throw r0     // Catch: java.lang.Throwable -> L95
        L49:
            coe r0 = r1.j     // Catch: java.lang.Throwable -> L95
            cnp r0 = r0.a     // Catch: java.lang.Throwable -> L95
            cgu r2 = r1.f     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r2.d     // Catch: java.lang.Throwable -> L95
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L95
            java.util.Map r2 = r2.c     // Catch: java.lang.Throwable -> L92
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L92
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L85
            java.util.List r2 = r1.g     // Catch: java.lang.Throwable -> L95
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L85
            java.lang.Object r2 = r0.b     // Catch: java.lang.Throwable -> L95
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L95
            java.util.ArrayDeque r0 = r0.a     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L85
            cbx r0 = defpackage.cbx.c()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = defpackage.chf.a     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "No more commands & intents."
            r0.a(r2, r4)     // Catch: java.lang.Throwable -> L95
            chd r0 = r1.i     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L90
            r0.a()     // Catch: java.lang.Throwable -> L95
            goto L90
        L82:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L95
        L85:
            java.util.List r0 = r1.g     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L90
            r1.d()     // Catch: java.lang.Throwable -> L95
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            return
        L92:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.che.run():void");
    }
}
