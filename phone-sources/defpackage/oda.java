package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oda {
    private static final oda a = new oda();
    private kwy b = null;

    public static kwy b(Context context) {
        return a.a(context);
    }

    public final synchronized kwy a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new kwy(context, (byte[]) null);
        }
        return this.b;
    }
}
