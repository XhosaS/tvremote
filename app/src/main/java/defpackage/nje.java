package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nje extends mii {
    public nje() {
        super(405782140, njf.class, new mim() { // from class: njc
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefz aefzVar = new aefz();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefzVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbl(aefzVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return njd.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nts(upbMessage);
        }
        int i = nts.d;
        return ntr.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nts.e;
    }
}
