package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nrk extends mip implements ngq {
    public static final UpbMiniTable d;
    static final miv e;
    volatile String f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1");
        d = upbMiniTableB;
        e = upbMiniTableB.d(1);
    }

    public nrk() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ngq
    public final String g() {
        if (!h()) {
            return null;
        }
        if (this.f == null) {
            this.f = aq(e.b);
        }
        return this.f;
    }

    @Override // defpackage.ngq
    public final boolean h() {
        return aw(8, 1);
    }

    public nrk(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
