package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cip {
    public final boolean a;
    public final Object b;

    public cip(sd sdVar, byg bygVar) {
        this.b = sdVar;
        this.a = bygVar.f();
    }

    public final cja a(Callable callable, Executor executor) {
        return new chy((bzl) this.b, this.a, executor, callable);
    }

    public final void b(int i, int i2, CharSequence charSequence) {
        if (charSequence != null) {
            ((ArrayDeque) this.b).add(new kx(i, i2, charSequence.toString()));
        }
    }

    public final aza c(final int i) {
        crv apwVar = new crv() { // from class: azb
            @Override // defpackage.crv, defpackage.cru
            public final Object a() {
                return Integer.valueOf(i);
            }
        };
        if (this.a) {
            apwVar = new apw(12);
        }
        return new aza(apwVar, (sd) this.b);
    }

    public cip(boolean z, bzs bzsVar) {
        this.a = z;
        this.b = bzsVar;
    }

    public cip(int i) {
        this.b = new ArrayDeque();
        int i2 = i & 4080;
        boolean z = true;
        if (i2 != 16 && i2 != 128 && i2 != 224) {
            z = false;
        }
        this.a = z;
    }
}
