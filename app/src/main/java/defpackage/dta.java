package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dta extends dtp {
    static final dta a = new dta();

    @Override // defpackage.dtp
    public final void b(ComponentTree componentTree, Exception exc) {
        if (componentTree != null && componentTree.b() != null) {
            componentTree.b().d();
            if (exc instanceof dxf) {
                Exception exc2 = ((dxf) exc).a;
                exc = null;
            }
            if (exc instanceof dvp) {
                ArrayList arrayList = ((dvp) exc).b;
                if (!arrayList.isEmpty()) {
                }
            }
            dsr.b(2, exc.getMessage());
        }
        dsq.f(exc);
    }
}
