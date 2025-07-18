package defpackage;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrd implements jrc {
    private final TimeAnimator a;
    private final jrj b;
    private jre e;
    private long f;
    private long g;
    private jrb h;
    private int k;
    private boolean l;
    private final jrf m;
    private final ArrayDeque c = new ArrayDeque();
    private final float[] d = new float[4];
    private final SparseArray i = new SparseArray();
    private int j = 0;

    public jrd(jrj jrjVar, TimeAnimator timeAnimator, jre jreVar, jrf jrfVar) {
        this.b = jrjVar;
        this.a = timeAnimator;
        this.e = jreVar;
        this.m = jrfVar;
        this.h = jrfVar.d(0);
        timeAnimator.setTimeListener(this);
    }

    private final Deque h(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (i != 8) {
            arrayDeque.addFirst(Integer.valueOf(i));
            i = i != 6 ? 8 : 5;
        }
        return arrayDeque;
    }

    private final void i(jrb jrbVar) {
        jrb jrbVar2 = this.h;
        jrj jrjVar = this.b;
        jrbVar2.b(jrjVar);
        if (jrbVar == null) {
            this.a.end();
        } else {
            this.h = jrbVar;
            int i = this.k;
            if (i != 0 && i != this.j) {
                jrf jrfVar = this.m;
                jrb jrbVarB = jrfVar.b(jrfVar.a(i));
                jrb jrbVarD = jrfVar.d(this.k);
                jrb jrbVar3 = this.h;
                if (jrbVar3 == jrbVarB || jrbVar3 == jrbVarD) {
                    this.a.isStarted();
                    int i2 = this.k;
                    this.j = i2;
                    this.k = 0;
                    jps jpsVar = (jps) this.i.get(i2);
                    if (jpsVar != null) {
                        jpsVar.a();
                    }
                }
            }
            this.h.a(jrjVar);
            this.g = this.f;
        }
        jre jreVar = this.e;
        if (jreVar != null) {
            jreVar.a();
        }
    }

    private final void j() {
        this.l = true;
        TimeAnimator timeAnimator = this.a;
        if (timeAnimator.isStarted()) {
            return;
        }
        this.f = 0L;
        timeAnimator.start();
    }

    @Override // defpackage.jrc
    public final int a() {
        return this.j;
    }

    @Override // defpackage.jrc
    public final void b() {
        this.a.pause();
    }

    @Override // defpackage.jrc
    public final void c() {
        TimeAnimator timeAnimator = this.a;
        if (timeAnimator.isStarted()) {
            timeAnimator.resume();
        } else {
            timeAnimator.start();
        }
    }

    @Override // defpackage.jrc
    public final void d(jps jpsVar, int i) {
        this.i.put(i, jpsVar);
        if (i != this.j || jpsVar == null) {
            return;
        }
        jpsVar.a();
    }

    @Override // defpackage.jrc
    public final void e(jre jreVar) {
        this.e = jreVar;
    }

    @Override // defpackage.jrc
    public final void f(int i, boolean z) {
        if (i == this.j && this.k == 0 && this.h == this.m.d(i)) {
            this.c.clear();
            return;
        }
        if (i == this.k) {
            return;
        }
        this.k = i;
        ArrayDeque arrayDeque = this.c;
        arrayDeque.clear();
        jrf jrfVar = this.m;
        int iA = jrfVar.a(this.j);
        int iA2 = jrfVar.a(this.k);
        boolean z2 = iA != iA2;
        if (z2) {
            Deque dequeH = h(iA);
            Deque dequeH2 = h(iA2);
            while (!dequeH.isEmpty() && !dequeH2.isEmpty() && ((Integer) dequeH.getFirst()).equals(dequeH2.getFirst())) {
                dequeH.removeFirst();
                dequeH2.removeFirst();
            }
            Iterator itDescendingIterator = dequeH.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                arrayDeque.addLast(jrfVar.c(((Integer) itDescendingIterator.next()).intValue()));
            }
            Iterator it = dequeH2.iterator();
            while (it.hasNext()) {
                arrayDeque.addLast(jrfVar.b(((Integer) it.next()).intValue()));
            }
            if (this.h == arrayDeque.getFirst()) {
                arrayDeque.pollFirst();
            }
        }
        arrayDeque.addLast(jrfVar.d(this.k));
        if (!z) {
            if (this.a.isStarted() && z2 && (this.h == jrfVar.b(iA) || this.h == jrfVar.c(iA))) {
                return;
            }
            j();
            return;
        }
        while (!arrayDeque.isEmpty()) {
            i((jrb) arrayDeque.removeFirst());
            this.g = 0L;
            this.f = 0L;
            jrb jrbVar = this.h;
            jrj jrjVar = this.b;
            jrbVar.c(0L, Long.MAX_VALUE, jrjVar);
            jrjVar.h();
        }
        this.l = false;
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (this.l) {
            this.l = false;
            i((jrb) this.c.pollFirst());
        }
        if (this.a.isStarted()) {
            this.f = j;
            jps jpsVar = (jps) this.i.get(this.j);
            if (jpsVar != null) {
                long j3 = this.f;
                float[] fArr = this.d;
                jpsVar.b(j3, fArr);
                this.b.j(fArr);
            }
            boolean zC = this.h.c(this.g, this.f, this.b);
            jre jreVar = this.e;
            if (jreVar != null) {
                jreVar.a();
            }
            if (zC) {
                return;
            }
            j();
        }
    }

    @Override // defpackage.jrc
    public final void g() {
    }
}
