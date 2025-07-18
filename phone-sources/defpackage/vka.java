package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vka implements vug {
    DEFAULT(0),
    TV(1),
    WEARABLE(2),
    AUTOMOTIVE(3),
    BATTLESTAR(4),
    CHROME_OS(5);

    public final int g;

    vka(int i) {
        this.g = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
