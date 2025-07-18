package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ym {
    public int b;
    public boolean c;
    public final yn d;
    public ym e;
    public yh h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public ym(yn ynVar, int i) {
        this.d = ynVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        ym ymVar;
        if (this.d.ai == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (ymVar = this.e) == null || ymVar.d.ai != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, zm zmVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                zf.a(((ym) it.next()).d, i, arrayList, zmVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        ym ymVar = this.e;
        if (ymVar != null && (hashSet = ymVar.a) != null) {
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

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ym ymVar = (ym) it.next();
            int i = ymVar.i - 1;
            if ((i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : ymVar.d.L : ymVar.d.K : ymVar.d.N : ymVar.d.M).h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        yh yhVar = this.h;
        if (yhVar == null) {
            this.h = new yh(1);
        } else {
            yhVar.c();
        }
    }

    public final void j(ym ymVar, int i, int i2) {
        if (ymVar == null) {
            d();
            return;
        }
        this.e = ymVar;
        if (ymVar.a == null) {
            ymVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.aj);
        sb.append(":");
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
