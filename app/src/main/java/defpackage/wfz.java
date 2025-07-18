package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfz implements zvi {
    final /* synthetic */ wgb a;
    final /* synthetic */ abvo b;
    final /* synthetic */ rgs c;

    public wfz(wgb wgbVar, abvo abvoVar, rgs rgsVar) {
        this.a = wgbVar;
        this.b = abvoVar;
        this.c = rgsVar;
    }

    @Override // defpackage.zvi
    public final /* bridge */ /* synthetic */ zyd a(Object obj) {
        wgb wgbVar = this.a;
        return wgbVar.c(this.b, (AccountId) obj, wgbVar.a, this.c);
    }
}
