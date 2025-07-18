package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayv {
    public final Map a;

    public ayv(Map map) {
        this.a = map;
    }

    public final float a() {
        Float fValueOf;
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    public final float b(Object obj) {
        Float f = (Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final Object c(float f) {
        Object next;
        Iterator it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    int iCompare = Float.compare(fAbs, fAbs2);
                    if (iCompare > 0) {
                        fAbs = fAbs2;
                    }
                    if (iCompare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final Object d(float f, boolean z) {
        Object next;
        Iterator it = this.a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f2 = z ? fFloatValue - f : f - fFloatValue;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f3 = z ? fFloatValue2 - f : f - fFloatValue2;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    int iCompare = Float.compare(f2, f3);
                    if (iCompare > 0) {
                        f2 = f3;
                    }
                    if (iCompare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public final boolean e(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ayv) {
            return yks.e(this.a, ((ayv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
