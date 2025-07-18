package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wwc {
    public static final wvz c = new wvz();
    private final wwc a;
    public final wx d;
    public boolean e = false;

    public wwc(wwc wwcVar, wx wxVar) {
        if (wwcVar != null) {
            yqw.A(wwcVar.e);
        }
        this.a = wwcVar;
        this.d = wxVar;
    }

    static wwc c(Set set) {
        if (set.isEmpty()) {
            return wwb.a;
        }
        if (set.size() == 1) {
            return (wwc) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            wwc wwcVar = (wwc) it.next();
            do {
                i += wwcVar.d.d;
                wwcVar = wwcVar.a;
            } while (wwcVar != null);
        }
        if (i == 0) {
            return wwb.a;
        }
        wx wxVar = new wx(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            wwc wwcVar2 = (wwc) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    wx wxVar2 = wwcVar2.d;
                    if (i2 >= wxVar2.d) {
                        break;
                    }
                    yqw.F(wxVar.put((wvz) wxVar2.e(i2), wxVar2.h(i2)) == null, "Duplicate bindings: %s", wxVar2.e(i2));
                    i2++;
                }
                wwcVar2 = wwcVar2.a;
            } while (wwcVar2 != null);
        }
        return new wwb(null, wxVar).e();
    }

    static wwc d(wwc wwcVar, wwc wwcVar2) {
        return wwcVar.h() ? wwcVar2 : wwcVar2.h() ? wwcVar : c(yzq.q(wwcVar, wwcVar2));
    }

    public static wvy i(wvz wvzVar, wwc wwcVar) {
        Object objF = wwcVar.f(wvzVar);
        if (objF == null) {
            return wvy.d(true != wwcVar.d.containsKey(c) ? 3 : 2);
        }
        return new wvy(1, objF, false);
    }

    public final wwa b() {
        return new wwb(this, new wx(0));
    }

    public final wwc e() {
        if (this.e) {
            throw new IllegalStateException("Already frozen");
        }
        this.e = true;
        wwc wwcVar = this.a;
        return (wwcVar == null || !this.d.isEmpty()) ? this : wwcVar;
    }

    final Object f(wvz wvzVar) {
        wwc wwcVar;
        yqw.L(this.e);
        Object obj = this.d.get(wvzVar);
        return (obj != null || (wwcVar = this.a) == null) ? obj : wwcVar.f(wvzVar);
    }

    final boolean g(wvz wvzVar) {
        if (this.d.containsKey(wvzVar)) {
            return true;
        }
        wwc wwcVar = this.a;
        return wwcVar != null && wwcVar.g(wvzVar);
    }

    public final boolean h() {
        return this == wwb.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (wwc wwcVar = this; wwcVar != null; wwcVar = wwcVar.a) {
            for (int i = 0; i < wwcVar.d.d; i++) {
                sb.append(this.d.h(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
