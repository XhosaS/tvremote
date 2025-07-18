package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndg extends mii {
    public ndg() {
        super(192475008, ndh.class, new mim() { // from class: nde
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeek aeekVar = new aeek();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeekVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mzo(aeekVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return ndf.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nob(upbMessage);
        }
        int i = nob.d;
        return noa.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nob.e;
    }
}
