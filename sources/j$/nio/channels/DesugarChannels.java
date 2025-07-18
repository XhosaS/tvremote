package j$.nio.channels;

import j$.adapter.a;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (a.a) {
            return fileChannel;
        }
        if (!(fileChannel instanceof j$.desugar.sun.nio.fs.a)) {
            return new j$.desugar.sun.nio.fs.a(fileChannel);
        }
        int i = j$.desugar.sun.nio.fs.a.b;
        return (j$.desugar.sun.nio.fs.a) fileChannel;
    }
}
