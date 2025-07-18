package defpackage;

import java.io.DataOutput;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tab {
    public static final tab a = new tab();

    private tab() {
    }

    public final void a(DataOutput dataOutput, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            dataOutput.write((i >> (i3 * 8)) & 255);
        }
    }

    public final void b(DataOutput dataOutput, String str) throws IOException {
        byte[] bytes = str.getBytes(agyo.a);
        bytes.getClass();
        dataOutput.write(bytes);
    }
}
