package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqv implements eac {
    public final String a;
    public final String b;
    public final List c;

    public eqv(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eqv eqvVar = (eqv) obj;
            if (TextUtils.equals(this.a, eqvVar.a) && TextUtils.equals(this.b, eqvVar.b) && this.c.equals(eqvVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.b + "]";
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(str);
    }

    @Override // defpackage.eac
    public final /* synthetic */ void b(eaa eaaVar) {
    }
}
