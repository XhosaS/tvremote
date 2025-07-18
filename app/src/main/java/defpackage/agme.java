package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agme implements aghs {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    final AtomicLong b;
    final int c;
    long d;
    final int e;
    AtomicReferenceArray f;
    final int g;
    AtomicReferenceArray h;
    final AtomicLong i;

    public agme(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.b = atomicLong;
        this.i = new AtomicLong();
        int iA = agod.a(Math.max(8, i));
        int i2 = iA - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iA + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(iA / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = iA - 2;
        atomicLong.lazySet(0L);
    }

    private final void c(AtomicReferenceArray atomicReferenceArray, Object obj, long j2, int i) {
        atomicReferenceArray.lazySet(i, obj);
        this.b.lazySet(j2 + 1);
    }

    @Override // defpackage.aghs
    public final void b() {
        while (true) {
            if (ff() == null && fj()) {
                return;
            }
        }
    }

    @Override // defpackage.aghs
    public final Object ff() {
        AtomicLong atomicLong = this.i;
        AtomicReferenceArray atomicReferenceArray = this.h;
        long j2 = atomicLong.get();
        int i = this.g;
        int i2 = ((int) j2) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = j;
        if (obj != null) {
            if (obj != obj2) {
                atomicReferenceArray.lazySet(i2, null);
                atomicLong.lazySet(j2 + 1);
                return obj;
            }
        } else if (obj2 != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.h = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j2 + 1);
        }
        return obj3;
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.b.get() == this.i.get();
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f;
        AtomicLong atomicLong = this.b;
        int i = this.e;
        long j2 = atomicLong.get();
        int i2 = ((int) j2) & i;
        if (j2 < this.d) {
            c(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        long j3 = this.c + j2;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            this.d = j3 - 1;
            c(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        long j4 = 1 + j2;
        if (atomicReferenceArray.get(((int) j4) & i) == null) {
            c(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + i) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, j);
        atomicLong.lazySet(j4);
        return true;
    }
}
