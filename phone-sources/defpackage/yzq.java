package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum yzq implements vug {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    yzq(int i) {
        this.c = i;
    }

    public static yzq b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
