package defpackage;

import android.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.CronetEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovi implements epu {
    public static final tui a = tui.l("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback");
    public final our b;
    public final Map c;
    public String d;
    public boolean e;
    public final Map f;
    public final ouy g;
    private final eer h;
    private final eps i;

    public ovi(our ourVar, ouy ouyVar, yfo yfoVar) {
        this.b = ourVar;
        this.g = ouyVar;
        eha ehaVar = new eha((CronetEngine) yfoVar.b(), new ugl());
        this.h = ehaVar;
        this.i = new eps(null, false, ehaVar);
        this.c = new LinkedHashMap();
        this.f = new LinkedHashMap();
    }

    @Override // defpackage.epu
    public final byte[] a(UUID uuid, eph ephVar) {
        uuid.getClass();
        return (byte[]) ykr.n(yim.a, new ovh(this, ephVar, uuid, null));
    }

    @Override // defpackage.epu
    public final byte[] b(UUID uuid, epm epmVar) throws JSONException {
        uuid.getClass();
        tug tugVar = (tug) a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback", "executeProvisionRequest", 51, "NurMediaDrmCallback.kt");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("defaultUrl", epmVar.b);
            jSONObject.put("data", Base64.encodeToString((byte[]) epmVar.a, 3)).getClass();
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        string.getClass();
        tugVar.B("uuid: %s, request: %s", uuid, string);
        byte[] bArrB = this.i.b(uuid, epmVar);
        bArrB.getClass();
        return bArrB;
    }
}
