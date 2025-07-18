package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idy implements zxe {
    final /* synthetic */ zxe a;

    public idy(zxe zxeVar) {
        this.a = zxeVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) iep.b.c()).p(th).q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer$Companion$updateDscBitToAssistantSettings$updateDeviceSettingsCallback$1", "onFailure", 862, "AssistantDataSharingConsentActivityPeer.kt")).u("Error receiving dsc settings from server");
        zxe zxeVar = this.a;
        if (zxeVar != null) {
            zxeVar.a(th);
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        if (optional.isEmpty()) {
            ((zdv) iep.b.c().q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer$Companion$updateDscBitToAssistantSettings$updateDeviceSettingsCallback$1", "onSuccess", 852, "AssistantDataSharingConsentActivityPeer.kt")).u("No updateSettingsUiResponse in result future at this time.");
            a(new IllegalArgumentException("result is not present"));
        } else {
            ((zdv) iep.b.b().q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer$Companion$updateDscBitToAssistantSettings$updateDeviceSettingsCallback$1", "onSuccess", 857, "AssistantDataSharingConsentActivityPeer.kt")).x("updateSettingsUiResponse for dsc bit: %s", (ymi) optional.get());
        }
    }
}
