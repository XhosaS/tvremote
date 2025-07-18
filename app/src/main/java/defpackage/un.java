package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class un {
    public volatile Context a;
    private final Set b = new CopyOnWriteArraySet();

    public final void a(uo uoVar) {
        if (this.a != null) {
            uoVar.a();
        }
        this.b.add(uoVar);
    }

    public final void b(Context context) {
        context.getClass();
        this.a = context;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((uo) it.next()).a();
        }
    }
}
