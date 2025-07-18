package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebs {
    public static final ebs a = new ebs(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ebs(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = edt.ak(i3) ? edt.p(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebs)) {
            return false;
        }
        ebs ebsVar = (ebs) obj;
        return this.b == ebsVar.b && this.c == ebsVar.c && this.d == ebsVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + "]";
    }
}
