package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwp extends mip implements nmn {
    public static final UpbMiniTable e;
    volatile nwj f;
    volatile nwn g;
    volatile nvq h;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$)!)!!3/a3!!33!!");
        e = upbMiniTableB;
        upbMiniTableB.e(nwn.d, nwj.d, nvq.d, nnm.d);
    }

    public nwp() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nmn
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 28, false));
    }

    @Override // defpackage.nmn
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 24, false));
    }

    @Override // defpackage.nmn
    public final float i() {
        if (!aw(8, 2)) {
            return 1.0f;
        }
        long j = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j + 16, false));
    }

    @Override // defpackage.nmn
    public final float j() {
        long j = true != a ? 44L : 36L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nmn
    public final float k() {
        long j = true != a ? 40L : 32L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nmn
    public final float l() {
        long j = true != a ? 56L : 40L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nmn
    public final float m() {
        long j = true != a ? 60L : 44L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.nmn
    public final int n() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nmn
    public final int o() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 20, false);
    }

    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nlp p() {
        if (!w()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nvq nvqVar = new nvq(ap(true != a ? 48 : 64, nvq.d));
        this.h = nvqVar;
        return nvqVar;
    }

    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nmj q() {
        if (!t()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nwj nwjVar = new nwj(ap(true != a ? 36 : 56, nwj.d));
        this.f = nwjVar;
        return nwjVar;
    }

    @Override // defpackage.nmn
    public final /* bridge */ /* synthetic */ nmo r() {
        if (!v()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nwn nwnVar = new nwn(ap(true != a ? 32 : 48, nwn.d));
        this.g = nwnVar;
        return nwnVar;
    }

    @Override // defpackage.nmn
    public final boolean s() {
        if (u()) {
            return av(this.c, 10);
        }
        return true;
    }

    @Override // defpackage.nmn
    public final boolean t() {
        return this.f != null || aw(8, 128);
    }

    @Override // defpackage.nmn
    public final boolean u() {
        return aw(8, 64);
    }

    @Override // defpackage.nmn
    public final boolean v() {
        return this.g != null || aw(8, 32);
    }

    @Override // defpackage.nmn
    public final boolean w() {
        return this.h != null || aw(9, 4);
    }

    public nwp(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
