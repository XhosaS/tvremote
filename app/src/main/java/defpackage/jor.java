package defpackage;

import android.content.Intent;
import com.google.android.tv.remote.service.AudioStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jor extends agtu implements agvb {
    int a;
    final /* synthetic */ jot b;
    final /* synthetic */ AudioStream c;
    final /* synthetic */ Intent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jor(jot jotVar, AudioStream audioStream, Intent intent, agsw agswVar) {
        super(2, agswVar);
        this.b = jotVar;
        this.c = audioStream;
        this.d = intent;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jor) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.a
            r2 = 1
            defpackage.agpl.b(r5)
            if (r1 == 0) goto Lb
            goto L1e
        Lb:
            jot r5 = r4.b
            gph r1 = r5.g
            gph r3 = defpackage.gph.a
            if (r1 != r3) goto L32
            fmg r5 = r5.m
            r4.a = r2
            java.lang.Object r5 = r5.c(r4)
            if (r5 != r0) goto L1e
            return r0
        L1e:
            jot r0 = r4.b
            j$.time.Instant r5 = (j$.time.Instant) r5
            ztw r1 = r0.n
            j$.time.Instant r1 = r1.a()
            int r5 = r5.compareTo(r1)
            if (r5 < 0) goto L32
            fad r5 = r0.o
            r5.a = r2
        L32:
            jot r5 = r4.b
            agow r0 = r5.k
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
            com.google.android.tv.remote.service.AudioStream r0 = r4.c
            int r0 = r5.n(r0)
            goto L5f
        L49:
            android.content.Intent r0 = r4.d
            java.lang.String r1 = "EXTRA_AUDIO_FD"
            boolean r2 = r0.hasExtra(r1)
            if (r2 == 0) goto L59
            r2 = -1
            int r0 = r0.getIntExtra(r1, r2)
            goto L5f
        L59:
            com.google.android.tv.remote.service.AudioStream r0 = r4.c
            int r0 = r5.n(r0)
        L5f:
            jdt r5 = r5.d
            r5.H(r0)
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jor.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jor(this.b, this.c, this.d, agswVar);
    }
}
