package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc extends ack implements bod {
    public bqz a;
    public final /* synthetic */ bqv b;

    public boc() {
        super("com.google.android.tv.remote.service.IndirectParcelFileDescriptor");
    }

    private final synchronized bqz b() {
        bqz bqzVar;
        bqzVar = this.a;
        this.a = null;
        return bqzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // defpackage.ack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean z(int r6, android.os.Parcel r7, android.os.Parcel r8) throws java.io.IOException {
        /*
            r5 = this;
            r7 = 1
            if (r6 != r7) goto L54
            bqz r6 = r5.b()
            java.lang.String r0 = "AssistantServiceLauncher.java"
            java.lang.String r1 = "com/google/android/tv/remote/service/audio/provider/AssistantServiceLauncher$IndirectPfd"
            r2 = 0
            if (r6 != 0) goto L24
            cbt r6 = defpackage.bqv.a
            cch r6 = r6.g()
            java.lang.String r3 = "getParcelFileDescriptor"
            r4 = 226(0xe2, float:3.17E-43)
            cch r6 = r6.j(r1, r3, r4, r0)
            cbs r6 = (defpackage.cbs) r6
            java.lang.String r0 = "Requested PFD is already null"
            r6.p(r0)
            goto L4d
        L24:
            android.os.ParcelFileDescriptor r3 = r6.e()
            if (r3 == 0) goto L4c
            int r6 = r6.f
            int r4 = android.os.Binder.getCallingUid()
            if (r4 == r6) goto L4c
            r3.close()     // Catch: java.io.IOException -> L36
            goto L4d
        L36:
            cbt r6 = defpackage.bqv.a
            cch r6 = r6.g()
            java.lang.String r3 = "close"
            r4 = 242(0xf2, float:3.39E-43)
            cch r6 = r6.j(r1, r3, r4, r0)
            cbs r6 = (defpackage.cbs) r6
            java.lang.String r0 = "Unable to close remote PFD"
            r6.p(r0)
            goto L4d
        L4c:
            r2 = r3
        L4d:
            r8.writeNoException()
            defpackage.acl.d(r8, r2)
            return r7
        L54:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boc.z(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc(bqv bqvVar, int i, String str) {
        super("com.google.android.tv.remote.service.IndirectParcelFileDescriptor");
        this.b = bqvVar;
        this.a = new bqz(bqvVar.c, i, str, new bid(this, 20));
    }
}
