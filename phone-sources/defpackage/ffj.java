package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffj implements fdp {
    private final edi a;
    private final feh b;
    private final /* synthetic */ int c;

    public ffj(int i, byte[] bArr) {
        this.c = i;
        this.a = new edi(4);
        this.b = new feh(-1, -1, "image/avif");
    }

    private final boolean h(fdq fdqVar, int i) {
        edi ediVar = this.a;
        ediVar.G(4);
        fdqVar.i(ediVar.a, 0, 4);
        return ediVar.r() == ((long) i);
    }

    private final boolean i(fdq fdqVar, int i) {
        edi ediVar = this.a;
        ediVar.G(4);
        fdqVar.i(ediVar.a, 0, 4);
        return ediVar.r() == ((long) i);
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        int i = this.c;
        if (i == 0) {
            this.b.d(j, j2);
        } else if (i != 1) {
            this.b.d(j, j2);
        } else {
            this.b.d(j, j2);
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        int i = this.c;
        if (i == 0) {
            fdqVar.g(4);
            return h(fdqVar, 1718909296) && h(fdqVar, 1751476579);
        }
        if (i == 1) {
            fdqVar.g(4);
            return i(fdqVar, 1718909296) && i(fdqVar, 1635150182);
        }
        edi ediVar = this.a;
        ediVar.G(4);
        fdqVar.i(ediVar.a, 0, 4);
        if (ediVar.r() == 1380533830) {
            fdqVar.g(4);
            ediVar.G(4);
            fdqVar.i(ediVar.a, 0, 4);
            if (ediVar.r() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        int i = this.c;
        return i != 0 ? i != 1 ? this.b.g(fdqVar, rsjVar) : this.b.g(fdqVar, rsjVar) : this.b.g(fdqVar, rsjVar);
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        int i = this.c;
        return i != 0 ? i != 1 ? ImmutableList.of() : ImmutableList.of() : ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        int i = this.c;
        if (i == 0) {
            this.b.y(fdrVar);
        } else if (i != 1) {
            this.b.y(fdrVar);
        } else {
            this.b.y(fdrVar);
        }
    }

    public ffj(int i) {
        this.c = i;
        this.a = new edi(4);
        this.b = new feh(-1, -1, "image/heif");
    }

    public ffj(int i, char[] cArr) {
        this.c = i;
        this.a = new edi(4);
        this.b = new feh(-1, -1, "image/webp");
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
