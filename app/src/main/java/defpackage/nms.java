package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nms extends mii {
    public nms() {
        super(158796380, nmt.class, new mim() { // from class: nmq
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                return new ncm(aegz.g(byteBuffer));
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nmr.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nwt(upbMessage);
        }
        int i = nwt.d;
        return nws.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nwt.e;
    }
}
