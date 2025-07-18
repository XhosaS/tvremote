package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgw {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/drm/exov2/ExoMediaDrmFactoryV2");
    public final Context b;

    public lgw(Context context) {
        this.b = context;
        if (nel.a) {
            VpxLibrary.b = WVMediaCrypto.TYPE;
            VpxLibrary.a.b("wvmediadrm");
            OpusLibrary.b = WVMediaCrypto.TYPE;
            OpusLibrary.a.b("wvmediadrm");
        }
    }
}
