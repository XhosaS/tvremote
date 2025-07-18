package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvr extends obp {
    public final byte[] a;

    public nvr(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.obp
    public final byte[] aA() {
        return this.a;
    }
}
