package j$.time.format;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[s.values().length];
        a = iArr;
        try {
            iArr[s.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[s.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[s.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[s.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
