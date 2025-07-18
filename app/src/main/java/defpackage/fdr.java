package defpackage;

import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdr {
    public final fcy a(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getJSONObject("device_info").getString("cloud_device_id");
            string.getClass();
            String strA = fcz.a(jSONObject.getJSONObject("sign").getString("certificate"));
            if (string.length() != 0 && strA.length() != 0) {
                if (!new agyu("^[0-9A-F]{32}$").c(string)) {
                    ((zdv) fdw.b.b().q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$Companion", "parseCastInfoFromJson", 146, "LoadCastServiceInfoTaskImpl.kt")).F("Unexpected cast ID format, received '%s' from '%s'", string, jSONObject);
                }
                return new fcy(string, strA, "cast_service");
            }
            if (string.length() == 0) {
                ((zdv) fdw.b.b().q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$Companion", "parseCastInfoFromJson", 133, "LoadCastServiceInfoTaskImpl.kt")).x("Received null or empty cast id:\n %s", jSONObject);
            }
            if (strA.length() == 0) {
                ((zdv) fdw.b.b().q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$Companion", "parseCastInfoFromJson", 137, "LoadCastServiceInfoTaskImpl.kt")).x("Received null or empty cast cert:\n %s", jSONObject);
            }
            return null;
        } catch (InvalidParameterException e) {
            ((zdv) ((zdv) fdw.b.c()).p(e).q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$Companion", "parseCastInfoFromJson", 127, "LoadCastServiceInfoTaskImpl.kt")).x("certificatePEM is invalid! %s", jSONObject);
            return null;
        } catch (JSONException e2) {
            ((zdv) ((zdv) fdw.b.c()).p(e2).q("com/google/android/apps/tvsearch/cast/info/LoadCastServiceInfoTaskImpl$Companion", "parseCastInfoFromJson", 124, "LoadCastServiceInfoTaskImpl.kt")).x("error parsing cast info Json %s", jSONObject);
            return null;
        }
    }
}
