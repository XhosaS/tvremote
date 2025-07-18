package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzy {
    public static final dzy a = new dzl().a();
    private static final String h = edt.Z(0);
    private static final String i = edt.Z(1);
    private static final String j = edt.Z(2);
    private static final String k = edt.Z(3);
    private static final String l = edt.Z(4);
    private static final String m = edt.Z(5);
    public final String b;
    public final dzt c;
    public final dzs d;
    public final eab e;
    public final dzn f;
    public final dzu g;

    public dzy(String str, dzo dzoVar, dzt dztVar, dzs dzsVar, eab eabVar, dzu dzuVar) {
        this.b = str;
        this.c = dztVar;
        this.d = dzsVar;
        this.e = eabVar;
        this.f = dzoVar;
        this.g = dzuVar;
    }

    public static dzy c(Bundle bundle) {
        dzs dzsVar;
        dzo dzoVar;
        dzu dzuVar;
        ImmutableMap immutableMapCopyOf;
        dzq dzqVar;
        dzt dztVar;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        if (bundle2 == null) {
            dzsVar = dzs.a;
        } else {
            dzs dzsVar2 = dzs.a;
            dzr dzrVar = new dzr();
            String str = dzs.b;
            dzs dzsVar3 = dzs.a;
            dzrVar.a = bundle2.getLong(str, dzsVar3.g);
            dzrVar.b = bundle2.getLong(dzs.c, dzsVar3.h);
            dzrVar.c = bundle2.getLong(dzs.d, dzsVar3.i);
            dzrVar.d = bundle2.getFloat(dzs.e, dzsVar3.j);
            dzrVar.e = bundle2.getFloat(dzs.f, dzsVar3.k);
            dzsVar = new dzs(dzrVar);
        }
        dzs dzsVar4 = dzsVar;
        Bundle bundle3 = bundle.getBundle(j);
        eab eabVarB = bundle3 == null ? eab.a : eab.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            dzoVar = dzo.r;
        } else {
            dzn dznVar = dzn.a;
            dzm dzmVar = new dzm();
            String str2 = dzn.b;
            dzn dznVar2 = dzn.a;
            dzmVar.b(edt.y(bundle4.getLong(str2, dznVar2.j)));
            dzmVar.a(edt.y(bundle4.getLong(dzn.c, dznVar2.l)));
            dzmVar.c = bundle4.getBoolean(dzn.d, dznVar2.n);
            dzmVar.d = bundle4.getBoolean(dzn.e, dznVar2.o);
            dzmVar.e = bundle4.getBoolean(dzn.f, dznVar2.p);
            dzmVar.f = bundle4.getBoolean(dzn.i, dznVar2.q);
            String str3 = dzn.g;
            long j2 = dznVar2.k;
            long j3 = bundle4.getLong(str3, j2);
            if (j3 != j2) {
                dzmVar.b(j3);
            }
            String str4 = dzn.h;
            long j4 = dznVar2.m;
            long j5 = bundle4.getLong(str4, j4);
            if (j5 != j4) {
                dzmVar.a(j5);
            }
            dzoVar = new dzo(dzmVar);
        }
        dzo dzoVar2 = dzoVar;
        Bundle bundle5 = bundle.getBundle(l);
        dzk dzkVar = null;
        if (bundle5 == null) {
            dzuVar = dzu.a;
        } else {
            dzu dzuVar2 = dzu.a;
            kvw kvwVar = new kvw((char[]) null);
            kvwVar.a = (Uri) bundle5.getParcelable(dzu.b);
            kvwVar.c = bundle5.getString(dzu.c);
            kvwVar.b = bundle5.getBundle(dzu.d);
            dzuVar = new dzu(kvwVar);
        }
        dzu dzuVar3 = dzuVar;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            dztVar = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(dzt.c);
            if (bundle7 == null) {
                dzqVar = null;
            } else {
                String string2 = bundle7.getString(dzq.a);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(dzq.b);
                Bundle bundle8 = bundle7.getBundle(dzq.c);
                if (bundle8 == null) {
                    bundle8 = Bundle.EMPTY;
                }
                if (bundle8 == Bundle.EMPTY) {
                    immutableMapCopyOf = ImmutableMap.of();
                } else {
                    HashMap map = new HashMap();
                    if (bundle8 != Bundle.EMPTY) {
                        for (String str5 : bundle8.keySet()) {
                            String string3 = bundle8.getString(str5);
                            if (string3 != null) {
                                map.put(str5, string3);
                            }
                        }
                    }
                    immutableMapCopyOf = ImmutableMap.copyOf((Map) map);
                }
                boolean z = bundle7.getBoolean(dzq.d, false);
                boolean z2 = bundle7.getBoolean(dzq.e, false);
                boolean z3 = bundle7.getBoolean(dzq.f, false);
                String str6 = dzq.g;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str6);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList);
                byte[] byteArray = bundle7.getByteArray(dzq.h);
                dzp dzpVar = new dzp(uuidFromString);
                dzpVar.b = uri;
                dzpVar.c = ImmutableMap.copyOf((Map) immutableMapCopyOf);
                dzpVar.d = z;
                dzpVar.f = z3;
                dzpVar.e = z2;
                dzpVar.g = ImmutableList.copyOf((Collection) immutableListCopyOf);
                dzpVar.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                dzqVar = new dzq(dzpVar);
            }
            Bundle bundle9 = bundle6.getBundle(dzt.d);
            if (bundle9 != null) {
                Uri uri2 = (Uri) bundle9.getParcelable(dzk.a);
                uri2.getClass();
                dzkVar = new dzk(new dxc(uri2, (byte[]) null));
            }
            dzk dzkVar2 = dzkVar;
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(dzt.e);
            ImmutableList immutableListOf = parcelableArrayList == null ? ImmutableList.of() : ecm.a(new dzc(5), parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(dzt.g);
            ImmutableList immutableListOf2 = parcelableArrayList2 == null ? ImmutableList.of() : ecm.a(new dzc(6), parcelableArrayList2);
            long j6 = bundle6.getLong(dzt.h, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(dzt.a);
            uri3.getClass();
            dztVar = new dzt(uri3, bundle6.getString(dzt.b), dzqVar, dzkVar2, immutableListOf, bundle6.getString(dzt.f), immutableListOf2, j6);
        }
        return new dzy(string, dzoVar2, dztVar, dzsVar4, eabVarB, dzuVar3);
    }

    public final Bundle a() {
        return b(false);
    }

    public final Bundle b(boolean z) {
        dzt dztVar;
        Bundle bundle = new Bundle();
        String str = this.b;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        dzs dzsVar = this.d;
        if (!dzsVar.equals(dzs.a)) {
            bundle.putBundle(i, dzsVar.a());
        }
        eab eabVar = this.e;
        if (!eabVar.equals(eab.a)) {
            bundle.putBundle(j, eabVar.a());
        }
        dzn dznVar = this.f;
        dzn dznVar2 = dzn.a;
        if (!dznVar.equals(dznVar2)) {
            String str2 = k;
            Bundle bundle2 = new Bundle();
            long j2 = dznVar2.j;
            long j3 = dznVar.j;
            if (j3 != j2) {
                bundle2.putLong(dzn.b, j3);
            }
            long j4 = dznVar.l;
            if (j4 != dznVar2.l) {
                bundle2.putLong(dzn.c, j4);
            }
            long j5 = dznVar.k;
            if (j5 != dznVar2.k) {
                bundle2.putLong(dzn.g, j5);
            }
            long j6 = dznVar.m;
            if (j6 != dznVar2.m) {
                bundle2.putLong(dzn.h, j6);
            }
            boolean z2 = dznVar.n;
            if (z2 != dznVar2.n) {
                bundle2.putBoolean(dzn.d, z2);
            }
            boolean z3 = dznVar.o;
            if (z3 != dznVar2.o) {
                bundle2.putBoolean(dzn.e, z3);
            }
            boolean z4 = dznVar.p;
            if (z4 != dznVar2.p) {
                bundle2.putBoolean(dzn.f, z4);
            }
            boolean z5 = dznVar.q;
            if (z5 != dznVar2.q) {
                bundle2.putBoolean(dzn.i, z5);
            }
            bundle.putBundle(str2, bundle2);
        }
        dzu dzuVar = this.g;
        if (!dzuVar.equals(dzu.a)) {
            String str3 = l;
            Bundle bundle3 = new Bundle();
            Uri uri = dzuVar.e;
            if (uri != null) {
                bundle3.putParcelable(dzu.b, uri);
            }
            String str4 = dzuVar.f;
            if (str4 != null) {
                bundle3.putString(dzu.c, str4);
            }
            Bundle bundle4 = dzuVar.g;
            if (bundle4 != null) {
                bundle3.putBundle(dzu.d, bundle4);
            }
            bundle.putBundle(str3, bundle3);
        }
        if (z && (dztVar = this.c) != null) {
            String str5 = m;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(dzt.a, dztVar.i);
            String str6 = dztVar.j;
            if (str6 != null) {
                bundle5.putString(dzt.b, str6);
            }
            dzq dzqVar = dztVar.k;
            if (dzqVar != null) {
                String str7 = dzt.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(dzq.a, dzqVar.i.toString());
                Uri uri2 = dzqVar.j;
                if (uri2 != null) {
                    bundle6.putParcelable(dzq.b, uri2);
                }
                ImmutableMap immutableMap = dzqVar.k;
                if (!immutableMap.isEmpty()) {
                    String str8 = dzq.c;
                    Bundle bundle7 = new Bundle();
                    Iterator it = immutableMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str8, bundle7);
                }
                if (dzqVar.l) {
                    bundle6.putBoolean(dzq.d, true);
                }
                if (dzqVar.m) {
                    bundle6.putBoolean(dzq.e, true);
                }
                if (dzqVar.n) {
                    bundle6.putBoolean(dzq.f, true);
                }
                ImmutableList immutableList = dzqVar.o;
                if (!immutableList.isEmpty()) {
                    bundle6.putIntegerArrayList(dzq.g, new ArrayList<>(immutableList));
                }
                byte[] bArr = dzqVar.p;
                if (bArr != null) {
                    bundle6.putByteArray(dzq.h, bArr);
                }
                bundle5.putBundle(str7, bundle6);
            }
            dzk dzkVar = dztVar.l;
            if (dzkVar != null) {
                String str9 = dzt.d;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(dzk.a, dzkVar.b);
                bundle5.putBundle(str9, bundle8);
            }
            List list = dztVar.m;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(dzt.e, ecm.b(list, new dzc(3)));
            }
            String str10 = dztVar.n;
            if (str10 != null) {
                bundle5.putString(dzt.f, str10);
            }
            ImmutableList immutableList2 = dztVar.o;
            if (!immutableList2.isEmpty()) {
                bundle5.putParcelableArrayList(dzt.g, ecm.b(immutableList2, new dzc(4)));
            }
            long j7 = dztVar.q;
            if (j7 != -9223372036854775807L) {
                bundle5.putLong(dzt.h, j7);
            }
            bundle.putBundle(str5, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzy)) {
            return false;
        }
        dzy dzyVar = (dzy) obj;
        return Objects.equals(this.b, dzyVar.b) && this.f.equals(dzyVar.f) && Objects.equals(this.c, dzyVar.c) && Objects.equals(this.d, dzyVar.d) && Objects.equals(this.e, dzyVar.e) && Objects.equals(this.g, dzyVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        dzt dztVar = this.c;
        return ((((((((iHashCode + (dztVar != null ? dztVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.g.hashCode();
    }
}
