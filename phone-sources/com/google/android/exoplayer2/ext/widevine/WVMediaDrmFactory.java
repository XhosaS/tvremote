package com.google.android.exoplayer2.ext.widevine;

import android.content.Context;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import defpackage.nel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WVMediaDrmFactory {
    static {
        if (nel.a) {
            native_init();
        }
    }

    private static native void native_init();

    public native ExoMediaDrm create(Context context);
}
