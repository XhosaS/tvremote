package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qtk {
    public abstract yyk a();

    public abstract boolean b();

    public final yyk c() {
        if (b()) {
            return a();
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }
}
