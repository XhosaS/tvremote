package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
class lze implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) lzl.a.c()).p(th)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$3", "onFailure", (char) 356, "AssistantSettingsServicePeer.java")).u("Error receiving updateSettingsUiResponse from server for setting promo emails opt-in");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            zdy zdyVar = lzl.a;
        } else {
            zdy zdyVar2 = lzl.a;
            optional.get();
        }
    }
}
