package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aflo {
    public static void a(Parcel parcel, afih afihVar) {
        int i;
        int length;
        int i2;
        if (afihVar != null) {
            Charset charset = afgt.a;
            i = afihVar.e;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = afgt.a;
        int i3 = afihVar.e;
        Object[] objArr = new Object[i3 + i3];
        for (int i4 = 0; i4 < afihVar.e; i4++) {
            int i5 = i4 + i4;
            objArr[i5] = afihVar.g(i4);
            int i6 = i5 + 1;
            Object objB = afihVar.b(i4);
            if (!(objB instanceof byte[])) {
                throw null;
            }
            objArr[i6] = objB;
        }
        parcel.writeInt(i);
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = i7 + i7;
            byte[] bArr = (byte[]) objArr[i8];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i8 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else {
                if (obj instanceof afly) {
                    parcel.writeInt(-1);
                    throw null;
                }
                byte[] bArrB = aflf.b(aflf.a);
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i9 = 0;
                    while (true) {
                        length = bArrB.length;
                        if (i9 >= length || (i2 = inputStream.read(bArrB, i9, length - i9)) == -1) {
                            break;
                        } else {
                            i9 += i2;
                        }
                    }
                    if (i9 == length) {
                        throw Status.h.withDescription("Metadata value too large").asException();
                    }
                    parcel.writeInt(i9);
                    if (i9 > 0) {
                        parcel.writeByteArray(bArrB, 0, i9);
                    }
                } finally {
                    aflf.a(bArrB);
                }
            }
        }
    }

    public static byte[] b(Parcel parcel, int i, int i2) throws StatusException {
        if (i2 + i > 8192) {
            throw Status.h.withDescription("Metadata too large").asException();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
