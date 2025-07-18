package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nsq extends mip implements nhq {
    public static final UpbMiniTable d;
    volatile nrh e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$/3");
        d = upbMiniTableB;
        upbMiniTableB.e(nrh.d);
    }

    public nsq() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nhq
    public final /* bridge */ /* synthetic */ ngp g() {
        if (!j()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        nrh nrhVar = new nrh(ap(true != a ? 12 : 16, nrh.d));
        this.e = nrhVar;
        return nrhVar;
    }

    @Override // defpackage.nhq
    public final boolean h() {
        return av(this.c, 9);
    }

    @Override // defpackage.nhq
    public final boolean i() {
        return aw(8, 1);
    }

    @Override // defpackage.nhq
    public final boolean j() {
        return this.e != null || aw(8, 2);
    }

    public nsq(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
