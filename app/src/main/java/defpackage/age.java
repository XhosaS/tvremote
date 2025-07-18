package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class age {
    private final Runnable b;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final Map c = new HashMap();

    public age(Runnable runnable) {
        this.b = runnable;
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cr) it.next()).a.P(menu, menuInflater);
        }
    }

    public final void b(Menu menu) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cr) it.next()).a.R(menu);
        }
    }

    public final boolean c(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((cr) it.next()).a.Q(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void d(cr crVar) {
        this.a.add(crVar);
        this.b.run();
    }

    public final void e(cr crVar) {
        this.a.remove(crVar);
        if (((agd) this.c.remove(crVar)) != null) {
            throw null;
        }
        this.b.run();
    }
}
