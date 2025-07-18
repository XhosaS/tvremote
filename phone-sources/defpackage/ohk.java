package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohk {

    @Deprecated
    public static final jzs a = new jzs("Nearby.CONNECTIONS_API", ohv.b, ohv.a);

    static {
        new jzs("Nearby.MESSAGES_API", oir.b, oir.a);
    }

    public static boolean a(Context context) {
        if (oda.b(context).A() == 0) {
            return opc.f(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }
}
