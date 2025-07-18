package defpackage;

import android.view.View;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class end {
    public static String a(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        return String.format(Locale.US, "[%d, %s]", Integer.valueOf(size), mode == Integer.MIN_VALUE ? "AT_MOST" : mode == 1073741824 ? "EXACTLY" : mode == 0 ? "UNSPECIFIED" : "INVALID");
    }
}
