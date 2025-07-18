package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agsc {
    public final agsf a;
    public int b;
    public int c = -1;
    private int d;

    public agsc(agsf agsfVar) {
        this.a = agsfVar;
        this.d = agsfVar.g;
        b();
    }

    public final void a() {
        if (this.a.g != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            agsf agsfVar = this.a;
            if (i >= agsfVar.f || agsfVar.e[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.f;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        agsf agsfVar = this.a;
        agsfVar.e();
        agsfVar.f(this.c);
        this.c = -1;
        this.d = agsfVar.g;
    }
}
