package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhz {
    public static final long a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        a = id;
    }
}
