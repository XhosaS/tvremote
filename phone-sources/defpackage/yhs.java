package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yhs<K, V> {
    public final yhu a;
    public int b;
    public int c = -1;
    private int d;

    public yhs(yhu yhuVar) {
        this.a = yhuVar;
        this.d = yhuVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            yhu yhuVar = this.a;
            if (i >= yhuVar.e || yhuVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        yhu yhuVar = this.a;
        yhuVar.f();
        yhuVar.g(this.c);
        this.c = -1;
        this.d = yhuVar.f;
    }
}
