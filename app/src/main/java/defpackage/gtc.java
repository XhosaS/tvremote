package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtc extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ gtd e;
    final /* synthetic */ Account f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtc(gtd gtdVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.e = gtdVar;
        this.f = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gtc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0135, code lost:
    
        if (defpackage.ahkr.b(r0, r17) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x016f -> B:45:0x0173). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gtc(this.e, this.f, agswVar);
    }
}
