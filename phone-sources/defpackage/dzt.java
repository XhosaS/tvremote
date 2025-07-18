package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public static final String h = edt.Z(7);
    public final Uri i;
    public final String j;
    public final dzq k;
    public final dzk l;
    public final List m;
    public final String n;
    public final ImmutableList o;
    public final Object p;
    public final long q;

    /* JADX WARN: Multi-variable type inference failed */
    public dzt(Uri uri, String str, dzq dzqVar, dzk dzkVar, List list, String str2, ImmutableList immutableList, long j) {
        this.i = uri;
        this.j = eae.i(str);
        this.k = dzqVar;
        this.l = dzkVar;
        this.m = list;
        this.n = str2;
        this.o = immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < immutableList.size(); i++) {
            builder.add((ImmutableList.Builder) new dzv(new dzw((dzx) immutableList.get(i))));
        }
        builder.build();
        this.p = null;
        this.q = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzt)) {
            return false;
        }
        dzt dztVar = (dzt) obj;
        if (this.i.equals(dztVar.i) && Objects.equals(this.j, dztVar.j) && Objects.equals(this.k, dztVar.k) && Objects.equals(this.l, dztVar.l) && this.m.equals(dztVar.m) && Objects.equals(this.n, dztVar.n) && this.o.equals(dztVar.o)) {
            Object obj2 = dztVar.p;
            if (Objects.equals(null, null) && this.q == dztVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() * 31;
        String str = this.j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        dzq dzqVar = this.k;
        int iHashCode3 = (iHashCode2 + (dzqVar == null ? 0 : dzqVar.hashCode())) * 31;
        dzk dzkVar = this.l;
        int iHashCode4 = (((iHashCode3 + (dzkVar == null ? 0 : dzkVar.hashCode())) * 31) + this.m.hashCode()) * 31;
        return (int) (((((iHashCode4 + (this.n != null ? r1.hashCode() : 0)) * 31) + this.o.hashCode()) * 31 * 31) + this.q);
    }
}
