package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfi {
    private final String a;
    private final int b = 1;
    private final boolean c;
    private final boolean d;

    public lfi(String str, boolean z, boolean z2) {
        this.a = str;
        this.c = z;
        this.d = z2;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authToken", this.a);
            jSONObject.put(krh.VERSION, 1);
            jSONObject.put("pinned", this.c);
            if (this.d) {
                jSONObject.put("autoplayEnabled", true);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfi)) {
            return false;
        }
        lfi lfiVar = (lfi) obj;
        if (!yks.e(this.a, lfiVar.a)) {
            return false;
        }
        int i = lfiVar.b;
        return this.c == lfiVar.c && this.d == lfiVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + 1) * 31) + a.q(this.c)) * 31) + a.q(this.d);
    }

    public final String toString() {
        return "LoadRequestCustomData(authToken=" + this.a + ", version=1, isPinned=" + this.c + ", isAutoplayEnabled=" + this.d + ")";
    }
}
