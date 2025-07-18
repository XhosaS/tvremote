package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epr implements ExoMediaDrm {
    public static final epl a = new epl() { // from class: epo
        @Override // defpackage.epl
        public final ExoMediaDrm a(UUID uuid) {
            return epr.a(uuid);
        }
    };
    private final UUID b;
    private final MediaDrm c;
    private int d;

    private epr(UUID uuid) {
        uuid.getClass();
        eci.a(!dys.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        MediaDrm mediaDrm = new MediaDrm(c(uuid));
        this.c = mediaDrm;
        this.d = 1;
        if (dys.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static /* synthetic */ ExoMediaDrm a(UUID uuid) {
        try {
            return b(uuid);
        } catch (eqc unused) {
            edb.c("FrameworkMediaDrm", a.cw(uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: ", "."));
            return new epf();
        }
    }

    public static epr b(UUID uuid) throws eqc {
        try {
            return new epr(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new eqc(1, e);
        } catch (Exception e2) {
            throw new eqc(2, e2);
        }
    }

    private static UUID c(UUID uuid) {
        return d(uuid) ? dys.b : uuid;
    }

    private static boolean d(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, dys.c);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void closeSession(byte[] bArr) {
        this.c.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final /* bridge */ /* synthetic */ CryptoConfig createCryptoConfig(byte[] bArr) {
        return new epn(c(this.b), bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final int getCryptoType() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0204  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eph getKeyRequest(byte[] r12, java.util.List<defpackage.dyz> r13, int r14, java.util.HashMap<java.lang.String, java.lang.String> r15) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epr.getKeyRequest(byte[], java.util.List, int, java.util.HashMap):eph");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final String getPropertyString(String str) {
        return this.c.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final epm getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new epm(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] openSession() {
        return this.c.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws JSONException {
        if (dys.c.equals(this.b) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(edt.S(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(clw.B(jSONObject2.getString("k")));
                    sb.append("\",\"kid\":\"");
                    sb.append(clw.B(jSONObject2.getString("kid")));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = edt.ar(sb.toString());
            } catch (JSONException e) {
                edb.d("ClearKeyUtil", "Failed to adjust response data: ".concat(edt.S(bArr2)), e);
            }
        }
        return this.c.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.c.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.c.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final synchronized void release() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.c.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0.startsWith("16.0") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0.equals(defpackage.dys.c) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r0 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        return r0.requiresSecureDecoder(r5, r0.getSecurityLevel(r4));
     */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean requiresSecureDecoder(byte[] r4, java.lang.String r5) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L4b
            java.util.UUID r0 = r3.b
            java.util.UUID r1 = defpackage.dys.d
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            java.lang.String r0 = "version"
            java.lang.String r0 = r3.getPropertyString(r0)
            java.lang.String r1 = "v5."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "14."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "15."
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "16.0"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L4b
            goto L40
        L37:
            java.util.UUID r1 = defpackage.dys.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4b
        L40:
            android.media.MediaDrm r0 = r3.c
            int r4 = defpackage.eo$$ExternalSyntheticApiModelOutline0.m(r0, r4)
            boolean r4 = defpackage.elk$$ExternalSyntheticApiModelOutline0.m(r0, r5, r4)
            return r4
        L4b:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L64 android.media.MediaCryptoException -> L66
            java.util.UUID r2 = r3.b     // Catch: java.lang.Throwable -> L64 android.media.MediaCryptoException -> L66
            java.util.UUID r2 = c(r2)     // Catch: java.lang.Throwable -> L64 android.media.MediaCryptoException -> L66
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L64 android.media.MediaCryptoException -> L66
            boolean r4 = r1.requiresSecureDecoderComponent(r5)     // Catch: java.lang.Throwable -> L5f android.media.MediaCryptoException -> L62
            r1.release()
            return r4
        L5f:
            r4 = move-exception
            r0 = r1
            goto L76
        L62:
            r0 = r1
            goto L66
        L64:
            r4 = move-exception
            goto L76
        L66:
            java.util.UUID r4 = r3.b     // Catch: java.lang.Throwable -> L64
            java.util.UUID r5 = defpackage.dys.c     // Catch: java.lang.Throwable -> L64
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L64
            r4 = r4 ^ 1
            if (r0 == 0) goto L75
            r0.release()
        L75:
            return r4
        L76:
            if (r0 == 0) goto L7b
            r0.release()
        L7b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epr.requiresSecureDecoder(byte[], java.lang.String):boolean");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.c.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnEventListener(final epi epiVar) {
        this.c.setOnEventListener(new MediaDrm.OnEventListener() { // from class: epp
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                epiVar.ef(this.a, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setOnKeyStatusChangeListener(final epk epkVar) {
        this.c.setOnKeyStatusChangeListener(new MediaDrm.OnKeyStatusChangeListener() { // from class: epq
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
                    arrayList.add(new zuw(keyStatus.getStatusCode(), keyStatus.getKeyId()));
                }
                epkVar.a(bArr, arrayList, z);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setPlayerIdForSession(byte[] bArr, elk elkVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.c;
                LogSessionId logSessionIdA = elkVar.a();
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                playbackComponent.setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused) {
                edb.e("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setPropertyString(String str, String str2) {
        this.c.setPropertyString("securityLevel", str2);
    }
}
