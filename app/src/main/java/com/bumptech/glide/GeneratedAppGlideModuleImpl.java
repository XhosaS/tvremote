package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.media.TikTokAppGlideModule;
import defpackage.cye;
import defpackage.cyg;
import defpackage.cyt;
import defpackage.dnk;
import defpackage.wgw;
import defpackage.wkn;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final TikTokAppGlideModule a = new TikTokAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.apps.tiktok.media.TikTokAppGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* synthetic */ dnk a() {
        return new cye();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.dny, defpackage.doa
    public final void c(Context context, cyg cygVar, cyt cytVar) {
        this.a.c(context, cygVar, cytVar);
    }

    @Override // defpackage.dnv, defpackage.dnw
    public final void d(Context context) {
        ((wkn) wgw.a(context, wkn.class)).hG();
    }
}
