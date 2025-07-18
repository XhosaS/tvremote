package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qob implements qns {
    public static final tvn a = tvn.n("GnpSdk");
    public final GnpPerAccountRoomDatabase b;
    private final yil c;

    public qob(GnpPerAccountRoomDatabase gnpPerAccountRoomDatabase, yil yilVar) {
        this.b = gnpPerAccountRoomDatabase;
        this.c = yilVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, defpackage.yih r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.qnz
            if (r0 == 0) goto L13
            r0 = r8
            qnz r0 = (defpackage.qnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qnz r0 = new qnz
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r8)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r6 = move-exception
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r8)
            com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase r8 = r5.b     // Catch: java.lang.Throwable -> L27
            qoa r2 = new qoa     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            yil r6 = r5.c     // Catch: java.lang.Throwable -> L27
            pfd r7 = new pfd     // Catch: java.lang.Throwable -> L27
            r3 = 15
            r7.<init>(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = defpackage.ykr.l(r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L51
            return r1
        L4e:
            defpackage.ybn.e(r6)
        L51:
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qob.a(long, yih):java.lang.Object");
    }
}
