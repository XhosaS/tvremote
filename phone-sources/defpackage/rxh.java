package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxh extends RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public rxh(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
