package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class doj {
    private final List a = new ArrayList();

    public final synchronized daq a(Class cls) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            doi doiVar = (doi) list.get(i);
            if (doiVar.a.isAssignableFrom(cls)) {
                return doiVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, daq daqVar) {
        this.a.add(new doi(cls, daqVar));
    }
}
