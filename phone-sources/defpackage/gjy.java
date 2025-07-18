package defpackage;

import android.view.ViewGroup;
import com.google.android.videos.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjy {
    private static final gju b = new gkc(null);
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList a = new ArrayList();

    static ir a() {
        ir irVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (irVar = (ir) weakReference.get()) != null) {
            return irVar;
        }
        ir irVar2 = new ir();
        threadLocal.set(new WeakReference(irVar2));
        return irVar2;
    }

    public static void b(ViewGroup viewGroup) {
        c(viewGroup, null);
    }

    public static void c(ViewGroup viewGroup, gju gjuVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (gjuVar == null) {
            gjuVar = b;
        }
        gju gjuVarClone = gjuVar.clone();
        e(viewGroup, gjuVarClone);
        gli.k(viewGroup);
        d(viewGroup, gjuVarClone);
    }

    public static void d(ViewGroup viewGroup, gju gjuVar) {
        if (gjuVar == null || viewGroup == null) {
            return;
        }
        gjx gjxVar = new gjx(gjuVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(gjxVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(gjxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(ViewGroup viewGroup, gju gjuVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gju) arrayList.get(i)).t(viewGroup);
            }
        }
        if (gjuVar != null) {
            gjuVar.p(viewGroup, true);
        }
        if (((gli) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
