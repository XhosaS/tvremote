package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecc {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
