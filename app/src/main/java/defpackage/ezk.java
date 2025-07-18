package defpackage;

import com.google.android.apps.tvsearch.app.modeutils.tvts.TvtsBroadcastReceiver;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezk extends agtu implements agvb {
    int a;
    final /* synthetic */ TvtsBroadcastReceiver b;
    final /* synthetic */ Instant c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezk(TvtsBroadcastReceiver tvtsBroadcastReceiver, Instant instant, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = tvtsBroadcastReceiver;
        this.c = instant;
        this.d = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r4 == r0) goto L19;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r3.a
            r2 = 1
            defpackage.agpl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L32
            goto L65
        Ld:
            com.google.android.apps.tvsearch.app.modeutils.tvts.TvtsBroadcastReceiver r4 = r3.b
            j$.time.Instant r1 = r3.c
            fmg r4 = r4.a()
            r3.a = r2
            abzy r1 = defpackage.acbk.b(r1)
            agow r4 = r4.a
            java.lang.Object r4 = r4.a()
            fhi r4 = (defpackage.fhi) r4
            fmb r2 = new fmb
            r2.<init>()
            java.lang.Object r4 = r4.b(r2, r3)
            if (r4 == r0) goto L30
            agpu r4 = defpackage.agpu.a
        L30:
            if (r4 == r0) goto L68
        L32:
            com.google.android.apps.tvsearch.app.modeutils.tvts.TvtsBroadcastReceiver r4 = r3.b
            agow r1 = r4.b()
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L65
            fmg r4 = r4.a()
            java.lang.String r1 = r3.d
            r2 = 2
            r3.a = r2
            agow r4 = r4.a
            java.lang.Object r4 = r4.a()
            fhi r4 = (defpackage.fhi) r4
            fma r2 = new fma
            r2.<init>()
            java.lang.Object r4 = r4.b(r2, r3)
            if (r4 == r0) goto L62
            agpu r4 = defpackage.agpu.a
        L62:
            if (r4 != r0) goto L65
            goto L68
        L65:
            agpu r4 = defpackage.agpu.a
            return r4
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ezk(this.b, this.c, this.d, agswVar);
    }
}
