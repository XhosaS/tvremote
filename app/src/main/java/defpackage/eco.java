package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eco {
    protected final Set a = new HashSet();

    public final void a(String str, Object obj, Object obj2, String str2, String str3, Boolean bool, String str4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eco) it.next()).a(str, obj, obj2, str2, str3, bool, str4);
        }
    }
}
