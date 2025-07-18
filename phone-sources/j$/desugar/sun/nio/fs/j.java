package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0064b;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0064b.values().length];
        a = iArr;
        try {
            iArr[EnumC0064b.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0064b.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC0064b.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
