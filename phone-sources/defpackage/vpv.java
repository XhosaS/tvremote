package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpv implements vps {
    public final int a;
    private final vqe b = null;

    public /* synthetic */ vpv(int i) {
        this.a = i;
    }

    @Override // defpackage.vps
    public final vqe c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpv)) {
            return false;
        }
        vpv vpvVar = (vpv) obj;
        if (this.a != vpvVar.a) {
            return false;
        }
        vqe vqeVar = vpvVar.b;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        return i * 31;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OgImage(type=");
        switch (this.a) {
            case 1:
                str = "RED_ALERT";
                break;
            case 2:
                str = "YELLOW_ALERT";
                break;
            case 3:
                str = "CLOUD_ICON";
                break;
            case 4:
                str = "BACKUP_OFF";
                break;
            case 5:
                str = "BACKUP_COMPLETE";
                break;
            case 6:
                str = "NO_CONNECTION";
                break;
            case 7:
                str = "ADD_ANOTHER_ACCOUNT";
                break;
            case 8:
                str = "SWITCH_PROFILE";
                break;
            case 9:
                str = "MANAGE_ACCOUNTS";
                break;
            case 10:
                str = "USE_WITHOUT_ACCOUNT";
                break;
            case 11:
                str = "RECOMMENDED_ACTIONS";
                break;
            case 12:
                str = "EDIT_PROFILE_IMAGE";
                break;
            case 13:
                str = "GOOGLE_LOGO";
                break;
            case 14:
                str = "TURN_ON_INCOGNITO";
                break;
            case 15:
                str = "TURN_OFF_INCOGNITO";
                break;
            default:
                str = "LOADING";
                break;
        }
        sb.append((Object) str);
        sb.append(", a11yLabel=null)");
        return sb.toString();
    }
}
