package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epr {
    public static eqw a(lme lmeVar) {
        if (lmeVar == null) {
            return eqw.f;
        }
        int iA = lmd.a(lmeVar.c);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            return (lmeVar.b & 4) != 0 ? new era(lmeVar.f) : eqw.m;
        }
        if (i == 2) {
            return (lmeVar.b & 16) != 0 ? new eqo(Double.valueOf(lmeVar.h)) : new eqo(null);
        }
        if (i == 3) {
            return (lmeVar.b & 8) != 0 ? new eqm(Boolean.valueOf(lmeVar.g)) : new eqm(null);
        }
        if (i != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        abxs abxsVar = lmeVar.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = abxsVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a((lme) it.next()));
        }
        return new eqx(lmeVar.e, arrayList);
    }

    public static eqw b(Object obj) {
        if (obj == null) {
            return eqw.g;
        }
        if (obj instanceof String) {
            return new era((String) obj);
        }
        if (obj instanceof Double) {
            return new eqo((Double) obj);
        }
        if (obj instanceof Long) {
            return new eqo(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new eqo(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new eqm((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            eql eqlVar = new eql();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                eqlVar.p(eqlVar.c(), b(it.next()));
            }
            return eqlVar;
        }
        eqt eqtVar = new eqt();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            eqw eqwVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                eqtVar.q((String) string, eqwVarB);
            }
        }
        return eqtVar;
    }
}
