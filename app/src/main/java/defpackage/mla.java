package defpackage;

import com.google.common.collect.Sets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mla extends mmn {
    public final ogq a;
    public final ogq b;
    public final ogq c;
    public final ogq d;
    public final nhw e;
    public final ofy f;
    public final oco g;
    public final oap h;
    public final boolean i;
    public final oaa j;
    public final yyr k;
    public final oal l;
    public final mrg m;

    public mla(ogq ogqVar, ogq ogqVar2, ogq ogqVar3, ogq ogqVar4, mrg mrgVar, nhw nhwVar, ofy ofyVar, oco ocoVar, oap oapVar, boolean z, oaa oaaVar, yyr yyrVar, oal oalVar) {
        this.a = ogqVar;
        this.b = ogqVar2;
        this.c = ogqVar3;
        this.d = ogqVar4;
        if (mrgVar == null) {
            throw new NullPointerException("Null imageSourceExtensionResolver");
        }
        this.m = mrgVar;
        if (nhwVar == null) {
            throw new NullPointerException("Null editableTextType");
        }
        this.e = nhwVar;
        if (ofyVar == null) {
            throw new NullPointerException("Null typefaceProvider");
        }
        this.f = ofyVar;
        if (ocoVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.g = ocoVar;
        if (oapVar == null) {
            throw new NullPointerException("Null dataLayerSelector");
        }
        this.h = oapVar;
        this.i = z;
        if (oaaVar == null) {
            throw new NullPointerException("Null commandResolver");
        }
        this.j = oaaVar;
        if (yyrVar == null) {
            throw new NullPointerException("Null styleRunExtensionConverters");
        }
        this.k = yyrVar;
        if (oalVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.l = oalVar;
    }

    @Override // defpackage.mmn
    public final nhw a() {
        return this.e;
    }

    @Override // defpackage.mmn
    public final oaa b() {
        return this.j;
    }

    @Override // defpackage.mmn
    public final oal c() {
        return this.l;
    }

    @Override // defpackage.mmn
    public final oap d() {
        return this.h;
    }

    @Override // defpackage.mmn
    public final oco e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmn) {
            mmn mmnVar = (mmn) obj;
            ogq ogqVar = this.a;
            if (ogqVar != null ? ogqVar.equals(mmnVar.h()) : mmnVar.h() == null) {
                ogq ogqVar2 = this.b;
                if (ogqVar2 != null ? ogqVar2.equals(mmnVar.i()) : mmnVar.i() == null) {
                    ogq ogqVar3 = this.c;
                    if (ogqVar3 != null ? ogqVar3.equals(mmnVar.g()) : mmnVar.g() == null) {
                        ogq ogqVar4 = this.d;
                        if (ogqVar4 != null ? ogqVar4.equals(mmnVar.j()) : mmnVar.j() == null) {
                            if (this.m.equals(mmnVar.m()) && this.e.equals(mmnVar.a()) && this.f.equals(mmnVar.f()) && this.g.equals(mmnVar.e()) && this.h.equals(mmnVar.d()) && this.i == mmnVar.l() && this.j.equals(mmnVar.b()) && this.k.equals(mmnVar.k()) && this.l.equals(mmnVar.c())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mmn
    public final ofy f() {
        return this.f;
    }

    @Override // defpackage.mmn
    public final ogq g() {
        return this.c;
    }

    @Override // defpackage.mmn
    public final ogq h() {
        return this.a;
    }

    public final int hashCode() {
        ogq ogqVar = this.a;
        int iHashCode = ogqVar == null ? 0 : ogqVar.hashCode();
        ogq ogqVar2 = this.b;
        int iHashCode2 = ogqVar2 == null ? 0 : ogqVar2.hashCode();
        int i = iHashCode ^ 1000003;
        ogq ogqVar3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (ogqVar3 == null ? 0 : ogqVar3.hashCode())) * 1000003;
        ogq ogqVar4 = this.d;
        return ((((((((((((((((((iHashCode3 ^ (ogqVar4 != null ? ogqVar4.hashCode() : 0)) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ Sets.a(this.k.entrySet())) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.mmn
    public final ogq i() {
        return this.b;
    }

    @Override // defpackage.mmn
    public final ogq j() {
        return this.d;
    }

    @Override // defpackage.mmn
    public final yyr k() {
        return this.k;
    }

    @Override // defpackage.mmn
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.mmn
    public final mrg m() {
        return this.m;
    }

    public final String toString() {
        oal oalVar = this.l;
        yyr yyrVar = this.k;
        oaa oaaVar = this.j;
        oap oapVar = this.h;
        oco ocoVar = this.g;
        ofy ofyVar = this.f;
        nhw nhwVar = this.e;
        mrg mrgVar = this.m;
        ogq ogqVar = this.d;
        ogq ogqVar2 = this.c;
        ogq ogqVar3 = this.b;
        return "PropArgs{onChangeCommandFuture=" + String.valueOf(this.a) + ", onFocusCommandFuture=" + String.valueOf(ogqVar3) + ", onBlurCommandFuture=" + String.valueOf(ogqVar2) + ", onTextInputActionCommandFuture=" + String.valueOf(ogqVar) + ", imageSourceExtensionResolver=" + mrgVar.toString() + ", editableTextType=" + nhwVar.toString() + ", typefaceProvider=" + ofyVar.toString() + ", logger=" + ocoVar.toString() + ", dataLayerSelector=" + oapVar.toString() + ", enableEmojiCompat=" + this.i + ", commandResolver=" + oaaVar.toString() + ", styleRunExtensionConverters=" + yyrVar.toString() + ", conversionContext=" + oalVar.toString() + "}";
    }
}
