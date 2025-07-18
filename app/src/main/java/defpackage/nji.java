package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nji extends mii {
    public nji() {
        super(389740320, njj.class, new mim() { // from class: njg
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aega aegaVar = new aega();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegaVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbm(aegaVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return njh.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new ntv(upbMessage);
        }
        int i = ntv.d;
        return ntu.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return ntv.e;
    }
}
