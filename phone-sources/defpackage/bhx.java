package defpackage;

import android.os.Trace;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhx {
    public bfz a;
    public final bfz b;
    public final bfz c;
    public kk d;
    private Set e;
    private final bfz f;
    private bju g;
    private final kk h;

    public bhx() {
        bfz bfzVar = new bfz(new bdb[16], 0);
        this.f = bfzVar;
        int i = kl.a;
        this.h = new kk((byte[]) null);
        this.a = bfzVar;
        this.b = new bfz(new Object[16], 0);
        this.c = new bfz(new yjk[16], 0);
    }

    public final void a() {
        this.e = null;
        this.g = null;
        bfz bfzVar = this.f;
        bfzVar.h();
        this.h.d();
        this.a = bfzVar;
        this.b.h();
        this.c.h();
        this.d = null;
    }

    public final void b() {
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            jv jvVar = new jv((jw) set, 0);
            while (jvVar.hasNext()) {
                bda bdaVar = (bda) jvVar.next();
                jvVar.remove();
                bdaVar.dI();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.e;
        if (set == null) {
            return;
        }
        bfz bfzVar = this.b;
        if (bfzVar.b != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                kk kkVar = this.d;
                int i = bfzVar.b;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Object obj = bfzVar.a[i];
                    try {
                        if (obj instanceof bdb) {
                            bda bdaVar = ((bdb) obj).a;
                            set.remove(bdaVar);
                            bdaVar.dJ();
                        }
                        if (obj instanceof bak) {
                            if (kkVar == null || !kkVar.a(obj)) {
                                ((bak) obj).a();
                            } else {
                                ((bak) obj).b();
                            }
                        }
                    } catch (Throwable th) {
                        bju bjuVar = this.g;
                        if (bjuVar != null) {
                            bjuVar.b(th, obj);
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        bfz bfzVar2 = this.f;
        if (bfzVar2.b != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.e;
                if (set2 != null) {
                    Object[] objArr = bfzVar2.a;
                    int i2 = bfzVar2.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        bdb bdbVar = (bdb) objArr[i3];
                        bda bdaVar2 = bdbVar.a;
                        set2.remove(bdaVar2);
                        try {
                            bdaVar2.cb();
                        } catch (Throwable th2) {
                            bju bjuVar2 = this.g;
                            if (bjuVar2 != null) {
                                bjuVar2.b(th2, bdbVar);
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d(bdb bdbVar) {
        kk kkVar = this.h;
        if (kkVar.a(bdbVar)) {
            kkVar.l(bdbVar);
            if (!this.a.n(bdbVar)) {
                bfz bfzVar = this.f;
                if (!bfzVar.n(bdbVar)) {
                    Object[] objArr = bfzVar.a;
                    int i = bfzVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        bda bdaVar = ((bdb) objArr[i2]).a;
                        if (bdaVar instanceof bhs) {
                            throw null;
                        }
                    }
                }
            }
            Set set = this.e;
            if (set == null) {
                return;
            } else {
                set.add(bdbVar.a);
            }
        }
        e(bdbVar);
    }

    public final void e(Object obj) {
        this.b.o(obj);
    }

    public final void f(bdb bdbVar) {
        this.a.o(bdbVar);
        this.h.j(bdbVar);
    }

    public final void g(Set set, bju bjuVar) {
        a();
        this.e = set;
        this.g = bjuVar;
    }
}
