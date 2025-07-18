package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npa extends mip implements ndv {
    public static final UpbMiniTable d = UpbMiniTable.b("$=");
    ArrayList e;

    public npa() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndv
    public final int g(int i) {
        r();
        return ((Integer) this.e.get(i)).intValue();
    }

    @Override // defpackage.ndv
    public final int h() {
        r();
        return this.e.size();
    }

    final void r() {
        if (this.e == null) {
            this.e = as(8);
        }
    }

    public npa(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
