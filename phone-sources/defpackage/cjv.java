package defpackage;

import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjv {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjv)) {
            return false;
        }
        cjv cjvVar = (cjv) obj;
        if (!yks.e(this.a, cjvVar.a) || !yks.e(this.b, cjvVar.b)) {
            return false;
        }
        List list = cjvVar.c;
        if (!yks.e(null, null)) {
            return false;
        }
        int i = cjvVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
