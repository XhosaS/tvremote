package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class noi extends mip implements ndn {
    public static final UpbMiniTable d;
    volatile nsu e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$P))34/");
        d = upbMiniTableB;
        upbMiniTableB.e(nsu.d, ndl.a);
    }

    public noi() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndn
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.ndn
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.ndn
    public final /* bridge */ /* synthetic */ nid i() {
        if (!k()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nsu nsuVar = new nsu(ap(true != a ? 20 : 24, nsu.d));
        this.e = nsuVar;
        return nsuVar;
    }

    @Override // defpackage.ndn
    public final boolean j() {
        return av(this.c, 9);
    }

    @Override // defpackage.ndn
    public final boolean k() {
        return this.e != null || aw(8, 4);
    }

    @Override // defpackage.ndn
    public final int l() {
        long j = true != a ? 24L : 20L;
        boolean z = UpbUnsafe.a;
        int iA = ndm.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public noi(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
