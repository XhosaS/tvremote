package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmg extends gli {
    public final List a;

    public gmg() {
        super(null);
        this.a = new ArrayList(3);
    }

    private static final void Y(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.gli
    public final void U(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gli) it.next()).U(i);
            }
        } catch (ConcurrentModificationException e) {
            Y(e);
        }
    }

    @Override // defpackage.gli
    public final void V(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gli) it.next()).V(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            Y(e);
        }
    }

    @Override // defpackage.gli
    public final void W(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gli) it.next()).W(i);
            }
        } catch (ConcurrentModificationException e) {
            Y(e);
        }
    }

    public final void a(gli gliVar) {
        this.a.add(gliVar);
    }
}
