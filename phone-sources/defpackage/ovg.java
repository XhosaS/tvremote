package defpackage;

import android.support.v7.appcompat.R;
import android.util.Base64;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovg implements ExoMediaDrm {
    private static final tui b = tui.l("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm");
    public final ovi a;
    private final UUID c;
    private final ExoMediaDrm d;

    public ovg(UUID uuid, ovi oviVar) {
        this.c = uuid;
        this.a = oviVar;
        this.d = epr.a(uuid);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "closeSession", 45, "NurMediaDrm.kt")).v("closeSession sessionId: %s", new String(bArr, ynd.a));
        this.a.f.remove(bArr);
        this.d.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final CryptoConfig createCryptoConfig(byte[] bArr) {
        bArr.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "createCryptoConfig", 176, "NurMediaDrm.kt")).v("createCryptoConfig sessionId: %s", new String(bArr, ynd.a));
        CryptoConfig cryptoConfigCreateCryptoConfig = this.d.createCryptoConfig(bArr);
        cryptoConfigCreateCryptoConfig.getClass();
        return cryptoConfigCreateCryptoConfig;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int getCryptoType() {
        int cryptoType = this.d.getCryptoType();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "getCryptoType", 184, "NurMediaDrm.kt")).v("getCryptoType no arguments, result = %s", cryptoType != 0 ? cryptoType != 1 ? cryptoType != 2 ? a.cf(cryptoType, "Unknown type: ") : "CRYPTO_TYPE_FRAMEWORK" : "CRYPTO_TYPE_UNSUPPORTED" : "CRYPTO_TYPE_NONE");
        return cryptoType;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final eph getKeyRequest(byte[] bArr, List<dyz> list, int i, HashMap<String, String> map) throws JSONException, IOException {
        String strAx;
        bArr.getClass();
        tug tugVar = (tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "getKeyRequest", 58, "NurMediaDrm.kt");
        String str = new String(bArr, ynd.a);
        if (list != null) {
            ArrayList arrayList = new ArrayList(yfm.z(list, 10));
            for (dyz dyzVar : list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("uuid", dyzVar.a);
                    jSONObject.put("mimeType", dyzVar.c);
                    jSONObject.put("data", Base64.encodeToString(dyzVar.d, 3));
                    jSONObject.put("licenseServerUrl", dyzVar.b);
                    jSONObject.put("hashCode", jSONObject.hashCode()).getClass();
                } catch (JSONException unused) {
                }
                arrayList.add(jSONObject);
            }
            strAx = yfm.ax(arrayList, ", ", null, null, null, 62);
        } else {
            strAx = "";
        }
        tugVar.F("getKeyRequest scope: %s, schemeDatas: [%s], keyType: %s, optionalParameters: %s", str, strAx, osk.e(i), map);
        eph keyRequest = this.d.getKeyRequest(bArr, list, i, map);
        keyRequest.getClass();
        ovi oviVar = this.a;
        ((tug) ovi.a.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrmCallback", "associateWithRequest", 152, "NurMediaDrmCallback.kt")).E("Associating scope %s and key type %s with request %s", new String(bArr, ynd.a), osk.e(i), keyRequest);
        oviVar.c.put(keyRequest, new yfw(bArr, osk.e(i)));
        return keyRequest;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final String getPropertyString(String str) {
        String propertyString = this.d.getPropertyString(str);
        propertyString.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "getPropertyString", 147, "NurMediaDrm.kt")).B("getPropertyString propertyName: %s, result = %s", str, propertyString);
        return propertyString;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final epm getProvisionRequest() {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "getProvisionRequest", 87, "NurMediaDrm.kt")).s("getProvisionRequest no arguments");
        epm provisionRequest = this.d.getProvisionRequest();
        provisionRequest.getClass();
        return provisionRequest;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] openSession() {
        byte[] bArrOpenSession = this.d.openSession();
        bArrOpenSession.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "openSession", 40, "NurMediaDrm.kt")).v("openSession no arguments, result = %s", new String(bArrOpenSession, ynd.a));
        return bArrOpenSession;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "provideKeyResponse", 74, "NurMediaDrm.kt")).B("provideKeyResponse scope: %s, response: %s", new String(bArr, ynd.a), osk.H(bArr2));
        if (bArr2.length == 0) {
            return null;
        }
        return this.d.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) {
        bArr.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "provideProvisionResponse", 92, "NurMediaDrm.kt")).v("provideProvisionResponse response: %s", osk.H(bArr));
        this.d.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        bArr.getClass();
        Map<String, String> mapQueryKeyStatus = this.d.queryKeyStatus(bArr);
        mapQueryKeyStatus.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "queryKeyStatus", 100, "NurMediaDrm.kt")).B("queryKeyStatus sessionId: %s, result = %s", new String(bArr, ynd.a), mapQueryKeyStatus);
        return mapQueryKeyStatus;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void release() {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "release", 127, "NurMediaDrm.kt")).s("release no arguments");
        this.d.release();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        bArr.getClass();
        boolean zRequiresSecureDecoder = this.d.requiresSecureDecoder(bArr, str);
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "requiresSecureDecoder", R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, "NurMediaDrm.kt")).E("requiresSecureDecoder sessionId: %s, mimeType: %s, result = %s", new String(bArr, ynd.a), str, Boolean.valueOf(zRequiresSecureDecoder));
        return zRequiresSecureDecoder;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "restoreKeys", 134, "NurMediaDrm.kt")).B("restoreKeys sessionId: %s, keySetId: %s", new String(bArr, ynd.a), bArr2);
        this.d.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnEventListener(epi epiVar) {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "setOnEventListener", 24, "NurMediaDrm.kt")).v("setOnEventListener listener: %s", epiVar);
        this.d.setOnEventListener(epiVar);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnKeyStatusChangeListener(epk epkVar) {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "setOnKeyStatusChangeListener", 29, "NurMediaDrm.kt")).v("setOnKeyStatusChangeListener listener: %s", epkVar);
        this.d.setOnKeyStatusChangeListener(epkVar);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setPropertyString(String str, String str2) {
        ((tug) b.b().j("com/google/android/libraries/googletv/player/kinetoscope/drm/NurMediaDrm", "setPropertyString", 164, "NurMediaDrm.kt")).B("setPropertyString propertyName: %s, value: %s", "securityLevel", str2);
        this.d.setPropertyString("securityLevel", str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final /* synthetic */ void setPlayerIdForSession(byte[] bArr, elk elkVar) {
    }
}
