package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.common.collect.ImmutableList;
import j$.util.DesugarArrays;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldy extends icu implements ldv, iea, iej {
    private static final tui k = tui.l("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl");
    public final Context g;
    public final xbw h;
    public ldx i;
    private final AccountManager l;
    private final SharedPreferences m;
    private final boolean n;
    private TokenData o;
    private Account p;
    private long q;
    private final Runnable s;
    private final Consumer t;
    private final ids v;
    private final kwy w;
    public long j = Long.MIN_VALUE;
    private ieg r = ieg.a;
    private boolean u = false;

    public ldy(Context context, SharedPreferences sharedPreferences, kwy kwyVar, xbw xbwVar, boolean z, Runnable runnable, Consumer consumer) throws nvz, nwa, RemoteException {
        this.g = context;
        this.w = kwyVar;
        this.h = xbwVar;
        this.n = !z;
        this.m = sharedPreferences;
        this.s = runnable;
        this.t = consumer;
        this.l = AccountManager.get(context);
        ids idsVarD = hjt.d(new ien(sharedPreferences, krh.USER_ACCOUNT), new iem(context, "android.intent.action.DEVICE_STORAGE_OK"));
        this.v = idsVarD;
        idsVarD.ea(this);
        dM();
    }

    private final Account B(ksn ksnVar) throws nvz, nwa, RemoteException {
        Account[] accountArrU = u();
        String strE = E(ksnVar.a);
        for (Account account : accountArrU) {
            if (strE.equals(E(account.name))) {
                return account;
            }
        }
        return null;
    }

    private final ieg C() throws nvz, nwa, RemoteException {
        SharedPreferences sharedPreferences = this.m;
        ieg iegVarA = ksn.a(sharedPreferences.getString(krh.USER_ACCOUNT, ""));
        if (!r(iegVarA)) {
            Account[] accountArrU = u();
            iegVarA = accountArrU.length == 0 ? ieg.a : ieg.f(ksn.b(accountArrU[0].name));
            sharedPreferences.edit().putString(krh.USER_ACCOUNT, ksn.c(iegVarA)).apply();
        }
        return iegVarA;
    }

    private final String D(ksn ksnVar, int i) throws nvz, InterruptedException, nwa, RemoteException, IOException, ldt {
        String str;
        try {
            Account accountB = B(ksnVar);
            if (accountB == null) {
                throw new ldt("No such account");
            }
            String strY = y(accountB);
            if (strY != null) {
                return strY;
            }
            if (SystemClock.elapsedRealtime() < this.j + 250) {
                ((tug) ((tug) k.f()).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthToken", 398, "AccountManagerWrapperImpl.java")).s("Cannot get user auth; within timeout retry period");
                throw new ldt(new TimeoutException());
            }
            try {
                Context context = this.g;
                TokenData tokenDataB = new nim(context).b(context, accountB, ((xlo) this.h.b()).g());
                String str2 = tokenDataB.b;
                if (str2 == null) {
                    throw new ldt("Null auth token");
                }
                A(accountB, tokenDataB);
                return str2;
            } catch (IOException e) {
                this.j = SystemClock.elapsedRealtime();
                ((tug) ((tug) k.f()).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthToken", 415, "AccountManagerWrapperImpl.java")).v("Cannot get user auth: network error; %s", e.getMessage());
                throw e;
            } catch (nhc e2) {
                ((tug) ((tug) k.f()).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthToken", 418, "AccountManagerWrapperImpl.java")).v("Cannot get user auth: network error; %s", e2.getMessage());
                throw new ldt(e2);
            }
        } catch (IOException e3) {
            if (i <= 0) {
                ((tug) ((tug) ((tug) k.f()).i(e3)).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthTokenWithRetries", (char) 437, "AccountManagerWrapperImpl.java")).s("Cannot get user auth: network error");
                throw new ldt(e3);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(4000 - (i * 1000));
                str = "AccountManagerWrapperImpl.java";
            } catch (InterruptedException e4) {
                str = "AccountManagerWrapperImpl.java";
                ((tug) ((tug) ((tug) k.e()).i(e4)).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthTokenWithRetries", (char) 432, str)).s("Interrupted");
            }
            ((tug) ((tug) ((tug) k.e()).i(e3)).j("com/google/android/apps/play/movies/common/service/accounts/AccountManagerWrapperImpl", "blockingGetAuthTokenWithRetries", (char) 434, str)).s("Failed to get user auth, retrying");
            return D(ksnVar, i - 1);
        }
    }

    private static String E(String str) {
        String strE = ksh.e(str);
        return (strE == null || !strE.endsWith("@googlemail.com")) ? strE : String.valueOf(strE.substring(0, strE.length() - 15)).concat("@gmail.com");
    }

    private final synchronized void F(String str) {
        try {
            try {
                Context context = this.g;
                String str2 = nhd.a;
                nhk.d(context, str);
            } catch (nhm e) {
                krd.c("Google play service is not available:".concat(String.valueOf(e.getMessage())));
            } catch (nhc e2) {
                krd.d("Google auth problem:", e2);
            }
        } catch (IOException e3) {
            krd.c("Cannot clear token:".concat(String.valueOf(e3.getMessage())));
        }
    }

    public final synchronized void A(Account account, TokenData tokenData) {
        this.o = tokenData;
        this.p = account;
        this.q = SystemClock.elapsedRealtime() + opc.a((ContentResolver) this.w.a, "videos:token_cache_duration", 3600000);
    }

    @Override // defpackage.ldv
    public final Account b(ieg iegVar) {
        if (iegVar.k()) {
            return null;
        }
        return B((ksn) iegVar.g());
    }

    @Override // defpackage.ldv
    public final Account c(String str) throws nvz, nwa, RemoteException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Account[] accountArrU = u();
        String strE = E(str);
        for (Account account : accountArrU) {
            if (strE.equals(E(account.name))) {
                return account;
            }
        }
        return null;
    }

    @Override // defpackage.iej
    public final void dM() throws nvz, nwa, RemoteException {
        ieg iegVarC = C();
        if (this.r.equals(iegVarC)) {
            return;
        }
        this.r = iegVarC;
        eb();
        if (this.u) {
            this.s.run();
        } else {
            this.u = true;
        }
    }

    @Override // defpackage.ldv
    public final Intent e(ieg iegVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        bundle.putString("authAccount", ksn.c(iegVar));
        bundle.putString("accountType", "com.google");
        return AccountManager.newChooseAccountIntent(null, new ArrayList(), new String[]{"com.google"}, null, l(), null, bundle);
    }

    @Override // defpackage.ieh
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ieg a() {
        if (this.r.l() && ksk.q()) {
            dM();
        }
        return this.r;
    }

    @Override // defpackage.ldv
    public final ieh h() {
        return new kqd(this, 2);
    }

    @Override // defpackage.ldv
    public final TokenData i(ieg iegVar) {
        if (this.o == null || !iegVar.m() || !B((ksn) iegVar.g()).equals(this.p) || SystemClock.elapsedRealtime() >= this.q) {
            return null;
        }
        return this.o;
    }

    @Override // defpackage.ldv
    public final String j(ieg iegVar) throws ldt {
        if (iegVar.k()) {
            throw new ldt("No such account");
        }
        return D((ksn) iegVar.g(), 3);
    }

    @Override // defpackage.ldv
    public final String k() {
        return "com.google";
    }

    @Override // defpackage.ldv
    public final String l() {
        return ((xlo) this.h.b()).g();
    }

    @Override // defpackage.ldv
    public final synchronized void m(String str) {
        F(str);
        TokenData tokenData = this.o;
        if (tokenData == null || !TextUtils.equals(tokenData.b, str)) {
            return;
        }
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.ldv
    @Deprecated
    public final synchronized void n(String str) {
        String str2 = nhd.a;
        AccountManager.get(this.g).invalidateAuthToken("com.google", str);
        TokenData tokenData = this.o;
        if (tokenData == null || !TextUtils.equals(tokenData.b, str)) {
            return;
        }
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.ldv
    public final void o(ieg iegVar, Activity activity, ldu lduVar) {
        lduVar.getClass();
        Account accountB = b(iegVar);
        if (accountB != null) {
            z(accountB, activity, lduVar, this.n);
        } else if (iegVar.k()) {
            lduVar.I(iegVar);
        } else {
            lduVar.H(iegVar, new AuthenticatorException("User account not found."));
        }
    }

    @Override // defpackage.ldv
    public final void p(ksn ksnVar) throws nvz, nwa, RemoteException {
        if (s(ksnVar)) {
            String str = ksnVar.a;
            SharedPreferences sharedPreferences = this.m;
            if (!TextUtils.equals(sharedPreferences.getString(krh.USER_ACCOUNT, ""), str)) {
                sharedPreferences.edit().putString(krh.USER_ACCOUNT, str).commit();
            }
        }
        dM();
    }

    @Override // defpackage.ldv
    public final void q(ksn ksnVar, Intent intent) throws nvz, nwa, RemoteException {
        if (s(ksnVar)) {
            String str = ksnVar.a;
            SharedPreferences sharedPreferences = this.m;
            if (!TextUtils.equals(sharedPreferences.getString(krh.USER_ACCOUNT, ""), str)) {
                sharedPreferences.edit().putString(krh.USER_ACCOUNT, str).commit();
            }
        }
        ieg iegVarC = C();
        if (!this.r.equals(iegVarC)) {
            this.r = iegVarC;
        }
        eb();
        this.t.accept(intent);
    }

    @Override // defpackage.ldv
    public final boolean r(ieg iegVar) {
        return iegVar.m() && B((ksn) iegVar.g()) != null;
    }

    @Override // defpackage.ldv
    public final boolean s(ksn ksnVar) {
        return B(ksnVar) != null;
    }

    @Override // defpackage.ldv
    public final boolean t(String str) {
        try {
            j(ksn.a(str));
            return true;
        } catch (ldt e) {
            if (e.getCause() != null) {
                return false;
            }
            krd.d("Authentication failed", e);
            return false;
        }
    }

    @Override // defpackage.ldv
    public final Account[] u() throws nvz, nwa, RemoteException {
        try {
            Context context = this.g;
            nim nimVar = new nim(context);
            String packageName = context.getPackageName();
            if (!xea.a.get().b() || nin.a(packageName)) {
                return nhd.a(context);
            }
            try {
                nim.a(nvj.a.b(nimVar.b, new nwv[0]));
                ((tug) ((tug) nim.a.e().h(ocq.a, 343)).j("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 129, "GoogleAuthClientWrapper.java")).v("Using GoogleAuthClient for getAccounts for 1p app: %s", context.getPackageName());
                ImmutableList.of();
                try {
                    nib nibVar = nimVar.b;
                    qbn qbnVarA = nhu.a();
                    qbnVarA.c();
                    List<nia> list = ((nhw) nim.a(nibVar.a(qbnVarA.b()))).a;
                    ArrayList arrayList = new ArrayList();
                    for (nia niaVar : list) {
                        arrayList.add(new Account(niaVar.c, niaVar.b));
                    }
                    return (Account[]) arrayList.toArray(new Account[0]);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RemoteException("Fetching accounts was interrupted. ".concat(e.toString()));
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof RemoteException) {
                        throw ((RemoteException) e2.getCause());
                    }
                    if (e2.getCause() instanceof nwa) {
                        throw ((nwa) e2.getCause());
                    }
                    if (e2.getCause() instanceof nvz) {
                        throw ((nvz) e2.getCause());
                    }
                    throw new RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e2.toString()));
                }
            } catch (InterruptedException | ExecutionException unused) {
                ((tug) ((tug) nim.a.e().h(ocq.a, 343)).j("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper", "getAccounts", 132, "GoogleAuthClientWrapper.java")).v("Using GoogleAuthUtil for getAccounts for 1p app: %s", context.getPackageName());
                return nhd.a(context);
            }
        } catch (Exception e3) {
            krd.d("getAccounts failed", e3);
            return new Account[0];
        }
    }

    @Override // defpackage.ldv
    public final void v(OnAccountsUpdateListener onAccountsUpdateListener) {
        this.l.addOnAccountsUpdatedListener(onAccountsUpdateListener, null, true);
    }

    @Override // defpackage.ldv
    public final AccountManagerFuture w() {
        Optional optionalFindFirst = DesugarArrays.stream(u()).filter(new ldw(this, 0)).findFirst();
        if (!optionalFindFirst.isPresent()) {
            throw null;
        }
        return this.l.hasFeatures((Account) optionalFindFirst.get(), new String[]{"uca"}, null, null);
    }

    @Override // defpackage.ldv
    public final boolean x(int i, int i2) {
        if (i != 904) {
            return false;
        }
        ldx ldxVar = this.i;
        this.i = null;
        if (ldxVar == null) {
            return false;
        }
        if (i2 == -1) {
            ldxVar.e.z(ldxVar.b, ldxVar.a, ldxVar.c, ldxVar.d);
            return true;
        }
        ldxVar.c.I(ksn.a(ldxVar.b.name));
        return true;
    }

    public final synchronized String y(Account account) {
        String str;
        TokenData tokenData = this.o;
        if (tokenData != null && (str = tokenData.b) != null && account.equals(this.p)) {
            if (SystemClock.elapsedRealtime() < this.q) {
                return str;
            }
        }
        return null;
    }

    public final void z(Account account, Activity activity, ldu lduVar, boolean z) {
        new ldx(this, activity, account, lduVar, z).execute(new Void[0]);
    }

    @Override // defpackage.ldv
    public final iea f() {
        return this;
    }
}
