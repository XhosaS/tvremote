package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class noc extends mip implements ndh {
    public static final UpbMiniTable e;
    volatile nod f;
    volatile nny g;
    volatile nnw h;
    volatile nrh i;
    volatile nrh j;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3/a!!(433334/3a3/33^*|+~,|-");
        e = upbMiniTableB;
        UpbMiniTable upbMiniTable = nrh.d;
        UpbMiniTable upbMiniTable2 = nrh.d;
        upbMiniTableB.e(nod.d, ndc.a, nny.d, nnw.d, upbMiniTable, upbMiniTable, njp.a, nnu.d, nof.d, upbMiniTable2, upbMiniTable2);
    }

    public noc() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.ndh
    public final float g() {
        long j = true != a ? 20L : 16L;
        long j2 = this.c;
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j2 + j, false));
    }

    @Override // defpackage.ndh
    public final float h() {
        if (!aw(8, 8)) {
            return 1.0f;
        }
        long j = this.c + (true != a ? 24L : 20L);
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j, false));
    }

    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ nda i() {
        if (!r()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nnw nnwVar = new nnw(ap(true != a ? 60 : 88, nnw.d));
        this.h = nnwVar;
        return nnwVar;
    }

    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ndb j() {
        if (!u()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nny nnyVar = new nny(ap(true != a ? 60 : 88, nny.d));
        this.g = nnyVar;
        return nnyVar;
    }

    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ndi k() {
        if (!q()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nod nodVar = new nod(ap(true != a ? 16 : 48, nod.d));
        this.f = nodVar;
        return nodVar;
    }

    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ngp l() {
        if (!s()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nrh nrhVar = new nrh(ap(true != a ? 68 : 96, nrh.d));
        this.j = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ndh
    public final /* bridge */ /* synthetic */ ngp m() {
        if (!t()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nrh nrhVar = new nrh(ap(true != a ? 68 : 96, nrh.d));
        this.i = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.ndh
    public final boolean n() {
        return av(this.c, 12);
    }

    @Override // defpackage.ndh
    public final boolean o() {
        return av(this.c, 11);
    }

    @Override // defpackage.ndh
    public final boolean p() {
        return av(this.c, 10);
    }

    @Override // defpackage.ndh
    public final boolean q() {
        return this.f != null || aw(8, 1);
    }

    @Override // defpackage.ndh
    public final boolean r() {
        if (this.h == null) {
            if (!ay(true != a ? 56 : 36, 9)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ndh
    public final boolean s() {
        if (this.j == null) {
            if (!ay(true != a ? 64 : 40, 11)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ndh
    public final boolean t() {
        if (this.i == null) {
            if (!ay(true != a ? 64 : 40, 10)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ndh
    public final boolean u() {
        if (this.g == null) {
            if (!ay(true != a ? 56 : 36, 8)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ndh
    public final int v() {
        long j = true != a ? 32L : 28L;
        boolean z = UpbUnsafe.a;
        int iA = ndd.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // defpackage.ndh
    public final int w() {
        long j = true != a ? 36L : 32L;
        boolean z = UpbUnsafe.a;
        int iA = njq.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public noc(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
