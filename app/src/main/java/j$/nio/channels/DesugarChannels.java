package j$.nio.channels;

import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.e)) {
            return new j$.desugar.sun.nio.fs.e(fileChannel, false, false, null);
        }
        int i = j$.desugar.sun.nio.fs.e.e;
        return (j$.desugar.sun.nio.fs.e) fileChannel;
    }
}
