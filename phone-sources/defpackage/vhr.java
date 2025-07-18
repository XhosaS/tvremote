package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vhr implements vug {
    IMAGE_TYPE_UNSPECIFIED(0),
    COLLAPSED_ICON(1),
    EXPANDED_ICON(2),
    BIG_PICTURE(3);

    public final int e;

    vhr(int i) {
        this.e = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
