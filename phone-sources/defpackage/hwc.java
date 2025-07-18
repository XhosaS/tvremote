package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwc {
    public static final /* synthetic */ int a = 0;
    private static final AtomicReference b = new AtomicReference();

    public static ByteBuffer a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference atomicReference = b;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i < 0) {
                atomicReference.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return b(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void c(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        b(byteBuffer);
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBuffer);
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.force(false);
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
            randomAccessFile.close();
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                } catch (IOException unused) {
                }
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }
}
