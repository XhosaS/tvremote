package defpackage;

import android.accounts.Account;
import android.net.Network;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxy {
    private static final zdy a = zdy.h("com/google/android/gms/auth/aang/migration/MigrationUtils");

    public static jxg a(Account account, String str, jxk jxkVar, Bundle bundle) throws IOException {
        GoogleAccount googleAccount;
        try {
            jxd jxdVarA = GetAccountsRequest.a();
            ((jxb) jxdVarA).a = "com.google";
            Iterator it = ((GetAccountsResponse) lvq.d(jxkVar.a(jxdVarA.a()))).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    googleAccount = null;
                    break;
                }
                googleAccount = (GoogleAccount) it.next();
                if (googleAccount.c.equals(account.name)) {
                    break;
                }
            }
            if (googleAccount == null) {
                throw new IOException("Account not found: ".concat(String.valueOf(account.name)));
            }
            jxc jxcVar = new jxc();
            jxcVar.i = (byte) (jxcVar.i | 2);
            jxcVar.i(0);
            jxcVar.j(false);
            jxcVar.a = googleAccount;
            if (str.startsWith("oauth2:")) {
                jxcVar.b = yyk.o(str.replaceFirst("^oauth2:", ""));
            } else if (str.startsWith("weblogin:")) {
                jxcVar.c = yyk.o(str.replaceFirst("^weblogin:", ""));
            } else if (str.startsWith("audience:server:client_id:")) {
                jxcVar.e = yyk.o(str.substring(26));
            } else {
                jxcVar.d = yyk.o(str);
            }
            String string = bundle.getString("delegatee_user_id");
            if (string != null) {
                int i = bundle.getInt("delegation_type", 0);
                jxcVar.f = string;
                jxcVar.i(i);
            }
            String string2 = bundle.getString(jwk.a);
            if (string2 != null) {
                jxcVar.g = string2;
            }
            jxcVar.j(bundle.getBoolean("suppressProgressScreen"));
            Network network = (Network) bundle.getParcelable("networkToUse");
            if (network != null) {
                jxcVar.h = network;
            }
            return jxcVar;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Fetching accounts was interrupted", e);
        } catch (ExecutionException e2) {
            throw new IOException("Account not found: ".concat(String.valueOf(account.name)), e2);
        }
    }

    public static void b(ExecutionException executionException, String str) {
        if (executionException.getCause() instanceof UserRecoverableAuthException) {
            throw ((UserRecoverableAuthException) executionException.getCause());
        }
        if (executionException.getCause() instanceof jwj) {
            throw ((jwj) executionException.getCause());
        }
        if (executionException.getCause() instanceof IOException) {
            throw ((IOException) executionException.getCause());
        }
        if (!(executionException.getCause() instanceof jwu)) {
            throw new jwj(str, executionException);
        }
        throw ((jwu) executionException.getCause());
    }

    public static boolean c(String str) {
        return aerv.a.eV().b() && !f(str);
    }

    public static boolean d(String str, jxk jxkVar) {
        if (!aerv.a.eV().c() || f(str)) {
            ((zdv) ((zdv) a.b().o(klm.a, 343)).q("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 113, "MigrationUtils.java")).x("Using GoogleAuthUtil for getToken for 1p app: %s", str);
            return false;
        }
        try {
            lvq.d(kcx.a.a(jxkVar, new kew[0]));
            ((zdv) ((zdv) a.b().o(klm.a, 343)).q("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 122, "MigrationUtils.java")).x("Using GoogleAuthClient for getToken for 1p app: %s", str);
            return true;
        } catch (InterruptedException | ExecutionException unused) {
            ((zdv) ((zdv) a.b().o(klm.a, 343)).q("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", 119, "MigrationUtils.java")).x("Using GoogleAuthUtil for getToken for 1p app: %s", str);
            return false;
        }
    }

    public static Account[] e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleAccount googleAccount = (GoogleAccount) it.next();
            arrayList.add(new Account(googleAccount.c, googleAccount.b));
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    private static boolean f(String str) {
        return aerv.a.eV().a().b.contains(str);
    }
}
