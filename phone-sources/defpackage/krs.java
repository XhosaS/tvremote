package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krs implements idy {
    private final List a = new ArrayList();

    @Override // defpackage.idy
    public final synchronized void c(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((idy) it.next()).c(obj);
        }
    }
}
