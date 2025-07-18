package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awc {
    public static volatile long a;
    public static String b;
    public static String c;
    private static volatile float d;

    public awc() {
    }

    public static byg a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bxw.a;
        }
        float f = d;
        if (f == 0.0f) {
            synchronized (awc.class) {
                f = d;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    d = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return byg.h(Float.valueOf(f));
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 20 ? 0 : 21;
        }
        return 1;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? "DEACTIVATE" : "ACTIVATE" : "UNSPECIFIED";
    }

    public awc(byte[] bArr) {
    }
}
