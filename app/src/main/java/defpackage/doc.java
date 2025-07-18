package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class doc {
    private final List a = new ArrayList();

    public final synchronized czt a(Class cls) {
        for (dob dobVar : this.a) {
            if (dobVar.a.isAssignableFrom(cls)) {
                return dobVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, czt cztVar) {
        this.a.add(new dob(cls, cztVar));
    }
}
