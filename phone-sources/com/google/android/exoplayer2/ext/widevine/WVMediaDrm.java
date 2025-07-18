package com.google.android.exoplayer2.ext.widevine;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import defpackage.a;
import defpackage.dys;
import defpackage.dyz;
import defpackage.elk;
import defpackage.eph;
import defpackage.epi;
import defpackage.epj;
import defpackage.epk;
import defpackage.epm;
import defpackage.nel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WVMediaDrm implements ExoMediaDrm {
    private epi eventListener;
    private final long nativeObject;
    private int referenceCount = 1;

    /* compiled from: PG */
    final class WVOnEventListener {
        private final WeakReference<WVMediaDrm> wvMediaDrmReference;

        public WVOnEventListener(WVMediaDrm wVMediaDrm) {
            this.wvMediaDrmReference = new WeakReference<>(wVMediaDrm);
        }

        private void onEvent(byte[] bArr, int i, int i2, byte[] bArr2) {
            WVMediaDrm wVMediaDrm = this.wvMediaDrmReference.get();
            if (wVMediaDrm == null || wVMediaDrm.eventListener == null) {
                return;
            }
            wVMediaDrm.eventListener.ef(wVMediaDrm, bArr, i, i2, bArr2);
        }
    }

    static {
        if (nel.a) {
            native_init();
        }
    }

    WVMediaDrm(long j) {
        this.nativeObject = j;
        native_setOnEventListener(new WVOnEventListener(this));
    }

    private native void native_closeSession(byte[] bArr);

    private native WVMediaCrypto native_createMediaCrypto(UUID uuid, byte[] bArr);

    private native void native_finalize();

    private native ExoMediaDrm.KeyRequest native_getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, int i2, String[] strArr, String[] strArr2);

    private native byte[] native_getPropertyByteArray(String str);

    private native String native_getPropertyString(String str);

    private native ExoMediaDrm.ProvisionRequest native_getProvisionRequest();

    private static native void native_init();

    private native byte[] native_openSession();

    private native byte[] native_provideKeyResponse(byte[] bArr, byte[] bArr2);

    private native void native_provideProvisionResponse(byte[] bArr);

    private native Map<String, String> native_queryKeyStatus(byte[] bArr);

    private native void native_release();

    private native void native_restoreKeys(byte[] bArr, byte[] bArr2);

    private native void native_setOnEventListener(WVOnEventListener wVOnEventListener);

    private native void native_setPropertyByteArray(String str, byte[] bArr);

    private native void native_setPropertyString(String str, String str2);

    public synchronized void acquire() {
        a.ab(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
        native_closeSession(bArr);
    }

    protected void finalize() throws Throwable {
        native_finalize();
        super.finalize();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return WVMediaCrypto.TYPE;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public eph getKeyRequest(byte[] bArr, List<dyz> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        dyz dyzVar;
        byte[] bArr2;
        String str;
        int i2 = 0;
        if (list != null) {
            dyzVar = list.get(0);
            bArr2 = dyzVar.d;
            str = dyzVar.c;
        } else {
            dyzVar = null;
            bArr2 = null;
            str = null;
        }
        int size = map == null ? 0 : map.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                strArr[i2] = entry.getKey();
                strArr2[i2] = entry.getValue();
                i2++;
            }
        }
        try {
            ExoMediaDrm.KeyRequest keyRequestNative_getKeyRequest = native_getKeyRequest(bArr, bArr2, str, i, size, strArr, strArr2);
            eph ephVar = new eph(keyRequestNative_getKeyRequest.getData(), keyRequestNative_getKeyRequest.getLicenseServerUrl());
            if (TextUtils.isEmpty(ephVar.c) && dyzVar != null) {
                String str2 = dyzVar.b;
                if (!TextUtils.isEmpty(str2)) {
                    return new eph((byte[]) ephVar.b, str2);
                }
            }
            return ephVar;
        } catch (DeniedByServerException e) {
            throw new NotProvisionedException(e.getMessage());
        }
    }

    public PersistableBundle getMetrics() {
        return null;
    }

    public /* synthetic */ List getOfflineLicenseKeySetIds() {
        throw new UnsupportedOperationException();
    }

    public byte[] getPropertyByteArray(String str) {
        return native_getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public String getPropertyString(String str) {
        return native_getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public epm getProvisionRequest() {
        ExoMediaDrm.ProvisionRequest provisionRequestNative_getProvisionRequest = native_getProvisionRequest();
        return new epm(provisionRequestNative_getProvisionRequest.getData(), provisionRequestNative_getProvisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() throws NotProvisionedException {
        try {
            return native_openSession();
        } catch (DeniedByServerException | SecurityException e) {
            throw new NotProvisionedException(e.getMessage());
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        return native_provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        native_provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return native_queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            native_release();
        }
    }

    public /* synthetic */ void removeOfflineLicense(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        native_restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(epi epiVar) {
        this.eventListener = epiVar;
    }

    public void setOnExpirationUpdateListener(epj epjVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(epk epkVar) {
        throw new UnsupportedOperationException();
    }

    public void setPropertyByteArray(String str, byte[] bArr) {
        native_setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(String str, String str2) {
        native_setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public WVMediaCrypto createCryptoConfig(byte[] bArr) {
        return native_createMediaCrypto(dys.d, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public /* synthetic */ void setPlayerIdForSession(byte[] bArr, elk elkVar) {
    }
}
