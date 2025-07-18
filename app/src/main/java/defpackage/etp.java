package defpackage;

import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class etp implements wgc {
    final /* synthetic */ etq a;

    public etp(etq etqVar) {
        this.a = etqVar;
    }

    @Override // defpackage.wgc
    public final wgb a(String str) {
        etq etqVar = this.a;
        etr etrVar = etqVar.b;
        AccountId accountId = (AccountId) etrVar.d.a();
        eup eupVar = etqVar.a;
        vhb vhbVar = (vhb) eupVar.bc.a();
        wec wecVarEp = eupVar.ep();
        wge wgeVar = (wge) eupVar.nT.a();
        Executor executor = (Executor) eupVar.m.a();
        eupVar.fP();
        return new wgb(accountId, vhbVar, wecVarEp, wgeVar, etrVar.n, executor, str);
    }
}
