package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpb extends BroadcastReceiver {
    final /* synthetic */ bpd a;

    public bpb(bpd bpdVar) {
        this.a = bpdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = r6.getAction()
            int r6 = r5.hashCode()
            r0 = -2128145023(0xffffffff81271581, float:-3.0688484E-38)
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L1f
            r0 = -1454123155(0xffffffffa953d76d, float:-4.7038264E-14)
            if (r6 == r0) goto L15
            goto L29
        L15:
            java.lang.String r6 = "android.intent.action.SCREEN_ON"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L29
            r5 = r1
            goto L2a
        L1f:
            java.lang.String r6 = "android.intent.action.SCREEN_OFF"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L29
            r5 = r2
            goto L2a
        L29:
            r5 = -1
        L2a:
            java.lang.String r6 = "onReceive"
            java.lang.String r0 = "com/google/android/tv/remote/service/PowerFeature$1"
            java.lang.String r3 = "PowerFeature.java"
            if (r5 == 0) goto L56
            if (r5 == r2) goto L35
            return
        L35:
            cbt r5 = defpackage.bpd.a
            cch r5 = r5.e()
            cck r2 = defpackage.btt.a
            cch r5 = r5.g(r2)
            cbs r5 = (defpackage.cbs) r5
            r2 = 41
            cch r5 = r5.j(r0, r6, r2, r3)
            cbs r5 = (defpackage.cbs) r5
            java.lang.String r6 = "Screen is off"
            r5.p(r6)
            bpd r5 = r4.a
            r5.e(r1)
            return
        L56:
            cbt r5 = defpackage.bpd.a
            cch r5 = r5.e()
            cck r1 = defpackage.btt.a
            cch r5 = r5.g(r1)
            cbs r5 = (defpackage.cbs) r5
            r1 = 37
            cch r5 = r5.j(r0, r6, r1, r3)
            cbs r5 = (defpackage.cbs) r5
            java.lang.String r6 = "Screen is on"
            r5.p(r6)
            bpd r5 = r4.a
            r5.e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpb.onReceive(android.content.Context, android.content.Intent):void");
    }
}
