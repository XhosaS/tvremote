package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lws extends lwq {
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;

    public lws(int i, List list, String str, tju tjuVar, int[] iArr, Collection collection, String str2, String str3, String str4, Collection collection2, String str5) {
        super(i, list, str, tjuVar, iArr);
        this.f = krh.h(collection);
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = krh.h(collection2);
        this.k = str5;
    }

    @Override // defpackage.lwq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        lws lwsVar = (lws) obj;
        List list = this.f;
        if (list == null ? lwsVar.f != null : !list.equals(lwsVar.f)) {
            return false;
        }
        String str = this.g;
        if (str == null ? lwsVar.g != null : !str.equals(lwsVar.g)) {
            return false;
        }
        String str2 = this.h;
        if (str2 == null ? lwsVar.h != null : !str2.equals(lwsVar.h)) {
            return false;
        }
        String str3 = this.i;
        if (str3 == null ? lwsVar.i != null : !str3.equals(lwsVar.i)) {
            return false;
        }
        String str4 = this.k;
        if (str4 == null ? lwsVar.k != null : !str4.equals(lwsVar.k)) {
            return false;
        }
        List list2 = this.j;
        return list2 == null ? lwsVar.j == null : list2.equals(lwsVar.j);
    }

    @Override // defpackage.lwq
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list2 = this.j;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str4 = this.k;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
