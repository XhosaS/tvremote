package com.google.apps.tiktok.media;

import android.content.Context;
import defpackage.cyg;
import defpackage.cyt;
import defpackage.dnv;
import defpackage.dny;
import defpackage.wgw;
import defpackage.wkn;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TikTokAppGlideModule extends dnv {
    @Override // defpackage.dny, defpackage.doa
    public final void c(Context context, cyg cygVar, cyt cytVar) {
        ((wkn) wgw.a(context, wkn.class)).hG();
        Iterator it = ((wkn) wgw.a(context, wkn.class)).gi().iterator();
        while (it.hasNext()) {
            ((dny) it.next()).c(context, cygVar, cytVar);
        }
    }
}
