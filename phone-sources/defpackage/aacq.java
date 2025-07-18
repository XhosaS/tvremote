package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aacq implements Comparable, Serializable, aaci {
    private static final long serialVersionUID = 9386874258972L;
    public volatile int g;

    protected aacq(int i) {
        this.g = i;
    }

    public abstract aace a();

    @Override // defpackage.aaci
    public final int b() {
        return this.g;
    }

    public abstract aabw c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aacq aacqVar = (aacq) obj;
        if (aacqVar.getClass() == getClass()) {
            int i = aacqVar.g;
            int i2 = this.g;
            if (i2 > i) {
                return 1;
            }
            return i2 < i ? -1 : 0;
        }
        throw new ClassCastException(String.valueOf(getClass()) + " cannot be compared to " + String.valueOf(aacqVar.getClass()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaci)) {
            return false;
        }
        aaci aaciVar = (aaci) obj;
        return aaciVar.a() == a() && aaciVar.b() == this.g;
    }

    public final int hashCode() {
        return ((this.g + 459) * 27) + c().hashCode();
    }
}
