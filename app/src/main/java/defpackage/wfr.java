package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfr {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public final Map c = new HashMap();
    public boolean d;

    public final boolean a() {
        Collection collectionValues = this.c.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((wbm) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
