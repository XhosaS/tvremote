package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mg {
    public static final mg a = new mg(new mp(null, null, null, false, null, 63));
    private static final mg c = new mg(new mp(null, null, null, true, null, 47));
    public final mp b;

    public mg() {
        throw null;
    }

    public final mg a(mg mgVar) {
        mp mpVar = mgVar.b;
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
        boolean z = true;
        if (!mpVar.e && !this.b.e) {
            z = false;
        }
        mp mpVar2 = this.b;
        return new mg(new mp(mhVar2, mnVar2, lvVar2, z, yfm.j(mpVar2.f, mpVar.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mg) && yks.e(((mg) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (yks.e(this, a)) {
            return "ExitTransition.None";
        }
        if (yks.e(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        mp mpVar = this.b;
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        mh mhVar = mpVar.a;
        sb.append(mhVar != null ? mhVar.toString() : null);
        sb.append(",\nSlide - ");
        mn mnVar = mpVar.b;
        sb.append(mnVar != null ? mnVar.toString() : null);
        sb.append(",\nShrink - ");
        lv lvVar = mpVar.c;
        sb.append(lvVar != null ? lvVar.toString() : null);
        sb.append(",\nScale - null,\nKeepUntilTransitionsFinished - ");
        sb.append(mpVar.e);
        return sb.toString();
    }

    public mg(mp mpVar) {
        this.b = mpVar;
    }
}
