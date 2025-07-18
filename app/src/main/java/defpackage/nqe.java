package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqe extends mip implements nfg {
    public static final UpbMiniTable e;
    volatile nqh f;
    volatile nql g;
    volatile nwj h;
    volatile nqa i;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!)!/33b3)33^$|%");
        e = upbMiniTableB;
        upbMiniTableB.e(nqh.d, nql.d, nwj.d, nqa.d, nqj.d);
    }

    public nqe() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nfg
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nfg
    public final float h() {
        boolean z = a;
        if (!ay(true != z ? 44 : 24, 3)) {
            return 0.0f;
        }
        long j = this.c + (true != z ? 48L : 28L);
        boolean z2 = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j, false));
    }

    @Override // defpackage.nfg
    public final int i() {
        long j = true != a ? 32L : 20L;
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + j, false);
    }

    @Override // defpackage.nfg
    public final int j() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfc k() {
        if (!q()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nqa nqaVar = new nqa(ap(true != a ? 36 : 56, nqa.d));
        this.i = nqaVar;
        return nqaVar;
    }

    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfi l() {
        if (!t()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nqh nqhVar = new nqh(ap(true != a ? 20 : 32, nqh.d));
        this.f = nqhVar;
        return nqhVar;
    }

    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nfj m() {
        if (!s()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nql nqlVar = new nql(ap(true != a ? 24 : 40, nql.d));
        this.g = nqlVar;
        return nqlVar;
    }

    @Override // defpackage.nfg
    public final /* bridge */ /* synthetic */ nmj n() {
        if (!r()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nwj nwjVar = new nwj(ap(true != a ? 28 : 48, nwj.d));
        this.h = nwjVar;
        return nwjVar;
    }

    @Override // defpackage.nfg
    public final boolean o() {
        boolean z = a;
        if (ay(true != z ? 44 : 24, 4)) {
            return av(this.c, true != z ? 48 : 28);
        }
        return false;
    }

    @Override // defpackage.nfg
    public final boolean p() {
        return aw(8, 32);
    }

    @Override // defpackage.nfg
    public final boolean q() {
        return this.i != null || aw(8, 64);
    }

    @Override // defpackage.nfg
    public final boolean r() {
        return this.h != null || aw(8, 16);
    }

    @Override // defpackage.nfg
    public final boolean s() {
        return this.g != null || aw(8, 8);
    }

    @Override // defpackage.nfg
    public final boolean t() {
        return this.f != null || aw(8, 4);
    }

    public nqe(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
