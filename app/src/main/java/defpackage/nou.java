package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nou extends mip implements nds {
    public static final UpbMiniTable d;
    volatile npv e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$3");
        d = upbMiniTableB;
        upbMiniTableB.e(npv.d);
    }

    public nou() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nds
    public final /* bridge */ /* synthetic */ net g() {
        if (!h()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        npv npvVar = new npv(ap(true != a ? 12 : 16, npv.d));
        this.e = npvVar;
        return npvVar;
    }

    @Override // defpackage.nds
    public final boolean h() {
        return this.e != null || aw(8, 1);
    }

    public nou(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
