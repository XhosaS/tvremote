package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nhk {
    public static final String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final String c = "androidPackageName";
    public static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final rza e = new rza("Auth", "GoogleAuthUtil");

    private static void a(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = c;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static TokenData b(final Context context, final Account account, final String str, Bundle bundle) throws Exception {
        final long j;
        Exception exc;
        final Bundle bundle2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final rbi rbiVarL = rbi.l(context);
        try {
            ocv.az("Calling this from your main thread can lead to deadlock");
            ocv.aE(str, "Scope cannot be empty or null.");
            i(account);
            e(context, 8400000);
            if (bundle == null) {
                try {
                    bundle2 = new Bundle();
                } catch (Exception e2) {
                    exc = e2;
                    j = jCurrentTimeMillis;
                    rbiVarL.i(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } else {
                bundle2 = new Bundle(bundle);
            }
            a(context, bundle2);
            j = jCurrentTimeMillis;
            try {
                nhj nhjVar = new nhj() { // from class: nhg
                    @Override // defpackage.nhj
                    public final Object a(IBinder iBinder) throws nhc, IOException {
                        ndp ndpVar;
                        String strAM;
                        String[] strArr = nhk.b;
                        TokenData tokenData = null;
                        if (iBinder == null) {
                            ndpVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            ndpVar = iInterfaceQueryLocalInterface instanceof ndp ? (ndp) iInterfaceQueryLocalInterface : new ndp(iBinder);
                        }
                        Bundle bundle3 = bundle2;
                        String str2 = str;
                        Account account2 = account;
                        Parcel parcelK = ndpVar.k();
                        ifl.c(parcelK, account2);
                        parcelK.writeString(str2);
                        ifl.c(parcelK, bundle3);
                        Parcel parcelL = ndpVar.l(5, parcelK);
                        Bundle bundle4 = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
                        parcelL.recycle();
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
                        rbi rbiVar = rbiVarL;
                        if (tokenData != null) {
                            rbiVar.i(1709, 0, j3, System.currentTimeMillis(), j2);
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
                                            strAM = "AccountNotPresent";
                                            break;
                                        case 49501:
                                            strAM = "AppSuspended";
                                            break;
                                        case 49502:
                                            strAM = "InvalidScope";
                                            break;
                                        case 49503:
                                            strAM = "NeedPermission";
                                            break;
                                        case 49504:
                                            strAM = "NeedRemoteConsent";
                                            break;
                                        case 49505:
                                            strAM = "PermissionDenied";
                                            break;
                                        case 49506:
                                            strAM = "UnknownError";
                                            break;
                                        default:
                                            switch (i) {
                                                case 49508:
                                                    strAM = "ServiceUnavailable";
                                                    break;
                                                case 49509:
                                                    strAM = "InvalidRequest";
                                                    break;
                                                case 49510:
                                                    strAM = "EmptyConsumerPackageOrSignature";
                                                    break;
                                                case 49511:
                                                    strAM = "NeedsTwoFactorAuth";
                                                    break;
                                                case 49512:
                                                    strAM = "NeedsBrowser";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 49514:
                                                            strAM = "UserCancel";
                                                            break;
                                                        case 49515:
                                                            strAM = "RestrictedClient";
                                                            break;
                                                        case 49516:
                                                            strAM = "InvalidAudience";
                                                            break;
                                                        case 49517:
                                                            strAM = "UnregisteredOnApiConsole";
                                                            break;
                                                        case 49518:
                                                            strAM = "ThirdPartyDeviceManagementRequired";
                                                            break;
                                                        case 49519:
                                                            strAM = "DeviceManagementInternalError";
                                                            break;
                                                        case 49520:
                                                            strAM = "DeviceManagementSyncDisabled";
                                                            break;
                                                        case 49521:
                                                            strAM = "DeviceManagementAdminBlocked";
                                                            break;
                                                        case 49522:
                                                            strAM = "DeviceManagementAdminPendingApproval";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 49524:
                                                                    strAM = "DeviceManagementDeactivated";
                                                                    break;
                                                                case 49525:
                                                                    strAM = "DeviceManagementScreenLockRequired";
                                                                    break;
                                                                case 49526:
                                                                    strAM = "DeviceManagementRequired";
                                                                    break;
                                                                case 49527:
                                                                    strAM = "DeviceManagementRequiredOrSyncDisabled";
                                                                    break;
                                                                case 49528:
                                                                    strAM = "AuthSecurityError";
                                                                    break;
                                                                case 49529:
                                                                    strAM = "AuthBindingError";
                                                                    break;
                                                                case 49530:
                                                                    strAM = "BadAuthentication";
                                                                    break;
                                                                case 49531:
                                                                    strAM = "NetworkError";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 49754:
                                                                            strAM = "CapabilityResponseYes";
                                                                            break;
                                                                        case 49755:
                                                                            strAM = "CapabilityResponseNo";
                                                                            break;
                                                                        case 49756:
                                                                            strAM = "CapabilityResponseNotPermitted";
                                                                            break;
                                                                        case 49757:
                                                                            strAM = "CapabilityResponseRequestFailed";
                                                                            break;
                                                                        case 49758:
                                                                            strAM = "CapabilityResponseUnknownCapability";
                                                                            break;
                                                                        case 49759:
                                                                            strAM = "CapabilityResponseFailedToSync";
                                                                            break;
                                                                        default:
                                                                            strAM = ocv.aM(i);
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else {
                                    strAM = "DeviceManagementStaleSyncRequired";
                                }
                                if (!strAM.equals(string)) {
                                    i++;
                                }
                            } else {
                                i = 13;
                            }
                        }
                        Context context2 = context;
                        rbiVar.i(1709, i, j3, System.currentTimeMillis(), j2);
                        nhk.f(context2, "getTokenWithDetails", string, intent, pendingIntent);
                        throw new nhc("Invalid state. Shouldn't happen");
                    }
                };
                rbiVarL = rbiVarL;
                try {
                    return (TokenData) g(context, d, nhjVar);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    rbiVarL.i(1709, 13, j, System.currentTimeMillis(), jElapsedRealtime);
                    throw exc;
                }
            } catch (Exception e4) {
                e = e4;
                rbiVarL = rbiVarL;
            }
        } catch (Exception e5) {
            e = e5;
            j = jCurrentTimeMillis;
        }
    }

    public static String c(Context context, String str) {
        ocv.aE(str, "accountName must be provided");
        ocv.az("Calling this from your main thread can lead to deadlock");
        e(context, 8400000);
        Bundle bundle = new Bundle();
        Account account = new Account(str, "com.google");
        i(account);
        return b(context, account, "^^_account_id_^^", bundle).b;
    }

    public static void d(Context context, String str) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        rbi rbiVarL = rbi.l(context);
        try {
            ocv.az("Calling this from your main thread can lead to deadlock");
            e(context, 8400000);
            Bundle bundle = new Bundle();
            a(context, bundle);
            g(context, d, new nhh(str, bundle));
            rbiVarL.i(1707, 0, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
        } catch (Exception e2) {
            rbiVarL.i(1707, 13, jCurrentTimeMillis, System.currentTimeMillis(), jElapsedRealtime);
            throw e2;
        }
    }

    public static void e(Context context, int i) {
        try {
            nwb.c(context.getApplicationContext(), i);
        } catch (GooglePlayServicesIncorrectManifestValueException | nvz e2) {
            throw new nhc(e2.getMessage(), e2);
        } catch (nwa e3) {
            throw new nhm(e3.a, e3.getMessage(), new Intent(e3.b));
        }
    }

    public static void f(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws nhc, IOException {
        njv njvVarA = njv.a(str2);
        rza rzaVar = e;
        rzaVar.f(String.format("[GoogleAuthUtil] error status:%s with method:%s", njvVarA, str));
        if (!njv.BAD_AUTHENTICATION.equals(njvVarA) && !njv.CAPTCHA.equals(njvVarA) && !njv.NEED_PERMISSION.equals(njvVarA) && !njv.NEED_REMOTE_CONSENT.equals(njvVarA) && !njv.NEEDS_BROWSER.equals(njvVarA) && !njv.USER_CANCEL.equals(njvVarA) && !njv.DEVICE_MANAGEMENT_REQUIRED.equals(njvVarA) && !njv.DM_INTERNAL_ERROR.equals(njvVarA) && !njv.DM_SYNC_DISABLED.equals(njvVarA) && !njv.DM_ADMIN_BLOCKED.equals(njvVarA) && !njv.DM_ADMIN_PENDING_APPROVAL.equals(njvVarA) && !njv.DM_STALE_SYNC_REQUIRED.equals(njvVarA) && !njv.DM_DEACTIVATED.equals(njvVarA) && !njv.DM_REQUIRED.equals(njvVarA) && !njv.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(njvVarA) && !njv.DM_SCREENLOCK_REQUIRED.equals(njvVarA)) {
            if (!njv.NETWORK_ERROR.equals(njvVarA) && !njv.SERVICE_UNAVAILABLE.equals(njvVarA) && !njv.INTNERNAL_ERROR.equals(njvVarA) && !njv.AUTH_SECURITY_ERROR.equals(njvVarA) && !njv.ACCOUNT_NOT_PRESENT.equals(njvVarA)) {
                throw new nhc(str2);
            }
            throw new IOException(str2);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.a(str2, intent);
        }
        nvj nvjVar = nvj.a;
        int iA = nwb.a(context);
        if (iA >= 233800000 && pendingIntent == null) {
            rzaVar.e(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.valueOf(iA), str, 233800000));
        }
        if (intent == null) {
            rzaVar.e(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str));
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    public static Object g(Context context, ComponentName componentName, nhj nhjVar) throws IOException {
        nvd nvdVar = new nvd();
        obi obiVarA = obi.a(context);
        try {
            try {
                if (!obiVarA.d(new obh(componentName), nvdVar, "GoogleAuthUtil").c()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    ocv.az("BlockingServiceConnection.getService() called on main thread");
                    if (nvdVar.a) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    nvdVar.a = true;
                    return nhjVar.a((IBinder) nvdVar.b.take());
                } catch (RemoteException | InterruptedException | TimeoutException e2) {
                    throw new IOException("Error on service connection.", e2);
                }
            } finally {
                obiVarA.b(componentName, nvdVar);
            }
        } catch (SecurityException e3) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e3.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e3);
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        e.f("Service call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static void i(Account account) {
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
