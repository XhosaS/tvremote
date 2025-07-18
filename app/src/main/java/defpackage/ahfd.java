package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfd {
    public static final ahdz a;

    static {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        int i = ahfc.a;
        a = new ahfa(handlerCreateAsync, "main", false);
    }
}
