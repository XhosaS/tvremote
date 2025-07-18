package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fno {
    private static final String a = edt.Z(0);
    private static final String b = edt.Z(1);
    private static final String c = edt.Z(2);
    private static final String d = edt.Z(3);

    private fno(Bundle bundle) {
        new Bundle(bundle);
    }

    public static void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(a);
        bundle.getBoolean(b, false);
        bundle.getBoolean(c, false);
        bundle.getBoolean(d, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        new fno(bundle2);
    }
}
