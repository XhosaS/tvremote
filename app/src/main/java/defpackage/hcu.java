package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcu implements zxe {
    final /* synthetic */ hcv a;
    final /* synthetic */ Account b;

    public hcu(hcv hcvVar, Account account) {
        this.a = hcvVar;
        this.b = account;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) hcv.a.c().q("com/google/android/apps/tvsearch/providers/slice/AssistantBroadcastDataHelperImpl$updateCache$getSettingsUiResponseCallback$1", "onFailure", 66, "AssistantBroadcastDataHelperImpl.kt")).u("Broadcast settingsUi fetching failed.");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        ((zdv) hcv.a.b().q("com/google/android/apps/tvsearch/providers/slice/AssistantBroadcastDataHelperImpl$updateCache$getSettingsUiResponseCallback$1", "onSuccess", 43, "AssistantBroadcastDataHelperImpl.kt")).u("Received Broadcast settings ui response.");
        hcv hcvVar = this.a;
        ahal.e(hcvVar.d, null, 0, new hct(optional, hcvVar, this.b, null), 3);
    }
}
