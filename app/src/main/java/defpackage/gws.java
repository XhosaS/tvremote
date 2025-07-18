package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gws implements gyi {
    private final agow a;
    private final boolean b;
    private final gyx c;
    private final Set d;
    private final Set e;
    private final int f;

    public gws(agow agowVar, boolean z) {
        agowVar.getClass();
        this.a = agowVar;
        this.b = z;
        this.c = gyx.a;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.d = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.Q);
        setSingleton2.getClass();
        this.e = setSingleton2;
        this.f = true != z ? 3 : 1;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 0;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        final gwx gwxVar = (gwx) this.a.a();
        ((zdv) gwx.a.b().q("com/google/android/apps/tvsearch/platform/account/state/AccountsUpdateHandler", "init", 101, "AccountsUpdateHandler.kt")).u("#startListening");
        gwxVar.e = new OnAccountsUpdateListener() { // from class: gwr
            @Override // android.accounts.OnAccountsUpdateListener
            public final void onAccountsUpdated(Account[] accountArr) {
                ((zdv) gwx.a.b().q("com/google/android/apps/tvsearch/platform/account/state/AccountsUpdateHandler", "init$lambda$0", 103, "AccountsUpdateHandler.kt")).v("Got %s accounts", accountArr.length);
                gwx gwxVar2 = gwxVar;
                ahal.e(gwxVar2.c, null, 0, new gwu(gwxVar2, accountArr, null), 3);
            }
        };
        gwxVar.b.addOnAccountsUpdatedListener(gwxVar.e, null, false);
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final int f() {
        return this.f;
    }
}
