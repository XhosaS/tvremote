package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aano {
    public static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static aano c;

    private aano() {
    }

    public static aano c() {
        if (c == null) {
            c = new aano();
        }
        return c;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public final boolean b(aanv aanvVar) {
        aanr aanrVar = (aanr) aanvVar;
        if (TextUtils.isEmpty(aanrVar.b)) {
            return true;
        }
        return aanrVar.e + aanrVar.d < a() + a;
    }
}
