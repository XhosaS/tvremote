package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class knr {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature[] f;

    static {
        Feature feature = new Feature("mdd_download_right_now", 1L);
        a = feature;
        Feature feature2 = new Feature("mdd_delayed_download", 1L);
        b = feature2;
        Feature feature3 = new Feature("mobstore_write_api", 1L);
        c = feature3;
        Feature feature4 = new Feature("mobstore_rename", 1L);
        d = feature4;
        Feature feature5 = new Feature("icing_get_document", 1L);
        e = feature5;
        f = new Feature[]{feature, feature2, feature3, feature4, feature5};
    }
}
