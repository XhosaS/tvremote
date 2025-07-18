package androidx.media3.exoplayer.drm;

import androidx.media3.decoder.CryptoConfig;
import defpackage.dyz;
import defpackage.elk;
import defpackage.eph;
import defpackage.epi;
import defpackage.epk;
import defpackage.epm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ExoMediaDrm {
    void closeSession(byte[] bArr);

    CryptoConfig createCryptoConfig(byte[] bArr);

    int getCryptoType();

    eph getKeyRequest(byte[] bArr, List<dyz> list, int i, HashMap<String, String> map);

    String getPropertyString(String str);

    epm getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(epi epiVar);

    void setOnKeyStatusChangeListener(epk epkVar);

    void setPlayerIdForSession(byte[] bArr, elk elkVar);

    void setPropertyString(String str, String str2);
}
