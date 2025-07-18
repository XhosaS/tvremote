package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myr {
    public final int a;
    public final tst b;
    public final String c;
    public final idb d;

    public myr() {
        throw null;
    }

    public static myq a() {
        myq myqVar = new myq(null);
        myqVar.b(0);
        myqVar.a = trk.a;
        myqVar.c = icz.c;
        myqVar.b = "";
        return myqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myr) {
            myr myrVar = (myr) obj;
            if (this.a == myrVar.a && this.b.equals(myrVar.b) && this.c.equals(myrVar.c) && this.d.equals(myrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        idb idbVar = this.d;
        return "HeaderViewModel{sectionHeight=" + this.a + ", trailerId=" + String.valueOf(this.b) + ", title=" + this.c + ", isTrailerPlaying=" + String.valueOf(idbVar) + "}";
    }

    public myr(int i, tst tstVar, String str, idb idbVar) {
        this.a = i;
        this.b = tstVar;
        this.c = str;
        this.d = idbVar;
    }
}
