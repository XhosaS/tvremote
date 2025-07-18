package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jwq {
    private static final kld a;
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        String str = new String[]{"GoogleAuthUtil"}[0];
        if (sb.length() > 1) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("] ");
        a = new kld(sb.toString());
    }

    public static String a(Context context, String str) throws jwj {
        kkk.i(str, "accountName must be provided");
        kkk.e("Calling this from your main thread can lead to deadlock");
        c(context, 8400000);
        return b(context, new Account(str, "com.google"), "^^_account_id_^^", new Bundle());
    }

    public static String b(Context context, Account account, String str, Bundle bundle) {
        k(account);
        return i(context, account, str, bundle, null).b;
    }

    public static void c(Context context, int i) throws jwj {
        try {
            kdu.b(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException | kdr e) {
            throw new jwj(e.getMessage(), e);
        } catch (kds e2) {
            throw new jwu(e2.getMessage(), new Intent(e2.b));
        }
    }

    public static void d(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void e(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws IOException, jwj {
        jyk jykVarA = jyk.a(str2);
        kld kldVar = a;
        kldVar.c(String.format("[GoogleAuthUtil] error status:%s with method:%s", jykVarA, str));
        if (!jyk.BAD_AUTHENTICATION.equals(jykVarA) && !jyk.CAPTCHA.equals(jykVarA) && !jyk.NEED_PERMISSION.equals(jykVarA) && !jyk.NEED_REMOTE_CONSENT.equals(jykVarA) && !jyk.NEEDS_BROWSER.equals(jykVarA) && !jyk.USER_CANCEL.equals(jykVarA) && !jyk.DEVICE_MANAGEMENT_REQUIRED.equals(jykVarA) && !jyk.DM_INTERNAL_ERROR.equals(jykVarA) && !jyk.DM_SYNC_DISABLED.equals(jykVarA) && !jyk.DM_ADMIN_BLOCKED.equals(jykVarA) && !jyk.DM_ADMIN_PENDING_APPROVAL.equals(jykVarA) && !jyk.DM_STALE_SYNC_REQUIRED.equals(jykVarA) && !jyk.DM_DEACTIVATED.equals(jykVarA) && !jyk.DM_REQUIRED.equals(jykVarA) && !jyk.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(jykVarA) && !jyk.DM_SCREENLOCK_REQUIRED.equals(jykVarA)) {
            if (!jyk.NETWORK_ERROR.equals(jykVarA) && !jyk.SERVICE_UNAVAILABLE.equals(jykVarA) && !jyk.INTNERNAL_ERROR.equals(jykVarA) && !jyk.AUTH_SECURITY_ERROR.equals(jykVarA) && !jyk.ACCOUNT_NOT_PRESENT.equals(jykVarA)) {
                throw new jwj(str2);
            }
            throw new IOException(str2);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent);
        }
        kcx kcxVar = kcx.a;
        int iA = kdu.a(context);
        if (iA >= 233800000 && pendingIntent == null) {
            kldVar.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(iA), str, 233800000));
        }
        if (intent == null) {
            kldVar.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str));
        }
        throw new UserRecoverableAuthException(str2, intent, jww.LEGACY);
    }

    public static Object f(Context context, ComponentName componentName, jwp jwpVar, Executor executor) throws IOException {
        kcq kcqVar = new kcq();
        kjp kjpVarB = kjp.b(context);
        try {
            try {
                if (!kjpVarB.a(new kjo(componentName), kcqVar, "GoogleAuthUtil", executor).c()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    kkk.e("BlockingServiceConnection.getService() called on main thread");
                    if (kcqVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    kcqVar.a = true;
                    return jwpVar.a((IBinder) kcqVar.b.take());
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                kjpVarB.c(componentName, kcqVar);
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static Account[] g(Context context) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jwi jwiVarA = jwi.a(context);
        try {
            kkk.h("com.google");
            try {
                int i = kcy.c;
                kdu.b(context, 8400000);
                kkk.k(context);
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireContentProviderClient == null) {
                        throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("callingActivity", context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "");
                            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("get_accounts", "com.google", bundle);
                            if (bundleCall == null) {
                                throw new RemoteException("Null result from AccountChimeraContentProvider");
                            }
                            Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                            if (parcelableArray == null) {
                                throw new RemoteException("Key_Accounts is Null");
                            }
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            contentProviderClientAcquireContentProviderClient.release();
                            jwiVarA.b(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                            return accountArr;
                        } catch (Exception e) {
                            a.a("Exception when getting accounts", e);
                            throw new RemoteException("Accounts ContentProvider failed: " + e.getMessage());
                        }
                    } catch (RemoteException e2) {
                        a.a("RemoteException when fetching accounts", e2);
                        throw e2;
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireContentProviderClient.release();
                    throw th;
                }
            } catch (GooglePlayServicesIncorrectManifestValueException unused) {
                throw new kdr(18);
            }
        } catch (Exception e3) {
            jwiVarA.b(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }

    public static Account[] h(Context context, final String[] strArr) throws Exception {
        final String className;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final jwi jwiVarA = jwi.a(context);
        try {
            kkk.k(context);
            kkk.h("com.google");
            c(context, 8400000);
            className = context instanceof Activity ? ((Activity) context).getComponentName().getClassName() : "";
        } catch (Exception e) {
            e = e;
        }
        try {
            jwp jwpVar = new jwp() { // from class: jwl
                public final /* synthetic */ String a = "com.google";

                @Override // defpackage.jwp
                public final Object a(IBinder iBinder) throws IOException {
                    jrz jrzVar;
                    Parcelable[] parcelableArray;
                    String[] strArr2 = jwq.b;
                    if (iBinder == null) {
                        jrzVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                        jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
                    }
                    String str = className;
                    String[] strArr3 = strArr;
                    String str2 = this.a;
                    Bundle bundle = new Bundle();
                    bundle.putString("accountType", str2);
                    bundle.putStringArray("account_features", strArr3);
                    bundle.putString("callingActivity", str);
                    Parcel parcelA = jrzVar.a();
                    erv.b(parcelA, bundle);
                    Parcel parcelB = jrzVar.b(6, parcelA);
                    Bundle bundle2 = (Bundle) erv.a(parcelB, Bundle.CREATOR);
                    parcelB.recycle();
                    if (bundle2 == null || (parcelableArray = bundle2.getParcelableArray("accounts")) == null) {
                        throw new IOException("Receive null result from service call.");
                    }
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i = 0; i < parcelableArray.length; i++) {
                        accountArr[i] = (Account) parcelableArray[i];
                    }
                    jwiVarA.b(1708, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
                    return accountArr;
                }
            };
            jwiVarA = jwiVarA;
            return (Account[]) f(context, d, jwpVar, null);
        } catch (Exception e2) {
            e = e2;
            jwiVarA = jwiVarA;
            Exception exc = e;
            jwiVarA.b(1708, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw exc;
        }
    }

    public static TokenData i(final Context context, final Account account, final String str, Bundle bundle, Executor executor) throws Exception {
        final long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final jwi jwiVarA = jwi.a(context);
        try {
            kkk.e("Calling this from your main thread can lead to deadlock");
            kkk.i(str, "Scope cannot be empty or null.");
            k(account);
            c(context, 8400000);
            final Bundle bundle2 = new Bundle(bundle);
            d(context, bundle2);
            j = jCurrentTimeMillis;
            try {
                jwp jwpVar = new jwp() { // from class: jwm
                    @Override // defpackage.jwp
                    public final Object a(IBinder iBinder) throws IOException, jwj {
                        jrz jrzVar;
                        String strA;
                        String[] strArr = jwq.b;
                        TokenData tokenData = null;
                        if (iBinder == null) {
                            jrzVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            jrzVar = iInterfaceQueryLocalInterface instanceof jrz ? (jrz) iInterfaceQueryLocalInterface : new jrz(iBinder);
                        }
                        Bundle bundle3 = bundle2;
                        String str2 = str;
                        Account account2 = account;
                        Parcel parcelA = jrzVar.a();
                        erv.b(parcelA, account2);
                        parcelA.writeString(str2);
                        erv.b(parcelA, bundle3);
                        Parcel parcelB = jrzVar.b(5, parcelA);
                        Bundle bundle4 = (Bundle) erv.a(parcelB, Bundle.CREATOR);
                        parcelB.recycle();
                        if (bundle4 == null) {
                            throw new IOException("Service call returned null");
                        }
                        ClassLoader classLoader = TokenData.class.getClassLoader();
                        if (classLoader != null) {
                            bundle4.setClassLoader(classLoader);
                        }
                        Bundle bundle5 = bundle4.getBundle("tokenDetails");
                        if (bundle5 != null) {
                            if (classLoader != null) {
                                bundle5.setClassLoader(classLoader);
                            }
                            tokenData = (TokenData) bundle5.getParcelable("TokenData");
                        }
                        long j2 = jElapsedRealtime;
                        long j3 = j;
                        jwi jwiVar = jwiVarA;
                        if (tokenData != null) {
                            jwiVar.b(1709, 0, j3, System.currentTimeMillis(), j2);
                            return tokenData;
                        }
                        String string = bundle4.getString("Error");
                        Intent intent = (Intent) bundle4.getParcelable("userRecoveryIntent");
                        PendingIntent pendingIntent = (PendingIntent) bundle4.getParcelable("userRecoveryPendingIntent");
                        int i = 49500;
                        while (true) {
                            if (i < 50000) {
                                if (i != 495243) {
                                    switch (i) {
                                        case 49500:
                                            strA = "AccountNotPresent";
                                            break;
                                        case 49501:
                                            strA = "AppSuspended";
                                            break;
                                        case 49502:
                                            strA = "InvalidScope";
                                            break;
                                        case 49503:
                                            strA = "NeedPermission";
                                            break;
                                        case 49504:
                                            strA = "NeedRemoteConsent";
                                            break;
                                        case 49505:
                                            strA = "PermissionDenied";
                                            break;
                                        case 49506:
                                            strA = "UnknownError";
                                            break;
                                        default:
                                            switch (i) {
                                                case 49508:
                                                    strA = "ServiceUnavailable";
                                                    break;
                                                case 49509:
                                                    strA = "InvalidRequest";
                                                    break;
                                                case 49510:
                                                    strA = "EmptyConsumerPackageOrSignature";
                                                    break;
                                                case 49511:
                                                    strA = "NeedsTwoFactorAuth";
                                                    break;
                                                case 49512:
                                                    strA = "NeedsBrowser";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 49514:
                                                            strA = "UserCancel";
                                                            break;
                                                        case 49515:
                                                            strA = "RestrictedClient";
                                                            break;
                                                        case 49516:
                                                            strA = "InvalidAudience";
                                                            break;
                                                        case 49517:
                                                            strA = "UnregisteredOnApiConsole";
                                                            break;
                                                        case 49518:
                                                            strA = "ThirdPartyDeviceManagementRequired";
                                                            break;
                                                        case 49519:
                                                            strA = "DeviceManagementInternalError";
                                                            break;
                                                        case 49520:
                                                            strA = "DeviceManagementSyncDisabled";
                                                            break;
                                                        case 49521:
                                                            strA = "DeviceManagementAdminBlocked";
                                                            break;
                                                        case 49522:
                                                            strA = "DeviceManagementAdminPendingApproval";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 49524:
                                                                    strA = "DeviceManagementDeactivated";
                                                                    break;
                                                                case 49525:
                                                                    strA = "DeviceManagementScreenLockRequired";
                                                                    break;
                                                                case 49526:
                                                                    strA = "DeviceManagementRequired";
                                                                    break;
                                                                case 49527:
                                                                    strA = "DeviceManagementRequiredOrSyncDisabled";
                                                                    break;
                                                                case 49528:
                                                                    strA = "AuthSecurityError";
                                                                    break;
                                                                case 49529:
                                                                    strA = "AuthBindingError";
                                                                    break;
                                                                case 49530:
                                                                    strA = "BadAuthentication";
                                                                    break;
                                                                case 49531:
                                                                    strA = "NetworkError";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 49754:
                                                                            strA = "CapabilityResponseYes";
                                                                            break;
                                                                        case 49755:
                                                                            strA = "CapabilityResponseNo";
                                                                            break;
                                                                        case 49756:
                                                                            strA = "CapabilityResponseNotPermitted";
                                                                            break;
                                                                        case 49757:
                                                                            strA = "CapabilityResponseRequestFailed";
                                                                            break;
                                                                        case 49758:
                                                                            strA = "CapabilityResponseUnknownCapability";
                                                                            break;
                                                                        case 49759:
                                                                            strA = "CapabilityResponseFailedToSync";
                                                                            break;
                                                                        default:
                                                                            strA = keo.a(i);
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    strA = "DeviceManagementStaleSyncRequired";
                                }
                                if (!strA.equals(string)) {
                                    i++;
                                }
                            } else {
                                i = 13;
                            }
                        }
                        Context context2 = context;
                        jwiVar.b(1709, i, j3, System.currentTimeMillis(), j2);
                        jwq.e(context2, "getTokenWithDetails", string, intent, pendingIntent);
                        throw new jwj("Invalid state. Shouldn't happen");
                    }
                };
                jwiVarA = jwiVarA;
                try {
                    return (TokenData) f(context, d, jwpVar, executor);
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    jwiVarA.b(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } catch (Exception e2) {
                e = e2;
                jwiVarA = jwiVarA;
            }
        } catch (Exception e3) {
            e = e3;
            j = jCurrentTimeMillis;
        }
    }

    public static void j(Object obj) throws IOException {
        if (obj != null) {
            return;
        }
        a.c("Service call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static void k(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }
}
