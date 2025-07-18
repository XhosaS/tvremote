package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class khj {
    public static khg a(Object obj, String str) {
        kkk.l(obj, "Listener must not be null");
        kkk.l(str, "Listener type must not be null");
        kkk.i(str, "Listener type must not be empty");
        return new khg(obj, str);
    }

    public static khi b(Object obj, Looper looper, String str) {
        kkk.l(obj, "Listener must not be null");
        kkk.l(looper, "Looper must not be null");
        kkk.l(str, "Listener type must not be null");
        return new khi(looper, obj, str);
    }
}
