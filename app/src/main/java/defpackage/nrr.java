package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nrr extends mip implements ngy {
    public static final UpbMiniTable d;
    volatile nrh e;
    volatile nrh f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$334");
        d = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, ngw.a);
    }

    public nrr() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!i()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nrh nrhVar = new nrh(ap(true != a ? 12 : 16, nrh.d));
        this.e = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ngy
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!j()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nrh nrhVar = new nrh(ap(true != a ? 16 : 24, nrh.d));
        this.f = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ngy
    public final boolean i() {
        return this.e != null || aw(8, 1);
    }

    @Override // defpackage.ngy
    public final boolean j() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.ngy
    public final int k() {
        long j = true != a ? 20L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = ngx.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nrr(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
