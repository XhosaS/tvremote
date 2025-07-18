package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydg implements ybz {
    private final /* synthetic */ int a;

    public ydg(int i) {
        this.a = i;
    }

    @Override // defpackage.ybz
    public final yby a(int i) {
        if (this.a != 0) {
            return new xug(ByteBuffer.allocateDirect(Math.min(1048576, i)));
        }
        return new ydf(new zgk(), Math.min(1048576, ((i + 8191) / 8192) * 8192));
    }
}
