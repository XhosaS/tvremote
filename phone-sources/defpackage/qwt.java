package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwt {
    public static final String a = "qwt";

    private qwt() {
    }

    public static rfc a(qwn qwnVar, Context context) {
        if (qwnVar.h.a) {
            return c(qwnVar.p, context);
        }
        return null;
    }

    public static boolean b(Context context) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            Log.e(a, "Failed to get DevicePolicyManager");
            return false;
        }
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins != null) {
            Iterator<ComponentName> it = activeAdmins.iterator();
            while (it.hasNext()) {
                if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static rfc c(rzy rzyVar, Context context) {
        CrossProfileApps crossProfileAppsM;
        if (Build.VERSION.SDK_INT < 28 || (crossProfileAppsM = hu$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(hu$$ExternalSyntheticApiModelOutline1.m()))) == null) {
            return null;
        }
        List targetUserProfiles = crossProfileAppsM.getTargetUserProfiles();
        if (targetUserProfiles.isEmpty()) {
            return null;
        }
        UserHandle userHandle = (UserHandle) targetUserProfiles.get(0);
        Drawable profileSwitchingIconDrawable = crossProfileAppsM.getProfileSwitchingIconDrawable(userHandle);
        CharSequence profileSwitchingLabel = crossProfileAppsM.getProfileSwitchingLabel(userHandle);
        rfa rfaVarA = rfc.a();
        rfaVarA.e(R.id.og_ai_switch_profile);
        rfaVarA.d = profileSwitchingIconDrawable;
        rfaVarA.f(profileSwitchingLabel.toString());
        rfaVarA.h(103027);
        rfaVarA.g(new iwv(crossProfileAppsM, userHandle, rzyVar, context, 2));
        return rfaVarA.a();
    }
}
