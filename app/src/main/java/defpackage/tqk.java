package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqk extends tqn {
    public final adis a;
    public final yqt b;
    public final yqt c;
    public final yqt d;

    public tqk(adis adisVar, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        this.a = adisVar;
        this.b = yqtVar;
        this.c = yqtVar2;
        this.d = yqtVar3;
    }

    @Override // defpackage.tqn
    public final yqt a() {
        return this.d;
    }

    @Override // defpackage.tqn
    public final yqt b() {
        return this.b;
    }

    @Override // defpackage.tqn
    public final yqt c() {
        return this.c;
    }

    @Override // defpackage.tqn
    public final adis d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqn) {
            tqn tqnVar = (tqn) obj;
            if (this.a.equals(tqnVar.d()) && this.b.equals(tqnVar.b()) && this.c.equals(tqnVar.c()) && this.d.equals(tqnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CodecConfig{format=" + Integer.toString(this.a.q) + ", outputBitRate=Optional.absent(), sampleRateHz=Optional.absent(), channelCount=Optional.absent()}";
    }
}
