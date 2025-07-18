package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nww extends mip implements nmu {
    public static final UpbMiniTable d;
    ArrayList e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!47");
        d = upbMiniTableB;
        upbMiniTableB.e(nmv.a);
    }

    public nww() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nmu
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nmu
    public final float h(int i) {
        r();
        return ((Float) this.e.get(i)).floatValue();
    }

    @Override // defpackage.nmu
    public final int i() {
        r();
        return this.e.size();
    }

    @Override // defpackage.nmu
    public final int j() {
        boolean z = UpbUnsafe.a;
        int iA = nmw.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final void r() {
        if (this.e == null) {
            this.e = ar(true != a ? 20 : 24);
        }
    }

    public nww(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
