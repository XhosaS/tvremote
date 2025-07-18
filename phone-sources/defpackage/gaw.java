package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gaw {
    public final List a;
    public final List b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final yrz h;
    public final yrz i;
    public final Map j;
    public final kvw k;
    private final fus l;

    public gaw(fus fusVar) {
        this.l = fusVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = arrayList;
        this.h = vyf.R(-1, 0, 6);
        this.i = vyf.R(-1, 0, 6);
        this.j = new LinkedHashMap();
        kvw kvwVar = new kvw(null, null);
        kvwVar.j(fzx.a, fzt.a);
        this.k = kvwVar;
    }

    public final int a() {
        Iterator it = this.b.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((gbn) it.next()).b.size();
        }
        return size;
    }

    public final gbp b(gcd gcdVar) {
        Integer numValueOf;
        int i;
        List list = this.b;
        List listAl = yfm.al(list);
        if (gcdVar != null) {
            int size = this.d;
            int i2 = -this.c;
            int iQ = yfm.q(list) - this.c;
            int i3 = i2;
            while (true) {
                i = gcdVar.a;
                if (i3 >= i) {
                    break;
                }
                size += i3 > iQ ? 10 : ((gbn) list.get(this.c + i3)).b.size();
                i3++;
            }
            int i4 = size + gcdVar.b;
            if (i < i2) {
                i4 -= 10;
            }
            numValueOf = Integer.valueOf(i4);
        } else {
            numValueOf = null;
        }
        return new gbp(listAl, numValueOf, this.l, this.d);
    }

    public final void c(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.e = i;
    }

    public final void d(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.d = i;
    }

    public final boolean e(int i, fzx fzxVar, gbn gbnVar) {
        fzxVar.getClass();
        gbnVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new yfu();
                }
                if (this.b.isEmpty()) {
                    throw new IllegalStateException("should've received an init before append");
                }
                if (i != this.g) {
                    return false;
                }
                this.a.add(gbnVar);
                int iJ = gbnVar.f;
                if (iJ == Integer.MIN_VALUE) {
                    iJ = ykn.j(this.e - gbnVar.b.size(), 0);
                }
                c(iJ);
                this.j.remove(fzx.c);
            } else {
                if (this.b.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i != this.f) {
                    return false;
                }
                this.a.add(0, gbnVar);
                this.c++;
                int iJ2 = gbnVar.e;
                if (iJ2 == Integer.MIN_VALUE) {
                    iJ2 = ykn.j(this.d - gbnVar.b.size(), 0);
                }
                d(iJ2);
                this.j.remove(fzx.b);
            }
        } else {
            if (!this.b.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this.a.add(gbnVar);
            this.c = 0;
            c(gbnVar.f);
            d(gbnVar.e);
        }
        return true;
    }

    public final fus f(gbn gbnVar, fzx fzxVar) {
        int size;
        gbnVar.getClass();
        fzxVar.getClass();
        int iOrdinal = fzxVar.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = -this.c;
        } else {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            size = (this.b.size() - this.c) - 1;
        }
        List listP = yfm.p(new gcb(size, gbnVar.b));
        int iOrdinal2 = fzxVar.ordinal();
        if (iOrdinal2 == 0) {
            fzz fzzVar = fzz.a;
            return new fzz(fzx.a, listP, this.d, this.e, this.k.i());
        }
        if (iOrdinal2 == 1) {
            fzz fzzVar2 = fzz.a;
            return new fzz(fzx.b, listP, this.d, -1, this.k.i());
        }
        if (iOrdinal2 != 2) {
            throw new yfu();
        }
        fzz fzzVar3 = fzz.a;
        return new fzz(fzx.c, listP, -1, this.e, this.k.i());
    }
}
