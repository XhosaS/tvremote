package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ahsn implements abxf {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    ahsn(int i) {
        this.c = i;
    }

    public static ahsn b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
