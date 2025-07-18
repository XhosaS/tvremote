package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uov extends ocg {
    public static final Parcelable.Creator<uov> CREATOR = new sct(15);
    public final Bundle a;
    private Map b;

    public uov(Bundle bundle) {
        this.a = bundle;
    }

    public static final int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final Map a() {
        if (this.b == null) {
            Bundle bundle = this.a;
            ir irVar = new ir();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        irVar.put(str, str2);
                    }
                }
            }
            this.b = irVar;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.E(parcel, 2, this.a);
        ocv.x(parcel, iV);
    }
}
