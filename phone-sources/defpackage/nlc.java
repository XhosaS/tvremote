package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlc extends ocg {
    public static final Parcelable.Creator<nlc> CREATOR = new nld(1);
    public boolean a;
    public String b;
    public boolean c;
    public nkp d;

    public nlc(boolean z, String str, boolean z2, nkp nkpVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = nkpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nlc)) {
            return false;
        }
        nlc nlcVar = (nlc) obj;
        return this.a == nlcVar.a && nrv.i(this.b, nlcVar.b) && this.c == nlcVar.c && nrv.i(this.d, nlcVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.y(parcel, 4, this.c);
        ocv.N(parcel, 5, this.d, i);
        ocv.x(parcel, iV);
    }

    public nlc() {
        Locale locale = Locale.getDefault();
        Pattern pattern = nrv.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }
}
