package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afd extends air {
    public final byte[] a;

    public afd(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.air
    public final byte[] x() {
        return this.a;
    }
}
