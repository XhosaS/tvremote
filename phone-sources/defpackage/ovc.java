package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovc {
    public final oup a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;
    private final String i;

    public ovc(int i, oup oupVar, String str, int i2, Integer num, Integer num2, Integer num3, int i3, int i4) {
        oupVar.getClass();
        this.h = i;
        this.a = oupVar;
        this.i = str;
        this.e = i2;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovc)) {
            return false;
        }
        ovc ovcVar = (ovc) obj;
        return this.h == ovcVar.h && this.a == ovcVar.a && yks.e(this.i, ovcVar.i) && this.e == ovcVar.e && yks.e(this.b, ovcVar.b) && yks.e(this.c, ovcVar.c) && yks.e(this.d, ovcVar.d) && this.f == ovcVar.f && this.g == ovcVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.h * 31) + this.a.hashCode();
        String str = this.i;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.e;
        if (i == 0) {
            i = 0;
        } else {
            a.bw(i);
        }
        int i2 = (iHashCode2 + i) * 31;
        Integer num = this.b;
        int iHashCode3 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode5 = num3 != null ? num3.hashCode() : 0;
        int i3 = this.f;
        a.bw(i3);
        int i4 = (((iHashCode4 + iHashCode5) * 31) + i3) * 31;
        int i5 = this.g;
        a.bw(i5);
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItagFormatInfo(id=");
        sb.append(this.h);
        sb.append(", mimeType=");
        sb.append(this.a);
        sb.append(", codecs=");
        sb.append(this.i);
        sb.append(", colorRange=");
        int i = this.e;
        sb.append((Object) (i != 0 ? Integer.toString(i - 1) : "null"));
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", audioChannels=");
        sb.append(this.d);
        sb.append(", drmType=");
        sb.append((Object) Integer.toString(this.f));
        sb.append(", bitrateOption=");
        int i2 = this.g;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? "MULTI" : "DASH" : "BITRATE_UNSPECIFIED"));
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ovc(int i, oup oupVar, String str, Integer num, int i2) {
        this(i, oupVar, str, 0, null, null, num, i2, 2);
    }
}
