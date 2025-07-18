package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mf {
    public static final mf a = new mf(new mp(null, null, null, false, null, 63));
    public final mp b;

    public mf() {
        throw null;
    }

    public final mf a(mf mfVar) {
        mp mpVar = mfVar.b;
        mh mhVar = mpVar.a;
        if (mhVar == null) {
            mhVar = this.b.a;
        }
        mh mhVar2 = mhVar;
        mn mnVar = mpVar.b;
        if (mnVar == null) {
            mnVar = this.b.b;
        }
        mn mnVar2 = mnVar;
        lv lvVar = mpVar.c;
        if (lvVar == null) {
            lvVar = this.b.c;
        }
        lv lvVar2 = lvVar;
        mp mpVar2 = this.b;
        return new mf(new mp(mhVar2, mnVar2, lvVar2, false, yfm.j(mpVar2.f, mpVar.f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mf) && yks.e(((mf) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (yks.e(this, a)) {
            return "EnterTransition.None";
        }
        mp mpVar = this.b;
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        mh mhVar = mpVar.a;
        sb.append(mhVar != null ? mhVar.toString() : null);
        sb.append(",\nSlide - ");
        mn mnVar = mpVar.b;
        sb.append(mnVar != null ? mnVar.toString() : null);
        sb.append(",\nShrink - ");
        lv lvVar = mpVar.c;
        sb.append(lvVar != null ? lvVar.toString() : null);
        sb.append(",\nScale - null");
        return sb.toString();
    }

    public mf(mp mpVar) {
        this.b = mpVar;
    }
}
