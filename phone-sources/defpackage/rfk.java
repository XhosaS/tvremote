package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfk extends dvu {
    private static final Set i = yfm.aZ(new rey[]{rey.OUT_OF_STORAGE, rey.LOW_STORAGE_SEVERE});
    public final qwo g;
    public final dvw h;
    private final rfj j;
    private final quy k;
    private boolean l;
    private boolean m;
    private reg n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfk(rfg rfgVar, qwo qwoVar) {
        super(false);
        rfgVar.getClass();
        qwoVar.getClass();
        this.g = qwoVar;
        dvw reqVar = new req(this, 5);
        this.h = reqVar;
        this.j = new rfj(this);
        quy quyVar = (quy) rfgVar.g.f();
        this.k = quyVar;
        rfgVar.f.c();
        if (quyVar != null) {
            n(quyVar, reqVar);
        }
    }

    @Override // defpackage.dvu, defpackage.dvs
    protected final void f() {
        sjl.c();
        super.f();
        qwo qwoVar = this.g;
        qwoVar.c(this.j);
        qwoVar.a();
        p();
        ImmutableList immutableListE = qwoVar.e();
        immutableListE.getClass();
        o(immutableListE);
    }

    @Override // defpackage.dvu, defpackage.dvs
    protected final void g() {
        sjl.c();
        super.g();
        this.g.d(this.j);
        p();
        ImmutableList immutableListOf = ImmutableList.of();
        immutableListOf.getClass();
        o(immutableListOf);
    }

    public final void o(ImmutableList immutableList) {
        quy quyVar = this.k;
        boolean z = quyVar != null && quyVar.q(immutableList);
        if (z != this.l) {
            sjl.c();
            this.l = z;
            k(Boolean.valueOf(z || this.m));
        }
    }

    public final void p() {
        this.n = null;
        boolean zAs = yfm.as(i, null);
        if (zAs != this.m) {
            sjl.c();
            this.m = zAs;
            boolean z = true;
            if (!this.l && !zAs) {
                z = false;
            }
            k(Boolean.valueOf(z));
        }
    }
}
