package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzh implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) lzl.a.c()).p(th)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$5", "onFailure", (char) 606, "AssistantSettingsServicePeer.java")).u("Error receiving UpdateSettingsUiResponse from server");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional == null || optional.isEmpty()) {
            ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$5", "onSuccess", 597, "AssistantSettingsServicePeer.java")).u("No UpdateSettingsUiResponse in result future at this time.");
        } else {
            zdy zdyVar = lzl.a;
        }
    }
}
