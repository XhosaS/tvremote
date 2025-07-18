package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nrm extends mip implements ngr {
    public static final UpbMiniTable d;
    volatile nrj e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3");
        d = upbMiniTableB;
        upbMiniTableB.e(nrj.d);
    }

    public nrm() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ngr
    public final /* bridge */ /* synthetic */ ngq g() {
        if (!h()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nrj nrjVar = new nrj(ap(true != a ? 12 : 16, nrj.d));
        this.e = nrjVar;
        return nrjVar;
    }

    @Override // defpackage.ngr
    public final boolean h() {
        return this.e != null || aw(8, 1);
    }

    public nrm(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
