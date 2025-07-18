package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jsj {
    private static volatile jsj a;
    private final Context b;

    private jsj(Context context) {
        this.b = context;
    }

    public static jsj a() {
        jsj jsjVar = a;
        if (jsjVar != null) {
            return jsjVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (jsj.class) {
                if (a == null) {
                    a = new jsj(context);
                }
            }
        }
    }

    public final jsf c() {
        return new jsi(this.b);
    }
}
