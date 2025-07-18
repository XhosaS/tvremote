package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uju extends ocg {
    public static final Parcelable.Creator<uju> CREATOR = new sct(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ujt e;
    public final String f;
    public final Bundle g;

    public uju(String str, String str2, String str3, String str4, ujt ujtVar, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ujtVar;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        sij.k(classLoader);
        this.g.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.b);
        sb.append("' } { objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        String str = this.d;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        ujt ujtVar = this.e;
        if (ujtVar != null) {
            sb.append("{ metadata: '");
            sb.append(ujtVar.toString());
            sb.append("' } ");
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append("{ actionStatus: '");
            sb.append(str2);
            sb.append("' } ");
        }
        Bundle bundle = this.g;
        if (!bundle.isEmpty()) {
            sb.append("{ ");
            sb.append(bundle);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.O(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.O(parcel, 4, this.d);
        ocv.N(parcel, 5, this.e, i);
        ocv.O(parcel, 6, this.f);
        ocv.E(parcel, 7, this.g);
        ocv.x(parcel, iV);
    }
}
