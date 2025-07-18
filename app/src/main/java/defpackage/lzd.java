package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzd implements zxe {
    final /* synthetic */ boolean a;
    final /* synthetic */ lzk b;

    public lzd(lzk lzkVar, boolean z) {
        this.a = z;
        this.b = lzkVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) lzl.a.c()).p(th)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$2", "onFailure", (char) 290, "AssistantSettingsServicePeer.java")).u("Error receiving updateSettingsUiResponse from server for setting personal results readout.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            zdy zdyVar = lzl.a;
            return;
        }
        zdy zdyVar2 = lzl.a;
        optional.getClass();
        lzl lzlVar = this.b.b;
        Account accountC = lzlVar.h.c();
        if (accountC != null) {
            lzlVar.l.C(accountC, this.a);
        } else {
            ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$2", "onSuccess", 283, "AssistantSettingsServicePeer.java")).u("No search account, unable to update personal results");
        }
    }
}
