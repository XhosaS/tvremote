package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nnl extends mip implements ncx {
    public static final UpbMiniTable e;
    static final miv f;
    static final miv g;
    static final miv h;
    static final miv i;
    volatile String j;
    volatile String k;
    volatile String l;
    ArrayList m;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1111H/4");
        e = upbMiniTableB;
        upbMiniTableB.e(ncy.a, ncs.a);
        f = upbMiniTableB.d(1);
        g = upbMiniTableB.d(2);
        upbMiniTableB.d(3);
        h = upbMiniTableB.d(4);
        i = upbMiniTableB.d(5);
    }

    public nnl() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.ncx
    public final boolean ao() {
        return aw(8, 16);
    }

    @Override // defpackage.ncx
    public final int g() {
        r();
        return this.m.size();
    }

    @Override // defpackage.ncx
    public final String h() {
        if (!aw(8, 2)) {
            return null;
        }
        if (this.k == null) {
            this.k = aq(g.b);
        }
        return this.k;
    }

    @Override // defpackage.ncx
    public final String i() {
        if (!aw(8, 8)) {
            return null;
        }
        if (this.l == null) {
            this.l = aq(h.b);
        }
        return this.l;
    }

    @Override // defpackage.ncx
    public final String j() {
        if (!aw(8, 1)) {
            return null;
        }
        if (this.j == null) {
            this.j = aq(f.b);
        }
        return this.j;
    }

    @Override // defpackage.ncx
    public final boolean k() {
        return av(this.c, 9);
    }

    @Override // defpackage.ncx
    public final boolean l() {
        return aw(8, 8);
    }

    @Override // defpackage.ncx
    public final int n() {
        long j = true != a ? 16L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = nct.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ncx
    public final int o(int i2) {
        r();
        int iA = ncz.a(((Integer) this.m.get(i2)).intValue());
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void r() {
        if (this.m == null) {
            this.m = as(i.b);
        }
    }

    public nnl(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
