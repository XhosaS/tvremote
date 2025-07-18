package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouj {
    public final String a;
    public final int b;
    public final int c;
    private final int d;

    public ouj(String str, int i, int i2, int i3) {
        this.a = str;
        this.d = i;
        this.c = i2;
        this.b = i3;
    }

    public static /* synthetic */ ouj b(ouj oujVar, int i) {
        return new ouj(oujVar.a, oujVar.d, oujVar.c, i);
    }

    public final int a() {
        int i = this.c - 1;
        int i2 = 0;
        int i3 = i != 1 ? i != 2 ? i != 3 ? 0 : 8 : 1 : 16;
        int i4 = this.d - 1;
        if (i4 == 1) {
            i2 = 512;
        } else if (i4 == 2) {
            i2 = RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        return i3 | i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouj)) {
            return false;
        }
        ouj oujVar = (ouj) obj;
        return yks.e(this.a, oujVar.a) && this.d == oujVar.d && this.c == oujVar.c && this.b == oujVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.d;
        a.bw(i);
        int i2 = this.c;
        a.bw(i2);
        return ((((iHashCode + i) * 31) + i2) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Audio(languageCode=");
        sb.append(this.a);
        sb.append(", accessibility=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "ENHANCED_AUDIO_INTELLIGIBILITY" : "DESCRIPTION" : "ACCESSIBILITY_UNSPECIFIED"));
        sb.append(", role=");
        int i2 = this.c;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? i2 != 3 ? "COMMENTARY" : "MAIN" : "DUB" : "ROLE_UNSPECIFIED"));
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
