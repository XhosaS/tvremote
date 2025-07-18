package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zc implements za {
    final zn d;
    int e;
    public int f;
    public za a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    zd h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public zc(zn znVar) {
        this.d = znVar;
    }

    public final void a(za zaVar) {
        this.j.add(zaVar);
        if (this.i) {
            zaVar.f();
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
            ((za) it.next()).f();
        }
    }

    @Override // defpackage.za
    public final void f() {
        List<zc> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((zc) it.next()).i) {
                return;
            }
        }
        this.c = true;
        za zaVar = this.a;
        if (zaVar != null) {
            zaVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        zc zcVar = null;
        for (zc zcVar2 : list) {
            if (!(zcVar2 instanceof zd)) {
                i++;
                zcVar = zcVar2;
            }
        }
        if (zcVar != null && i == 1 && zcVar.i) {
            zd zdVar = this.h;
            if (zdVar != null) {
                if (!zdVar.i) {
                    return;
                } else {
                    this.e = this.g * zdVar.f;
                }
            }
            c(zcVar.f + this.e);
        }
        za zaVar2 = this.a;
        if (zaVar2 != null) {
            zaVar2.f();
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
