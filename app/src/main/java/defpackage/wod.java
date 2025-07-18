package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wod extends wqd {
    private final Set a;
    private final long b;
    private final yqt c;

    public wod(Set set, long j, yqt yqtVar) {
        this.a = set;
        this.b = j;
        this.c = yqtVar;
    }

    @Override // defpackage.wqd
    public final long a() {
        return this.b;
    }

    @Override // defpackage.wqd
    public final yqt b() {
        return this.c;
    }

    @Override // defpackage.wqd
    public final Set c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wqd) {
            wqd wqdVar = (wqd) obj;
            if (this.a.equals(wqdVar.c()) && this.b == wqdVar.a() && this.c.equals(wqdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        yqt yqtVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + yqtVar.toString() + "}";
    }
}
