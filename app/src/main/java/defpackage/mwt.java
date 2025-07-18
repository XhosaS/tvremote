package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwt {
    final List a = new ArrayList();

    public final synchronized void a(mxc mxcVar) {
        this.a.add(mxcVar);
    }

    public final synchronized void b(mxc mxcVar) {
        this.a.remove(mxcVar);
    }
}
