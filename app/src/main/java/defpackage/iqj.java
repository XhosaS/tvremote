package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqj implements zxe {
    final /* synthetic */ iqk a;
    final /* synthetic */ Account b;

    public iqj(iqk iqkVar, Account account) {
        this.a = iqkVar;
        this.b = account;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) iqk.a.d().q("com/google/android/apps/tvsearch/setup/settings/EnableAssistantSettingsJobServicePeer$onStartJob$2", "onFailure", 129, "EnableAssistantSettingsJobServicePeer.kt")).u("Cast id failed to be loaded.");
        this.a.c(this.b);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fcy fcyVar = (fcy) obj;
        zdy zdyVar = iqk.a;
        if (fcyVar == null) {
            ((zdv) iqk.a.d().q("com/google/android/apps/tvsearch/setup/settings/EnableAssistantSettingsJobServicePeer$onStartJob$2", "onSuccess", 122, "EnableAssistantSettingsJobServicePeer.kt")).u("Cast id loaded as invalid value.");
        }
        this.a.c(this.b);
    }
}
