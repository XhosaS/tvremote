package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lhk {
    static final yyk a = yyk.u("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int b = 0;

    static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final String c(zzh zzhVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < zzhVar.a()) ? "0" : String.valueOf(str.charAt(zzhVar.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= zzhVar.a()) {
            strValueOf = String.valueOf(str2.charAt(zzhVar.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    static final boolean d(zzh zzhVar, yyr yyrVar, yyr yyrVar2, yzq yzqVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        lhj lhjVar;
        char c;
        int iF = f(zzhVar);
        if (iF > 0 && (i2 != 1 || i != 1)) {
            cArr[iF] = '2';
        }
        if (e(zzhVar, yyrVar2) == zzi.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (zzhVar == zzh.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && ((zdd) yzqVar).b.equals(str)) {
                if (iF > 0 && cArr[iF] != '2') {
                    cArr[iF] = '1';
                }
                return true;
            }
            if (yyrVar.containsKey(zzhVar) && (lhjVar = (lhj) yyrVar.get(zzhVar)) != null) {
                int iOrdinal = lhjVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return e(zzhVar, yyrVar2) == zzi.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(zzhVar, cArr, str3, z2) : g(zzhVar, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return e(zzhVar, yyrVar2) == zzi.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(zzhVar, cArr, str2, z) : h(zzhVar, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (e(zzhVar, yyrVar2) != zzi.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(zzhVar, cArr, str3, z2);
                    }
                } else if (e(zzhVar, yyrVar2) != zzi.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(zzhVar, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iF <= 0 || cArr[iF] == '2') {
            return false;
        }
        cArr[iF] = c;
        return false;
    }

    private static final zzi e(zzh zzhVar, yyr yyrVar) {
        return (zzi) yyrVar.getOrDefault(zzhVar, zzi.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final int f(zzh zzhVar) {
        if (zzhVar == zzh.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzhVar == zzh.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzhVar == zzh.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzhVar == zzh.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final boolean g(zzh zzhVar, char[] cArr, String str, boolean z) {
        char c;
        int iF = f(zzhVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= zzhVar.a()) {
                char cCharAt = str.charAt(zzhVar.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iF > 0 && cArr[iF] != '2') {
                    cArr[iF] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iF > 0 && cArr[iF] != '2') {
            cArr[iF] = c;
        }
        return false;
    }

    private static final boolean h(zzh zzhVar, char[] cArr, String str, boolean z) {
        char c;
        int iF = f(zzhVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= zzhVar.a()) {
                char cCharAt = str.charAt(zzhVar.a() - 1);
                boolean z2 = cCharAt == '1';
                if (iF > 0 && cArr[iF] != '2') {
                    cArr[iF] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iF > 0 && cArr[iF] != '2') {
            cArr[iF] = c;
        }
        return false;
    }
}
