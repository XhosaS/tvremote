package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nea {
    private static volatile nea a;
    private final Context b;

    private nea(Context context) {
        this.b = context;
    }

    public static nea a() {
        nea neaVar = a;
        if (neaVar != null) {
            return neaVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (nea.class) {
                if (a == null) {
                    a = new nea(context);
                }
            }
        }
    }

    public final ndx c() {
        return new ndz(this.b);
    }
}
