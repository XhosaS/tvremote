package java.nio.channels;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface SeekableByteChannel extends ByteChannel {
    long size() throws IOException;
}
