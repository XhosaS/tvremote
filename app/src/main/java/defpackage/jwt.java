package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class jwt implements jwr {
    public final Context a;
    public final yrp b;

    public jwt(final Context context) {
        this.a = context;
        this.b = yru.a(new yrp() { // from class: jws
            @Override // defpackage.yrp
            public final Object eV() {
                return new jxx(context);
            }
        });
    }

    @Override // defpackage.jwr
    public final lvf a(String str) throws Exception {
        try {
            Context context = this.a;
            String str2 = jwk.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jwi jwiVarA = jwi.a(context);
            try {
                kkk.e("Calling this from your main thread can lead to deadlock");
                jwq.c(context, 8400000);
                Bundle bundle = new Bundle();
                jwq.d(context, bundle);
                jwq.f(context, jwq.d, new jwn(str, bundle), null);
                jwiVarA.b(1707, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                return lvq.c(null);
            } catch (Exception e) {
                jwiVarA.b(1707, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                throw e;
            }
        } catch (IOException | jwj e2) {
            return lvq.b(e2);
        }
    }

    @Override // defpackage.jwr
    public final lvf b(String str) {
        try {
            Context context = this.a;
            String str2 = jwk.a;
            return lvq.c(jwq.a(context, str));
        } catch (IOException | jwj e) {
            return lvq.b(e);
        }
    }

    @Override // defpackage.jwr
    public final lvf c(Account account, String str) throws IOException {
        String strB;
        try {
            jxx jxxVar = (jxx) this.b.eV();
            Context context = this.a;
            Bundle bundle = new Bundle();
            String packageName = context.getPackageName();
            jxk jxkVar = jxxVar.b;
            if (jxy.d(packageName, jxkVar)) {
                try {
                    String str2 = account.name;
                    String str3 = jwk.a;
                    if (TextUtils.isEmpty(jwq.a(context, str2))) {
                        throw new IOException("Could not fetch gaia id for account.");
                    }
                    strB = ((GetTokenResponse) lvq.d(jxkVar.b(jxy.a(account, str, jxkVar, bundle).k()))).a;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IOException();
                } catch (ExecutionException e) {
                    jxy.b(e, "Unexpected exception while fetching token.");
                    String str4 = jwk.a;
                    strB = jwq.b(context, account, str, bundle);
                }
            } else {
                String str5 = jwk.a;
                strB = jwq.b(context, account, str, bundle);
            }
            return lvq.c(strB);
        } catch (IOException | jwj e2) {
            return lvq.b(e2);
        }
    }

    @Override // defpackage.jwr
    public final lvf d() throws kdr, RemoteException, kds {
        Account[] accountArrG;
        try {
            jxx jxxVar = (jxx) this.b.eV();
            Context context = this.a;
            if (jxy.c(context.getPackageName())) {
                try {
                    jxx.a(kcx.a.a(jxxVar.b, new kew[0]));
                    ((zdv) ((zdv) jxx.a.b().o(klm.a, 343)).q("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 129, "GoogleAuthClientWrapper.java")).x("Using GoogleAuthClient for getAccounts for 1p app: %s", context.getPackageName());
                    int i = yyk.e;
                    yyk yykVar = zcg.b;
                    try {
                        jxk jxkVar = jxxVar.b;
                        jxd jxdVarA = GetAccountsRequest.a();
                        ((jxb) jxdVarA).a = "com.google";
                        accountArrG = jxy.e(((GetAccountsResponse) jxx.a(jxkVar.a(jxdVarA.a()))).a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RemoteException("Fetching accounts was interrupted. ".concat(e.toString()));
                    } catch (ExecutionException e2) {
                        if (e2.getCause() instanceof RemoteException) {
                            throw ((RemoteException) e2.getCause());
                        }
                        if (e2.getCause() instanceof kds) {
                            throw ((kds) e2.getCause());
                        }
                        if (e2.getCause() instanceof kdr) {
                            throw ((kdr) e2.getCause());
                        }
                        throw new RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e2.toString()));
                    }
                } catch (InterruptedException | ExecutionException unused) {
                    ((zdv) ((zdv) jxx.a.b().o(klm.a, 343)).q("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 132, "GoogleAuthClientWrapper.java")).x("Using GoogleAuthUtil for getAccounts for 1p app: %s", context.getPackageName());
                    String str = jwk.a;
                    accountArrG = jwq.g(context);
                }
            } else {
                String str2 = jwk.a;
                accountArrG = jwq.g(context);
            }
            return lvq.c(accountArrG);
        } catch (RemoteException | kdr | kds e3) {
            return lvq.b(e3);
        }
    }
}
