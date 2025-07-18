package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwb extends mip implements nlu {
    public static final UpbMiniTable d;
    volatile nwc e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!(43/!4");
        d = upbMiniTableB;
        upbMiniTableB.e(nlv.a, nwc.d, nlt.a);
    }

    public nwb() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nlu
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nlu
    public final float h() {
        long j = true != a ? 28L : 24L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nlu
    public final int i() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nlu
    public final /* bridge */ /* synthetic */ nlx j() {
        if (!l()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nwc nwcVar = new nwc(ap(true != a ? 24 : 32, nwc.d));
        this.e = nwcVar;
        return nwcVar;
    }

    @Override // defpackage.nlu
    public final boolean k() {
        return av(this.c, 9);
    }

    @Override // defpackage.nlu
    public final boolean l() {
        return this.e != null || aw(8, 8);
    }

    @Override // defpackage.nlu
    public final int m() {
        boolean z = UpbUnsafe.a;
        int iA = nlw.a(Memory.peekInt(this.c + 20, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nwb(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
