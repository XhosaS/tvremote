package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icc implements zxe {
    final /* synthetic */ icd a;
    final /* synthetic */ String b;
    final /* synthetic */ Account c;
    final /* synthetic */ zxe d;

    public icc(icd icdVar, String str, Account account, zxe zxeVar) {
        this.a = icdVar;
        this.b = str;
        this.c = account;
        this.d = zxeVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) icd.a.d()).p(th).q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$updateLocalPersonalResultsEnabledStatus$updateDeviceSettingsCallback$1", "onFailure", 584, "AssistantSettingsGrpcClientImpl.kt")).u("Error receiving SettingsUi from server");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        if (optional.isEmpty()) {
            ((zdv) icd.a.d().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$updateLocalPersonalResultsEnabledStatus$updateDeviceSettingsCallback$1", "onSuccess", 558, "AssistantSettingsGrpcClientImpl.kt")).u("No SettingsUi in result future at this time.");
            return;
        }
        zdy zdyVar = icd.a;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$updateLocalPersonalResultsEnabledStatus$updateDeviceSettingsCallback$1", "onSuccess", 561, "AssistantSettingsGrpcClientImpl.kt")).u("Received SettingsUi!");
        ymc ymcVar = (ymc) optional.get();
        icd icdVar = this.a;
        Optional optionalG = icdVar.g(ymcVar, this.b);
        if (optionalG.isPresent()) {
            if (icdVar.k == gph.a || ((Boolean) icdVar.n.a()).booleanValue()) {
                int iA = yik.a(((yil) optionalG.get()).e);
                icdVar.o.E(this.c, iA != 0 && iA == 4);
            }
            int iA2 = yik.a(((yil) optionalG.get()).e);
            icdVar.o.C(this.c, iA2 != 0 && iA2 == 2);
        } else {
            ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$updateLocalPersonalResultsEnabledStatus$updateDeviceSettingsCallback$1", "onSuccess", 578, "AssistantSettingsGrpcClientImpl.kt")).x("Cannot find user with account type %s on this device", this.c.type);
        }
        this.d.b(ymcVar);
    }
}
