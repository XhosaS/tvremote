package defpackage;

import android.media.MediaDrmException;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epf implements ExoMediaDrm {
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final CryptoConfig createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int getCryptoType() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final eph getKeyRequest(byte[] bArr, List<dyz> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final String getPropertyString(String str) {
        return "";
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final epm getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void release() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnEventListener(epi epiVar) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnKeyStatusChangeListener(epk epkVar) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final /* synthetic */ void setPlayerIdForSession(byte[] bArr, elk elkVar) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setPropertyString(String str, String str2) {
    }
}
