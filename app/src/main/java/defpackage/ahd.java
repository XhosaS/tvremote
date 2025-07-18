package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahd {
    public static ajc a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ajc ajcVarG = ajc.g(rootWindowInsets, null);
        aiy aiyVar = ajcVarG.b;
        aiyVar.i(ajcVarG);
        aiyVar.f(view.getRootView());
        return ajcVarG;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }
}
