package defpackage;

import android.accounts.Account;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdy implements zxe {
    final /* synthetic */ hec a;
    final /* synthetic */ Account b;

    public hdy(hec hecVar, Account account) {
        this.a = hecVar;
        this.b = account;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        th.getClass();
        ((zdv) ((zdv) hec.a.d()).p(th).q("com/google/android/apps/tvsearch/providers/slice/AssistantSliceDataHelperImpl$updatePersonalResults$updateDeviceSettingsCallback$1", "onFailure", 232, "AssistantSliceDataHelperImpl.kt")).u("Error receiving personal readout settings from server");
        hec hecVar = this.a;
        idl idlVar = hecVar.i;
        Account account = this.b;
        idlVar.D(account, false);
        if (((Boolean) hecVar.g.a()).booleanValue()) {
            idlVar.F(account, false);
        }
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
        hecVar.f(account);
        idl idlVar = hecVar.i;
        idlVar.D(account, false);
        if (((Boolean) hecVar.g.a()).booleanValue()) {
            idlVar.F(account, false);
        }
    }
}
