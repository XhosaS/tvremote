package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tez extends nwk {
    /* JADX WARN: Illegal instructions before constructor call */
    public tez() {
        String str;
        Locale locale = Locale.getDefault();
        Map map = tfi.a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) tfi.b.get(-1)) + ")";
        } else {
            str = "";
        }
        super(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str)));
    }
}
