package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpg implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public dpg(dph dphVar) {
        this.a = new WeakReference(dphVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        dph dphVar = (dph) this.a.get();
        if (dphVar == null) {
            return true;
        }
        List list = dphVar.c;
        if (list.isEmpty()) {
            return true;
        }
        int iB = dphVar.b();
        int iA = dphVar.a();
        if (!dphVar.d(iB, iA)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dpe) arrayList.get(i)).e(iB, iA);
        }
        dphVar.c();
        return true;
    }
}
