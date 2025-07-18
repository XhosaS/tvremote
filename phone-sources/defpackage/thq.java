package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thq {
    public static final /* synthetic */ int a = 0;
    private static Boolean b;

    static {
        Pattern.compile(",");
    }

    public static int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public static int b(int i, int i2, boolean z, int i3) {
        return c(i, i2, !z, i3);
    }

    public static int c(int i, int i2, boolean z, int i3) {
        return z ? i3 : (i - i3) - i2;
    }

    public static synchronized boolean d(Context context) {
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }
}
