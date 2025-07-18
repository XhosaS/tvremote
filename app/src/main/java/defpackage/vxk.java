package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxk extends vyx {
    public final long a;
    public final vyv b;
    public final boolean c;
    public final yqt d;
    public final yqt e;

    public vxk(long j, vyv vyvVar, boolean z, yqt yqtVar, yqt yqtVar2) {
        this.a = j;
        this.b = vyvVar;
        this.c = z;
        this.d = yqtVar;
        this.e = yqtVar2;
    }

    @Override // defpackage.vyx
    public final long a() {
        return this.a;
    }

    @Override // defpackage.vyx
    public final vyv b() {
        return this.b;
    }

    @Override // defpackage.vyx
    public final yqt c() {
        return this.e;
    }

    @Override // defpackage.vyx
    public final yqt d() {
        return this.d;
    }

    @Override // defpackage.vyx
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyx) {
            vyx vyxVar = (vyx) obj;
            if (this.a == vyxVar.a() && this.b.equals(vyxVar.b()) && this.c == vyxVar.e() && this.d.equals(vyxVar.d()) && this.e.equals(vyxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        yqt yqtVar = this.e;
        yqt yqtVar2 = this.d;
        return "SubscriptionCallbacksState{index=" + this.a + ", callbacks=" + this.b.toString() + ", openBackgroundFetch=" + this.c + ", maybeTopicData=" + yqtVar2.toString() + ", maybeInstanceData=" + yqtVar.toString() + "}";
    }
}
