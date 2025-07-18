package defpackage;

import android.accounts.Account;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gua extends agtu implements agvb {
    final /* synthetic */ gva a;
    final /* synthetic */ Account b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gua(gva gvaVar, Account account, agsw agswVar) {
        super(2, agswVar);
        this.a = gvaVar;
        this.b = account;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gua) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        Duration duration = gvi.a;
        return this.a.b.c(this.b, gvi.c);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gua(this.a, this.b, agswVar);
    }
}
