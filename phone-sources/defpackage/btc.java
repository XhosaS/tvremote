package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btc {
    public bvc a;
    public bsr b;
    public final /* synthetic */ btf c;
    public int d;

    public btc() {
    }

    public final void a(bsr bsrVar, boolean z) {
        List list = bsrVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((bsz) list.get(i)).c()) {
                c(bsrVar);
                return;
            }
        }
        bvc bvcVar = this.a;
        if (bvcVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        bny.w(bsrVar, bvcVar.j(0L), new lz(this, this.c, 7), false);
        if (this.d == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((bsz) list.get(i2)).b();
                }
            }
            ft ftVar = bsrVar.e;
            if (ftVar != null) {
                ftVar.b = !r3.c;
            }
        }
    }

    public final void b() {
        this.d = 1;
        this.c.c = false;
        this.b = null;
    }

    public final void c(bsr bsrVar) {
        if (this.d == 2) {
            bvc bvcVar = this.a;
            if (bvcVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            bny.w(bsrVar, bvcVar.j(0L), new brj(this.c, 6), true);
        }
        this.d = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public btc(btf btfVar) {
        this();
        this.c = btfVar;
        this.d = 1;
    }
}
