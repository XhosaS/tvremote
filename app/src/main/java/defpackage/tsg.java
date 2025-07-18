package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsg extends tsc {
    public final Optional a;
    public final Optional b;
    public final int c;
    public final int d;
    private final int e;
    private final boolean f;

    public tsg(Optional optional, Optional optional2, int i, int i2, int i3, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    @Override // defpackage.tsc
    public final int a() {
        return this.d;
    }

    @Override // defpackage.tsc
    public final int b() {
        return this.e;
    }

    @Override // defpackage.tsc
    public final int c() {
        return this.c;
    }

    @Override // defpackage.tsc
    public final Optional e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tsc) {
            tsc tscVar = (tsc) obj;
            if (this.a.equals(tscVar.f()) && this.b.equals(tscVar.e()) && this.c == tscVar.c() && this.d == tscVar.a() && this.e == tscVar.b() && this.f == tscVar.g()) {
                tscVar.h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tsc
    public final Optional f() {
        return this.a;
    }

    @Override // defpackage.tsc
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return (((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        Optional optional = this.b;
        return "AudioSourceParams{uri=" + String.valueOf(this.a) + ", fileDescriptor=" + String.valueOf(optional) + ", samplingRate=" + this.c + ", channelCount=" + this.d + ", encoding=" + this.e + ", isFromMic=" + this.f + ", enableFastTranscription=false}";
    }

    @Override // defpackage.tsc
    public final void h() {
    }
}
