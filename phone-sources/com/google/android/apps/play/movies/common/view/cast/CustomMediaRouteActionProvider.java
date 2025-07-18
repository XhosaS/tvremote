package com.google.android.apps.play.movies.common.view.cast;

import android.content.Context;
import android.os.Bundle;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import defpackage.fuy;
import defpackage.fva;
import defpackage.fvb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomMediaRouteActionProvider extends MediaRouteActionProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMediaRouteActionProvider(Context context) {
        super(context);
        context.getClass();
    }

    @Override // androidx.mediarouter.app.MediaRouteActionProvider
    public final MediaRouteButton onCreateMediaRouteButton() {
        fuy.b(getContext());
        fvb fvbVarL = fuy.l();
        if (fvbVarL == null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON", false);
            fva fvaVar = new fva();
            fvaVar.b(bundle);
            fuy.p(new fvb(fvaVar));
        } else {
            Bundle bundle2 = new Bundle(fvbVarL.f);
            bundle2.putBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON", false);
            fva fvaVar2 = new fva(fvbVarL);
            fvaVar2.b(bundle2);
            fuy.p(new fvb(fvaVar2));
        }
        return super.onCreateMediaRouteButton();
    }
}
