package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aehm {
    public static boolean a(Context context) {
        Set setGh = ((aehl) aehh.a(context, aehl.class)).gh();
        aejb.a(((zcp) setGh).f <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setGh.isEmpty()) {
            return true;
        }
        return ((Boolean) setGh.iterator().next()).booleanValue();
    }
}
