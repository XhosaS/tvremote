package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nim {
    public static final tui a = tui.l("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper");
    public final nib b;

    public nim(Context context) {
        rwv.c(context);
        this.b = new nil(context);
    }

    public static Object a(onz onzVar) {
        return ocv.e() ? ((ufb) qtl.aH(onzVar)).s() : osk.s(onzVar);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public final TokenData b(Context context, Account account, String str) throws nhc, IOException {
        TokenData tokenData;
        nia niaVar;
        Long l;
        List list;
        Bundle bundle = new Bundle();
        String packageName = context.getPackageName();
        boolean zC = xea.a.get().c();
        nib nibVar = this.b;
        if (!zC || nin.a(packageName)) {
            ((tug) ((tug) nin.a.e().h(ocq.a, 343)).j("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", R.styleable.AppCompatTheme_toolbarStyle, "MigrationUtils.java")).v("Using GoogleAuthUtil for getToken for 1p app: %s", packageName);
        } else {
            try {
                osk.s(nvj.a.b(nibVar, new nwv[0]));
                ((tug) ((tug) nin.a.e().h(ocq.a, 343)).j("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", R.styleable.AppCompatTheme_windowFixedWidthMajor, "MigrationUtils.java")).v("Using GoogleAuthClient for getToken for 1p app: %s", packageName);
                try {
                    String str2 = account.name;
                    String str3 = nhd.a;
                    if (TextUtils.isEmpty(nhk.c(context, str2))) {
                        throw new IOException("Could not fetch gaia id for account.");
                    }
                    nib nibVar2 = this.b;
                    try {
                        qbn qbnVarA = nhu.a();
                        qbnVarA.c();
                        Iterator it = ((nhw) osk.s(nibVar2.a(qbnVarA.b()))).a.iterator();
                        while (true) {
                            tokenData = null;
                            if (!it.hasNext()) {
                                niaVar = null;
                                break;
                            }
                            niaVar = (nia) it.next();
                            if (niaVar.c.equals(account.name)) {
                                break;
                            }
                        }
                        if (niaVar == null) {
                            throw new IOException("Account not found: ".concat(String.valueOf(account.name)));
                        }
                        nhx nhxVar = new nhx();
                        int i = 2;
                        nhxVar.c = (byte) (nhxVar.c | 2);
                        nhxVar.b(0);
                        nhxVar.c(false);
                        nhxVar.d = niaVar;
                        if (str.startsWith("oauth2:")) {
                            nhxVar.e = ImmutableList.of(str.replaceFirst("^oauth2:", ""));
                        } else if (str.startsWith("weblogin:")) {
                            nhxVar.f = ImmutableList.of(str.replaceFirst("^weblogin:", ""));
                        } else if (str.startsWith("audience:server:client_id:")) {
                            nhxVar.h = ImmutableList.of(str.substring(26));
                        } else {
                            nhxVar.g = ImmutableList.of(str);
                        }
                        String string = bundle.getString("delegatee_user_id");
                        if (string != null) {
                            int i2 = bundle.getInt("delegation_type", 0);
                            nhxVar.i = string;
                            nhxVar.b(i2);
                        }
                        String string2 = bundle.getString(nhd.a);
                        if (string2 != null) {
                            nhxVar.j = string2;
                        }
                        nhxVar.c(bundle.getBoolean("suppressProgressScreen"));
                        Network network = (Network) bundle.getParcelable("networkToUse");
                        if (network != null) {
                            nhxVar.k = network;
                        }
                        if (nhxVar.d == null) {
                            throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
                        }
                        Object obj = nhxVar.e;
                        if (obj == null && nhxVar.f == null && nhxVar.g == null && nhxVar.h == null) {
                            throw new IllegalArgumentException("A token type must be specified.");
                        }
                        int i3 = obj != null ? 1 : 0;
                        if (nhxVar.f != null) {
                            i3++;
                        }
                        if (nhxVar.g != null) {
                            i3++;
                        }
                        if (nhxVar.h != null) {
                            i3++;
                        }
                        if (i3 == 0) {
                            throw new IllegalArgumentException("No auth token type specified. Please specify exactly one type of auth token.");
                        }
                        if (i3 > 1) {
                            throw new IllegalArgumentException("GetTokenRequest supports only one token type per request. Please call only one of setOauth2Scopes(), setWebLoginUrls(), setClientLoginScopes(), setOauth2TokenIdScopes()");
                        }
                        if (nhxVar.i != null && nhxVar.a() == 0) {
                            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
                        }
                        if (nhxVar.a() == 1 && nhxVar.i == null) {
                            throw new IllegalArgumentException("Please provide a delegatee user ID.");
                        }
                        if (nhxVar.c != 7) {
                            StringBuilder sb = new StringBuilder();
                            if ((1 & nhxVar.c) == 0) {
                                sb.append(" delegationType");
                            }
                            if ((nhxVar.c & 2) == 0) {
                                sb.append(" handleNotification");
                            }
                            if ((nhxVar.c & 4) == 0) {
                                sb.append(" suppressProgressScreen");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        nhy nhyVar = new nhy((nia) nhxVar.d, null, nhxVar.e, nhxVar.f, nhxVar.g, nhxVar.h, nhxVar.a, (String) nhxVar.i, false, null, (String) nhxVar.j, nhxVar.b, (Network) nhxVar.k);
                        Object obj2 = this.b;
                        oaf oafVar = new oaf();
                        oafVar.b = new nvg[]{new nvg("google_auth_api", 1L)};
                        oafVar.a = new nig(nhyVar, i);
                        oafVar.c = 1680;
                        nhz nhzVar = (nhz) osk.s(((nwq) obj2).r(oafVar.a()));
                        String str4 = nhzVar.a;
                        nic nicVar = nhzVar.b;
                        if (nicVar != null) {
                            Long l2 = nicVar.a;
                            list = nicVar.b;
                            l = l2;
                        } else {
                            l = null;
                            list = null;
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            tokenData = new TokenData(1, str4, l, false, false, list, null);
                        }
                        if (tokenData != null) {
                            return tokenData;
                        }
                        throw new IOException("Token is null");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Fetching accounts was interrupted", e);
                    } catch (ExecutionException e2) {
                        throw new IOException("Account not found: ".concat(String.valueOf(account.name)), e2);
                    }
                } catch (InterruptedException e3) {
                    Thread.currentThread().interrupt();
                    throw new IOException(e3);
                } catch (ExecutionException e4) {
                    if (e4.getCause() instanceof UserRecoverableAuthException) {
                        throw ((UserRecoverableAuthException) e4.getCause());
                    }
                    if (e4.getCause() instanceof nhc) {
                        throw ((nhc) e4.getCause());
                    }
                    if (e4.getCause() instanceof IOException) {
                        throw ((IOException) e4.getCause());
                    }
                    if (e4.getCause() instanceof nhm) {
                        throw ((nhm) e4.getCause());
                    }
                    throw new nhc("Unexpected exception while fetching token.", e4);
                }
            } catch (InterruptedException | ExecutionException unused) {
                ((tug) ((tug) nin.a.e().h(ocq.a, 343)).j("com/google/android/gms/auth/aang/migration/MigrationUtils", "shouldUseGoogleAuthClientForGetToken1p", R.styleable.AppCompatTheme_windowActionModeOverlay, "MigrationUtils.java")).v("Using GoogleAuthUtil for getToken for 1p app: %s", packageName);
            }
        }
        String str5 = nhd.a;
        return nhk.b(context, account, str, bundle);
    }
}
