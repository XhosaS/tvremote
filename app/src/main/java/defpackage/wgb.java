package defpackage;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgb implements wap {
    public final AccountId a;
    public final wec b;
    public final wge c;
    public final agow d;
    public final String e;
    private final vhb f;
    private final Executor g;

    public wgb(AccountId accountId, vhb vhbVar, wec wecVar, wge wgeVar, agow agowVar, Executor executor, String str) {
        accountId.getClass();
        vhbVar.getClass();
        wgeVar.getClass();
        executor.getClass();
        this.a = accountId;
        this.f = vhbVar;
        this.b = wecVar;
        this.c = wgeVar;
        this.d = agowVar;
        this.g = executor;
        this.e = str;
    }

    @Override // defpackage.wap
    public final zyd a(String str, abvo abvoVar, rgs rgsVar) {
        return this.c.a(rgsVar, abvoVar, str, this.e);
    }

    @Override // defpackage.wap
    public final zyd b(final abvo abvoVar, final rgs rgsVar) {
        zyd zydVarB = this.c.a.b(wyo.b(new wgd(new agux() { // from class: wfy
            @Override // defpackage.agux
            public final Object a(Object obj) {
                wgb wgbVar = this.a;
                AccountId accountId = (AccountId) obj;
                Object obj2 = ((aejh) wgbVar.d).b;
                obj2.getClass();
                yqt yqtVar = (yqt) obj2;
                boolean zG = yqtVar.g();
                abvo abvoVar2 = abvoVar;
                rgs rgsVar2 = rgsVar;
                if (!zG) {
                    return wgbVar.c(abvoVar2, accountId, wgbVar.a, rgsVar2);
                }
                vgb vgbVar = (vgb) yqtVar.c();
                new Intent();
                zyd zydVarA = vgbVar.a();
                zvi zviVarC = wyo.c(new wfz(wgbVar, abvoVar2, rgsVar2));
                return zuz.h(zydVarA, wyo.c(zviVarC), zwk.a);
            }
        })), zwk.a);
        zydVarB.getClass();
        return zydVarB;
    }

    public final zyd c(final abvo abvoVar, AccountId accountId, AccountId accountId2, final rgs rgsVar) {
        if (accountId == null || !agvy.c(accountId2, accountId)) {
            return zxy.a;
        }
        zyd zydVarB = this.f.b(accountId2);
        final agux aguxVar = new agux() { // from class: wfx
            @Override // defpackage.agux
            public final Object a(Object obj) {
                vhg vhgVarB = ((vha) obj).b();
                wgb wgbVar = this.a;
                return wgbVar.c.a(rgsVar, abvoVar, wgbVar.b.a(vhgVarB), wgbVar.e);
            }
        };
        zvi zviVar = new zvi() { // from class: wga
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zyd] */
            @Override // defpackage.zvi
            public final /* synthetic */ zyd a(Object obj) {
                return aguxVar.a(obj);
            }
        };
        return zuz.h(zydVarB, wyo.c(zviVar), this.g);
    }
}
