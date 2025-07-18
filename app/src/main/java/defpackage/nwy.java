package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwy extends mip implements nmx {
    public static final UpbMiniTable d;
    volatile nvq e;
    volatile nwh f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!333^!|#|$|%");
        d = upbMiniTableB;
        upbMiniTableB.e(nvq.d, nwh.d, nnm.d);
    }

    public nwy() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nmx
    public final float g() {
        if (!j()) {
            return 0.0f;
        }
        long j = this.c + (true != a ? 12L : 16L);
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j, false));
    }

    @Override // defpackage.nmx
    public final /* bridge */ /* synthetic */ nlp h() {
        if (!k()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nvq nvqVar = new nvq(ap(true != a ? 12 : 16, nvq.d));
        this.e = nvqVar;
        return nvqVar;
    }

    @Override // defpackage.nmx
    public final /* bridge */ /* synthetic */ nmi i() {
        if (!l()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nwh nwhVar = new nwh(ap(true != a ? 12 : 16, nwh.d));
        this.f = nwhVar;
        return nwhVar;
    }

    @Override // defpackage.nmx
    public final boolean j() {
        return ay(8, 1);
    }

    @Override // defpackage.nmx
    public final boolean k() {
        return this.e != null || ay(8, 2);
    }

    @Override // defpackage.nmx
    public final boolean l() {
        return this.f != null || ay(8, 3);
    }

    public nwy(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
