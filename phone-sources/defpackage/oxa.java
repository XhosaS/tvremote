package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxa implements owz {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final qja c;

    public oxa(Context context, qja qjaVar) {
        this.b = context;
        this.c = qjaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.owz
    public final /* bridge */ /* synthetic */ List a() {
        ImmutableList immutableListCopyOf;
        if (!xgp.b()) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        qdl qdlVarF = this.c.f();
        if (qdlVarF.i()) {
            immutableListCopyOf = ImmutableList.copyOf((Collection) qdlVarF.c());
        } else {
            ((tvk) ((tvk) ((tvk) a.g()).i(qdlVarF.f())).j("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", '6', "AccountManagerImpl.java")).s("Failed to get accounts using GoogleAuthUtil");
            immutableListCopyOf = null;
        }
        if (immutableListCopyOf == null) {
            Context context = this.b;
            if (czi.b(context, "android.permission.GET_ACCOUNTS") == 0) {
                immutableListCopyOf = ImmutableList.copyOf(AccountManager.get(context).getAccountsByType("com.google"));
            } else {
                ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/accounts/impl/AccountManagerImpl", "getAccountsNames", 66, "AccountManagerImpl.java")).s("Failed to get accounts using AccountManager, missing permission GET_ACCOUNTS");
            }
        }
        if (immutableListCopyOf != null) {
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((Account) it.next()).name);
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }
}
