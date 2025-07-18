package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzu {
    public static final /* synthetic */ int a = 0;

    static {
        new tzt();
    }

    public static byte[] a(InputStream inputStream) {
        inputStream.getClass();
        return b(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] b(InputStream inputStream, Queue queue, int i) throws IOException {
        int i2;
        int iHighestOneBit = Integer.highestOneBit(i);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        loop0: while (true) {
            i2 = 2147483639;
            if (i < 2147483639) {
                int iMin2 = Math.min(iMin, 2147483639 - i);
                byte[] bArr = new byte[iMin2];
                queue.add(bArr);
                int i3 = 0;
                while (i3 < iMin2) {
                    int i4 = inputStream.read(bArr, i3, iMin2 - i3);
                    if (i4 == -1) {
                        i2 = i;
                        break loop0;
                    }
                    i3 += i4;
                    i += i4;
                }
                iMin = udo.g(iMin, iMin < 4096 ? 4 : 2);
            } else if (inputStream.read() != -1) {
                throw new OutOfMemoryError("input is too large to fit in a byte array");
            }
        }
        return qtl.aN(queue, i2);
    }
}
