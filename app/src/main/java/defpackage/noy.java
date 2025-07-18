package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class noy extends mip implements ndu {
    public static final UpbMiniTable d = UpbMiniTable.b("$==");
    ArrayList e;
    ArrayList f;

    public noy() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndu
    public final int g(int i) {
        r();
        return ((Integer) this.f.get(i)).intValue();
    }

    @Override // defpackage.ndu
    public final int h() {
        r();
        return this.f.size();
    }

    @Override // defpackage.ndu
    public final int i(int i) {
        s();
        return ((Integer) this.e.get(i)).intValue();
    }

    @Override // defpackage.ndu
    public final int j() {
        s();
        return this.e.size();
    }

    final void r() {
        if (this.f == null) {
            this.f = as(true != a ? 12 : 16);
        }
    }

    final void s() {
        if (this.e == null) {
            this.e = as(8);
        }
    }

    public noy(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
