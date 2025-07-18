package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum kvm {
    TYPE_UNSPECIFIED(0, 0),
    TYPE_RENTAL(1, 0),
    TYPE_PURCHASE(2, 1),
    TYPE_SUBSCRIPTION(3, 0),
    TYPE_FREE_WITH_ADS(4, 0);

    public final int f;
    public final int g;

    kvm(int i, int i2) {
        this.f = i;
        this.g = i2;
    }
}
