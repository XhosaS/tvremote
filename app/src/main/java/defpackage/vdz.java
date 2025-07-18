package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vdz implements abxf {
    HOTWORD_TYPE_UNSPECIFIED(0),
    DSP(1),
    CPU(2);

    public final int d;

    vdz(int i) {
        this.d = i;
    }

    public static vdz b(int i) {
        if (i == 0) {
            return HOTWORD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DSP;
        }
        if (i != 2) {
            return null;
        }
        return CPU;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
