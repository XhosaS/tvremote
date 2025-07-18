package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ZoneId implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        Collections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId K(j$.time.temporal.k kVar) {
        ZoneId zoneId = (ZoneId) kVar.J(j$.time.temporal.o.e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new b("Unable to obtain ZoneId from TemporalAccessor: " + String.valueOf(kVar) + " of type " + kVar.getClass().getName());
    }

    public static ZoneId M(String str, ZoneOffset zoneOffset) {
        Objects.a(str, "prefix");
        Objects.a(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.a != 0) {
            str = str.concat(zoneOffset.b);
        }
        return new w(str, new j$.time.zone.e(zoneOffset));
    }

    public static ZoneId N(String str, int i) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return M(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return w.P(str);
        }
        try {
            ZoneOffset zoneOffsetQ = ZoneOffset.Q(str.substring(i));
            return zoneOffsetQ == ZoneOffset.UTC ? M(strSubstring, zoneOffsetQ) : M(strSubstring, zoneOffsetQ);
        } catch (b e) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    public abstract j$.time.zone.e L();

    public abstract void O(ObjectOutput objectOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return h().equals(((ZoneId) obj).h());
        }
        return false;
    }

    public abstract String h();

    public int hashCode() {
        return h().hashCode();
    }

    public String toString() {
        return h();
    }
}
