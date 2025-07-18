package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koh {
    private static final ThreadLocal a = new kog();

    public static SharedPreferences a(Context context, String str) {
        knz knzVar = kny.a;
        kof kofVar = str.equals("") ? new kof() : null;
        if (kofVar != null) {
            return kofVar;
        }
        ThreadLocal threadLocal = a;
        yqw.A(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            a.set(Boolean.TRUE);
            throw th;
        }
    }
}
