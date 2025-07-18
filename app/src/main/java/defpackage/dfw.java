package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfw implements daw {
    private final File a;

    public dfw(File file) {
        this.a = file;
    }

    @Override // defpackage.daw
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        try {
            File file = this.a;
            int i = dpw.a;
            FileChannel fileChannel = null;
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
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
                        davVar.b(mappedByteBufferLoad);
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
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
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            davVar.e(e);
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }

    @Override // defpackage.daw
    public final void d() {
    }
}
