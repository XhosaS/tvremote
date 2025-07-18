package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crn implements cqw, cro {
    public final boolean a;
    public final crt b;
    public final crt c;
    public final crt d;
    public final int e;
    private final List f = new ArrayList();

    public crn(cug cugVar, cue cueVar) {
        this.a = cueVar.d;
        this.e = cueVar.e;
        crt crtVarA = cueVar.a.a();
        this.b = crtVarA;
        crt crtVarA2 = cueVar.b.a();
        this.c = crtVarA2;
        crt crtVarA3 = cueVar.c.a();
        this.d = crtVarA3;
        cugVar.k(crtVarA);
        cugVar.k(crtVarA2);
        cugVar.k(crtVarA3);
        crtVarA.h(this);
        crtVarA2.h(this);
        crtVarA3.h(this);
    }

    final void a(cro croVar) {
        this.f.add(croVar);
    }

    @Override // defpackage.cro
    public final void d() {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((cro) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.cqw
    public final String g() {
        throw null;
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
    }
}
