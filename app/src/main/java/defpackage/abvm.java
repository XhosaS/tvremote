package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abvm extends abvl {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public abvm(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.abvo
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.abvo
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.abvo
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.abvo
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.abvo
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abvo) || d() != ((abvo) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof abvm)) {
            return obj.equals(this);
        }
        abvm abvmVar = (abvm) obj;
        int i = this.c;
        int i2 = abvmVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(abvmVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.abvl
    public final boolean g(abvo abvoVar, int i, int i2) {
        if (i2 > abvoVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > abvoVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abvoVar.d());
        }
        if (!(abvoVar instanceof abvm)) {
            return abvoVar.j(i, i3).equals(j(0, i2));
        }
        abvm abvmVar = (abvm) abvoVar;
        byte[] bArr = this.a;
        byte[] bArr2 = abvmVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = abvmVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.abvo
    protected final int i(int i, int i2, int i3) {
        return abxt.b(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.abvo
    public final abvo j(int i, int i2) {
        int iQ = q(i, i2, d());
        return iQ == 0 ? abvo.b : new abvi(this.a, c() + i, iQ);
    }

    @Override // defpackage.abvo
    public final abvt k() {
        return abvt.L(this.a, c(), d(), true);
    }

    @Override // defpackage.abvo
    public final InputStream l() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.abvo
    protected final String m(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.abvo
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.abvo
    public final void o(abvf abvfVar) {
        abvfVar.a(this.a, c(), d());
    }

    @Override // defpackage.abvo
    public final void p(OutputStream outputStream) throws IOException {
        outputStream.write(B());
    }
}
