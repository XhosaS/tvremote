package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mks implements nkl {
    private final boolean a;
    private JSONArray b;
    public final HashMap d = new HashMap();

    protected mks(boolean z) {
        this.a = z;
    }

    protected abstract void b(List list, int i);

    protected abstract void c(long j, String str, String[] strArr);

    protected abstract void d(List list, kwx kwxVar);

    public final nwx e(nwu nwuVar, JSONObject jSONObject) {
        if (this.a) {
            krd.e("Sent message: ".concat(jSONObject.toString()));
        }
        jzs jzsVar = nkm.a;
        return jys.Q(nwuVar, "urn:x-cast:com.google.play.movies", jSONObject.toString());
    }

    @Override // defpackage.nkl
    public final void f(String str) throws JSONException {
        if (this.a) {
            krd.e("Received message: ".concat(String.valueOf(str)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            int i = 0;
            if ("KEY_REQUEST".equals(string)) {
                long j = jSONObject.getLong("cmd_id");
                String string2 = jSONObject.getString("method");
                JSONArray jSONArray = jSONObject.getJSONArray("requests");
                int length = jSONArray.length();
                String[] strArr = new String[length];
                while (i < length) {
                    strArr[i] = jSONArray.get(i).toString();
                    i++;
                }
                c(j, string2, strArr);
                return;
            }
            int i2 = 1;
            if ("TT_TRACK_LIST_NOTIFICATION".equals(string)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("tracks");
                if (this.b == null || !jSONArray2.toString().equals(this.b.toString())) {
                    this.b = jSONArray2;
                    int length2 = jSONArray2.length();
                    ArrayList arrayList = new ArrayList(length2);
                    kwx kwxVar = null;
                    while (i < length2) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                        kwx kwxVarSubtitleTrack = kwx.subtitleTrack(jSONObject2.getString("language").replace('_', '-'), "", "AAAAAAAAAAA", 1, jSONObject2.getString("id"), false, "DAHH".equals(jSONObject2.getString("accessibility")));
                        if (true == jSONObject2.getBoolean("selected")) {
                            kwxVar = kwxVarSubtitleTrack;
                        }
                        arrayList.add(kwxVarSubtitleTrack);
                        i++;
                    }
                    d(arrayList, kwxVar);
                    return;
                }
                return;
            }
            if ("AUDIO_TRACK_LIST_NOTIFICATION".equals(string)) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("tracks");
                HashMap map = this.d;
                map.clear();
                int length3 = jSONArray3.length();
                ArrayList arrayList2 = new ArrayList(length3);
                vtw vtwVarM = kzo.a.m();
                int i3 = -1;
                while (i < length3) {
                    JSONObject jSONObject3 = jSONArray3.getJSONObject(i);
                    if (vtwVarM.a.A()) {
                        throw new IllegalArgumentException("Default instance must be immutable.");
                    }
                    vtwVarM.b = vtwVarM.q();
                    String string3 = jSONObject3.getString("language");
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    kzo kzoVar = (kzo) vtwVarM.b;
                    string3.getClass();
                    int i4 = i2;
                    kzoVar.b |= 1;
                    kzoVar.c = string3;
                    String string4 = jSONObject3.getString("content");
                    if ("PRIMARY".equals(string4)) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        kzo kzoVar2 = (kzo) vtwVarM.b;
                        kzoVar2.d = i4;
                        kzoVar2.b |= 2;
                    } else if ("PRIMARY_DESCRIPTIVE".equals(string4)) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        kzo kzoVar3 = (kzo) vtwVarM.b;
                        kzoVar3.d = 3;
                        kzoVar3.b |= 2;
                    } else if ("DIRECTOR_COMMENTARY".equals(string4)) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        kzo kzoVar4 = (kzo) vtwVarM.b;
                        kzoVar4.d = 2;
                        kzoVar4.b |= 2;
                    } else if ("ACTOR_COMMENTARY".equals(string4)) {
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        kzo kzoVar5 = (kzo) vtwVarM.b;
                        kzoVar5.d = 2;
                        kzoVar5.b |= 2;
                    }
                    if (true == jSONObject3.getBoolean("selected")) {
                        i3 = i;
                    }
                    kzo kzoVar6 = (kzo) vtwVarM.r();
                    arrayList2.add(kzoVar6);
                    map.put(kzoVar6, jSONObject3.getString("id"));
                    i++;
                    i2 = 1;
                }
                if (i3 < 0) {
                    arrayList2.clear();
                    map.clear();
                }
                b(arrayList2, i3);
            }
        } catch (JSONException e) {
            krd.c("error parsing message: " + str + " " + e.toString());
        }
    }
}
