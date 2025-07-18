package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adw {
    public static final adv a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = yks.e(lowerCase, "robolectric") ? new adv() : null;
    }
}
