package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
class azq {
    private static SparseArray a;

    public static void a(View view, int i) {
        if (a == null) {
            a = new SparseArray();
        }
        ViewOutlineProvider azpVar = (ViewOutlineProvider) a.get(i);
        if (azpVar == null) {
            azpVar = new azp(i);
            if (a.size() < 32) {
                a.put(i, azpVar);
            }
        }
        view.setOutlineProvider(azpVar);
        view.setClipToOutline(true);
    }
}
