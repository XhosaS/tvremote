package defpackage;

import com.google.android.libraries.elements.interfaces.ComponentState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpc extends beb implements aggi {
    private Map a;
    private volatile boolean b = false;

    public final synchronized ComponentState a(String str) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return (ComponentState) map.get(str);
    }

    public final synchronized void b(String str, ComponentState componentState) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, componentState);
    }

    @Override // defpackage.aggi
    public final synchronized void dispose() {
        if (this.b) {
            return;
        }
        Map map = this.a;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ComponentState) it.next()).dispose();
            }
            map.clear();
        }
        this.b = true;
    }

    @Override // defpackage.aggi
    public final synchronized boolean f() {
        throw null;
    }
}
