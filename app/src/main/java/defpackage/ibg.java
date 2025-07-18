package defpackage;

import android.accounts.Account;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibg implements zxe {
    final /* synthetic */ icd a;
    final /* synthetic */ Account b;

    public ibg(icd icdVar, Account account) {
        this.a = icdVar;
        this.b = account;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) icd.a.d()).p(th).q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$fetchSettingsForAssistantSetupWithAccount$settingsUiCallback$1", "onFailure", 362, "AssistantSettingsGrpcClientImpl.kt")).u("Error: Could not get Assistant settings for user from server!");
        icd icdVar = this.a;
        icdVar.t = false;
        Iterator it = icdVar.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((iaw) next).a(th);
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        if (optional.isEmpty()) {
            ((zdv) icd.a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$fetchSettingsForAssistantSetupWithAccount$settingsUiCallback$1", "onSuccess", 325, "AssistantSettingsGrpcClientImpl.kt")).u("No SettingsUi in result future at this time.");
            return;
        }
        ((zdv) icd.a.b().q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$fetchSettingsForAssistantSetupWithAccount$settingsUiCallback$1", "onSuccess", 330, "AssistantSettingsGrpcClientImpl.kt")).u("Received SettingsUi with user settings needed for starting Assistant Setup.");
        final icd icdVar = this.a;
        icdVar.t = false;
        final ymc ymcVar = (ymc) optional.get();
        final Account account = this.b;
        ahal.e(icdVar.i, null, 0, new ibe(icdVar, account, ymcVar, null), 3);
        icdVar.g.h(new agvb() { // from class: ibd
            @Override // defpackage.agvb
            public final Object a(Object obj2, Object obj3) {
                String str = (String) obj2;
                str.getClass();
                ((String) obj3).getClass();
                final icd icdVar2 = icdVar;
                ahal.e(icdVar2.i, null, 0, new ibf(icdVar2, ymcVar, account, str, null), 3).w(new agux() { // from class: ibc
                    @Override // defpackage.agux
                    public final Object a(Object obj4) {
                        Throwable th = (Throwable) obj4;
                        if (th != null && !(th instanceof CancellationException)) {
                            ((zdv) ((zdv) icd.a.d()).p(th).q("com/google/android/apps/tvsearch/settings/client/AssistantSettingsGrpcClientImpl$fetchSettingsForAssistantSetupWithAccount$settingsUiCallback$1", "onSuccess$lambda$1$lambda$0", 347, "AssistantSettingsGrpcClientImpl.kt")).u("Failed to commit assistant settings to PDS.");
                        }
                        Iterator it = icdVar2.s.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            ((iaw) next).b();
                        }
                        return agpu.a;
                    }
                });
                return agpu.a;
            }
        });
    }
}
