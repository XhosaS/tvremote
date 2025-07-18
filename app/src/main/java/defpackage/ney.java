package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ney extends mii {
    public ney() {
        super(189078944, nez.class, new mim() { // from class: new
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeeo aeeoVar = new aeeo();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeeoVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nae(aeeoVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nex.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new npy(upbMessage);
        }
        int i = npy.d;
        return npx.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return npy.e;
    }
}
