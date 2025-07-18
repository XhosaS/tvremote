package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exx {
    public static final exx a = new exx();

    private exx() {
    }

    public final Intent a(adxv adxvVar, Account account) throws URISyntaxException {
        int iA;
        Intent uri = null;
        if (adxvVar != null && ((iA = adxu.a(adxvVar.c)) == 0 || iA == 1)) {
            String str = adxvVar.d;
            str.getClass();
            boolean z = str.length() > 0;
            String str2 = adxvVar.e;
            str2.getClass();
            boolean z2 = str2.length() > 0;
            if (z && z2) {
                uri = new Intent(adxvVar.e, Uri.parse(adxvVar.d));
            } else if (z) {
                try {
                    uri = Intent.parseUri(adxvVar.d, 1);
                } catch (URISyntaxException e) {
                    ((zdv) ((zdv) exy.a.c()).p(e).q("com/google/android/apps/tvsearch/app/intentutils/IntentUtils", "toIntent", 72, "IntentUtils.kt")).u("Invalid intent uri");
                    return null;
                }
            } else if (z2) {
                uri = new Intent(adxvVar.e);
            }
            if (!agvy.c(uri.getAction(), "android.search.action.GLOBAL_SEARCH")) {
                uri.setFlags(335544320);
            }
            String str3 = adxvVar.i;
            str3.getClass();
            if (str3.length() > 0) {
                uri.setPackage(adxvVar.i);
            }
            if (adxvVar.h && account != null) {
                uri.putExtra("authAccount", account.name);
            }
            uri.getClass();
            abxs<adxz> abxsVar = adxvVar.f;
            abxsVar.getClass();
            for (adxz adxzVar : abxsVar) {
                int iA2 = adxy.a(adxzVar.b);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i = iA2 - 1;
                if (i == 0) {
                    uri.putExtra(adxzVar.c, adxzVar.d).getClass();
                } else if (i == 1) {
                    uri.putExtra(adxzVar.c, adxzVar.e).getClass();
                } else if (i != 2) {
                    uri.putExtra(adxzVar.c, adxzVar.g).getClass();
                } else {
                    uri.putExtra(adxzVar.c, adxzVar.f).getClass();
                }
            }
        }
        return uri;
    }

    public final Intent b(aebk aebkVar, Account account) throws URISyntaxException {
        Intent uri = null;
        if (aebkVar == null) {
            return null;
        }
        int iA = aebj.a(aebkVar.h);
        if (iA != 0 && iA == 3 && (aebkVar.b & 64) != 0) {
            byte[] bArrB = aebkVar.g.B();
            bArrB.getClass();
            Parcelable.Creator creator = Intent.CREATOR;
            creator.getClass();
            return (Intent) fen.c(bArrB, creator);
        }
        String str = aebkVar.c;
        str.getClass();
        boolean z = str.length() > 0;
        String str2 = aebkVar.d;
        str2.getClass();
        boolean z2 = str2.length() > 0;
        if (z && z2) {
            uri = new Intent(aebkVar.d, Uri.parse(aebkVar.c));
        } else {
            if (!z) {
                if (z2) {
                    uri = new Intent(aebkVar.d);
                }
                return uri;
            }
            try {
                uri = Intent.parseUri(aebkVar.c, 1);
            } catch (URISyntaxException e) {
                ((zdv) ((zdv) exy.a.c()).p(e).q("com/google/android/apps/tvsearch/app/intentutils/IntentUtils", "toIntent", 43, "IntentUtils.kt")).u("Invalid intent uri");
                return null;
            }
        }
        if (aebkVar.f && account != null) {
            uri.putExtra("authAccount", account.name);
        }
        uri.getClass();
        abxs<aebe> abxsVar = aebkVar.e;
        abxsVar.getClass();
        for (aebe aebeVar : abxsVar) {
            int iA2 = aebd.a(aebeVar.b);
            if (iA2 == 0) {
                iA2 = 1;
            }
            int i = iA2 - 1;
            if (i == 0) {
                uri.putExtra(aebeVar.c, aebeVar.d).getClass();
            } else if (i == 1) {
                uri.putExtra(aebeVar.c, aebeVar.e).getClass();
            } else if (i != 2) {
                uri.putExtra(aebeVar.c, aebeVar.g).getClass();
            } else {
                uri.putExtra(aebeVar.c, aebeVar.f).getClass();
            }
        }
        return uri;
    }
}
