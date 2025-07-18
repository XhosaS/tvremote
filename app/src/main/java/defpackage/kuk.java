package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kuk {
    public static final kuk a = new kuk((Boolean) null, 100, (Boolean) null, (String) null);
    public final int b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final EnumMap f;

    public kuk(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(lcs.class);
        this.f = enumMap;
        enumMap.put((EnumMap) lcs.AD_USER_DATA, (lcs) lct.f(bool));
        this.b = i;
        this.c = f();
        this.d = bool2;
        this.e = str;
    }

    public static kuk a(Bundle bundle, int i) {
        if (bundle == null) {
            return new kuk((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(lcs.class);
        for (lcs lcsVar : lcr.DMA.c) {
            enumMap.put((EnumMap) lcsVar, (lcs) lct.b(bundle.getString(lcsVar.e)));
        }
        return new kuk(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static kuk b(String str) {
        if (str == null || str.length() <= 0) {
            return a;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(lcs.class);
        lcs[] lcsVarArr = lcr.DMA.c;
        int length = lcsVarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) lcsVarArr[i3], (lcs) lct.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new kuk(enumMap, i, (Boolean) null, (String) null);
    }

    public static Boolean d(Bundle bundle) {
        lcq lcqVarB;
        if (bundle == null || (lcqVarB = lct.b(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = lcqVarB.ordinal();
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? null : true;
        }
        return false;
    }

    private final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        for (lcs lcsVar : lcr.DMA.c) {
            sb.append(":");
            sb.append(lct.a((lcq) this.f.get(lcsVar)));
        }
        return sb.toString();
    }

    public final lcq c() {
        lcq lcqVar = (lcq) this.f.get(lcs.AD_USER_DATA);
        return lcqVar == null ? lcq.UNINITIALIZED : lcqVar;
    }

    public final boolean e() {
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            if (((lcq) it.next()) != lcq.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kuk)) {
            return false;
        }
        kuk kukVar = (kuk) obj;
        if (this.c.equalsIgnoreCase(kukVar.c) && Objects.equals(this.d, kukVar.d)) {
            return Objects.equals(this.e, kukVar.e);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.d;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.e;
        return this.c.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(lct.j(this.b));
        for (lcs lcsVar : lcr.DMA.c) {
            sb.append(",");
            sb.append(lcsVar.e);
            sb.append("=");
            lcq lcqVar = (lcq) this.f.get(lcsVar);
            if (lcqVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = lcqVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.d;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.e;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public kuk(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(lcs.class);
        this.f = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
        this.c = f();
        this.d = bool;
        this.e = str;
    }
}
