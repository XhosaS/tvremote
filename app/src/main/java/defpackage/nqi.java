package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.util.ArrayList;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqi extends mip implements nfi {
    public static final UpbMiniTable d;
    ArrayList e;
    ArrayList f;
    volatile nqf g;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$=7!3^$|%");
        d = upbMiniTableB;
        upbMiniTableB.e(nqf.d);
    }

    public nqi() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nfi
    public final float g() {
        boolean z = a;
        if (!ay(true != z ? 16 : 8, 3)) {
            return 0.0f;
        }
        long j = this.c + (true != z ? 20L : 32L);
        boolean z2 = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(j, false));
    }

    @Override // defpackage.nfi
    public final float h(int i) {
        s();
        return ((Float) this.f.get(i)).floatValue();
    }

    @Override // defpackage.nfi
    public final int i(int i) {
        r();
        return ((Integer) this.e.get(i)).intValue();
    }

    @Override // defpackage.nfi
    public final int j() {
        r();
        return this.e.size();
    }

    @Override // defpackage.nfi
    public final int k() {
        s();
        return this.f.size();
    }

    @Override // defpackage.nfi
    public final /* bridge */ /* synthetic */ nfh l() {
        if (!m()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nqf nqfVar = new nqf(ap(true != a ? 20 : 32, nqf.d));
        this.g = nqfVar;
        return nqfVar;
    }

    @Override // defpackage.nfi
    public final boolean m() {
        if (this.g == null) {
            if (!ay(true != a ? 16 : 8, 4)) {
                return false;
            }
        }
        return true;
    }

    final void r() {
        if (this.e == null) {
            this.e = as(true != a ? 8 : 16);
        }
    }

    final void s() {
        if (this.f == null) {
            this.f = ar(true != a ? 12 : 24);
        }
    }

    public nqi(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
