package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nel {
    public static final boolean a;

    static {
        boolean z;
        try {
            System.loadLibrary("wvmediadrm");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }
}
