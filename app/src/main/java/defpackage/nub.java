package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nub extends mip implements njn {
    public static final UpbMiniTable e;
    static final miv f;
    volatile String g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1c11");
        e = upbMiniTableB;
        f = upbMiniTableB.d(1);
        upbMiniTableB.d(6);
    }

    public nub() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.njn
    public final String g() {
        if (!h()) {
            return null;
        }
        if (this.g == null) {
            this.g = aq(f.b);
        }
        return this.g;
    }

    @Override // defpackage.njn
    public final boolean h() {
        return aw(8, 1);
    }

    public nub(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
