package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sru {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {R.attr.dynamicColorThemeOverlay};
    private static final srt c;
    private static final srt d;
    private static final Map e;
    private static final Map f;

    static {
        srr srrVar = new srr();
        c = srrVar;
        srs srsVar = new srs();
        d = srsVar;
        HashMap map = new HashMap();
        map.put("fcnt", srrVar);
        map.put("google", srrVar);
        map.put("hmd global", srrVar);
        map.put("infinix", srrVar);
        map.put("infinix mobility limited", srrVar);
        map.put("itel", srrVar);
        map.put("kyocera", srrVar);
        map.put("lenovo", srrVar);
        map.put("lge", srrVar);
        map.put("meizu", srrVar);
        map.put("motorola", srrVar);
        map.put("nothing", srrVar);
        map.put("oneplus", srrVar);
        map.put("oppo", srrVar);
        map.put("realme", srrVar);
        map.put("robolectric", srrVar);
        map.put("samsung", srsVar);
        map.put("sharp", srrVar);
        map.put("shift", srrVar);
        map.put("sony", srrVar);
        map.put("tcl", srrVar);
        map.put("tecno", srrVar);
        map.put("tecno mobile limited", srrVar);
        map.put("vivo", srrVar);
        map.put("wingtech", srrVar);
        map.put("xiaomi", srrVar);
        e = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", srrVar);
        map2.put("jio", srrVar);
        f = DesugarCollections.unmodifiableMap(map2);
    }

    private sru() {
    }

    public static Context a(Context context) {
        int iE;
        srv srvVar = new srv(new xzg());
        if (c() && (iE = e(context, b)) != 0) {
            Integer num = srvVar.a;
            if (num != null) {
                ssc sscVar = new ssc(new ssd(num.intValue()), !sip.j(context), d(context));
                if (sio.b() != null) {
                    Map mapA = srw.a(sscVar);
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
                    contextThemeWrapper.applyOverrideConfiguration(new Configuration());
                    if (true == sir.c(contextThemeWrapper, mapA)) {
                        return contextThemeWrapper;
                    }
                }
            }
            return new ContextThemeWrapper(context, iE);
        }
        return context;
    }

    public static void b(Activity activity, srv srvVar) {
        if (c()) {
            int iE = srvVar.a == null ? e(activity, b) : 0;
            Integer num = srvVar.a;
            if (num == null) {
                sis.d(activity, iE);
                return;
            }
            ssc sscVar = new ssc(new ssd(num.intValue()), !sip.j(activity), d(activity));
            if (sio.b() == null || !sir.c(activity, srw.a(sscVar))) {
                return;
            }
            sis.d(activity, R.style.ThemeOverlay_Material3_PersonalizedColors);
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (ctk.b()) {
            return true;
        }
        srt srtVar = (srt) e.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
        if (srtVar == null) {
            srtVar = (srt) f.get(Build.BRAND.toLowerCase(Locale.ROOT));
        }
        return srtVar != null && srtVar.a();
    }

    private static float d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    private static int e(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
