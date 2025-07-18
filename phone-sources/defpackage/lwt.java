package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwt extends lwq {
    public final String f;
    public final String g;

    public lwt(int i, String str, tju tjuVar, int[] iArr, String str2, String str3) {
        super(i, str, tjuVar, iArr);
        this.f = str2;
        this.g = str3;
    }

    public final String d() {
        String queryParameter = Uri.parse(this.g).getQueryParameter("tid");
        return queryParameter == null ? "" : queryParameter.replaceFirst("song-", "");
    }

    @Override // defpackage.lwq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        lwt lwtVar = (lwt) obj;
        String str = this.f;
        if (str == null ? lwtVar.f != null : !str.equals(lwtVar.f)) {
            return false;
        }
        String str2 = this.g;
        return str2 == null ? lwtVar.g == null : str2.equals(lwtVar.g);
    }

    @Override // defpackage.lwq
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
