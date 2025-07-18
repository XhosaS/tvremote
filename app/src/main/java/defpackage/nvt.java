package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nvt extends mip implements nlq {
    public static final UpbMiniTable d;
    volatile nrh e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$(3");
        d = upbMiniTableB;
        upbMiniTableB.e(nrh.d);
    }

    public nvt() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nlq
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nlq
    public final /* bridge */ /* synthetic */ ngp h() {
        if (!i()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nrh nrhVar = new nrh(ap(16, nrh.d));
        this.e = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nlq
    public final boolean i() {
        return this.e != null || aw(8, 2);
    }

    public nvt(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
