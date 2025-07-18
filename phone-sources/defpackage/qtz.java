package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtz implements Comparable {
    public final Drawable a;
    public final String b;
    public final int c;

    public qtz() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return rdd.l(this.c).compareTo(rdd.l(((qtz) obj).c));
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qtz) {
            qtz qtzVar = (qtz) obj;
            if (this.a.equals(qtzVar.a) && ((str = this.b) != null ? str.equals(qtzVar.b) : qtzVar.b == null) && this.c == qtzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = this.c;
        a.bl(i);
        return (((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.c;
        String string = this.a.toString();
        switch (i) {
            case 1:
                str = "APP_CUSTOM";
                break;
            case 2:
                str = "YELLOW_ALERT";
                break;
            case 3:
                str = "RED_ALERT";
                break;
            case 4:
                str = "UPLOAD_ARROW";
                break;
            case 5:
                str = "PAUSED_UPLOAD_ARROW";
                break;
            case 6:
                str = "COMPLETED_CHECKMARK";
                break;
            case 7:
                str = "SYNCING_OFF";
                break;
            default:
                str = "OBAKE";
                break;
        }
        return "BadgeContent{data=" + string + ", contentDescription=" + this.b + ", badgeType=" + str + "}";
    }

    public qtz(Drawable drawable, String str, int i) {
        if (drawable == null) {
            throw new NullPointerException("Null data");
        }
        this.a = drawable;
        this.b = str;
        this.c = i;
    }
}
