package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhr {
    public static ccz a(Set set) {
        cbc cbcVar = new cbc();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ccz cczVar = (ccz) it.next();
            cczVar.getClass();
            cbcVar.a.add(cczVar);
        }
        return cbcVar;
    }
}
