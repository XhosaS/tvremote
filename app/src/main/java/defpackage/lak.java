package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lak {
    final /* synthetic */ lao a;
    private final String b;
    private final Bundle c;
    private Bundle d;

    public lak(lao laoVar, String str) {
        this.a = laoVar;
        kkk.h(str);
        this.b = str;
        this.c = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0100 A[Catch: NumberFormatException | JSONException -> 0x010f, NumberFormatException | JSONException -> 0x010f, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010f, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006e, B:26:0x006e, B:28:0x0080, B:28:0x0080, B:29:0x0089, B:29:0x0089, B:51:0x0100, B:51:0x0100, B:33:0x0096, B:33:0x0096, B:35:0x00a9, B:35:0x00a9, B:37:0x00bb, B:37:0x00bb, B:38:0x00c4, B:38:0x00c4, B:42:0x00d0, B:42:0x00d0, B:46:0x00e0, B:46:0x00e0, B:50:0x00f4, B:50:0x00f4), top: B:65:0x0027, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lak.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) throws JSONException {
        lao laoVar;
        JSONObject jSONObject;
        lbk lbkVar;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        lao laoVar2 = this.a;
        SharedPreferences.Editor editorEdit = laoVar2.c().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.b);
        } else {
            String str = this.b;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        aeuw.a.eV();
                        lbkVar = laoVar2.y;
                        laoVar = laoVar2;
                    } catch (JSONException e) {
                        e = e;
                        laoVar = laoVar2;
                    }
                    if (lbkVar.d.t(null, kzg.aQ)) {
                        try {
                        } catch (JSONException e2) {
                            e = e2;
                            lbk lbkVar2 = this.a.y;
                            lab labVar = lbkVar2.f;
                            lbkVar2.o(labVar);
                            labVar.c.b("Cannot serialize bundle value to SharedPreferences", e);
                            laoVar2 = laoVar;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            lab labVar2 = lbkVar.f;
                            lbkVar.o(labVar2);
                            labVar2.c.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            laoVar2 = laoVar;
                        }
                        jSONArray.put(jSONObject);
                        laoVar2 = laoVar;
                    } else {
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            lab labVar3 = lbkVar.f;
                            lbkVar.o(labVar3);
                            labVar3.c.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            laoVar2 = laoVar;
                        }
                        jSONArray.put(jSONObject);
                        laoVar2 = laoVar;
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.d = bundle2;
    }
}
