package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class npn extends nqc {
    final /* synthetic */ long[] a;
    final /* synthetic */ nqj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npn(nqj nqjVar, long[] jArr) {
        super(nqjVar);
        this.a = jArr;
        this.b = nqjVar;
    }

    @Override // defpackage.nqc
    public final void b() throws JSONException {
        nsm nsmVarC = c();
        JSONObject jSONObject = new JSONObject();
        long[] jArr = this.a;
        nsk nskVar = this.b.d;
        long jA = nskVar.a();
        try {
            jSONObject.put("requestId", jA);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", nskVar.h());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        nskVar.d(jSONObject.toString(), jA);
        nskVar.q.a(jA, nsmVarC);
    }
}
