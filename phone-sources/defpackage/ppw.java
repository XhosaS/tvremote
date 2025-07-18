package defpackage;

import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ppw {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppw)) {
            return false;
        }
        ppw ppwVar = (ppw) obj;
        if (!yks.e(this.a, ppwVar.a) || !yks.e(this.b, ppwVar.b)) {
            return false;
        }
        List list = ppwVar.c;
        if (!yks.e(null, null)) {
            return false;
        }
        int i = ppwVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
