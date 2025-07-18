package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmo {
    public final ewb a;
    public final ieg b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final int g;
    private final int h;

    public lmo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lmo) {
            lmo lmoVar = (lmo) obj;
            if (this.a.equals(lmoVar.a) && this.b.equals(lmoVar.b) && this.c == lmoVar.c && this.d == lmoVar.d && this.e == lmoVar.e && this.h == lmoVar.h && this.f.equals(lmoVar.f) && this.g == lmoVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.h) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        List list = this.f;
        ieg iegVar = this.b;
        return "MediaSourceData{mediaSource=" + String.valueOf(this.a) + ", audioTrackInfosResult=" + iegVar.toString() + ", initialAudioTrackIndex=" + this.c + ", bestHdItag=" + this.d + ", bestSdItag=" + this.e + ", audioItag=" + this.h + ", selectedStreams=" + list.toString() + ", maxVideoHeight=" + this.g + "}";
    }

    public lmo(ewb ewbVar, ieg iegVar, int i, int i2, int i3, int i4, List list, int i5) {
        this.a = ewbVar;
        if (iegVar == null) {
            throw new NullPointerException("Null audioTrackInfosResult");
        }
        this.b = iegVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.h = i4;
        this.f = list;
        this.g = i5;
    }
}
