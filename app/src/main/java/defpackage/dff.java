package defpackage;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dff {
    public static final dfj a(boolean z, int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(str));
        }
        return new dfj(new ThreadPoolExecutor(i, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new dfi(str, z)));
    }
}
