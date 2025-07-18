package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ytd implements Iterator {
    int a;
    int b = -1;
    ytm c;
    AtomicReferenceArray d;
    yuh e;
    yuf f;
    yuf g;
    final /* synthetic */ yug h;

    public ytd(yug yugVar) {
        this.h = yugVar;
        this.a = yugVar.f.length - 1;
        b();
    }

    final yuf a() {
        yuf yufVar = this.f;
        if (yufVar == null) {
            throw new NoSuchElementException();
        }
        this.g = yufVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            yug yugVar = this.h;
            this.a = i - 1;
            ytm ytmVar = yugVar.f[i];
            this.c = ytmVar;
            if (ytmVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(yuh yuhVar) {
        Object obj;
        boolean z;
        try {
            yug yugVar = this.h;
            long jA = yugVar.p.a();
            Object objJ = yuhVar.j();
            Object obj2 = null;
            if (yuhVar.j() != null && (obj = yuhVar.d().get()) != null && !yugVar.m(yuhVar, jA)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new yuf(yugVar, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.n();
        }
    }

    final boolean d() {
        yuh yuhVar = this.e;
        if (yuhVar == null) {
            return false;
        }
        while (true) {
            this.e = yuhVar.e();
            yuh yuhVar2 = this.e;
            if (yuhVar2 == null) {
                return false;
            }
            if (c(yuhVar2)) {
                return true;
            }
            yuhVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            yuh yuhVar = (yuh) atomicReferenceArray.get(i);
            this.e = yuhVar;
            if (yuhVar != null && (c(yuhVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        yqw.L(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
