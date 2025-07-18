package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unu {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static unu c;

    private unu() {
    }

    public static unu b() {
        if (uiv.a == null) {
            uiv.a = new uiv();
        }
        if (c == null) {
            c = new unu();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean c(unz unzVar) {
        if (TextUtils.isEmpty(unzVar.b)) {
            return true;
        }
        return unzVar.e + unzVar.d < a() + a;
    }
}
