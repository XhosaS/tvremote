package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpq implements cpo {
    final cpz d;
    int e;
    public int f;
    public cpo a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    cpr h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public cpq(cpz cpzVar) {
        this.d = cpzVar;
    }

    public final void a(cpo cpoVar) {
        this.j.add(cpoVar);
        if (this.i) {
            cpoVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((cpo) it.next()).f();
        }
    }

    @Override // defpackage.cpo
    public final void f() {
        List<cpq> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((cpq) it.next()).i) {
                return;
            }
        }
        this.c = true;
        cpo cpoVar = this.a;
        if (cpoVar != null) {
            cpoVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        cpq cpqVar = null;
        for (cpq cpqVar2 : list) {
            if (!(cpqVar2 instanceof cpr)) {
                i++;
                cpqVar = cpqVar2;
            }
        }
        if (cpqVar != null && i == 1 && cpqVar.i) {
            cpr cprVar = this.h;
            if (cprVar != null) {
                if (!cprVar.i) {
                    return;
                } else {
                    this.e = this.g * cprVar.f;
                }
            }
            c(cpqVar.f + this.e);
        }
        cpo cpoVar2 = this.a;
        if (cpoVar2 != null) {
            cpoVar2.f();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.aj);
        sb.append(":");
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append((Object) str);
        sb.append("(");
        sb.append(this.i ? Integer.valueOf(this.f) : "unresolved");
        sb.append(") <t=");
        sb.append(this.k.size());
        sb.append(":d=");
        sb.append(this.j.size());
        sb.append(">");
        return sb.toString();
    }
}
