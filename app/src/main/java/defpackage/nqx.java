package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqx extends mip implements nfy {
    public static final UpbMiniTable e;
    volatile nrh f;
    volatile nrh g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$433");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        upbMiniTableB.e(nft.a, upbMiniTable, upbMiniTable);
    }

    public nqx() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nfy
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!i()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nrh nrhVar = new nrh(ap(true != a ? 20 : 24, nrh.d));
        this.g = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nfy
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!j()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nrh nrhVar = new nrh(ap(16, nrh.d));
        this.f = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nfy
    public final boolean i() {
        return this.g != null || aw(8, 4);
    }

    @Override // defpackage.nfy
    public final boolean j() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nfy
    public final int k() {
        boolean z = UpbUnsafe.a;
        int iA = nfu.a(Memory.peekInt(this.c + 12, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nqx(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
