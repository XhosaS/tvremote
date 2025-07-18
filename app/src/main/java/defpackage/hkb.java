package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkb {
    public static final int a(bq bqVar) {
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            return bundle.getInt("top_padding");
        }
        return 0;
    }

    public static final Bundle b(bq bqVar) {
        bqVar.getClass();
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        bqVar.ae(bundle2);
        return bundle2;
    }

    public static final String c(bq bqVar) {
        String string;
        Bundle bundle = bqVar.n;
        return (bundle == null || (string = bundle.getString("parent_event_id", "")) == null) ? "" : string;
    }

    public static final void d(bq bqVar, int i) {
        b(bqVar).putInt("top_padding", i);
    }

    public static final void e(bq bqVar) {
        b(bqVar).putBoolean("full_screen", true);
    }

    public static final void f(bq bqVar) {
        b(bqVar).putBoolean("overlay_screen", true);
    }

    public static final void g(bq bqVar, String str) {
        bqVar.getClass();
        b(bqVar).putString("parent_event_id", str);
    }

    public static final boolean h(bq bqVar) {
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            return bundle.containsKey("top_padding");
        }
        return false;
    }

    public static final boolean i(bq bqVar) {
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            return bundle.getBoolean("full_screen", false);
        }
        return false;
    }

    public static final boolean j(bq bqVar) {
        Bundle bundle = bqVar.n;
        if (bundle != null) {
            return bundle.getBoolean("shimmer", false);
        }
        return false;
    }
}
