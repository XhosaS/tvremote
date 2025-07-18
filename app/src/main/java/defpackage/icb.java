package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icb extends agtu implements agvb {
    final /* synthetic */ icd a;
    final /* synthetic */ Account b;
    final /* synthetic */ yme c;
    final /* synthetic */ zxe d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icb(icd icdVar, Account account, yme ymeVar, zxe zxeVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.a = icdVar;
        this.b = account;
        this.c = ymeVar;
        this.d = zxeVar;
        this.e = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((icb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        this.a.m(this.b, this.c, this.d, this.e);
        ((zdv) icd.a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$updateLocalPersonalResultsEnabledStatus$1", "invokeSuspend", 596, "AssistantSettingsGrpcClientImpl.kt")).u("Updated local personal results enabled status.");
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new icb(this.a, this.b, this.c, this.d, this.e, agswVar);
    }
}
