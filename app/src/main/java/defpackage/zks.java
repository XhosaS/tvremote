package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zks {
    public static final byte[] a(File file) {
        zkq zkqVar = new zkq();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            zkqVar.a(fileInputStream);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            int i = zkn.a;
            yqw.E(size >= 0, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArrB = new byte[i2];
            int i3 = i2;
            while (true) {
                if (i3 > 0) {
                    int i4 = i2 - i3;
                    int i5 = fileInputStream.read(bArrB, i4, i3);
                    if (i5 == -1) {
                        bArrB = Arrays.copyOf(bArrB, i4);
                        break;
                    }
                    i3 -= i5;
                } else {
                    int i6 = fileInputStream.read();
                    if (i6 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArrB);
                        arrayDeque.add(new byte[]{(byte) i6});
                        bArrB = zkn.b(fileInputStream, arrayDeque, i2 + 1);
                    }
                }
            }
            return bArrB;
        } catch (Throwable th) {
            try {
                zkqVar.a = th;
                yrv.a(th, IOException.class);
                yrv.b(th);
                throw new RuntimeException(th);
            } finally {
                zkqVar.close();
            }
        }
    }
}
