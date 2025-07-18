package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncw extends mii {
    public ncw() {
        super(168774763, ncx.class, new mim() { // from class: ncu
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeeh aeehVar = new aeeh();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeehVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new mzl(aeehVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return ncv.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nnk(upbMessage);
        }
        int i = nnk.d;
        return nnj.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nnk.e;
    }
}
