package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srq {
    public static byte a;
    public static final zuw c = new zuw(1, "android");
    public static final Comparator b = new bxy(17);

    public static byte[] a(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) (c2 >> '\b')};
    }

    public static byte[] b(short s) {
        return s > 127 ? new byte[]{(byte) ((s >> 8) | 128), (byte) (s & 255)} : new byte[]{(byte) (s & 255)};
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] d(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }
}
