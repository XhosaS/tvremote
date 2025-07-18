package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuo extends BroadcastReceiver {
    final /* synthetic */ iup a;

    public iuo(iup iupVar) {
        this.a = iupVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L8
            java.lang.String r0 = r6.getAction()
            goto L9
        L8:
            r0 = r5
        L9:
            if (r0 == 0) goto L85
            int r1 = r0.hashCode()
            r2 = -1940635523(0xffffffff8c54407d, float:-1.6351292E-31)
            r3 = 3
            if (r1 == r2) goto L33
            r2 = 1170999219(0x45cc07b3, float:6528.9624)
            if (r1 == r2) goto L29
            r2 = 1920758225(0x727c71d1, float:5.0001804E30)
            if (r1 == r2) goto L20
            return
        L20:
            java.lang.String r1 = "android.media.STREAM_MUTE_CHANGED_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            return
        L29:
            java.lang.String r6 = "android.media.MASTER_MUTE_CHANGED_ACTION"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L32
            goto L4e
        L32:
            return
        L33:
            java.lang.String r1 = "android.media.VOLUME_CHANGED_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            return
        L3c:
            r6.getClass()
            java.lang.String r0 = "android.media.EXTRA_VOLUME_STREAM_TYPE"
            boolean r1 = r6.hasExtra(r0)
            if (r1 == 0) goto L85
            r1 = -1
            int r6 = r6.getIntExtra(r0, r1)
            if (r6 != r3) goto L85
        L4e:
            iup r6 = r4.a
            agow r0 = r6.b
            java.lang.Object r0 = r0.a()
            r0.getClass()
            abwf r0 = (defpackage.abwf) r0
            j$.time.Duration r0 = defpackage.acbh.b(r0)
            r0.getClass()
            j$.time.Duration r1 = j$.time.Duration.ZERO
            int r1 = r0.compareTo(r1)
            if (r1 <= 0) goto L80
            ahdl r1 = r6.c
            if (r1 == 0) goto L71
            r1.s(r5)
        L71:
            ahbt r1 = r6.a
            iun r2 = new iun
            r2.<init>(r0, r6, r5)
            r0 = 0
            ahdl r5 = defpackage.ahal.e(r1, r5, r0, r2, r3)
            r6.c = r5
            return
        L80:
            agux r5 = r6.d
            r5.a(r6)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuo.onReceive(android.content.Context, android.content.Intent):void");
    }
}
