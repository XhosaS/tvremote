package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmd extends AtomicReferenceArray implements aghs {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;

    public agmd(int i) {
        super(agod.a(i));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(0, f.intValue());
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
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.b.get() == this.d.get();
    }

    @Override // defpackage.aghs
    public final boolean h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.a;
        AtomicLong atomicLong = this.b;
        long j = atomicLong.get();
        int i2 = ((int) j) & i;
        if (j >= this.c) {
            long j2 = this.e + j;
            if (get(i & ((int) j2)) == null) {
                this.c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }
}
