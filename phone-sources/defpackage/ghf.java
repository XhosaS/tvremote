package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class ghf {
    public static final void a(Bundle bundle, String str, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    public static final void b(Bundle bundle, String str, List list) {
        bundle.putParcelableArrayList(str, gez.x(list));
    }

    public static final void c(Bundle bundle, String str, String str2) {
        str.getClass();
        bundle.putString(str, str2);
    }

    public static final void d(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, gez.x(list));
    }

    public static final void e(Bundle bundle, Parcelable parcelable) {
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", parcelable);
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
