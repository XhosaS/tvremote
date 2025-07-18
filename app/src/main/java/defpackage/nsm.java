package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nsm extends mip implements nhm {
    public static final UpbMiniTable d;
    volatile nsn e;
    volatile nsn f;
    volatile nsn g;
    volatile nsn h;
    volatile nsn i;
    volatile nsn j;
    volatile nsn k;
    volatile nsn l;
    volatile nsn m;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$333333333");
        d = upbMiniTableB;
        UpbMiniTable upbMiniTable = nsn.d;
        upbMiniTableB.e(upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable, upbMiniTable);
    }

    public nsm() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn g() {
        if (!p()) {
            return null;
        }
        if (this.m != null) {
            return this.m;
        }
        nsn nsnVar = new nsn(ap(true != a ? 44 : 80, nsn.d));
        this.m = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn h() {
        if (!q()) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        nsn nsnVar = new nsn(ap(true != a ? 20 : 32, nsn.d));
        this.g = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn i() {
        if (!r()) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nsn nsnVar = new nsn(ap(true != a ? 32 : 56, nsn.d));
        this.j = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn j() {
        if (!s()) {
            return null;
        }
        if (this.k != null) {
            return this.k;
        }
        nsn nsnVar = new nsn(ap(true != a ? 36 : 64, nsn.d));
        this.k = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn k() {
        if (!t()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        nsn nsnVar = new nsn(ap(true != a ? 16 : 24, nsn.d));
        this.f = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn l() {
        if (!u()) {
            return null;
        }
        if (this.h != null) {
            return this.h;
        }
        nsn nsnVar = new nsn(ap(true != a ? 24 : 40, nsn.d));
        this.h = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn m() {
        if (!v()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nsn nsnVar = new nsn(ap(true != a ? 28 : 48, nsn.d));
        this.i = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn n() {
        if (!w()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nsn nsnVar = new nsn(ap(true != a ? 12 : 16, nsn.d));
        this.e = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final /* bridge */ /* synthetic */ nhn o() {
        if (!x()) {
            return null;
        }
        if (this.l != null) {
            return this.l;
        }
        nsn nsnVar = new nsn(ap(true != a ? 40 : 72, nsn.d));
        this.l = nsnVar;
        return nsnVar;
    }

    @Override // defpackage.nhm
    public final boolean p() {
        return this.m != null || aw(9, 1);
    }

    @Override // defpackage.nhm
    public final boolean q() {
        return this.g != null || aw(8, 4);
    }

    @Override // defpackage.nhm
    public final boolean r() {
        return this.j != null || aw(8, 32);
    }

    @Override // defpackage.nhm
    public final boolean s() {
        return this.k != null || aw(8, 64);
    }

    @Override // defpackage.nhm
    public final boolean t() {
        return this.f != null || aw(8, 2);
    }

    @Override // defpackage.nhm
    public final boolean u() {
        return this.h != null || aw(8, 8);
    }

    @Override // defpackage.nhm
    public final boolean v() {
        return this.i != null || aw(8, 16);
    }

    @Override // defpackage.nhm
    public final boolean w() {
        return this.e != null || aw(8, 1);
    }

    @Override // defpackage.nhm
    public final boolean x() {
        return this.l != null || aw(8, 128);
    }

    public nsm(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
