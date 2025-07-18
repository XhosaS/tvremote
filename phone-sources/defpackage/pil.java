package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pil {
    public final int a;
    private final String b;
    private final ImmutableMap c;

    public pil() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pil)) {
            return false;
        }
        pil pilVar = (pil) obj;
        int i = this.a;
        int i2 = pilVar.a;
        if (i != 0) {
            return i == i2 && ((str = this.b) != null ? str.equals(pilVar.b) : pilVar.b == null) && this.c.equals(pilVar.c);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        a.bl(i);
        String str = this.b;
        return ((((i ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str;
        switch (this.a) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "BOTTOM_SHEET";
                break;
            case 3:
                str = "DIALOG";
                break;
            case 4:
                str = "FEATURE_HIGHLIGHT";
                break;
            case 5:
                str = "PERMISSION";
                break;
            case 6:
                str = "TOOLTIP";
                break;
            case 7:
                str = "CUSTOM_UI";
                break;
            case 8:
                str = "IN_APP_REVIEW";
                break;
            default:
                str = "null";
                break;
        }
        return "PromoDetails{promoType=" + str + ", elementId=" + this.b + ", actionIntents=" + String.valueOf(this.c) + "}";
    }

    public pil(int i, String str, ImmutableMap immutableMap) {
        this.a = i;
        this.b = str;
        this.c = immutableMap;
    }
}
