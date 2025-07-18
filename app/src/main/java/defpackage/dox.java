package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dox implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public dox(doy doyVar) {
        this.a = new WeakReference(doyVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        doy doyVar = (doy) this.a.get();
        if (doyVar == null) {
            return true;
        }
        List list = doyVar.c;
        if (list.isEmpty()) {
            return true;
        }
        int iB = doyVar.b();
        int iA = doyVar.a();
        if (!doyVar.d(iB, iA)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dpe) arrayList.get(i)).e(iB, iA);
        }
        doyVar.c();
        return true;
    }
}
