package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vhm implements vug {
    UNKNOWN(0),
    DELIVERED_FCM_PUSH(1),
    SCHEDULED_RECEIVER(2),
    FETCHED_LATEST_THREADS(3),
    FETCHED_UPDATED_THREADS(4),
    LOCAL_NOTIFICATION_CREATED(5),
    LOCAL_NOTIFICATION_UPDATED(6);

    public final int h;

    vhm(int i2) {
        this.h = i2;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
