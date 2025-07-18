package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajv {
    private static final ajv a = new ajv();
    private adx b = null;

    public static adx b(Context context) {
        return a.a(context);
    }

    public final synchronized adx a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new adx((Object) context, (byte[]) null);
        }
        return this.b;
    }
}
