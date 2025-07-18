package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dod {
    private final List a = new ArrayList();

    public final synchronized List a() {
        return this.a;
    }

    public final synchronized void b(czv czvVar) {
        this.a.add(czvVar);
    }
}
