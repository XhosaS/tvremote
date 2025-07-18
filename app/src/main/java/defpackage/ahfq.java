package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfq {
    public static /* synthetic */ ahfn a(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new ahfj(ahfm.a) : new ahga(1, i2);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? i2 == 1 ? new ahfj(i) : new ahga(i, i2) : new ahfj(Integer.MAX_VALUE) : i2 == 1 ? new ahfj(0) : new ahga(1, i2);
        }
        if (i2 == 1) {
            return new ahga(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
