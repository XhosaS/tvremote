package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsx extends vsv {
    private final ByteBuffer a;

    public vsx(ByteBuffer byteBuffer) {
        Charset charset = vuo.a;
        a.ar(byteBuffer, "buffer");
        this.a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.a.slice();
        int iRemaining = byteBufferSlice.remaining();
        a.J(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new vsw(bArr);
    }

    @Override // defpackage.vsz
    public final byte a(int i) {
        try {
            return this.a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // defpackage.vsz
    public final byte b(int i) {
        return a(i);
    }

    @Override // defpackage.vsz
    public final int d() {
        return this.a.remaining();
    }

    @Override // defpackage.vsz
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.a.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // defpackage.vsz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vsz)) {
            return false;
        }
        vsz vszVar = (vsz) obj;
        if (d() != vszVar.d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        return obj instanceof vsx ? this.a.equals(((vsx) obj).a) : obj instanceof vvx ? obj.equals(this) : this.a.equals(vszVar.l());
    }

    @Override // defpackage.vsv
    public final boolean g(vsz vszVar, int i, int i2) {
        return j(0, i2).equals(vszVar.j(i, i + i2));
    }

    @Override // defpackage.vsz
    protected final int i(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.a.get(i4);
        }
        return i;
    }

    @Override // defpackage.vsz
    public final vsz j(int i, int i2) {
        try {
            ByteBuffer byteBuffer = this.a;
            if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.position(i - byteBuffer.position());
            byteBufferSlice.limit(i2 - byteBuffer.position());
            return new vsx(byteBufferSlice);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // defpackage.vsz
    public final vte k() {
        int i = vte.g;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            return vte.O(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), true);
        }
        if (byteBuffer.isDirect()) {
            int i2 = vtd.a;
            if (vwl.a) {
                return new vtd(byteBuffer);
            }
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return vte.O(bArr, 0, iRemaining, true);
    }

    @Override // defpackage.vsz
    public final ByteBuffer l() {
        return this.a.asReadOnlyBuffer();
    }

    @Override // defpackage.vsz
    public final void m(vsq vsqVar) {
        vsqVar.a(this.a.slice());
    }

    @Override // defpackage.vsz
    public final void n(OutputStream outputStream) throws IOException {
        outputStream.write(w());
    }
}
