package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npq extends mip implements neo {
    public static final UpbMiniTable d;
    volatile npl e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$))33");
        d = upbMiniTableB;
        upbMiniTableB.e(npl.d, npj.d);
    }

    public npq() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.neo
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.neo
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.neo
    public final /* bridge */ /* synthetic */ nel i() {
        if (!k()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        npl nplVar = new npl(ap(true != a ? 20 : 24, npl.d));
        this.e = nplVar;
        return nplVar;
    }

    @Override // defpackage.neo
    public final boolean j() {
        return aw(8, 2);
    }

    @Override // defpackage.neo
    public final boolean k() {
        return this.e != null || aw(8, 4);
    }

    public npq(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
