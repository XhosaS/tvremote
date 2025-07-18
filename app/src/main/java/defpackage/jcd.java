package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcd {
    public static final yzq a;
    public static final yzq b;
    public static final yzq c;

    static {
        yzq yzqVarU = yzq.u("cmn-Hant-TW", "zh-Hant-TW", "zh-TW", "yue-Hant-HK", "zh-Hant-HK", "zh-HK", "yue-HK", "cmn-Hans-CN", "zh-Hans-CN", "zh-CN");
        a = yzqVarU;
        if (Build.VERSION.SDK_INT >= 29) {
            yzqVarU = zcp.b;
        }
        b = yzqVarU;
        c = yzq.u("en-AU", "en-CA", "en-GB", "en-IE", "en-IN", "en-PH", "en-US");
    }

    public static boolean a(String str) {
        return (Build.VERSION.SDK_INT >= 29 ? b : a).contains(str);
    }
}
