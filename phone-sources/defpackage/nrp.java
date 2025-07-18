package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nrp {
    protected final nsf a;
    public final String b;
    public final List c;
    private nsl d;

    public nrp(String str) {
        nrv.h(str);
        this.b = str;
        this.a = new nsf("MediaControlChannel", (String) null);
        this.c = DesugarCollections.synchronizedList(new ArrayList());
    }

    public final long a() {
        nsl nslVar = this.d;
        if (nslVar != null) {
            return nslVar.a();
        }
        this.a.b("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public void b() {
        throw null;
    }

    public final void c(nsl nslVar) {
        this.d = nslVar;
        if (nslVar == null) {
            b();
        }
    }

    public final void d(String str, long j) {
        nsf.e();
        nsl nslVar = this.d;
        if (nslVar == null) {
            this.a.b("Attempt to send text message without a sink", new Object[0]);
        } else {
            nslVar.b(this.b, str, j);
        }
    }

    protected final void e(nsn nsnVar) {
        this.c.add(nsnVar);
    }
}
