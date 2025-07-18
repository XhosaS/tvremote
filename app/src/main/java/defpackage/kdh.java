package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdh extends kdg {
    public final byte[] a;

    public kdh(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.kdg
    public final byte[] g() {
        return this.a;
    }
}
