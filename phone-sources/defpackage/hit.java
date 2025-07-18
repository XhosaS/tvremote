package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hit {
    private final String a;
    private final String b;
    private final String c;
    private final int d;

    public hit(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.c = strOptString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hit) {
            return TextUtils.equals(this.a, ((hit) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.c + "', statusCode=" + this.d + "}";
    }
}
