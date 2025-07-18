package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uwq {
    public static /* synthetic */ int a(int i, int i2) {
        int i3 = i / i2;
        return (i - (i2 * i3) != 0 && (((i ^ i2) >> 31) | 1) < 0) ? i3 - 1 : i3;
    }
}
