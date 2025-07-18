package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eka {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static ComponentTree a(dru druVar, AtomicReference atomicReference, boolean z) {
        ComponentTree componentTree = (ComponentTree) atomicReference.get();
        if (componentTree != null && !componentTree.A()) {
            return componentTree;
        }
        String str = ComponentTree.a;
        dsi dsiVar = new dsi(druVar);
        dsiVar.d = z;
        ComponentTree componentTreeA = dsiVar.a();
        atomicReference.set(componentTreeA);
        return componentTreeA;
    }

    public static dzh b(dru druVar, int i, int i2) {
        dzh dzhVarB = dzh.b(druVar.f);
        if (dzhVarB == null) {
            dzhVarB = new dzh();
        }
        dzhVarB.d(dxt.class, new dxt(i, i2));
        return dzhVarB;
    }
}
