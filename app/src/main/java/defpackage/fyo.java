package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyo extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ fyp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyo(String str, fyp fypVar, agsw agswVar) {
        super(2, agswVar);
        this.c = str;
        this.d = fypVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fyo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r8 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r8.c.e(r1, r7) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.b
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1c
            if (r1 == r5) goto L18
            defpackage.agpl.b(r8)
            if (r1 == r4) goto L6a
            if (r1 == r3) goto L77
            goto L87
        L18:
            defpackage.agpl.b(r8)
            goto L50
        L1c:
            java.lang.Object r1 = r7.a
            defpackage.agpl.b(r8)
            goto L3c
        L22:
            defpackage.agpl.b(r8)
            java.lang.String r1 = r7.c
            int r8 = r1.length()
            if (r8 != 0) goto L2e
            goto L59
        L2e:
            fyp r8 = r7.d
            r7.a = r1
            r7.b = r6
            fjn r8 = r8.c
            java.lang.Object r8 = r8.c(r7)
            if (r8 == r0) goto Lb8
        L3c:
            boolean r8 = defpackage.agvy.c(r1, r8)
            if (r8 == 0) goto L5c
            fyp r8 = r7.d
            r7.a = r2
            r7.b = r5
            fjn r8 = r8.c
            java.lang.Object r8 = r8.b(r7)
            if (r8 == r0) goto Lb8
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L59
            goto L5c
        L59:
            agpu r8 = defpackage.agpu.a
            return r8
        L5c:
            fyp r8 = r7.d
            r7.a = r2
            r7.b = r4
            fsv r8 = r8.d
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Lb8
        L6a:
            fyp r8 = r7.d
            r7.b = r3
            fjn r8 = r8.c
            r1 = 0
            java.lang.Object r8 = r8.d(r1, r7)
            if (r8 == r0) goto Lb8
        L77:
            fyp r8 = r7.d
            java.lang.String r1 = r7.c
            r2 = 5
            r7.b = r2
            fjn r8 = r8.c
            java.lang.Object r8 = r8.e(r1, r7)
            if (r8 != r0) goto L87
            goto Lb8
        L87:
            fyp r8 = r7.d
            agow r0 = r8.g
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9e
            ffp r0 = r8.e
            java.lang.String r1 = r7.c
            r0.h(r1)
        L9e:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.apps.tvsearch.fcm.REGISTRATION_NEEDED"
            r0.<init>(r1)
            android.content.ComponentName r1 = defpackage.irm.a
            android.content.ComponentName r1 = defpackage.irm.i
            android.content.Intent r0 = r0.setComponent(r1)
            r0.getClass()
            com.google.android.apps.tvsearch.fcm.KatnissFcmService r8 = r8.f
            r8.sendBroadcast(r0)
            agpu r8 = defpackage.agpu.a
            return r8
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fyo(this.c, this.d, agswVar);
    }
}
