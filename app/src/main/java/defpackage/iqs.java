package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqs implements iaw {
    final /* synthetic */ iqz a;
    final /* synthetic */ Account b;
    final /* synthetic */ aedy c;

    public iqs(iqz iqzVar, Account account, aedy aedyVar) {
        this.a = iqzVar;
        this.b = account;
        this.c = aedyVar;
    }

    @Override // defpackage.iaw
    public final void a(Throwable th) {
        ((zdv) iqz.a.b().q("com/google/android/apps/tvsearch/setup/settings/GeminiSettingsUpdateHandler$fetchSettings$3", "onFetchSettingsFailure", 167, "GeminiSettingsUpdateHandler.kt")).u("Failed to fetch settings.");
        iqz iqzVar = this.a;
        ahal.e(iqzVar.e, null, 0, new iqq(iqzVar, this.b, this.c, null), 3);
    }

    @Override // defpackage.iaw
    public final void b() {
        ((zdv) iqz.a.b().q("com/google/android/apps/tvsearch/setup/settings/GeminiSettingsUpdateHandler$fetchSettings$3", "onFetchSettingsSuccess", 153, "GeminiSettingsUpdateHandler.kt")).u("Successfully fetched settings.");
        final iqz iqzVar = this.a;
        final Account account = this.b;
        final aedy aedyVar = this.c;
        iqzVar.d.h(new agvb() { // from class: iqp
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                final String str = (String) obj;
                final String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                final Account account2 = account;
                String str3 = account2.name;
                str3.getClass();
                final iqz iqzVar2 = iqzVar;
                final aedy aedyVar2 = aedyVar;
                iqzVar2.c.b(str3, new agum() { // from class: iqo
                    @Override // defpackage.agum
                    public final Object a() {
                        iqz iqzVar3 = iqzVar2;
                        ahal.e(iqzVar3.e, null, 0, new iqr(iqzVar3, str, str2, account2, aedyVar2, null), 3);
                        return agpu.a;
                    }
                });
                return agpu.a;
            }
        });
    }
}
