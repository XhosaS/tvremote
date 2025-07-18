package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uke extends ocg {
    public static final Parcelable.Creator<uke> CREATOR = new sct(8);
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;

    public uke(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.e = bundle2;
        ClassLoader classLoader = getClass().getClassLoader();
        sij.k(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uke)) {
            return false;
        }
        uke ukeVar = (uke) obj;
        if (a.Q(Boolean.valueOf(this.a), Boolean.valueOf(ukeVar.a))) {
            if (a.Q(Integer.valueOf(this.b), Integer.valueOf(ukeVar.b)) && a.Q(this.c, ukeVar.c) && Thing.c(this.d, ukeVar.d) && Thing.c(this.e, ukeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.a(this.d)), Integer.valueOf(Thing.a(this.e))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.a);
        sb.append(", score: ");
        sb.append(this.b);
        String str = this.c;
        if (!str.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(str);
        }
        Bundle bundle = this.d;
        if (!bundle.isEmpty()) {
            sb.append(", Properties { ");
            Thing.b(bundle, sb);
            sb.append("}");
        }
        Bundle bundle2 = this.e;
        if (!bundle2.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.b(bundle2, sb);
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, z);
        ocv.B(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.E(parcel, 4, this.d);
        ocv.E(parcel, 5, this.e);
        ocv.x(parcel, iV);
    }
}
