package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxw {
    public static volatile long a;
    private static volatile float b;

    private qxw() {
    }

    public static yqt a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ypv.a;
        }
        float f = b;
        if (f == 0.0f) {
            synchronized (qxw.class) {
                f = b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return yqt.i(Float.valueOf(f));
    }
}
