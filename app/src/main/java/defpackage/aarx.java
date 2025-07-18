package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aarx {
    public static aarx a;

    public static aarx d() {
        if (a == null) {
            a = new aarz();
        }
        return a;
    }

    public abstract int a(CharSequence charSequence);

    public abstract String b(ByteBuffer byteBuffer, int i, int i2);

    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);
}
