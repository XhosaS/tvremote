package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class blf extends agvw implements agux {
    public blf(Object obj) {
        super(1, obj, blh.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    @Override // defpackage.agux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r11) {
        /*
            r10 = this;
            java.util.Set r11 = (java.util.Set) r11
            r11.getClass()
            java.lang.Object r0 = r10.c
            blh r0 = (defpackage.blh) r0
            java.util.concurrent.locks.ReentrantLock r1 = r0.e
            r1.lock()
            java.util.Map r0 = r0.d     // Catch: java.lang.Throwable -> La1
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La1
            java.util.List r0 = defpackage.agqq.x(r0)     // Catch: java.lang.Throwable -> La1
            r1.unlock()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r0.next()
            blw r1 = (defpackage.blw) r1
            int[] r2 = r1.b
            int r3 = r2.length
            r4 = 0
            if (r3 == 0) goto L6a
            r5 = 1
            if (r3 == r5) goto L5b
            agsl r5 = new agsl
            r5.<init>()
            r6 = r4
            r7 = r6
        L3b:
            if (r6 >= r3) goto L56
            r8 = r2[r6]
            int r9 = r7 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L52
            java.lang.String[] r8 = r1.c
            r7 = r8[r7]
            r5.add(r7)
        L52:
            int r6 = r6 + 1
            r7 = r9
            goto L3b
        L56:
            java.util.Set r2 = defpackage.agrp.a(r5)
            goto L6c
        L5b:
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L6a
            java.util.Set r2 = r1.d
            goto L6c
        L6a:
            agrf r2 = defpackage.agrf.a
        L6c:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1f
            ble r1 = r1.a
            r2.getClass()
            bln r1 = (defpackage.bln) r1
            blp r1 = r1.b
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.e
            boolean r3 = r3.get()
            if (r3 != 0) goto L1f
            bla r3 = r1.g     // Catch: android.os.RemoteException -> L95
            if (r3 == 0) goto L1f
            int r1 = r1.f     // Catch: android.os.RemoteException -> L95
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: android.os.RemoteException -> L95
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch: android.os.RemoteException -> L95
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: android.os.RemoteException -> L95
            r3.b(r1, r2)     // Catch: android.os.RemoteException -> L95
            goto L1f
        L95:
            r1 = move-exception
            java.lang.String r2 = "ROOM"
            java.lang.String r3 = "Cannot broadcast invalidation"
            android.util.Log.w(r2, r3, r1)
            goto L1f
        L9e:
            agpu r11 = defpackage.agpu.a
            return r11
        La1:
            r11 = move-exception
            r1.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blf.a(java.lang.Object):java.lang.Object");
    }
}
