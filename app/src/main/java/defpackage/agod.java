package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agod {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
