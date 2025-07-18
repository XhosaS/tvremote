package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdn implements jdg {
    public static final /* synthetic */ int e = 0;
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/voice/hotword/contentprovider/KatnissHotwordStateContentProviderClientImpl");
    private static final Duration g;
    public ahdl a;
    public final ahni b;
    public ahdl c;
    public final ahni d;
    private final vrs h;
    private final ahbt i;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        durationOfSeconds.getClass();
        g = durationOfSeconds;
    }

    public jdn(vrs vrsVar, ahbt ahbtVar) {
        ahbtVar.getClass();
        this.h = vrsVar;
        this.i = ahbtVar;
        this.b = new ahnm(false);
        this.d = new ahnm(false);
    }

    @Override // defpackage.jdg
    public final void a(boolean z) {
        ahal.e(this.i, null, 0, new jdk(this, z, null), 3);
    }

    @Override // defpackage.jdg
    public final void b(boolean z) {
        ahal.e(this.i, null, 0, new jdm(this, z, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r10.b(r2, r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [agpu, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:21:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r9, defpackage.agsw r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.jdh
            if (r0 == 0) goto L13
            r0 = r10
            jdh r0 = (defpackage.jdh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jdh r0 = new jdh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            android.content.ContentValues r9 = r0.d
            defpackage.agpl.b(r10)
            goto L56
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            android.content.ContentValues r9 = r0.d
            defpackage.agpl.b(r10)     // Catch: defpackage.vsq -> L3a
            goto L65
        L3a:
            r10 = move-exception
            goto L68
        L3c:
            defpackage.agpl.b(r10)
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r2 = "key"
            java.lang.String r5 = "is_hotword_switch_visible"
            r10.put(r2, r5)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r9)
            java.lang.String r9 = "value"
            r10.put(r9, r2)
            r9 = r10
        L56:
            vrs r10 = r8.h     // Catch: defpackage.vsq -> L3a
            android.net.Uri r2 = com.google.android.apps.tvsearch.voice.hotword.contentprovider.KatnissHotwordStateContentProvider.b     // Catch: defpackage.vsq -> L3a
            r0.d = r9     // Catch: defpackage.vsq -> L3a
            r0.c = r4     // Catch: defpackage.vsq -> L3a
            java.lang.Object r9 = r10.b(r2, r9, r0)     // Catch: defpackage.vsq -> L3a
            if (r9 != r1) goto L65
            goto L94
        L65:
            agpu r9 = defpackage.agpu.a
            return r9
        L68:
            zdy r2 = defpackage.jdn.f
            zeo r2 = r2.d()
            zdv r2 = (defpackage.zdv) r2
            zeo r10 = r2.p(r10)
            r2 = 56
            java.lang.String r5 = "KatnissHotwordStateContentProviderClientImpl.kt"
            java.lang.String r6 = "com/google/android/apps/tvsearch/voice/hotword/contentprovider/KatnissHotwordStateContentProviderClientImpl"
            java.lang.String r7 = "insertHotwordSwitchVisible"
            zeo r10 = r10.q(r6, r7, r2, r5)
            zdv r10 = (defpackage.zdv) r10
            java.lang.String r2 = "Hotword switch not set successfully due to content provider not being available."
            r10.u(r2)
            j$.time.Duration r10 = defpackage.jdn.g
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = defpackage.zty.a(r10, r0)
            if (r10 == r1) goto L94
            goto L56
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdn.c(boolean, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r12.a(r6, r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [agpu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b2 -> B:21:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r11, defpackage.agsw r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.jdi
            if (r0 == 0) goto L13
            r0 = r12
            jdi r0 = (defpackage.jdi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jdi r0 = new jdi
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            android.content.ContentValues r11 = r0.e
            android.content.ContentValues r2 = r0.d
            defpackage.agpl.b(r12)
            goto L6d
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            android.content.ContentValues r11 = r0.e
            android.content.ContentValues r2 = r0.d
            defpackage.agpl.b(r12)     // Catch: defpackage.vsq -> L3f
            goto L84
        L3f:
            r12 = move-exception
            goto L87
        L41:
            defpackage.agpl.b(r12)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r12 = "is_hotword_switch_disabled"
            java.lang.String r6 = "key"
            r2.put(r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r3)
            java.lang.String r7 = "value"
            r2.put(r7, r12)
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            java.lang.String r8 = "is_listening_for_hotword"
            r12.put(r6, r8)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            r12.put(r7, r6)
            r11 = r12
        L6d:
            vrs r12 = r10.h     // Catch: defpackage.vsq -> L3f
            android.net.Uri r6 = com.google.android.apps.tvsearch.voice.hotword.contentprovider.KatnissHotwordStateContentProvider.b     // Catch: defpackage.vsq -> L3f
            android.content.ContentValues[] r7 = new android.content.ContentValues[r4]     // Catch: defpackage.vsq -> L3f
            r7[r3] = r2     // Catch: defpackage.vsq -> L3f
            r7[r5] = r11     // Catch: defpackage.vsq -> L3f
            r0.d = r2     // Catch: defpackage.vsq -> L3f
            r0.e = r11     // Catch: defpackage.vsq -> L3f
            r0.c = r5     // Catch: defpackage.vsq -> L3f
            java.lang.Object r11 = r12.a(r6, r7, r0)     // Catch: defpackage.vsq -> L3f
            if (r11 != r1) goto L84
            goto Lb5
        L84:
            agpu r11 = defpackage.agpu.a
            return r11
        L87:
            zdy r6 = defpackage.jdn.f
            zeo r6 = r6.d()
            zdv r6 = (defpackage.zdv) r6
            zeo r12 = r6.p(r12)
            r6 = 91
            java.lang.String r7 = "KatnissHotwordStateContentProviderClientImpl.kt"
            java.lang.String r8 = "com/google/android/apps/tvsearch/voice/hotword/contentprovider/KatnissHotwordStateContentProviderClientImpl"
            java.lang.String r9 = "insertIsHotwordEnable"
            zeo r12 = r12.q(r8, r9, r6, r7)
            zdv r12 = (defpackage.zdv) r12
            java.lang.String r6 = "Hotword enable not set successfully due to content provider not being available."
            r12.u(r6)
            j$.time.Duration r12 = defpackage.jdn.g
            r0.d = r2
            r0.e = r11
            r0.c = r4
            java.lang.Object r12 = defpackage.zty.a(r12, r0)
            if (r12 == r1) goto Lb5
            goto L6d
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdn.d(boolean, agsw):java.lang.Object");
    }
}
