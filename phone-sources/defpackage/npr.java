package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npr extends nqc {
    final /* synthetic */ int[] a;
    final /* synthetic */ nqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npr(nqj nqjVar, int[] iArr) {
        super(nqjVar, true);
        this.a = iArr;
        this.b = nqjVar;
    }

    @Override // defpackage.nqc
    public final void b() throws JSONException {
        nsm nsmVarC = c();
        JSONObject jSONObject = new JSONObject();
        int[] iArr = this.a;
        nsk nskVar = this.b.d;
        long jA = nskVar.a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", nskVar.h());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        nskVar.d(jSONObject.toString(), jA);
        nskVar.x.a(jA, nsmVarC);
    }
}
