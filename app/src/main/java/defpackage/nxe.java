package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nxe extends mip implements nnc {
    public static final UpbMiniTable d;
    volatile nwv e;
    volatile nwx f;
    volatile nwx g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$43/!/!a33");
        d = upbMiniTableB;
        UpbMiniTable upbMiniTable = nwx.d;
        upbMiniTableB.e(nnd.a, nwv.d, upbMiniTable, upbMiniTable);
    }

    public nxe() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nnc
    public final float g() {
        long j = true != a ? 24L : 20L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nnc
    public final float h() {
        long j = true != a ? 20L : 16L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmu i() {
        if (this.e == null && !aw(8, 2)) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nwv nwvVar = new nwv(ap(true != a ? 16 : 24, nwv.d));
        this.e = nwvVar;
        return nwvVar;
    }

    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmx j() {
        if (this.g == null && !aw(8, 128)) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nwx nwxVar = new nwx(ap(true != a ? 32 : 40, nwx.d));
        this.g = nwxVar;
        return nwxVar;
    }

    @Override // defpackage.nnc
    public final /* bridge */ /* synthetic */ nmx k() {
        if (this.f == null && !aw(8, 64)) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nwx nwxVar = new nwx(ap(true != a ? 28 : 32, nwx.d));
        this.f = nwxVar;
        return nwxVar;
    }

    @Override // defpackage.nnc
    public final nne l() {
        boolean z = UpbUnsafe.a;
        nne nneVarA = nne.a(Memory.peekInt(this.c + 12, false));
        return nneVarA == null ? nne.TRANSITION_VALUE_TYPE_NONE : nneVarA;
    }

    @Override // defpackage.nnc
    public final boolean m() {
        return av(this.c, 10);
    }

    @Override // defpackage.nnc
    public final boolean n() {
        return av(this.c, 9);
    }

    public nxe(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
