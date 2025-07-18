package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public ujf(String str, String str2, String str3, String str4, String str5) {
        ocv.aA(!ocw.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = null;
        this.c = str4;
        this.g = null;
        this.d = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ujf)) {
            return false;
        }
        ujf ujfVar = (ujf) obj;
        if (a.Q(this.b, ujfVar.b) && a.Q(this.a, ujfVar.a) && a.Q(this.e, ujfVar.e)) {
            String str = ujfVar.f;
            if (a.Q(null, null) && a.Q(this.c, ujfVar.c)) {
                String str2 = ujfVar.g;
                if (a.Q(null, null) && a.Q(this.d, ujfVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, null, this.c, null, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ocv.aK("applicationId", this.b, arrayList);
        ocv.aK("apiKey", this.a, arrayList);
        ocv.aK("databaseUrl", this.e, arrayList);
        ocv.aK("gcmSenderId", this.c, arrayList);
        ocv.aK("storageBucket", null, arrayList);
        ocv.aK("projectId", this.d, arrayList);
        return ocv.aJ(arrayList, this);
    }
}
