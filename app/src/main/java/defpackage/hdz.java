package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdz extends agtu implements agvb {
    boolean a;
    int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hec d;
    final /* synthetic */ Account e;
    final /* synthetic */ heb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdz(boolean z, hec hecVar, Account account, heb hebVar, agsw agswVar) {
        super(2, agswVar);
        this.c = z;
        this.d = hecVar;
        this.e = account;
        this.f = hebVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hdz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hdz(this.c, this.d, this.e, this.f, agswVar);
    }
}
