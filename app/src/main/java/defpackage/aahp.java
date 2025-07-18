package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public aahp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        kkk.g(!kls.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aahp)) {
            return false;
        }
        aahp aahpVar = (aahp) obj;
        return kki.a(this.b, aahpVar.b) && kki.a(this.a, aahpVar.a) && kki.a(this.e, aahpVar.e) && kki.a(this.f, aahpVar.f) && kki.a(this.c, aahpVar.c) && kki.a(this.g, aahpVar.g) && kki.a(this.d, aahpVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kkh.b("applicationId", this.b, arrayList);
        kkh.b("apiKey", this.a, arrayList);
        kkh.b("databaseUrl", this.e, arrayList);
        kkh.b("gcmSenderId", this.c, arrayList);
        kkh.b("storageBucket", this.g, arrayList);
        kkh.b("projectId", this.d, arrayList);
        return kkh.a(arrayList, this);
    }
}
