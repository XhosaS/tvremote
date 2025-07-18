package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngu extends mii {
    public ngu() {
        super(168774585, ngv.class, new mim() { // from class: ngs
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeez aeezVar = new aeez();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeezVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nau(aeezVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return ngt.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nro(upbMessage);
        }
        int i = nro.d;
        return nrn.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nro.e;
    }
}
