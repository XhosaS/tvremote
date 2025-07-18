package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nsz extends mip implements nik {
    public static final UpbMiniTable e;
    volatile ntc f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$((a3G");
        e = upbMiniTableB;
        upbMiniTableB.e(ntc.d, nta.d);
    }

    public nsz() {
        super(UpbMessage.a(e));
        new AtomicReference();
    }

    @Override // defpackage.nik
    public final /* bridge */ /* synthetic */ nil g() {
        if (!h()) {
            return null;
        }
        if (this.f != null) {
            return this.f;
        }
        ntc ntcVar = new ntc(ap(true != a ? 20 : 24, ntc.d));
        this.f = ntcVar;
        return ntcVar;
    }

    @Override // defpackage.nik
    public final boolean h() {
        return this.f != null || aw(8, 4);
    }

    public nsz(UpbMessage upbMessage) {
        super(upbMessage);
        new AtomicReference();
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
