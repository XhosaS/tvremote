package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heb implements zxe {
    final /* synthetic */ hec a;
    final /* synthetic */ Account b;
    final /* synthetic */ boolean c;

    public heb(hec hecVar, Account account, boolean z) {
        this.a = hecVar;
        this.b = account;
        this.c = z;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) hec.a.c()).p(th).q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataHelperImpl$updateVoiceInputEnabled$updateDeviceSettingsCallback$1", "onFailure", 314, "AssistantSliceDataHelperImpl.kt")).u("Error updating assistant enabled settings from server");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        optional.getClass();
        if (optional.isEmpty()) {
            return;
        }
        hec hecVar = this.a;
        Account account = this.b;
        hecVar.i.K(account, this.c);
        hecVar.f(account);
    }
}
