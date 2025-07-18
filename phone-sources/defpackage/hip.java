package defpackage;

import android.text.TextUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hip {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    private final String g;
    private final JSONObject h;
    private final String i;

    public hip(String str) {
        this.g = str;
        JSONObject jSONObject = new JSONObject(str);
        this.h = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.a = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.b = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.i = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.c = jSONObject.optString("skuDetailsToken");
        this.d = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListNewArrayList.add(new hjs(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.e = arrayListNewArrayList;
        } else {
            this.e = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? Lists.newArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.h.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.h.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayListNewArrayList2 = Lists.newArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayListNewArrayList2.add(new hio(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f = arrayListNewArrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f = null;
        } else {
            arrayListNewArrayList2.add(new hio(jSONObjectOptJSONObject));
            this.f = arrayListNewArrayList2;
        }
    }

    public final hio a() {
        List list = this.f;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (hio) list.get(0);
    }

    public final String b() {
        return this.h.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hip) {
            return TextUtils.equals(this.g, ((hip) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        List list = this.e;
        return "ProductDetails{jsonString='" + this.g + "', parsedJson=" + this.h.toString() + ", productId='" + this.a + "', productType='" + this.b + "', title='" + this.i + "', productDetailsToken='" + this.c + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
