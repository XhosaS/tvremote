package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdx extends agtu implements agvb {
    Object a;
    boolean b;
    int c;
    final /* synthetic */ hec d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Optional f;
    final /* synthetic */ Account g;
    final /* synthetic */ hdy h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdx(hec hecVar, boolean z, Optional optional, Account account, hdy hdyVar, agsw agswVar) {
        super(2, agswVar);
        this.d = hecVar;
        this.e = z;
        this.f = optional;
        this.g = account;
        this.h = hdyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r14 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (defpackage.ahal.a(r14, r7, r13) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return r0;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r13.c
            r2 = 12
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L10
            defpackage.agpl.b(r14)
            goto L71
        L10:
            boolean r1 = r13.b
            java.lang.Object r5 = r13.a
            java.lang.Object r6 = r13.i
            ahbt r6 = (defpackage.ahbt) r6
            defpackage.agpl.b(r14)
            goto L40
        L1c:
            defpackage.agpl.b(r14)
            java.lang.Object r14 = r13.i
            r6 = r14
            ahbt r6 = (defpackage.ahbt) r6
            hec r14 = r13.d
            gph r1 = r14.d
            gph r5 = defpackage.gph.a
            if (r1 != r5) goto L49
            boolean r1 = r13.e
            j$.util.Optional r5 = r13.f
            fda r14 = r14.c
            r13.i = r6
            r13.a = r5
            r13.b = r1
            r13.c = r4
            java.lang.Object r14 = r14.e(r13)
            if (r14 == r0) goto L70
        L40:
            java.lang.String r14 = (java.lang.String) r14
            j$.util.Optional r5 = (j$.util.Optional) r5
            ymg r14 = defpackage.ird.b(r1, r5, r4, r14, r2)
            goto L52
        L49:
            boolean r14 = r13.e
            j$.util.Optional r1 = r13.f
            r4 = 0
            ymg r14 = defpackage.ird.b(r14, r1, r4, r3, r2)
        L52:
            r10 = r14
            hec r8 = r13.d
            android.accounts.Account r9 = r13.g
            hdy r11 = r13.h
            agte r14 = r6.fs()
            hdw r7 = new hdw
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r13.i = r3
            r13.a = r3
            r1 = 2
            r13.c = r1
            java.lang.Object r14 = defpackage.ahal.a(r14, r7, r13)
            if (r14 != r0) goto L71
        L70:
            return r0
        L71:
            agpu r14 = defpackage.agpu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        hdx hdxVar = new hdx(this.d, this.e, this.f, this.g, this.h, agswVar);
        hdxVar.i = obj;
        return hdxVar;
    }
}
