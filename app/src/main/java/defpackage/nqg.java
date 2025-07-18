package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqg extends mip implements nfh {
    public static final UpbMiniTable d;
    volatile nvq e;
    volatile nvq f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$334");
        d = upbMiniTableB;
        UpbMiniTable upbMiniTable = nvq.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, nho.a);
    }

    public nqg() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nfh
    public final /* bridge */ /* synthetic */ nlp g() {
        if (!i()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nvq nvqVar = new nvq(ap(true != a ? 16 : 24, nvq.d));
        this.f = nvqVar;
        return nvqVar;
    }

    @Override // defpackage.nfh
    public final /* bridge */ /* synthetic */ nlp h() {
        if (!j()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nvq nvqVar = new nvq(ap(true != a ? 12 : 16, nvq.d));
        this.e = nvqVar;
        return nvqVar;
    }

    @Override // defpackage.nfh
    public final boolean i() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nfh
    public final boolean j() {
        return this.e != null || aw(8, 1);
    }

    @Override // defpackage.nfh
    public final int k() {
        long j = true != a ? 20L : 12L;
        boolean z = UpbUnsafe.a;
        int iA = nhp.a(Memory.peekInt(this.c + j, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nqg(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
