package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class noe extends mip implements ndi {
    public static final UpbMiniTable d;
    static final miv e;
    static final miv f;
    volatile String g;
    volatile String h;
    volatile nue i;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$113!^!|#|$");
        d = upbMiniTableB;
        upbMiniTableB.e(nue.d);
        e = upbMiniTableB.d(1);
        f = upbMiniTableB.d(2);
    }

    public noe() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndi
    public final /* bridge */ /* synthetic */ njo g() {
        if (!k()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nue nueVar = new nue(ap(true != a ? 20 : 24, nue.d));
        this.i = nueVar;
        return nueVar;
    }

    @Override // defpackage.ndi
    public final String h() {
        if (!j()) {
            return null;
        }
        if (this.g == null) {
            this.g = aq(e.b);
        }
        return this.g;
    }

    @Override // defpackage.ndi
    public final String i() {
        if (!l()) {
            return null;
        }
        if (this.h == null) {
            this.h = aq(f.b);
        }
        return this.h;
    }

    @Override // defpackage.ndi
    public final boolean j() {
        return ay(16, 1);
    }

    @Override // defpackage.ndi
    public final boolean k() {
        return this.i != null || ay(16, 3);
    }

    @Override // defpackage.ndi
    public final boolean l() {
        return ay(16, 2);
    }

    public noe(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
