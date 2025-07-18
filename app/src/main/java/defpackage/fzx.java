package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzx extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ Intent c;
    final /* synthetic */ fzy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzx(Intent intent, fzy fzyVar, agsw agswVar) {
        super(2, agswVar);
        this.c = intent;
        this.d = fzyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fzx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r6)
            goto L6a
        Ld:
            java.lang.Object r1 = r5.a
            defpackage.agpl.b(r6)
            goto L46
        L13:
            defpackage.agpl.b(r6)
            j$.time.Duration r6 = j$.time.Duration.ZERO
            r6.getClass()
            android.content.Intent r1 = r5.c
            java.lang.String r3 = "android.media.action.HDMI_AUDIO_PLUG"
            java.lang.String r4 = r1.getAction()
            boolean r3 = defpackage.agvy.c(r3, r4)
            if (r3 == 0) goto L75
            java.lang.String r6 = "android.media.extra.AUDIO_PLUG_STATE"
            r3 = -1
            int r6 = r1.getIntExtra(r6, r3)
            if (r6 != r2) goto L87
            fzy r6 = r5.d
            gxt r1 = r6.b
            fnj r1 = r1.f()
            r5.a = r1
            r5.b = r2
            fjd r6 = r6.a
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L74
        L46:
            if (r1 == r6) goto L87
            fzy r6 = r5.d
            gxt r1 = r6.b
            fnj r1 = r1.f()
            r2 = 0
            r5.a = r2
            r2 = 2
            r5.b = r2
            fjb r2 = new fjb
            r2.<init>()
            fjd r6 = r6.a
            fhi r6 = r6.a
            java.lang.Object r6 = r6.b(r2, r5)
            if (r6 == r0) goto L67
            agpu r6 = defpackage.agpu.a
        L67:
            if (r6 != r0) goto L6a
            goto L74
        L6a:
            r0 = 3
            j$.time.Duration r6 = j$.time.Duration.ofSeconds(r0)
            r6.getClass()
            goto L75
        L74:
            return r0
        L75:
            android.content.Intent r0 = r5.c
            java.lang.String r1 = "android.intent.extra.REPLACING"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 != 0) goto L87
            fzy r0 = r5.d
            gai r0 = r0.c
            r0.a(r6)
        L87:
            agpu r6 = defpackage.agpu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fzx(this.c, this.d, agswVar);
    }
}
