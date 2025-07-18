package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hkh implements Cloneable {
    public hvw a = hvt.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hkh clone() {
        try {
            return (hkh) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hkh)) {
            return false;
        }
        hvw hvwVar = this.a;
        hvw hvwVar2 = ((hkh) obj).a;
        char[] cArr = hwp.a;
        return a.au(hvwVar, hvwVar2);
    }

    public final int hashCode() {
        hvw hvwVar = this.a;
        if (hvwVar != null) {
            return hvwVar.hashCode();
        }
        return 0;
    }
}
