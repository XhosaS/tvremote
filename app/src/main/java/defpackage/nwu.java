package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwu extends mip implements nmt {
    public static final UpbMiniTable e;
    volatile noj f;
    volatile noj g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3)33/)/");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = noj.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable);
    }

    public nwu() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nmt
    public final int g() {
        long j = true != a ? 28L : 16L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nmt
    public final int h() {
        long j = true != a ? 16L : 12L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nmt
    public final /* bridge */ /* synthetic */ ndo i() {
        if (!m()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        noj nojVar = new noj(ap(true != a ? 12 : 24, noj.d));
        this.f = nojVar;
        return nojVar;
    }

    @Override // defpackage.nmt
    public final /* bridge */ /* synthetic */ ndo j() {
        if (!n()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        noj nojVar = new noj(ap(true != a ? 20 : 32, noj.d));
        this.g = nojVar;
        return nojVar;
    }

    @Override // defpackage.nmt
    public final boolean k() {
        return av(this.c, 10);
    }

    @Override // defpackage.nmt
    public final boolean l() {
        return aw(8, 2);
    }

    @Override // defpackage.nmt
    public final boolean m() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.nmt
    public final boolean n() {
        return this.g != null || aw(8, 4);
    }

    public nwu(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
