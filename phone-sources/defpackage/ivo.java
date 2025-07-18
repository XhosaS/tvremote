package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivo {
    public final tos a;
    public final tos b;
    public final tos c;
    public final tos d;
    public final tos e;
    public final tos f;

    public ivo(tos tosVar, tos tosVar2, tos tosVar3, tos tosVar4, tos tosVar5, tos tosVar6) {
        this.a = tosVar;
        this.b = tosVar2;
        this.c = tosVar3;
        this.d = tosVar4;
        this.e = tosVar5;
        this.f = tosVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivo)) {
            return false;
        }
        ivo ivoVar = (ivo) obj;
        return yks.e(this.a, ivoVar.a) && yks.e(this.b, ivoVar.b) && yks.e(this.c, ivoVar.c) && yks.e(this.d, ivoVar.d) && yks.e(this.e, ivoVar.e) && yks.e(this.f, ivoVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "RemoteButtonActionListeners(homeButtonListener=" + this.a + ", backButtonListener=" + this.b + ", volumeUpButtonListener=" + this.c + ", volumeDownButtonListener=" + this.d + ", muteButtonListener=" + this.e + ", playbackButtonListener=" + this.f + ")";
    }
}
