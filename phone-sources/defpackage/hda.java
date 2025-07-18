package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hda implements hcj, hdb {
    public final boolean a;
    public final hdg b;
    public final hdg c;
    public final hdg d;
    public final int e;
    private final List f = new ArrayList();

    public hda(hfk hfkVar, hfi hfiVar) {
        this.a = hfiVar.d;
        this.e = hfiVar.e;
        hdg hdgVarA = hfiVar.a.a();
        this.b = hdgVarA;
        hdg hdgVarA2 = hfiVar.b.a();
        this.c = hdgVarA2;
        hdg hdgVarA3 = hfiVar.c.a();
        this.d = hdgVarA3;
        hfkVar.i(hdgVarA);
        hfkVar.i(hdgVarA2);
        hfkVar.i(hdgVarA3);
        hdgVarA.h(this);
        hdgVarA2.h(this);
        hdgVarA3.h(this);
    }

    final void a(hdb hdbVar) {
        this.f.add(hdbVar);
    }

    @Override // defpackage.hdb
    public final void d() {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((hdb) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.hcj
    public final String g() {
        throw null;
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
    }
}
