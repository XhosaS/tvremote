package defpackage;

import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bvg {
    public static final bvc a = new btu();
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList b = new ArrayList();

    static we a() {
        we weVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (weVar = (we) weakReference.get()) != null) {
            return weVar;
        }
        we weVar2 = new we();
        threadLocal.set(new WeakReference(weVar2));
        return weVar2;
    }

    public static void b(ViewGroup viewGroup, bvc bvcVar) {
        if (bvcVar != null) {
            bvf bvfVar = new bvf(bvcVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(bvfVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(bvfVar);
        }
    }

    public static void c(ViewGroup viewGroup, bvc bvcVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bvc) arrayList.get(i)).u(viewGroup);
            }
        }
        if (bvcVar != null) {
            bvcVar.p(viewGroup, true);
        }
        if (((bun) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
