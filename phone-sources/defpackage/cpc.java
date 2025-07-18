package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpc {
    public int b;
    public boolean c;
    public final cpd d;
    public cpc e;
    public coy h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public cpc(cpd cpdVar, int i) {
        this.d = cpdVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        cpc cpcVar;
        if (this.d.ai == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (cpcVar = this.e) == null || cpcVar.d.ai != 8) ? this.f : i;
    }

    public final cpc c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.M;
        }
        if (i == 2) {
            return this.d.N;
        }
        if (i == 3) {
            return this.d.K;
        }
        if (i != 4) {
            return null;
        }
        return this.d.L;
    }

    public final void d(int i, ArrayList arrayList, cpy cpyVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cme.o(((cpc) it.next()).d, i, arrayList, cpyVar);
            }
        }
    }

    public final void e() {
        HashSet hashSet;
        cpc cpcVar = this.e;
        if (cpcVar != null && (hashSet = cpcVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((cpc) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(cpc cpcVar) {
        if (cpcVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = cpcVar.i;
        if (i2 == i) {
            return i != 6 || (cpcVar.d.G && this.d.G);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case 3:
                i3 = 8;
                break;
            case 2:
            case 4:
                i5 = 3;
                i4 = 5;
                break;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        return cpcVar.d instanceof cph ? z || i2 == i3 : z;
    }

    public final void l(cpc cpcVar, int i) {
        n(cpcVar, i, Integer.MIN_VALUE, false);
    }

    public final void m() {
        coy coyVar = this.h;
        if (coyVar == null) {
            this.h = new coy(1);
        } else {
            coyVar.c();
        }
    }

    public final void n(cpc cpcVar, int i, int i2, boolean z) {
        if (cpcVar == null) {
            e();
            return;
        }
        if (z || k(cpcVar)) {
            this.e = cpcVar;
            if (cpcVar.a == null) {
                cpcVar.a = new HashSet();
            }
            HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final String toString() {
        return this.d.aj + ":" + a.e(this.i);
    }
}
