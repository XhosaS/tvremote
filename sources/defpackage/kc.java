package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kc {
    public static boolean a;
    public static Method b;
    static final boolean c;

    static {
        c = Build.VERSION.SDK_INT >= 27;
    }

    public static boolean a(View view) {
        return view.getLayoutDirection() == 1;
    }
}
