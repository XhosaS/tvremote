package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edc {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public edc(am amVar) {
        this.e = new ArrayList();
        this.b = amVar.w;
        this.d = amVar.x;
        this.c = amVar.h();
        this.a = amVar.d();
        ArrayList arrayList = amVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            al alVar = (al) arrayList.get(i);
            ((ArrayList) this.e).add(new ap(alVar));
        }
    }

    public final long a() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.e;
        int i2 = this.a;
        long j = ((long[]) obj)[i2];
        this.a = this.d & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public edc() {
        a.H(true);
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i = iHighestOneBit + iHighestOneBit;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.e = new long[i];
        this.d = r0.length - 1;
    }
}
