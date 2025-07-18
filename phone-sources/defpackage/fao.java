package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fao implements faf {
    private final int a;
    private final double b;
    private final ArrayDeque c;
    private final TreeSet d;
    private double e;
    private long f;

    public fao() {
        this(10, 0.5d);
    }

    @Override // defpackage.faf
    public final long a() {
        return this.f;
    }

    @Override // defpackage.faf
    public final void b(long j, long j2) {
        ArrayDeque arrayDeque;
        long j3;
        while (true) {
            arrayDeque = this.c;
            if (arrayDeque.size() < this.a) {
                break;
            }
            fan fanVar = (fan) arrayDeque.remove();
            this.d.remove(fanVar);
            this.e -= fanVar.b;
        }
        double dSqrt = Math.sqrt(j);
        fan fanVar2 = new fan((j * 8000000) / j2, dSqrt);
        arrayDeque.add(fanVar2);
        TreeSet treeSet = this.d;
        treeSet.add(fanVar2);
        this.e += dSqrt;
        if (!arrayDeque.isEmpty()) {
            double d = this.e * this.b;
            Iterator it = treeSet.iterator();
            double d2 = 0.0d;
            double d3 = 0.0d;
            long j4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    j3 = j4;
                    break;
                }
                fan fanVar3 = (fan) it.next();
                double d4 = fanVar3.b / 2.0d;
                double d5 = d2 + d4;
                if (d5 < d) {
                    j4 = fanVar3.a;
                    d3 = d5;
                    d2 = d5 + d4;
                } else if (j4 == 0) {
                    j3 = fanVar3.a;
                } else {
                    j3 = ((long) (((fanVar3.a - j4) * (d - d3)) / (d5 - d3))) + j4;
                }
            }
        } else {
            j3 = Long.MIN_VALUE;
        }
        this.f = j3;
    }

    @Override // defpackage.faf
    public final void c() {
        this.c.clear();
        this.d.clear();
        this.e = 0.0d;
        this.f = Long.MIN_VALUE;
    }

    public fao(int i, double d) {
        boolean z = false;
        if (d >= 0.0d && d <= 1.0d) {
            z = true;
        }
        a.H(z);
        this.a = i;
        this.b = d;
        this.c = new ArrayDeque();
        this.d = new TreeSet();
        this.f = Long.MIN_VALUE;
    }
}
