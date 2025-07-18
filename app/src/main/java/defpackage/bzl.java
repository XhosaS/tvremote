package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzl {
    public final IBinder a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public final bxq b() throws NumberFormatException {
        String apiVersion;
        String strGroup;
        try {
            apiVersion = SidecarProvider.getApiVersion();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        if (TextUtils.isEmpty(apiVersion) || apiVersion == null || agyv.n(apiVersion)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
        if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 != null) {
                int i2 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                if (strGroup3 != null) {
                    int i3 = Integer.parseInt(strGroup3);
                    String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                    strGroup4.getClass();
                    return new bxq(i, i2, i3, strGroup4);
                }
            }
        }
        return null;
    }
}
