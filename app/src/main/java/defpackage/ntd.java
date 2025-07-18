package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntd extends mip implements nil {
    public static final UpbMiniTable d;
    static final miv e;
    ArrayList f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$H");
        d = upbMiniTableB;
        upbMiniTableB.e(nie.a);
        e = upbMiniTableB.d(1);
    }

    public ntd() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nil
    public final int g() {
        r();
        return this.f.size();
    }

    @Override // defpackage.nil
    public final int h(int i) {
        r();
        int iA = nif.a(((Integer) this.f.get(i)).intValue());
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void r() {
        if (this.f == null) {
            this.f = as(e.b);
        }
    }

    public ntd(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
