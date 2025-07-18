package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvu {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature[] f;

    static {
        Feature feature = new Feature("usage_and_diagnostics_listener", 1L);
        a = feature;
        Feature feature2 = new Feature("usage_and_diagnostics_consents", 1L);
        b = feature2;
        Feature feature3 = new Feature("usage_and_diagnostics_check_consents", 1L);
        c = feature3;
        Feature feature4 = new Feature("usage_and_diagnostics_settings_access", 1L);
        d = feature4;
        Feature feature5 = new Feature("el_capitan", 1L);
        e = feature5;
        f = new Feature[]{feature, feature2, feature3, feature4, feature5};
    }
}
