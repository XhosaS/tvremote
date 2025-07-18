package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nru extends mip implements nhb {
    public static final UpbMiniTable e;
    volatile nwq f;
    volatile nse g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1a33331a/");
        e = upbMiniTableB;
        upbMiniTableB.e(nwq.d, nsc.d, nrx.d, nse.d);
        upbMiniTableB.d(1);
        upbMiniTableB.d(7);
    }

    public nru() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nhb
    public final /* bridge */ /* synthetic */ nhg g() {
        if (!i()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nse nseVar = new nse(ap(true != a ? 24 : 72, nse.d));
        this.g = nseVar;
        return nseVar;
    }

    @Override // defpackage.nhb
    public final /* bridge */ /* synthetic */ nmp h() {
        if (!j()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nwq nwqVar = new nwq(ap(true != a ? 12 : 48, nwq.d));
        this.f = nwqVar;
        return nwqVar;
    }

    @Override // defpackage.nhb
    public final boolean i() {
        return this.g != null || aw(8, 16);
    }

    @Override // defpackage.nhb
    public final boolean j() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nhb
    public final void k() {
        av(this.c, 9);
    }

    public nru(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
