package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class ggz {
    public static final int a(Bundle bundle, String str) {
        int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt("nav-entry-state:destination-id", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) != Integer.MAX_VALUE) {
            return i;
        }
        gez.z("nav-entry-state:destination-id");
        throw new yfs();
    }

    public static final Bundle b(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        gez.z(str);
        throw new yfs();
    }

    public static final String c(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        gez.z(str);
        throw new yfs();
    }

    public static final List d(Bundle bundle, String str) {
        int i = ylg.a;
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 34 ? bundle.getParcelableArrayList(str, wef.o(new ykl(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        gez.z(str);
        throw new yfs();
    }

    public static final List e(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        gez.z(str);
        throw new yfs();
    }

    public static final boolean f(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final boolean g(Bundle bundle, String str) {
        return f(bundle, str) && bundle.get(str) == null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
