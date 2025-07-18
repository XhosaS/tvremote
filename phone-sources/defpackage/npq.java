package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npq extends nqc {
    final /* synthetic */ nqj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npq(nqj nqjVar) {
        super(nqjVar, true);
        this.a = nqjVar;
    }

    @Override // defpackage.nqc
    public final void b() throws JSONException {
        nsm nsmVarC = c();
        JSONObject jSONObject = new JSONObject();
        nsk nskVar = this.a.d;
        long jA = nskVar.a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", nskVar.h());
        } catch (JSONException unused) {
        }
        nskVar.d(jSONObject.toString(), jA);
        nskVar.w.a(jA, nsmVarC);
    }
}
