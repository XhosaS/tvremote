package defpackage;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hio {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final String f;
    public final hjs g;

    public hio(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("formattedPrice");
        this.a = jSONObject.optLong("priceAmountMicros");
        this.b = jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        this.c = true == strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId").isEmpty();
        jSONObject.optString("purchaseOptionId").isEmpty();
        this.d = jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        this.e = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.e.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                jSONObjectOptJSONObject.optInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("startTimeMillis");
            }
            if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("endTimeMillis");
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getInt("maximumQuantity");
            jSONObjectOptJSONObject4.getInt("remainingQuantity");
        }
        this.f = jSONObject.optString("serializedDocid");
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject6 != null) {
            jSONObjectOptJSONObject6.getString("rentalPeriod");
            jSONObjectOptJSONObject6.optString("rentalExpirationPeriod").isEmpty();
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        this.g = jSONObjectOptJSONObject7 == null ? null : new hjs(jSONObjectOptJSONObject7, (char[]) null);
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (jSONArrayOptJSONArray2 == null) {
            return;
        }
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i2);
            if (jSONObjectOptJSONObject8 != null) {
                arrayListNewArrayList.add(new hjs(jSONObjectOptJSONObject8, (byte[]) null));
            }
        }
    }
}
