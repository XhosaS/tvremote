package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzw {
    public static final afzw a = new afzw(new afjy[0]);
    public final afjy[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public afzw(afjy[] afjyVarArr) {
        this.b = afjyVarArr;
    }

    public static afzw h(afev[] afevVarArr, afeh afehVar) {
        afzw afzwVar = new afzw(afevVarArr);
        for (afev afevVar : afevVarArr) {
            afevVar.d(afehVar);
        }
        return afzwVar;
    }

    public final void a() {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            i++;
        }
    }

    public final void b(long j) {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjyVarArr[i].b(j);
            i++;
        }
    }

    public final void c(long j) {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjyVarArr[i].c(j);
            i++;
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjy afjyVar = afjyVarArr[i];
            i++;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjy afjyVar = afjyVarArr[i];
            i++;
        }
    }

    public final void f() {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjy afjyVar = afjyVarArr[i];
            i++;
        }
    }

    public final void g() {
        int i = 0;
        while (true) {
            afjy[] afjyVarArr = this.b;
            if (i >= afjyVarArr.length) {
                return;
            }
            afjy afjyVar = afjyVarArr[i];
            i++;
        }
    }

    public final void i() {
        if (this.c.compareAndSet(false, true)) {
            for (afjy afjyVar : this.b) {
            }
        }
    }
}
