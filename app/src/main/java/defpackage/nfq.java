package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfq extends mii {
    public nfq() {
        super(503223997, nfr.class, new mim() { // from class: nfo
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aees aeesVar = new aees();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeesVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nal(aeesVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nfp.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nqr(upbMessage);
        }
        int i = nqr.d;
        return nqq.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nqr.e;
    }
}
