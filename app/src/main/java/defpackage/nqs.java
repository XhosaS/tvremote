package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqs extends mip implements nfr {
    public static final UpbMiniTable e;
    static final miv f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$1");
        e = upbMiniTableB;
        f = upbMiniTableB.d(1);
    }

    public nqs() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nfr
    public final boolean g() {
        return aw(8, 1);
    }

    public nqs(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
