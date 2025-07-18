package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipk implements zxe {
    final /* synthetic */ ipl a;

    public ipk(ipl iplVar) {
        this.a = iplVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) ipl.a.c()).p(th).q("com/google/android/apps/tvsearch/setup/notification/ProactiveBitNotificationHelper$getAssistantSettingsCallback$1", "onFailure", 91, "ProactiveBitNotificationHelper.kt")).u("Error receiving SettingsUi from server");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        zdy zdyVar = ipl.a;
        ipl iplVar = this.a;
        ahal.e(iplVar.f, null, 0, new ipj(iplVar, optional, null), 3).w(new agux() { // from class: ipi
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    ((zdv) ((zdv) ipl.a.d()).p(th).q("com/google/android/apps/tvsearch/setup/notification/ProactiveBitNotificationHelper$getAssistantSettingsCallback$1", "onSuccess$lambda$0", 85, "ProactiveBitNotificationHelper.kt")).u("Failed to handle retrieved SettingsUi.");
                }
                return agpu.a;
            }
        });
    }
}
