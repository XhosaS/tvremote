package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhj implements hby {
    private static final Set a = new HashSet();

    @Override // defpackage.hby
    public final void a(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
